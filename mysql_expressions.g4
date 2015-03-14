grammar mysql_expressions;

@header{
	import java.util.Random; 
	import java.io.*;
}

query
    locals[
        ArrayList<Integer> tables = new ArrayList<Integer>(),
        ArrayList<String> select_fields = new ArrayList<String>(),
        int where_index = -1;
]:
    WS? explain? SELECT DISTINCT? STRAIGHT_JOIN? SQL_SMALL_RESULT? (simple_select_list | aggregate_select_list)
    FROM join_list {$where_index = $text.length();} where_clause group_by_clause? having_clause order_by_clause? SEMI? EOF?
 {
	//pA.test($text, $tables, $select_fields, $where_index);
 }
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
    LPAREN new_table (COMMA new_table)+ RPAREN;

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
    | LPAREN value COMMA value RPAREN NOT? IN double_subquery
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
    LPAREN SELECT DISTINCT? SQL_SMALL_RESULT? aggregate? subquery_table DOT field RPAREN AS field subquery_body (subquery_group_by subquery_having)? RPAREN
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
    ALIAS DOT field (COMMA table DOT field)? DESC
    | field DESC
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
    AGGREGATE_OP LPAREN DISTINCT? ;

SELECT: 'SELECT' WS? {if(false) System.out.print(getText() + " ");};

DISTINCT: 'DISTINCT' WS? {if(false) System.out.print(getText() + " ");};

ANY: 'ANY' WS? {if(false) System.out.print(getText() + " ");};

ALL: 'ALL' WS? {if(false) System.out.print(getText() + " ");};

SOME: 'SOME' WS? {if(false) System.out.print(getText() + " ");};

EXISTS: 'EXISTS' WS? {if(false) System.out.print(getText() + " ");};

SQL_SMALL_RESULT: 'SQL_SMALL_RESULT' WS? {if(false) System.out.print(getText() + " ");};

CONCAT: 'CONCAT' WS? {if(false) System.out.print(getText() + " ");};

UNION: 'UNION' WS? {if(false) System.out.print(getText() + " ");};

ON: 'ON' WS? {if(false) System.out.print(getText() + " ");};

FROM: 'FROM' WS? {if(false) System.out.print(getText() + " ");};

JOIN: 'JOIN' WS? {if(false) System.out.print(getText() + " ");};

INNER_JOIN: 'INNER JOIN' WS? {if(false) System.out.print(getText() + " ");};

LEFT: 'LEFT' WS? {if(false) System.out.print(getText() + " ");};

RIGHT: 'RIGHT' WS? {if(false) System.out.print(getText() + " ");};

OUTER: 'OUTER' WS? {if(false) System.out.print(getText() + " ");};

STRAIGHT_JOIN: 'STRAIGHT_JOIN' WS? {if(false) System.out.print(getText() + " ");};

WHERE: 'WHERE' WS? {if(false) System.out.print(getText() + " ");};

GROUP_BY: 'GROUP BY' WS? {if(false) System.out.print(getText() + " ");};

HAVING: 'HAVING' WS? {if(false) System.out.print(getText() + " ");};

ORDER_BY: 'ORDER BY' WS? {if(false) System.out.print(getText() + " ");};

SQ: 'SQ' WS? {if(false) System.out.print(getText() + " ");};

DOT: '.' WS? {if(false) System.out.print(getText() + " ");};

COMMA: ',' WS? {if(false) System.out.print(getText() + " ");};

AS: 'AS' WS? {if(false) System.out.print(getText() + " ");};

DESC: 'DESC' WS? | 'ASC' WS? {if(false) System.out.print(getText() + " ");};

LIMIT: 'LIMIT' WS? {if(false) System.out.print(getText() + " ");};

OFFSET: 'OFFSET' WS? {if(false) System.out.print(getText() + " ");};

DUAL: 'DUAL' WS?  {if(false) System.out.print(getText() + " ");};

TABLE_NAME: ( 'view_'?('A' | 'B' | 'C' | 'D')+ ) WS? {if(false) System.out.print(getText() + " ");};

SUBQUERY_FIELD: 'SQ'DIGIT'_'FIELDTK WS? {if(false) System.out.print(getText() + " ");};

SUBQUERY_TABLE_NAME: 'SQ'DIGIT'_'ALIAS WS? {if(false) System.out.print(getText() + " ");};

CHILD_SUBQUERY_TABLE_NAME: 'C_'SUBQUERY_TABLE_NAME WS? {if(false) System.out.print(getText() + " ");};

ALIAS: 'alias' [0-9]+ WS? {if(false) System.out.print(getText() + " ");};

FIELDTK: 'field' [0-9]+ WS? {if(false) System.out.print(getText() + " ");};

PK: 'pk' WS? {if(false) System.out.print(getText() + " ");};

GRAVE: '`' WS? {if(false) System.out.print(getText() + " ");};

COLUMN: 'col_'COL_TYPE'_'('key'|'nokey') WS? {if(false) System.out.print(getText() + " ");};

COL_TYPE: 'int' | 'varchar' {if(false) System.out.print(getText() + " ");};

DIGIT: [0-9][0-9]?[0-9]? WS? {if(false) System.out.print(getText() + " ");};

CHAR: '\''[a-z]'\'' WS? | '\'USA\'' WS? {if(false) System.out.print(getText() + " ");};

PERCENT: '%' WS? {if(false) System.out.print(getText() + " ");};

ASTERISK: '*' WS? {if(false) System.out.print(getText() + " ");};

SEMI: ';' WS? {if(false) System.out.print(getText() + " ");};

AGGREGATE_OP: ('COUNT' | 'SUM' | 'MIN' | 'MAX') WS? {if(false) System.out.print(getText() + " ");};

LIKE: 'LIKE' WS? {if(false) System.out.print(getText() + " ");};

AND_OR: 'AND' WS? | 'OR' WS? {if(false) System.out.print(getText() + " ");};

IS: 'IS' WS? {if(false) System.out.print(getText() + " ");};

NOT: 'NOT' WS? {if(false) System.out.print(getText() + " ");};

BETWEEN: 'BETWEEN' WS? {if(false) System.out.print(getText() + " ");};

IN: 'IN' WS? {if(false) System.out.print(getText() + " ");};

NULL: 'NULL' WS? {if(false) System.out.print(getText() + " ");};

LPAREN: ( '(' | '[' | '{' ) WS? {if(false) System.out.print(getText() + " ");};

RPAREN: (')' | ']' | '}') WS?  {if(false) System.out.print(getText() + " ");};

SYM: ( '.' | '`' | '_' | ';' | ',' | '\'' ) WS? {if(false) System.out.print(getText() + " ");};

OP: ( '+' | '-' | '*' | '/' ) WS? {if(false) System.out.print(getText() + " ");};

COMPARE_OP: ( '=' | '<' | '>' | '!=' | '<>' | '<=' | '>=' ) WS? {if(false) System.out.print(getText() + " ");};

WORD: ([a-zA-Z0-9] | '_')+ WS? {if(false) System.out.print(getText() + " ");};

WS: [ \t\r\n]+ ;
