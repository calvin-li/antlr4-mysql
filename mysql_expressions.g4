grammar mysql_expressions;

@header{
	import java.util.Random; 
	import java.util.HashMap;
	import java.io.*;
}

query
    locals[
        ArrayList<Integer> tables = new ArrayList<Integer>(),
        ArrayList<String> select_fields = new ArrayList<String>(),
]:
    WS? explain? SELECT DISTINCT? STRAIGHT_JOIN? SQL_SMALL_RESULT? (select_list | simple_select_list | {fuzzer.Visitor.index.put("AGG", $text.length());} aggregate_select_list)
    FROM join_list {fuzzer.Visitor.index.put("WHERE", $text.length());} where_clause group_by_clause? having_clause? order_by_clause? SEMI? EOF?
;

explain:
    'EXPLAIN' | 'EXPLAIN EXTENDED' ;

select_list:
    new_select_item (COMMA new_select_item)*;

simple_select_list:
    nonaggregate_select_item (COMMA nonaggregate_select_item)* ;

aggregate_select_list:
    aggregate_select_item (COMMA aggregate_select_item)*;

new_select_item:
    nonaggregate_select_item | aggregate_select_item | combo_select_item | select_subquery ;

nonaggregate_select_item:
    table DOT f = field AS field
    {$query::select_fields.add($text.split("AS")[0]);}
    ;

aggregate_select_item:
    aggregate table DOT field RPAREN? AS field ;

combo_select_item:
    LPAREN LPAREN table DOT field RPAREN OP LPAREN table DOT table RPAREN RPAREN AS field
    | CONCAT LPAREN table DOT field COMMA table DOT field RPAREN AS field
    ;

select_subquery:
    (single_subquery | int_scalar_subquery) AS field ;

select_subquery_body_disabled:
    LPAREN SELECT value UNION (ALL | DISTINCT)? LPAREN value LIMIT '1' AS field ;

join_list:
    LPAREN new_table join_type new_table ON LPAREN join_condition_item RPAREN RPAREN
    | LPAREN new_table join_type LPAREN LPAREN new_table join_type new_table ON LPAREN join_condition_item RPAREN RPAREN RPAREN ON LPAREN join_condition_item RPAREN RPAREN
    | LPAREN new_table (COMMA new_table)+ RPAREN;

join_list_disabled:
    new_table 
    | LPAREN new_table join_type join_list ON LPAREN join_condition_item RPAREN RPAREN ;

join_type:
    INNER_JOIN | (LEFT | RIGHT) OUTER? JOIN| STRAIGHT_JOIN ;

join_condition_item:
    table DOT field COMPARE_OP table DOT field on_subquery? ;

where_clause:
    WHERE where_subquery | WHERE LPAREN where_subquery RPAREN AND_OR where_list ;

where_subquery:
    general_subquery | special_subquery ;

where_list:
    generic_where_list | ranged_where_list (AND_OR generic_where_list)?;

generic_where_list:
    where_item | LPAREN where_item AND_OR where_item RPAREN ;

where_item:
    where_subquery
    | table DOT field COMPARE_OP table DOT field
    | table DOT field COMPARE_OP value
    | table DOT field IS NOT? NULL;

ranged_where_list:
    ranged_where_item | LPAREN ranged_where_item AND_OR ranged_where_item RPAREN ;

ranged_where_item:
table DOT field NOT? BETWEEN DIGIT AND_OR LPAREN DIGIT OP DIGIT RPAREN
| table DOT field COMPARE_OP CHAR
| table DOT field NOT? IN  DIGIT (COMMA DIGIT)*
| table DOT field NOT? IN  CHAR (COMMA CHAR)*
| table DOT field COMPARE_OP DIGIT AND_OR table DOT field COMPARE_OP LPAREN DIGIT OP DIGIT RPAREN
| table DOT field COMPARE_OP (DIGIT | CHAR )
| table DOT LIKE CONCAT LPAREN CHAR COMMA PERCENT RPAREN
| table DOT field COMPARE_OP table DOT field ;

on_subquery:
    subquery_table AND_OR general_subquery ;
    
general_subquery:
    table DOT field COMPARE_OP single_subquery
    | LPAREN table DOT field COMMA table DOT field RPAREN NOT? IN double_subquery
    | table DOT field membership_operator single_subquery
    | LPAREN? value COMMA value RPAREN? NOT? IN double_subquery
    | table DOT field membership_operator single_union_subquery ;

general_subquery_union_test_disabled:
    (table | subquery_table) DOT field COMPARE_OP all_any single_union_subquery_disabled ;

special_subquery:
    NOT? EXISTS (LPAREN single_subquery RPAREN | correlated_subquery)
    | table DOT field membership_operator correlated_subquery
    | single_subquery IS NOT? NULL ;

single_union_subquery:
    LPAREN SELECT value UNION  (ALL | DISTINCT)? SELECT value RPAREN;

single_union_subquery_disabled:
    LPAREN? single_subquery UNION (ALL | DISTINCT)? single_subquery RPAREN? ;

double_subquery:
    LPAREN SELECT DISTINCT? SQL_SMALL_RESULT? subquery_table DOT field AS SUBQUERY_FIELD COMMA
    subquery_table DOT field AS SUBQUERY_FIELD subquery_body subquery_group_by? subquery_having? RPAREN
    | LPAREN SELECT value COMMA value UNION (ALL | DISTINCT)? SELECT value COMMA value RPAREN ;

correlated_subquery:
    LPAREN SELECT DISTINCT? SQL_SMALL_RESULT? aggregate? subquery_table DOT field AS SUBQUERY_FIELD FROM subquery_join_list WHERE correlated_subquery_where_list RPAREN ;

single_subquery:
    LPAREN LPAREN? SELECT DISTINCT? SQL_SMALL_RESULT? aggregate? subquery_table DOT field RPAREN? AS SUBQUERY_FIELD subquery_body (subquery_group_by subquery_having)? RPAREN
    | LPAREN SELECT value FROM DUAL RPAREN
    | SELECT value ;

int_scalar_subquery:
    LPAREN SELECT DISTINCT? SQL_SMALL_RESULT aggregate subquery_table DOT field  RPAREN AS field FROM subquery_join_list WHERE correlated_subquery_where_list RPAREN ;

subquery_body:
    FROM subquery_join_list (WHERE LPAREN? subquery_where_list RPAREN?)? ;

subquery_join_list:
    LPAREN new_subquery_table join_type LPAREN? new_subquery_table RPAREN? ON
        LPAREN subquery_join_condition_item RPAREN RPAREN |
    new_subquery_table
    | LPAREN new_subquery_table COMMA new_subquery_table RPAREN
    | LPAREN new_subquery_table join_type LPAREN? new_subquery_table RPAREN? ON
        LPAREN subquery_join_condition_item RPAREN RPAREN
    | LPAREN new_subquery_table join_type
        LPAREN new_subquery_table join_type new_subquery_table ON
            LPAREN subquery_join_condition_item
        RPAREN RPAREN ON LPAREN subquery_join_condition_item RPAREN RPAREN
    ;

subquery_join_condition_item:
    subquery_table DOT field COMPARE_OP subquery_table DOT field (AND_OR where_subquery)? ;

correlated_subquery_where_list:
    correlated_subquery_where_item
    (AND_OR (correlated_subquery_where_item | subquery_where_item) )?;

subquery_where_list:
    subquery_where_item (AND_OR subquery_where_item)? ;

correlated_subquery_where_item:
    subquery_table DOT field COMPARE_OP table DOT field ;

subquery_where_item:
    subquery_table DOT field COMPARE_OP
    (DIGIT | CHAR | subquery_table DOT field )
    | general_subquery_union_test_disabled ;

subquery_group_by:
    GROUP_BY subquery_table DOT field (COMMA subquery_table DOT field)? ;

subquery_having:
    HAVING subquery_having_item (AND_OR subquery_having_item)* ;

subquery_having_item:
    subquery_table DOT field COMPARE_OP value ;

group_by_clause:
    GROUP_BY field (COMMA field)* ;
    
having_clause:
    HAVING LPAREN? having_item (AND_OR having_item)* RPAREN? ;
    
having_item:
    field COMPARE_OP value | general_subquery;

order_by_clause:
    ORDER_BY ALIAS DOT field DESC? COMMA total_order_by limit_rule?
    | ORDER_BY order_by_list (COMMA total_order_by limit_rule?)? ;

order_by_list:
    order_by_item (COMMA order_by_item)* ;

order_by_item:
    ALIAS DOT field (COMMA table DOT field)? DESC?
    | field DESC?
    | CONCAT LPAREN table DOT field COMMA table DOT field RPAREN ;

total_order_by:
    field (COMMA field)* ;

limit_rule:
    LIMIT DIGIT (OFFSET DIGIT)? ;

membership_operator:
    COMPARE_OP all_any | NOT? IN ;

all_any:
    ANY | ALL | SOME ;

value:
    (DIGIT | CHAR) ;
    
table:
    TABLE_NAME | ALIAS;

new_table locals[Boolean first_sq_table = true] :
    a = table AS table
    {$query::tables.add(0);}
    | LPAREN from_subquery RPAREN AS ALIAS
    ;

from_subquery:
    SELECT DISTINCT? SQL_SMALL_RESULT? subquery_table DOT ASTERISK subquery_body ;

new_subquery_table:
    table AS subquery_table ;

subquery_table:
    SUBQUERY_TABLE_NAME
    {/*
        if($new_table::first_sq_table){
            $new_table::first_sq_table = false;
            int index = Integer.parseInt($text.trim().substring($text.trim().length() - 1));
            $query::tables.add(index);
        }
        */
    }
    | CHILD_SUBQUERY_TABLE_NAME ;

field:
    GRAVE PK GRAVE | GRAVE COLUMN GRAVE | FIELDTK ;

aggregate:
    a = AGGREGATE_OP
    {
    if(!fuzzer.Visitor.index.containsKey("AGGL"))
        fuzzer.Visitor.index.put(
            "AGGL",
            $a.text.trim().length()
        );
    }
    LPAREN DISTINCT? ;

SELECT: 'SELECT' WS? ;

DISTINCT: 'DISTINCT' WS? ;

ANY: 'ANY' WS? ;

ALL: 'ALL' WS? ;

SOME: 'SOME' WS? ;

EXISTS: 'EXISTS' WS? ;

SQL_SMALL_RESULT: 'SQL_SMALL_RESULT' WS? ;

CONCAT: 'CONCAT' WS? ;

UNION: 'UNION' WS? ;

ON: 'ON' WS? ;

FROM: 'FROM' WS? ;

JOIN: 'JOIN' WS? ;

INNER_JOIN: 'INNER JOIN' WS? ;

LEFT: 'LEFT' WS? ;

RIGHT: 'RIGHT' WS? ;

OUTER: 'OUTER' WS? ;

STRAIGHT_JOIN: 'STRAIGHT_JOIN' WS? ;

WHERE: 'WHERE' WS? ;

GROUP_BY: 'GROUP BY' WS? ;

HAVING: 'HAVING' WS? ;

ORDER_BY: 'ORDER BY' WS? ;

SQ: 'SQ' WS? ;

DOT: '.' WS? ;

COMMA: ',' WS? ;

AS: 'AS' WS? ;

DESC: 'DESC' WS? | 'ASC' WS? ;

LIMIT: 'LIMIT' WS? ;

OFFSET: 'OFFSET' WS? ;

DUAL: 'DUAL' WS?  ;

TABLE_NAME: ( 'view_'?('A' | 'B' | 'C' | 'D')+ ) WS? ;

SUBQUERY_FIELD: 'SQ'DIGIT'_'FIELDTK WS? ;

SUBQUERY_TABLE_NAME: 'SQ'DIGIT'_'ALIAS WS? ;

CHILD_SUBQUERY_TABLE_NAME: 'C_'SUBQUERY_TABLE_NAME WS? ;

ALIAS: 'alias' [0-9]+ WS? ;

FIELDTK: 'field' [0-9]+ WS? ;

PK: 'pk' WS? ;

GRAVE: '`' WS? ;

COLUMN: 'col_'COL_TYPE'_'('key'|'nokey') WS? ;

COL_TYPE: 'int' | 'varchar' ;

DIGIT: [0-9][0-9]?[0-9]? WS? ;

CHAR: '\''[a-z]'\'' WS? | '\'USA\'' WS? ;

PERCENT: '%' WS? ;

ASTERISK: '*' WS? ;

SEMI: ';' WS? ;

AGGREGATE_OP: ('COUNT' | 'SUM' | 'MIN' | 'MAX') WS? ;

LIKE: 'LIKE' WS? ;

AND_OR: 'AND' WS? | 'OR' WS? ;

IS: 'IS' WS? ;

NOT: 'NOT' WS? ;

BETWEEN: 'BETWEEN' WS? ;

IN: 'IN' WS? ;

NULL: 'NULL' WS? ;

LPAREN: ( '(' | '[' | '{' ) WS? ;

RPAREN: (')' | ']' | '}') WS?  ;

SYM: ( '.' | '`' | '_' | ';' | ',' | '\'' ) WS? ;

OP: ( '+' | '-' | '*' | '/' ) WS? ;

COMPARE_OP: ( '=' | '<' | '>' | '!=' | '<>' | '<=' | '>=' ) WS? ;

WORD: ([a-zA-Z0-9] | '_')+ WS? ;

WS: [ \t\r\n]+ ;
