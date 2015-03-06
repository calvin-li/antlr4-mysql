// Generated from mysql_expressions.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mysql_expressionsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, SELECT=4, DISTINCT=5, ANY=6, ALL=7, SOME=8, EXISTS=9, 
		SQL_SMALL_RESULT=10, CONCAT=11, UNION=12, ON=13, FROM=14, JOIN=15, INNER_JOIN=16, 
		LEFT=17, RIGHT=18, OUTER=19, STRAIGHT_JOIN=20, WHERE=21, GROUP_BY=22, 
		HAVING=23, ORDER_BY=24, SQ=25, DOT=26, COMMA=27, AS=28, DESC=29, LIMIT=30, 
		LIMIT_SIZE=31, OFFSET=32, DUAL=33, TABLE_NAME=34, SUBQUERY_TABLE_NAME=35, 
		CHILD_SUBQUERY_TABLE_NAME=36, ALIAS=37, FIELDTK=38, PK=39, GRAVE=40, COLUMN=41, 
		COL_TYPE=42, DIGIT=43, CHAR=44, EQUAL=45, PERCENT=46, ASTERISK=47, SEMI=48, 
		AGGREGATE_OP=49, LIKE=50, AND_OR=51, IS=52, NOT=53, BETWEEN=54, IN=55, 
		NULL=56, LPAREN=57, RPAREN=58, SYM=59, OP=60, COMPARE_OP=61, WORD=62, 
		WS=63;
	public static final int
		RULE_query = 0, RULE_explain = 1, RULE_select_list = 2, RULE_simple_select_list = 3, 
		RULE_aggregate_select_list = 4, RULE_new_select_item = 5, RULE_nonaggregate_select_item = 6, 
		RULE_aggregate_select_item = 7, RULE_combo_select_item = 8, RULE_select_subquery = 9, 
		RULE_select_subquery_body_disabled = 10, RULE_join_list = 11, RULE_join_list_disabled = 12, 
		RULE_join_type = 13, RULE_join_condition_item = 14, RULE_where_clause = 15, 
		RULE_where_subquery = 16, RULE_where_list = 17, RULE_generic_where_list = 18, 
		RULE_where_item = 19, RULE_ranged_where_list = 20, RULE_ranged_where_item = 21, 
		RULE_on_subquery = 22, RULE_general_subquery = 23, RULE_general_subquery_union_test_disabled = 24, 
		RULE_special_subquery = 25, RULE_single_union_subquery = 26, RULE_single_union_subquery_disabled = 27, 
		RULE_double_subquery = 28, RULE_correlated_subquery = 29, RULE_single_subquery = 30, 
		RULE_int_scalar_subquery = 31, RULE_subquery_body = 32, RULE_subquery_join_list = 33, 
		RULE_subquery_join_condition_item = 34, RULE_correlated_subquery_where_list = 35, 
		RULE_subquery_where_list = 36, RULE_correlated_subquery_where_item = 37, 
		RULE_subquery_where_item = 38, RULE_subquery_group_by = 39, RULE_subquery_having = 40, 
		RULE_subquery_having_item = 41, RULE_group_by_clause = 42, RULE_having_clause = 43, 
		RULE_having_item = 44, RULE_order_by_clause = 45, RULE_order_by_list = 46, 
		RULE_order_by_item = 47, RULE_total_order_by = 48, RULE_limit_rule = 49, 
		RULE_membership_operator = 50, RULE_all_any = 51, RULE_value = 52, RULE_table = 53, 
		RULE_new_table = 54, RULE_from_subquery = 55, RULE_new_subquery_table = 56, 
		RULE_subquery_table = 57, RULE_field = 58, RULE_aggregate = 59;
	public static final String[] ruleNames = {
		"query", "explain", "select_list", "simple_select_list", "aggregate_select_list", 
		"new_select_item", "nonaggregate_select_item", "aggregate_select_item", 
		"combo_select_item", "select_subquery", "select_subquery_body_disabled", 
		"join_list", "join_list_disabled", "join_type", "join_condition_item", 
		"where_clause", "where_subquery", "where_list", "generic_where_list", 
		"where_item", "ranged_where_list", "ranged_where_item", "on_subquery", 
		"general_subquery", "general_subquery_union_test_disabled", "special_subquery", 
		"single_union_subquery", "single_union_subquery_disabled", "double_subquery", 
		"correlated_subquery", "single_subquery", "int_scalar_subquery", "subquery_body", 
		"subquery_join_list", "subquery_join_condition_item", "correlated_subquery_where_list", 
		"subquery_where_list", "correlated_subquery_where_item", "subquery_where_item", 
		"subquery_group_by", "subquery_having", "subquery_having_item", "group_by_clause", 
		"having_clause", "having_item", "order_by_clause", "order_by_list", "order_by_item", 
		"total_order_by", "limit_rule", "membership_operator", "all_any", "value", 
		"table", "new_table", "from_subquery", "new_subquery_table", "subquery_table", 
		"field", "aggregate"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'EXPLAIN'", "'EXPLAIN EXTENDED'", "'1'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "SELECT", "DISTINCT", "ANY", "ALL", "SOME", "EXISTS", 
		"SQL_SMALL_RESULT", "CONCAT", "UNION", "ON", "FROM", "JOIN", "INNER_JOIN", 
		"LEFT", "RIGHT", "OUTER", "STRAIGHT_JOIN", "WHERE", "GROUP_BY", "HAVING", 
		"ORDER_BY", "SQ", "DOT", "COMMA", "AS", "DESC", "LIMIT", "LIMIT_SIZE", 
		"OFFSET", "DUAL", "TABLE_NAME", "SUBQUERY_TABLE_NAME", "CHILD_SUBQUERY_TABLE_NAME", 
		"ALIAS", "FIELDTK", "PK", "GRAVE", "COLUMN", "COL_TYPE", "DIGIT", "CHAR", 
		"EQUAL", "PERCENT", "ASTERISK", "SEMI", "AGGREGATE_OP", "LIKE", "AND_OR", 
		"IS", "NOT", "BETWEEN", "IN", "NULL", "LPAREN", "RPAREN", "SYM", "OP", 
		"COMPARE_OP", "WORD", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "mysql_expressions.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public mysql_expressionsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QueryContext extends ParserRuleContext {
		public ArrayList<Integer> tables =  new ArrayList<Integer>();
		public ArrayList<String> select_fields =  new ArrayList<String>();
		public int where_index =  -1;;
		public TerminalNode SELECT() { return getToken(mysql_expressionsParser.SELECT, 0); }
		public Simple_select_listContext simple_select_list() {
			return getRuleContext(Simple_select_listContext.class,0);
		}
		public TerminalNode FROM() { return getToken(mysql_expressionsParser.FROM, 0); }
		public Join_listContext join_list() {
			return getRuleContext(Join_listContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Having_clauseContext having_clause() {
			return getRuleContext(Having_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(mysql_expressionsParser.SEMI, 0); }
		public ExplainContext explain() {
			return getRuleContext(ExplainContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(mysql_expressionsParser.DISTINCT, 0); }
		public TerminalNode STRAIGHT_JOIN() { return getToken(mysql_expressionsParser.STRAIGHT_JOIN, 0); }
		public TerminalNode SQL_SMALL_RESULT() { return getToken(mysql_expressionsParser.SQL_SMALL_RESULT, 0); }
		public Group_by_clauseContext group_by_clause() {
			return getRuleContext(Group_by_clauseContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__1) {
				{
				setState(120);
				explain();
				}
			}

			setState(123);
			match(SELECT);
			setState(125);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(124);
				match(DISTINCT);
				}
			}

			setState(128);
			_la = _input.LA(1);
			if (_la==STRAIGHT_JOIN) {
				{
				setState(127);
				match(STRAIGHT_JOIN);
				}
			}

			setState(131);
			_la = _input.LA(1);
			if (_la==SQL_SMALL_RESULT) {
				{
				setState(130);
				match(SQL_SMALL_RESULT);
				}
			}

			setState(133);
			simple_select_list();
			setState(134);
			match(FROM);
			setState(135);
			join_list();
			((QueryContext)_localctx).where_index =  _input.getText(_localctx.start, _input.LT(-1)).length();
			setState(137);
			where_clause();
			setState(139);
			_la = _input.LA(1);
			if (_la==GROUP_BY) {
				{
				setState(138);
				group_by_clause();
				}
			}

			setState(141);
			having_clause();
			setState(142);
			order_by_clause();
			setState(143);
			match(SEMI);

			    java.util.Random rng = new java.util.Random(0);
			    String query = _input.getText(_localctx.start, _input.LT(-1));

			    String[] types = {"int", "varchar"};
			    String[] is_key = {"key", "nokey"};
			    String[] and_or = {"AND", "OR"};
			    String[] compare = {"=", "<", ">", "!=", "<>", "<=", ">="};

			    String select_more = " " ;

			    for(int i = 1; i <= _localctx.tables.size(); i++){
			        Boolean duplicate_field = true;
			        String new_field = "";

			        //make sure we do not select same field twice
			        while(duplicate_field){
			            String type = types[rng.nextInt(types.length)];
			            String key = is_key[rng.nextInt(is_key.length)];
			            new_field = "";

			            new_field += "alias" + i + ".";
			            if(rng.nextInt(100) < 90)
			                new_field += "`col_" + type + "_" + key + "`";
			            else
			                new_field += "`pk`";

			            duplicate_field = false;
			            for(String f : _localctx.select_fields){
			                if(f.equals(new_field))
			                    duplicate_field = true;
			            }//for
			        }//while

			        select_more += new_field;
			        select_more += " AS ";
			        select_more += "field" + (_localctx.select_fields.size() + i);
			        select_more += ", ";
			    }//for

			    select_more += ' ';

			    query = query.replaceFirst("SELECT", "SELECT" + select_more);

			    String where_more = "\n";

			    for(int i=0; i<4; i++){
			        String alias = "alias" + (rng.nextInt(_localctx.tables.size())+1);

			        String type = types[rng.nextInt(types.length)];
			        String key = is_key[rng.nextInt(is_key.length)];
			        String conj = and_or[rng.nextInt(and_or.length)];
			        String op = compare[rng.nextInt(compare.length)];

			        String characters = "abcdefghijklmnopqrstuvwxyz";
			        String value = "";
			        if(type.equals("int"))
			            value = Integer.toString(rng.nextInt() % 100);
			        else if(type.equals("varchar")){
			            for(int j=0; j<5; j++)
			                value += characters.charAt(rng.nextInt(characters.length()));
			        }

			        where_more += alias + ".";
			        where_more += "`col_" + type + "_" + key + "`";
			        where_more += " " + op + " " + value + " " + conj + " ";
			    }
			    where_more += "\n";
			    _localctx.where_index += select_more.length() + "WHERE ".length();
			    query = query.substring(0, _localctx.where_index-1) + where_more + query.substring(_localctx.where_index);

			    try{
			        java.io.PrintWriter outfile = new java.io.PrintWriter("out.txt");
			        outfile.print(query);
			        outfile.close();
			    } catch (java.io.FileNotFoundException e){
			        System.err.println("Cannot open output file");
			    }
			 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplainContext extends ParserRuleContext {
		public ExplainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitExplain(this);
		}
	}

	public final ExplainContext explain() throws RecognitionException {
		ExplainContext _localctx = new ExplainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_explain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_listContext extends ParserRuleContext {
		public List<New_select_itemContext> new_select_item() {
			return getRuleContexts(New_select_itemContext.class);
		}
		public New_select_itemContext new_select_item(int i) {
			return getRuleContext(New_select_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(mysql_expressionsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mysql_expressionsParser.COMMA, i);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterSelect_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitSelect_list(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_select_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			new_select_item();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(149);
				match(COMMA);
				setState(150);
				new_select_item();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_select_listContext extends ParserRuleContext {
		public List<Nonaggregate_select_itemContext> nonaggregate_select_item() {
			return getRuleContexts(Nonaggregate_select_itemContext.class);
		}
		public Nonaggregate_select_itemContext nonaggregate_select_item(int i) {
			return getRuleContext(Nonaggregate_select_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(mysql_expressionsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mysql_expressionsParser.COMMA, i);
		}
		public Simple_select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_select_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterSimple_select_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitSimple_select_list(this);
		}
	}

	public final Simple_select_listContext simple_select_list() throws RecognitionException {
		Simple_select_listContext _localctx = new Simple_select_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_simple_select_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			nonaggregate_select_item();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(157);
				match(COMMA);
				setState(158);
				nonaggregate_select_item();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aggregate_select_listContext extends ParserRuleContext {
		public List<Aggregate_select_itemContext> aggregate_select_item() {
			return getRuleContexts(Aggregate_select_itemContext.class);
		}
		public Aggregate_select_itemContext aggregate_select_item(int i) {
			return getRuleContext(Aggregate_select_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(mysql_expressionsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mysql_expressionsParser.COMMA, i);
		}
		public Aggregate_select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_select_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterAggregate_select_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitAggregate_select_list(this);
		}
	}

	public final Aggregate_select_listContext aggregate_select_list() throws RecognitionException {
		Aggregate_select_listContext _localctx = new Aggregate_select_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_aggregate_select_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			aggregate_select_item();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(165);
				match(COMMA);
				setState(166);
				aggregate_select_item();
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_select_itemContext extends ParserRuleContext {
		public Nonaggregate_select_itemContext nonaggregate_select_item() {
			return getRuleContext(Nonaggregate_select_itemContext.class,0);
		}
		public Aggregate_select_itemContext aggregate_select_item() {
			return getRuleContext(Aggregate_select_itemContext.class,0);
		}
		public Combo_select_itemContext combo_select_item() {
			return getRuleContext(Combo_select_itemContext.class,0);
		}
		public Select_subqueryContext select_subquery() {
			return getRuleContext(Select_subqueryContext.class,0);
		}
		public New_select_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_select_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterNew_select_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitNew_select_item(this);
		}
	}

	public final New_select_itemContext new_select_item() throws RecognitionException {
		New_select_itemContext _localctx = new New_select_itemContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_new_select_item);
		try {
			setState(176);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				nonaggregate_select_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				aggregate_select_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				combo_select_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(175);
				select_subquery();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nonaggregate_select_itemContext extends ParserRuleContext {
		public FieldContext f;
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public TerminalNode DOT() { return getToken(mysql_expressionsParser.DOT, 0); }
		public TerminalNode AS() { return getToken(mysql_expressionsParser.AS, 0); }
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public Nonaggregate_select_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonaggregate_select_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterNonaggregate_select_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitNonaggregate_select_item(this);
		}
	}

	public final Nonaggregate_select_itemContext nonaggregate_select_item() throws RecognitionException {
		Nonaggregate_select_itemContext _localctx = new Nonaggregate_select_itemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nonaggregate_select_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			table();
			setState(179);
			match(DOT);
			setState(180);
			((Nonaggregate_select_itemContext)_localctx).f = field();
			setState(181);
			match(AS);
			setState(182);
			field();
			((QueryContext)getInvokingContext(0)).select_fields.add(_input.getText(_localctx.start, _input.LT(-1)).split("AS")[0]);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aggregate_select_itemContext extends ParserRuleContext {
		public AggregateContext aggregate() {
			return getRuleContext(AggregateContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public TerminalNode DOT() { return getToken(mysql_expressionsParser.DOT, 0); }
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public TerminalNode AS() { return getToken(mysql_expressionsParser.AS, 0); }
		public TerminalNode RPAREN() { return getToken(mysql_expressionsParser.RPAREN, 0); }
		public Aggregate_select_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_select_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterAggregate_select_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitAggregate_select_item(this);
		}
	}

	public final Aggregate_select_itemContext aggregate_select_item() throws RecognitionException {
		Aggregate_select_itemContext _localctx = new Aggregate_select_itemContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_aggregate_select_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			aggregate();
			setState(186);
			table();
			setState(187);
			match(DOT);
			setState(188);
			field();
			setState(190);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(189);
				match(RPAREN);
				}
			}

			setState(192);
			match(AS);
			setState(193);
			field();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Combo_select_itemContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(mysql_expressionsParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(mysql_expressionsParser.LPAREN, i);
		}
		public List<TableContext> table() {
			return getRuleContexts(TableContext.class);
		}
		public TableContext table(int i) {
			return getRuleContext(TableContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(mysql_expressionsParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(mysql_expressionsParser.DOT, i);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(mysql_expressionsParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(mysql_expressionsParser.RPAREN, i);
		}
		public TerminalNode OP() { return getToken(mysql_expressionsParser.OP, 0); }
		public TerminalNode AS() { return getToken(mysql_expressionsParser.AS, 0); }
		public TerminalNode CONCAT() { return getToken(mysql_expressionsParser.CONCAT, 0); }
		public TerminalNode COMMA() { return getToken(mysql_expressionsParser.COMMA, 0); }
		public Combo_select_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combo_select_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterCombo_select_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitCombo_select_item(this);
		}
	}

	public final Combo_select_itemContext combo_select_item() throws RecognitionException {
		Combo_select_itemContext _localctx = new Combo_select_itemContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_combo_select_item);
		try {
			setState(224);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(LPAREN);
				setState(196);
				match(LPAREN);
				setState(197);
				table();
				setState(198);
				match(DOT);
				setState(199);
				field();
				setState(200);
				match(RPAREN);
				setState(201);
				match(OP);
				setState(202);
				match(LPAREN);
				setState(203);
				table();
				setState(204);
				match(DOT);
				setState(205);
				table();
				setState(206);
				match(RPAREN);
				setState(207);
				match(RPAREN);
				setState(208);
				match(AS);
				setState(209);
				field();
				}
				break;
			case CONCAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(CONCAT);
				setState(212);
				match(LPAREN);
				setState(213);
				table();
				setState(214);
				match(DOT);
				setState(215);
				field();
				setState(216);
				match(COMMA);
				setState(217);
				table();
				setState(218);
				match(DOT);
				setState(219);
				field();
				setState(220);
				match(RPAREN);
				setState(221);
				match(AS);
				setState(222);
				field();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_subqueryContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(mysql_expressionsParser.AS, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public Single_subqueryContext single_subquery() {
			return getRuleContext(Single_subqueryContext.class,0);
		}
		public Int_scalar_subqueryContext int_scalar_subquery() {
			return getRuleContext(Int_scalar_subqueryContext.class,0);
		}
		public Select_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterSelect_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitSelect_subquery(this);
		}
	}

	public final Select_subqueryContext select_subquery() throws RecognitionException {
		Select_subqueryContext _localctx = new Select_subqueryContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_select_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(226);
				single_subquery();
				}
				break;
			case 2:
				{
				setState(227);
				int_scalar_subquery();
				}
				break;
			}
			setState(230);
			match(AS);
			setState(231);
			field();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_subquery_body_disabledContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(mysql_expressionsParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(mysql_expressionsParser.LPAREN, i);
		}
		public TerminalNode SELECT() { return getToken(mysql_expressionsParser.SELECT, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode UNION() { return getToken(mysql_expressionsParser.UNION, 0); }
		public TerminalNode LIMIT() { return getToken(mysql_expressionsParser.LIMIT, 0); }
		public TerminalNode AS() { return getToken(mysql_expressionsParser.AS, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode ALL() { return getToken(mysql_expressionsParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(mysql_expressionsParser.DISTINCT, 0); }
		public Select_subquery_body_disabledContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_subquery_body_disabled; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterSelect_subquery_body_disabled(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitSelect_subquery_body_disabled(this);
		}
	}

	public final Select_subquery_body_disabledContext select_subquery_body_disabled() throws RecognitionException {
		Select_subquery_body_disabledContext _localctx = new Select_subquery_body_disabledContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_select_subquery_body_disabled);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(LPAREN);
			setState(234);
			match(SELECT);
			setState(235);
			value();
			setState(236);
			match(UNION);
			setState(237);
			_la = _input.LA(1);
			if ( !(_la==DISTINCT || _la==ALL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(238);
			match(LPAREN);
			setState(239);
			value();
			setState(240);
			match(LIMIT);
			setState(241);
			match(T__2);
			setState(242);
			match(AS);
			setState(243);
			field();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_listContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(mysql_expressionsParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(mysql_expressionsParser.LPAREN, i);
		}
		public List<New_tableContext> new_table() {
			return getRuleContexts(New_tableContext.class);
		}
		public New_tableContext new_table(int i) {
			return getRuleContext(New_tableContext.class,i);
		}
		public List<Join_typeContext> join_type() {
			return getRuleContexts(Join_typeContext.class);
		}
		public Join_typeContext join_type(int i) {
			return getRuleContext(Join_typeContext.class,i);
		}
		public List<TerminalNode> ON() { return getTokens(mysql_expressionsParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(mysql_expressionsParser.ON, i);
		}
		public List<Join_condition_itemContext> join_condition_item() {
			return getRuleContexts(Join_condition_itemContext.class);
		}
		public Join_condition_itemContext join_condition_item(int i) {
			return getRuleContext(Join_condition_itemContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(mysql_expressionsParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(mysql_expressionsParser.RPAREN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(mysql_expressionsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mysql_expressionsParser.COMMA, i);
		}
		public Join_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterJoin_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitJoin_list(this);
		}
	}

	public final Join_listContext join_list() throws RecognitionException {
		Join_listContext _localctx = new Join_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_join_list);
		int _la;
		try {
			setState(284);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(LPAREN);
				setState(246);
				new_table();
				setState(247);
				join_type();
				setState(248);
				new_table();
				setState(249);
				match(ON);
				setState(250);
				match(LPAREN);
				setState(251);
				join_condition_item();
				setState(252);
				match(RPAREN);
				setState(253);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				match(LPAREN);
				setState(256);
				join_type();
				setState(257);
				match(LPAREN);
				setState(258);
				match(LPAREN);
				setState(259);
				new_table();
				setState(260);
				join_type();
				setState(261);
				new_table();
				setState(262);
				match(ON);
				setState(263);
				match(LPAREN);
				setState(264);
				join_condition_item();
				setState(265);
				match(RPAREN);
				setState(266);
				match(RPAREN);
				setState(267);
				match(RPAREN);
				setState(268);
				match(ON);
				setState(269);
				match(LPAREN);
				setState(270);
				join_condition_item();
				setState(271);
				match(RPAREN);
				setState(272);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				match(LPAREN);
				setState(275);
				new_table();
				setState(278); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(276);
					match(COMMA);
					setState(277);
					new_table();
					}
					}
					setState(280); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(282);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_list_disabledContext extends ParserRuleContext {
		public New_tableContext new_table() {
			return getRuleContext(New_tableContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(mysql_expressionsParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(mysql_expressionsParser.LPAREN, i);
		}
		public Join_typeContext join_type() {
			return getRuleContext(Join_typeContext.class,0);
		}
		public Join_listContext join_list() {
			return getRuleContext(Join_listContext.class,0);
		}
		public TerminalNode ON() { return getToken(mysql_expressionsParser.ON, 0); }
		public Join_condition_itemContext join_condition_item() {
			return getRuleContext(Join_condition_itemContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(mysql_expressionsParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(mysql_expressionsParser.RPAREN, i);
		}
		public Join_list_disabledContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_list_disabled; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterJoin_list_disabled(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitJoin_list_disabled(this);
		}
	}

	public final Join_list_disabledContext join_list_disabled() throws RecognitionException {
		Join_list_disabledContext _localctx = new Join_list_disabledContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_join_list_disabled);
		try {
			setState(297);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				new_table();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				match(LPAREN);
				setState(288);
				new_table();
				setState(289);
				join_type();
				setState(290);
				join_list();
				setState(291);
				match(ON);
				setState(292);
				match(LPAREN);
				setState(293);
				join_condition_item();
				setState(294);
				match(RPAREN);
				setState(295);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_typeContext extends ParserRuleContext {
		public TerminalNode INNER_JOIN() { return getToken(mysql_expressionsParser.INNER_JOIN, 0); }
		public TerminalNode JOIN() { return getToken(mysql_expressionsParser.JOIN, 0); }
		public TerminalNode LEFT() { return getToken(mysql_expressionsParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(mysql_expressionsParser.RIGHT, 0); }
		public TerminalNode OUTER() { return getToken(mysql_expressionsParser.OUTER, 0); }
		public TerminalNode STRAIGHT_JOIN() { return getToken(mysql_expressionsParser.STRAIGHT_JOIN, 0); }
		public Join_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterJoin_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitJoin_type(this);
		}
	}

	public final Join_typeContext join_type() throws RecognitionException {
		Join_typeContext _localctx = new Join_typeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_join_type);
		int _la;
		try {
			setState(306);
			switch (_input.LA(1)) {
			case INNER_JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				match(INNER_JOIN);
				}
				break;
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				_la = _input.LA(1);
				if ( !(_la==LEFT || _la==RIGHT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(302);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(301);
					match(OUTER);
					}
				}

				setState(304);
				match(JOIN);
				}
				break;
			case STRAIGHT_JOIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				match(STRAIGHT_JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_condition_itemContext extends ParserRuleContext {
		public List<TableContext> table() {
			return getRuleContexts(TableContext.class);
		}
		public TableContext table(int i) {
			return getRuleContext(TableContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(mysql_expressionsParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(mysql_expressionsParser.DOT, i);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(mysql_expressionsParser.EQUAL, 0); }
		public On_subqueryContext on_subquery() {
			return getRuleContext(On_subqueryContext.class,0);
		}
		public Join_condition_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_condition_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterJoin_condition_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitJoin_condition_item(this);
		}
	}

	public final Join_condition_itemContext join_condition_item() throws RecognitionException {
		Join_condition_itemContext _localctx = new Join_condition_itemContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_join_condition_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			table();
			setState(309);
			match(DOT);
			setState(310);
			field();
			setState(311);
			match(EQUAL);
			setState(312);
			table();
			setState(313);
			match(DOT);
			setState(314);
			field();
			setState(316);
			_la = _input.LA(1);
			if (_la==SUBQUERY_TABLE_NAME || _la==CHILD_SUBQUERY_TABLE_NAME) {
				{
				setState(315);
				on_subquery();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(mysql_expressionsParser.WHERE, 0); }
		public Where_subqueryContext where_subquery() {
			return getRuleContext(Where_subqueryContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(mysql_expressionsParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(mysql_expressionsParser.RPAREN, 0); }
		public TerminalNode AND_OR() { return getToken(mysql_expressionsParser.AND_OR, 0); }
		public Where_listContext where_list() {
			return getRuleContext(Where_listContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitWhere_clause(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_where_clause);
		try {
			setState(327);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				match(WHERE);
				setState(319);
				where_subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				match(WHERE);
				setState(321);
				match(LPAREN);
				setState(322);
				where_subquery();
				setState(323);
				match(RPAREN);
				setState(324);
				match(AND_OR);
				setState(325);
				where_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_subqueryContext extends ParserRuleContext {
		public General_subqueryContext general_subquery() {
			return getRuleContext(General_subqueryContext.class,0);
		}
		public Special_subqueryContext special_subquery() {
			return getRuleContext(Special_subqueryContext.class,0);
		}
		public Where_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterWhere_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitWhere_subquery(this);
		}
	}

	public final Where_subqueryContext where_subquery() throws RecognitionException {
		Where_subqueryContext _localctx = new Where_subqueryContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_where_subquery);
		try {
			setState(331);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				general_subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				special_subquery();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_listContext extends ParserRuleContext {
		public Generic_where_listContext generic_where_list() {
			return getRuleContext(Generic_where_listContext.class,0);
		}
		public Ranged_where_listContext ranged_where_list() {
			return getRuleContext(Ranged_where_listContext.class,0);
		}
		public TerminalNode AND_OR() { return getToken(mysql_expressionsParser.AND_OR, 0); }
		public Where_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterWhere_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitWhere_list(this);
		}
	}

	public final Where_listContext where_list() throws RecognitionException {
		Where_listContext _localctx = new Where_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_where_list);
		int _la;
		try {
			setState(339);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				generic_where_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				ranged_where_list();
				setState(337);
				_la = _input.LA(1);
				if (_la==AND_OR) {
					{
					setState(335);
					match(AND_OR);
					setState(336);
					generic_where_list();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_where_listContext extends ParserRuleContext {
		public List<Where_itemContext> where_item() {
			return getRuleContexts(Where_itemContext.class);
		}
		public Where_itemContext where_item(int i) {
			return getRuleContext(Where_itemContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(mysql_expressionsParser.LPAREN, 0); }
		public TerminalNode AND_OR() { return getToken(mysql_expressionsParser.AND_OR, 0); }
		public TerminalNode RPAREN() { return getToken(mysql_expressionsParser.RPAREN, 0); }
		public Generic_where_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_where_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterGeneric_where_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitGeneric_where_list(this);
		}
	}

	public final Generic_where_listContext generic_where_list() throws RecognitionException {
		Generic_where_listContext _localctx = new Generic_where_listContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_generic_where_list);
		try {
			setState(348);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				where_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				match(LPAREN);
				setState(343);
				where_item();
				setState(344);
				match(AND_OR);
				setState(345);
				where_item();
				setState(346);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_itemContext extends ParserRuleContext {
		public Where_subqueryContext where_subquery() {
			return getRuleContext(Where_subqueryContext.class,0);
		}
		public List<TableContext> table() {
			return getRuleContexts(TableContext.class);
		}
		public TableContext table(int i) {
			return getRuleContext(TableContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(mysql_expressionsParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(mysql_expressionsParser.DOT, i);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public TerminalNode COMPARE_OP() { return getToken(mysql_expressionsParser.COMPARE_OP, 0); }
		public TerminalNode IS() { return getToken(mysql_expressionsParser.IS, 0); }
		public TerminalNode NULL() { return getToken(mysql_expressionsParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(mysql_expressionsParser.NOT, 0); }
		public Where_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterWhere_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitWhere_item(this);
		}
	}

	public final Where_itemContext where_item() throws RecognitionException {
		Where_itemContext _localctx = new Where_itemContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_where_item);
		int _la;
		try {
			setState(368);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				where_subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				table();
				setState(352);
				match(DOT);
				setState(353);
				field();
				setState(354);
				match(COMPARE_OP);
				setState(355);
				table();
				setState(356);
				match(DOT);
				setState(357);
				field();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				table();
				setState(360);
				match(DOT);
				setState(361);
				field();
				setState(362);
				match(IS);
				setState(364);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(363);
					match(NOT);
					}
				}

				setState(366);
				match(NULL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ranged_where_listContext extends ParserRuleContext {
		public List<Ranged_where_itemContext> ranged_where_item() {
			return getRuleContexts(Ranged_where_itemContext.class);
		}
		public Ranged_where_itemContext ranged_where_item(int i) {
			return getRuleContext(Ranged_where_itemContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(mysql_expressionsParser.LPAREN, 0); }
		public TerminalNode AND_OR() { return getToken(mysql_expressionsParser.AND_OR, 0); }
		public TerminalNode RPAREN() { return getToken(mysql_expressionsParser.RPAREN, 0); }
		public Ranged_where_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ranged_where_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterRanged_where_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitRanged_where_list(this);
		}
	}

	public final Ranged_where_listContext ranged_where_list() throws RecognitionException {
		Ranged_where_listContext _localctx = new Ranged_where_listContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ranged_where_list);
		try {
			setState(377);
			switch (_input.LA(1)) {
			case TABLE_NAME:
			case ALIAS:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				ranged_where_item();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				match(LPAREN);
				setState(372);
				ranged_where_item();
				setState(373);
				match(AND_OR);
				setState(374);
				ranged_where_item();
				setState(375);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ranged_where_itemContext extends ParserRuleContext {
		public List<TableContext> table() {
			return getRuleContexts(TableContext.class);
		}
		public TableContext table(int i) {
			return getRuleContext(TableContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(mysql_expressionsParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(mysql_expressionsParser.DOT, i);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public TerminalNode BETWEEN() { return getToken(mysql_expressionsParser.BETWEEN, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(mysql_expressionsParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(mysql_expressionsParser.DIGIT, i);
		}
		public TerminalNode AND_OR() { return getToken(mysql_expressionsParser.AND_OR, 0); }
		public TerminalNode LPAREN() { return getToken(mysql_expressionsParser.LPAREN, 0); }
		public TerminalNode OP() { return getToken(mysql_expressionsParser.OP, 0); }
		public TerminalNode RPAREN() { return getToken(mysql_expressionsParser.RPAREN, 0); }
		public TerminalNode NOT() { return getToken(mysql_expressionsParser.NOT, 0); }
		public List<TerminalNode> COMPARE_OP() { return getTokens(mysql_expressionsParser.COMPARE_OP); }
		public TerminalNode COMPARE_OP(int i) {
			return getToken(mysql_expressionsParser.COMPARE_OP, i);
		}
		public List<TerminalNode> CHAR() { return getTokens(mysql_expressionsParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(mysql_expressionsParser.CHAR, i);
		}
		public TerminalNode IN() { return getToken(mysql_expressionsParser.IN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(mysql_expressionsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mysql_expressionsParser.COMMA, i);
		}
		public TerminalNode EQUAL() { return getToken(mysql_expressionsParser.EQUAL, 0); }
		public TerminalNode LIKE() { return getToken(mysql_expressionsParser.LIKE, 0); }
		public TerminalNode CONCAT() { return getToken(mysql_expressionsParser.CONCAT, 0); }
		public TerminalNode PERCENT() { return getToken(mysql_expressionsParser.PERCENT, 0); }
		public Ranged_where_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ranged_where_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterRanged_where_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitRanged_where_item(this);
		}
	}

	public final Ranged_where_itemContext ranged_where_item() throws RecognitionException {
		Ranged_where_itemContext _localctx = new Ranged_where_itemContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ranged_where_item);
		int _la;
		try {
			setState(470);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				table();
				setState(380);
				match(DOT);
				setState(381);
				field();
				setState(383);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(382);
					match(NOT);
					}
				}

				setState(385);
				match(BETWEEN);
				setState(386);
				match(DIGIT);
				setState(387);
				match(AND_OR);
				setState(388);
				match(LPAREN);
				setState(389);
				match(DIGIT);
				setState(390);
				match(OP);
				setState(391);
				match(DIGIT);
				setState(392);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				table();
				setState(395);
				match(DOT);
				setState(396);
				field();
				setState(397);
				match(COMPARE_OP);
				setState(398);
				match(CHAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(400);
				table();
				setState(401);
				match(DOT);
				setState(402);
				field();
				setState(404);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(403);
					match(NOT);
					}
				}

				setState(406);
				match(IN);
				setState(407);
				match(DIGIT);
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(408);
					match(COMMA);
					setState(409);
					match(DIGIT);
					}
					}
					setState(414);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(415);
				table();
				setState(416);
				match(DOT);
				setState(417);
				field();
				setState(419);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(418);
					match(NOT);
					}
				}

				setState(421);
				match(IN);
				setState(422);
				match(CHAR);
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(423);
					match(COMMA);
					setState(424);
					match(CHAR);
					}
					}
					setState(429);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(430);
				table();
				setState(431);
				match(DOT);
				setState(432);
				field();
				setState(433);
				match(COMPARE_OP);
				setState(434);
				match(DIGIT);
				setState(435);
				match(AND_OR);
				setState(436);
				table();
				setState(437);
				match(DOT);
				setState(438);
				field();
				setState(439);
				match(COMPARE_OP);
				setState(440);
				match(LPAREN);
				setState(441);
				match(DIGIT);
				setState(442);
				match(OP);
				setState(443);
				match(DIGIT);
				setState(444);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(446);
				table();
				setState(447);
				match(DOT);
				setState(448);
				field();
				setState(449);
				match(EQUAL);
				setState(450);
				_la = _input.LA(1);
				if ( !(_la==DIGIT || _la==CHAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(452);
				table();
				setState(453);
				match(DOT);
				setState(454);
				match(LIKE);
				setState(455);
				match(CONCAT);
				setState(456);
				match(LPAREN);
				setState(457);
				match(CHAR);
				setState(458);
				match(COMMA);
				setState(459);
				match(PERCENT);
				setState(460);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(462);
				table();
				setState(463);
				match(DOT);
				setState(464);
				field();
				setState(465);
				match(EQUAL);
				setState(466);
				table();
				setState(467);
				match(DOT);
				setState(468);
				field();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class On_subqueryContext extends ParserRuleContext {
		public Subquery_tableContext subquery_table() {
			return getRuleContext(Subquery_tableContext.class,0);
		}
		public TerminalNode AND_OR() { return getToken(mysql_expressionsParser.AND_OR, 0); }
		public General_subqueryContext general_subquery() {
			return getRuleContext(General_subqueryContext.class,0);
		}
		public On_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_on_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterOn_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitOn_subquery(this);
		}
	}

	public final On_subqueryContext on_subquery() throws RecognitionException {
		On_subqueryContext _localctx = new On_subqueryContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_on_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			subquery_table();
			setState(473);
			match(AND_OR);
			setState(474);
			general_subquery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class General_subqueryContext extends ParserRuleContext {
		public List<TableContext> table() {
			return getRuleContexts(TableContext.class);
		}
		public TableContext table(int i) {
			return getRuleContext(TableContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(mysql_expressionsParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(mysql_expressionsParser.DOT, i);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public TerminalNode COMPARE_OP() { return getToken(mysql_expressionsParser.COMPARE_OP, 0); }
		public Single_subqueryContext single_subquery() {
			return getRuleContext(Single_subqueryContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(mysql_expressionsParser.LPAREN, 0); }
		public TerminalNode COMMA() { return getToken(mysql_expressionsParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(mysql_expressionsParser.RPAREN, 0); }
		public TerminalNode IN() { return getToken(mysql_expressionsParser.IN, 0); }
		public Double_subqueryContext double_subquery() {
			return getRuleContext(Double_subqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(mysql_expressionsParser.NOT, 0); }
		public Membership_operatorContext membership_operator() {
			return getRuleContext(Membership_operatorContext.class,0);
		}
		public List<TerminalNode> DIGIT() { return getTokens(mysql_expressionsParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(mysql_expressionsParser.DIGIT, i);
		}
		public List<TerminalNode> CHAR() { return getTokens(mysql_expressionsParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(mysql_expressionsParser.CHAR, i);
		}
		public Single_union_subqueryContext single_union_subquery() {
			return getRuleContext(Single_union_subqueryContext.class,0);
		}
		public General_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterGeneral_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitGeneral_subquery(this);
		}
	}

	public final General_subqueryContext general_subquery() throws RecognitionException {
		General_subqueryContext _localctx = new General_subqueryContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_general_subquery);
		int _la;
		try {
			setState(529);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				table();
				setState(477);
				match(DOT);
				setState(478);
				field();
				setState(479);
				match(COMPARE_OP);
				setState(480);
				single_subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				match(LPAREN);
				setState(483);
				table();
				setState(484);
				match(DOT);
				setState(485);
				field();
				setState(486);
				match(COMMA);
				setState(487);
				table();
				setState(488);
				match(DOT);
				setState(489);
				field();
				setState(490);
				match(RPAREN);
				setState(492);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(491);
					match(NOT);
					}
				}

				setState(494);
				match(IN);
				setState(495);
				double_subquery();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(497);
				table();
				setState(498);
				match(DOT);
				setState(499);
				field();
				setState(500);
				membership_operator();
				setState(501);
				single_subquery();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(503);
				match(LPAREN);
				setState(504);
				match(DIGIT);
				setState(505);
				match(COMMA);
				setState(506);
				match(DIGIT);
				setState(507);
				match(RPAREN);
				setState(509);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(508);
					match(NOT);
					}
				}

				setState(511);
				match(IN);
				setState(512);
				double_subquery();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(513);
				match(LPAREN);
				setState(514);
				match(CHAR);
				setState(515);
				match(COMMA);
				setState(516);
				match(CHAR);
				setState(517);
				match(RPAREN);
				setState(519);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(518);
					match(NOT);
					}
				}

				setState(521);
				match(IN);
				setState(522);
				double_subquery();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(523);
				table();
				setState(524);
				match(DOT);
				setState(525);
				field();
				setState(526);
				membership_operator();
				setState(527);
				single_union_subquery();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class General_subquery_union_test_disabledContext extends ParserRuleContext {
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public TerminalNode DOT() { return getToken(mysql_expressionsParser.DOT, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode COMPARE_OP() { return getToken(mysql_expressionsParser.COMPARE_OP, 0); }
		public All_anyContext all_any() {
			return getRuleContext(All_anyContext.class,0);
		}
		public Single_union_subquery_disabledContext single_union_subquery_disabled() {
			return getRuleContext(Single_union_subquery_disabledContext.class,0);
		}
		public General_subquery_union_test_disabledContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general_subquery_union_test_disabled; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterGeneral_subquery_union_test_disabled(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitGeneral_subquery_union_test_disabled(this);
		}
	}

	public final General_subquery_union_test_disabledContext general_subquery_union_test_disabled() throws RecognitionException {
		General_subquery_union_test_disabledContext _localctx = new General_subquery_union_test_disabledContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_general_subquery_union_test_disabled);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			table();
			setState(532);
			match(DOT);
			setState(533);
			field();
			setState(534);
			match(COMPARE_OP);
			setState(535);
			all_any();
			setState(536);
			single_union_subquery_disabled();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Special_subqueryContext extends ParserRuleContext {
		public TerminalNode EXISTS() { return getToken(mysql_expressionsParser.EXISTS, 0); }
		public TerminalNode LPAREN() { return getToken(mysql_expressionsParser.LPAREN, 0); }
		public Single_subqueryContext single_subquery() {
			return getRuleContext(Single_subqueryContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(mysql_expressionsParser.RPAREN, 0); }
		public Correlated_subqueryContext correlated_subquery() {
			return getRuleContext(Correlated_subqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(mysql_expressionsParser.NOT, 0); }
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public TerminalNode DOT() { return getToken(mysql_expressionsParser.DOT, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public Membership_operatorContext membership_operator() {
			return getRuleContext(Membership_operatorContext.class,0);
		}
		public TerminalNode IS() { return getToken(mysql_expressionsParser.IS, 0); }
		public TerminalNode NULL() { return getToken(mysql_expressionsParser.NULL, 0); }
		public Special_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterSpecial_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitSpecial_subquery(this);
		}
	}

	public final Special_subqueryContext special_subquery() throws RecognitionException {
		Special_subqueryContext _localctx = new Special_subqueryContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_special_subquery);
		int _la;
		try {
			setState(562);
			switch (_input.LA(1)) {
			case EXISTS:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(539);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(538);
					match(NOT);
					}
				}

				setState(541);
				match(EXISTS);
				setState(547);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(542);
					match(LPAREN);
					setState(543);
					single_subquery();
					setState(544);
					match(RPAREN);
					}
					break;
				case 2:
					{
					setState(546);
					correlated_subquery();
					}
					break;
				}
				}
				break;
			case TABLE_NAME:
			case ALIAS:
				enterOuterAlt(_localctx, 2);
				{
				setState(549);
				table();
				setState(550);
				match(DOT);
				setState(551);
				field();
				setState(552);
				membership_operator();
				setState(553);
				correlated_subquery();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(555);
				single_subquery();
				setState(556);
				match(IS);
				setState(558);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(557);
					match(NOT);
					}
				}

				setState(560);
				match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_union_subqueryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(mysql_expressionsParser.LPAREN, 0); }
		public List<TerminalNode> SELECT() { return getTokens(mysql_expressionsParser.SELECT); }
		public TerminalNode SELECT(int i) {
			return getToken(mysql_expressionsParser.SELECT, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode UNION() { return getToken(mysql_expressionsParser.UNION, 0); }
		public TerminalNode RPAREN() { return getToken(mysql_expressionsParser.RPAREN, 0); }
		public TerminalNode ALL() { return getToken(mysql_expressionsParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(mysql_expressionsParser.DISTINCT, 0); }
		public Single_union_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_union_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterSingle_union_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitSingle_union_subquery(this);
		}
	}

	public final Single_union_subqueryContext single_union_subquery() throws RecognitionException {
		Single_union_subqueryContext _localctx = new Single_union_subqueryContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_single_union_subquery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			match(LPAREN);
			setState(565);
			match(SELECT);
			setState(566);
			value();
			setState(567);
			match(UNION);
			setState(569);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==ALL) {
				{
				setState(568);
				_la = _input.LA(1);
				if ( !(_la==DISTINCT || _la==ALL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(571);
			match(SELECT);
			setState(572);
			value();
			setState(573);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_union_subquery_disabledContext extends ParserRuleContext {
		public List<Single_subqueryContext> single_subquery() {
			return getRuleContexts(Single_subqueryContext.class);
		}
		public Single_subqueryContext single_subquery(int i) {
			return getRuleContext(Single_subqueryContext.class,i);
		}
		public TerminalNode UNION() { return getToken(mysql_expressionsParser.UNION, 0); }
		public TerminalNode ALL() { return getToken(mysql_expressionsParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(mysql_expressionsParser.DISTINCT, 0); }
		public Single_union_subquery_disabledContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_union_subquery_disabled; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterSingle_union_subquery_disabled(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitSingle_union_subquery_disabled(this);
		}
	}

	public final Single_union_subquery_disabledContext single_union_subquery_disabled() throws RecognitionException {
		Single_union_subquery_disabledContext _localctx = new Single_union_subquery_disabledContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_single_union_subquery_disabled);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			single_subquery();
			setState(576);
			match(UNION);
			setState(578);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==ALL) {
				{
				setState(577);
				_la = _input.LA(1);
				if ( !(_la==DISTINCT || _la==ALL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(580);
			single_subquery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Double_subqueryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(mysql_expressionsParser.LPAREN, 0); }
		public List<TerminalNode> SELECT() { return getTokens(mysql_expressionsParser.SELECT); }
		public TerminalNode SELECT(int i) {
			return getToken(mysql_expressionsParser.SELECT, i);
		}
		public List<Subquery_tableContext> subquery_table() {
			return getRuleContexts(Subquery_tableContext.class);
		}
		public Subquery_tableContext subquery_table(int i) {
			return getRuleContext(Subquery_tableContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(mysql_expressionsParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(mysql_expressionsParser.DOT, i);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<TerminalNode> AS() { return getTokens(mysql_expressionsParser.AS); }
		public TerminalNode AS(int i) {
			return getToken(mysql_expressionsParser.AS, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(mysql_expressionsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mysql_expressionsParser.COMMA, i);
		}
		public Subquery_bodyContext subquery_body() {
			return getRuleContext(Subquery_bodyContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(mysql_expressionsParser.RPAREN, 0); }
		public TerminalNode DISTINCT() { return getToken(mysql_expressionsParser.DISTINCT, 0); }
		public TerminalNode SQL_SMALL_RESULT() { return getToken(mysql_expressionsParser.SQL_SMALL_RESULT, 0); }
		public Subquery_group_byContext subquery_group_by() {
			return getRuleContext(Subquery_group_byContext.class,0);
		}
		public Subquery_havingContext subquery_having() {
			return getRuleContext(Subquery_havingContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode UNION() { return getToken(mysql_expressionsParser.UNION, 0); }
		public TerminalNode ALL() { return getToken(mysql_expressionsParser.ALL, 0); }
		public Double_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterDouble_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitDouble_subquery(this);
		}
	}

	public final Double_subqueryContext double_subquery() throws RecognitionException {
		Double_subqueryContext _localctx = new Double_subqueryContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_double_subquery);
		int _la;
		try {
			setState(629);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(582);
				match(LPAREN);
				setState(583);
				match(SELECT);
				setState(585);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(584);
					match(DISTINCT);
					}
				}

				setState(588);
				_la = _input.LA(1);
				if (_la==SQL_SMALL_RESULT) {
					{
					setState(587);
					match(SQL_SMALL_RESULT);
					}
				}

				setState(590);
				subquery_table();
				setState(591);
				match(DOT);
				setState(592);
				field();
				setState(593);
				match(AS);
				setState(594);
				subquery_table();
				setState(595);
				match(DOT);
				setState(596);
				field();
				setState(597);
				match(COMMA);
				setState(598);
				subquery_table();
				setState(599);
				match(DOT);
				setState(600);
				field();
				setState(601);
				match(AS);
				setState(602);
				subquery_table();
				setState(603);
				match(DOT);
				setState(604);
				field();
				setState(605);
				subquery_body();
				setState(607);
				_la = _input.LA(1);
				if (_la==GROUP_BY) {
					{
					setState(606);
					subquery_group_by();
					}
				}

				setState(610);
				_la = _input.LA(1);
				if (_la==HAVING) {
					{
					setState(609);
					subquery_having();
					}
				}

				setState(612);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(614);
				match(LPAREN);
				setState(615);
				match(SELECT);
				setState(616);
				value();
				setState(617);
				match(COMMA);
				setState(618);
				value();
				setState(619);
				match(UNION);
				setState(621);
				_la = _input.LA(1);
				if (_la==DISTINCT || _la==ALL) {
					{
					setState(620);
					_la = _input.LA(1);
					if ( !(_la==DISTINCT || _la==ALL) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(623);
				match(SELECT);
				setState(624);
				value();
				setState(625);
				match(COMMA);
				setState(626);
				value();
				setState(627);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Correlated_subqueryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(mysql_expressionsParser.LPAREN, 0); }
		public TerminalNode SELECT() { return getToken(mysql_expressionsParser.SELECT, 0); }
		public List<TerminalNode> DOT() { return getTokens(mysql_expressionsParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(mysql_expressionsParser.DOT, i);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public TerminalNode AS() { return getToken(mysql_expressionsParser.AS, 0); }
		public Subquery_tableContext subquery_table() {
			return getRuleContext(Subquery_tableContext.class,0);
		}
		public TerminalNode FROM() { return getToken(mysql_expressionsParser.FROM, 0); }
		public Subquery_join_listContext subquery_join_list() {
			return getRuleContext(Subquery_join_listContext.class,0);
		}
		public Correlated_subquery_where_listContext correlated_subquery_where_list() {
			return getRuleContext(Correlated_subquery_where_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(mysql_expressionsParser.RPAREN, 0); }
		public TerminalNode DISTINCT() { return getToken(mysql_expressionsParser.DISTINCT, 0); }
		public TerminalNode SQL_SMALL_RESULT() { return getToken(mysql_expressionsParser.SQL_SMALL_RESULT, 0); }
		public AggregateContext aggregate() {
			return getRuleContext(AggregateContext.class,0);
		}
		public Correlated_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_correlated_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterCorrelated_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitCorrelated_subquery(this);
		}
	}

	public final Correlated_subqueryContext correlated_subquery() throws RecognitionException {
		Correlated_subqueryContext _localctx = new Correlated_subqueryContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_correlated_subquery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(LPAREN);
			setState(632);
			match(SELECT);
			setState(634);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(633);
				match(DISTINCT);
				}
			}

			setState(637);
			_la = _input.LA(1);
			if (_la==SQL_SMALL_RESULT) {
				{
				setState(636);
				match(SQL_SMALL_RESULT);
				}
			}

			setState(640);
			_la = _input.LA(1);
			if (_la==AGGREGATE_OP) {
				{
				setState(639);
				aggregate();
				}
			}

			setState(642);
			match(DOT);
			setState(643);
			field();
			setState(644);
			match(AS);
			setState(645);
			subquery_table();
			setState(646);
			match(DOT);
			setState(647);
			field();
			setState(648);
			match(FROM);
			setState(649);
			subquery_join_list();
			setState(650);
			correlated_subquery_where_list();
			setState(651);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_subqueryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(mysql_expressionsParser.LPAREN, 0); }
		public TerminalNode SELECT() { return getToken(mysql_expressionsParser.SELECT, 0); }
		public Subquery_tableContext subquery_table() {
			return getRuleContext(Subquery_tableContext.class,0);
		}
		public TerminalNode DOT() { return getToken(mysql_expressionsParser.DOT, 0); }
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(mysql_expressionsParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(mysql_expressionsParser.RPAREN, i);
		}
		public TerminalNode AS() { return getToken(mysql_expressionsParser.AS, 0); }
		public Subquery_bodyContext subquery_body() {
			return getRuleContext(Subquery_bodyContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(mysql_expressionsParser.DISTINCT, 0); }
		public TerminalNode SQL_SMALL_RESULT() { return getToken(mysql_expressionsParser.SQL_SMALL_RESULT, 0); }
		public AggregateContext aggregate() {
			return getRuleContext(AggregateContext.class,0);
		}
		public Subquery_group_byContext subquery_group_by() {
			return getRuleContext(Subquery_group_byContext.class,0);
		}
		public Subquery_havingContext subquery_having() {
			return getRuleContext(Subquery_havingContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode FROM() { return getToken(mysql_expressionsParser.FROM, 0); }
		public TerminalNode DUAL() { return getToken(mysql_expressionsParser.DUAL, 0); }
		public Single_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterSingle_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitSingle_subquery(this);
		}
	}

	public final Single_subqueryContext single_subquery() throws RecognitionException {
		Single_subqueryContext _localctx = new Single_subqueryContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_single_subquery);
		int _la;
		try {
			setState(685);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				match(LPAREN);
				setState(654);
				match(SELECT);
				setState(656);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(655);
					match(DISTINCT);
					}
				}

				setState(659);
				_la = _input.LA(1);
				if (_la==SQL_SMALL_RESULT) {
					{
					setState(658);
					match(SQL_SMALL_RESULT);
					}
				}

				setState(662);
				_la = _input.LA(1);
				if (_la==AGGREGATE_OP) {
					{
					setState(661);
					aggregate();
					}
				}

				setState(664);
				subquery_table();
				setState(665);
				match(DOT);
				setState(666);
				field();
				setState(667);
				match(RPAREN);
				setState(668);
				match(AS);
				setState(669);
				field();
				setState(670);
				subquery_body();
				setState(674);
				_la = _input.LA(1);
				if (_la==GROUP_BY) {
					{
					setState(671);
					subquery_group_by();
					setState(672);
					subquery_having();
					}
				}

				setState(676);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				match(LPAREN);
				setState(679);
				match(SELECT);
				setState(680);
				value();
				setState(681);
				match(FROM);
				setState(682);
				match(DUAL);
				setState(683);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_scalar_subqueryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(mysql_expressionsParser.LPAREN, 0); }
		public TerminalNode SELECT() { return getToken(mysql_expressionsParser.SELECT, 0); }
		public TerminalNode DISTINCT() { return getToken(mysql_expressionsParser.DISTINCT, 0); }
		public TerminalNode SQL_SMALL_RESULT() { return getToken(mysql_expressionsParser.SQL_SMALL_RESULT, 0); }
		public AggregateContext aggregate() {
			return getRuleContext(AggregateContext.class,0);
		}
		public Subquery_tableContext subquery_table() {
			return getRuleContext(Subquery_tableContext.class,0);
		}
		public TerminalNode DOT() { return getToken(mysql_expressionsParser.DOT, 0); }
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(mysql_expressionsParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(mysql_expressionsParser.RPAREN, i);
		}
		public TerminalNode AS() { return getToken(mysql_expressionsParser.AS, 0); }
		public TerminalNode FROM() { return getToken(mysql_expressionsParser.FROM, 0); }
		public Subquery_join_listContext subquery_join_list() {
			return getRuleContext(Subquery_join_listContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(mysql_expressionsParser.WHERE, 0); }
		public Correlated_subquery_where_listContext correlated_subquery_where_list() {
			return getRuleContext(Correlated_subquery_where_listContext.class,0);
		}
		public Int_scalar_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_scalar_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterInt_scalar_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitInt_scalar_subquery(this);
		}
	}

	public final Int_scalar_subqueryContext int_scalar_subquery() throws RecognitionException {
		Int_scalar_subqueryContext _localctx = new Int_scalar_subqueryContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_int_scalar_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			match(LPAREN);
			setState(688);
			match(SELECT);
			setState(689);
			match(DISTINCT);
			setState(690);
			match(SQL_SMALL_RESULT);
			setState(691);
			aggregate();
			setState(692);
			subquery_table();
			setState(693);
			match(DOT);
			setState(694);
			field();
			setState(695);
			match(RPAREN);
			setState(696);
			match(AS);
			setState(697);
			field();
			setState(698);
			match(FROM);
			setState(699);
			subquery_join_list();
			setState(700);
			match(WHERE);
			setState(701);
			correlated_subquery_where_list();
			setState(702);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subquery_bodyContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(mysql_expressionsParser.FROM, 0); }
		public Subquery_join_listContext subquery_join_list() {
			return getRuleContext(Subquery_join_listContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(mysql_expressionsParser.WHERE, 0); }
		public Subquery_where_listContext subquery_where_list() {
			return getRuleContext(Subquery_where_listContext.class,0);
		}
		public Subquery_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterSubquery_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitSubquery_body(this);
		}
	}

	public final Subquery_bodyContext subquery_body() throws RecognitionException {
		Subquery_bodyContext _localctx = new Subquery_bodyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_subquery_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			match(FROM);
			setState(705);
			subquery_join_list();
			setState(708);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(706);
				match(WHERE);
				setState(707);
				subquery_where_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subquery_join_listContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(mysql_expressionsParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(mysql_expressionsParser.LPAREN, i);
		}
		public List<New_subquery_tableContext> new_subquery_table() {
			return getRuleContexts(New_subquery_tableContext.class);
		}
		public New_subquery_tableContext new_subquery_table(int i) {
			return getRuleContext(New_subquery_tableContext.class,i);
		}
		public List<Join_typeContext> join_type() {
			return getRuleContexts(Join_typeContext.class);
		}
		public Join_typeContext join_type(int i) {
			return getRuleContext(Join_typeContext.class,i);
		}
		public List<TerminalNode> ON() { return getTokens(mysql_expressionsParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(mysql_expressionsParser.ON, i);
		}
		public List<Subquery_join_condition_itemContext> subquery_join_condition_item() {
			return getRuleContexts(Subquery_join_condition_itemContext.class);
		}
		public Subquery_join_condition_itemContext subquery_join_condition_item(int i) {
			return getRuleContext(Subquery_join_condition_itemContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(mysql_expressionsParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(mysql_expressionsParser.RPAREN, i);
		}
		public TerminalNode COMMA() { return getToken(mysql_expressionsParser.COMMA, 0); }
		public Subquery_join_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery_join_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterSubquery_join_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitSubquery_join_list(this);
		}
	}

	public final Subquery_join_listContext subquery_join_list() throws RecognitionException {
		Subquery_join_listContext _localctx = new Subquery_join_listContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_subquery_join_list);
		int _la;
		try {
			setState(767);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(710);
				match(LPAREN);
				setState(711);
				new_subquery_table();
				setState(712);
				join_type();
				setState(714);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(713);
					match(LPAREN);
					}
				}

				setState(716);
				new_subquery_table();
				setState(718);
				_la = _input.LA(1);
				if (_la==RPAREN) {
					{
					setState(717);
					match(RPAREN);
					}
				}

				setState(720);
				match(ON);
				setState(721);
				match(LPAREN);
				setState(722);
				subquery_join_condition_item();
				setState(723);
				match(RPAREN);
				setState(724);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(726);
				new_subquery_table();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(727);
				match(LPAREN);
				setState(728);
				new_subquery_table();
				setState(729);
				match(COMMA);
				setState(730);
				new_subquery_table();
				setState(731);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(733);
				match(LPAREN);
				setState(734);
				new_subquery_table();
				setState(735);
				join_type();
				setState(737);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(736);
					match(LPAREN);
					}
				}

				setState(739);
				new_subquery_table();
				setState(741);
				_la = _input.LA(1);
				if (_la==RPAREN) {
					{
					setState(740);
					match(RPAREN);
					}
				}

				setState(743);
				match(ON);
				setState(744);
				match(LPAREN);
				setState(745);
				subquery_join_condition_item();
				setState(746);
				match(RPAREN);
				setState(747);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(749);
				match(LPAREN);
				setState(750);
				new_subquery_table();
				setState(751);
				join_type();
				setState(752);
				match(LPAREN);
				setState(753);
				new_subquery_table();
				setState(754);
				join_type();
				setState(755);
				new_subquery_table();
				setState(756);
				match(ON);
				setState(757);
				match(LPAREN);
				setState(758);
				subquery_join_condition_item();
				setState(759);
				match(RPAREN);
				setState(760);
				match(RPAREN);
				setState(761);
				match(ON);
				setState(762);
				match(LPAREN);
				setState(763);
				subquery_join_condition_item();
				setState(764);
				match(RPAREN);
				setState(765);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subquery_join_condition_itemContext extends ParserRuleContext {
		public List<Subquery_tableContext> subquery_table() {
			return getRuleContexts(Subquery_tableContext.class);
		}
		public Subquery_tableContext subquery_table(int i) {
			return getRuleContext(Subquery_tableContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(mysql_expressionsParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(mysql_expressionsParser.DOT, i);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(mysql_expressionsParser.EQUAL, 0); }
		public TerminalNode AND_OR() { return getToken(mysql_expressionsParser.AND_OR, 0); }
		public Where_subqueryContext where_subquery() {
			return getRuleContext(Where_subqueryContext.class,0);
		}
		public Subquery_join_condition_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery_join_condition_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterSubquery_join_condition_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitSubquery_join_condition_item(this);
		}
	}

	public final Subquery_join_condition_itemContext subquery_join_condition_item() throws RecognitionException {
		Subquery_join_condition_itemContext _localctx = new Subquery_join_condition_itemContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_subquery_join_condition_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			subquery_table();
			setState(770);
			match(DOT);
			setState(771);
			field();
			setState(772);
			match(EQUAL);
			setState(773);
			subquery_table();
			setState(774);
			match(DOT);
			setState(775);
			field();
			setState(778);
			_la = _input.LA(1);
			if (_la==AND_OR) {
				{
				setState(776);
				match(AND_OR);
				setState(777);
				where_subquery();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Correlated_subquery_where_listContext extends ParserRuleContext {
		public List<Correlated_subquery_where_itemContext> correlated_subquery_where_item() {
			return getRuleContexts(Correlated_subquery_where_itemContext.class);
		}
		public Correlated_subquery_where_itemContext correlated_subquery_where_item(int i) {
			return getRuleContext(Correlated_subquery_where_itemContext.class,i);
		}
		public TerminalNode AND_OR() { return getToken(mysql_expressionsParser.AND_OR, 0); }
		public Subquery_where_itemContext subquery_where_item() {
			return getRuleContext(Subquery_where_itemContext.class,0);
		}
		public Correlated_subquery_where_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_correlated_subquery_where_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterCorrelated_subquery_where_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitCorrelated_subquery_where_list(this);
		}
	}

	public final Correlated_subquery_where_listContext correlated_subquery_where_list() throws RecognitionException {
		Correlated_subquery_where_listContext _localctx = new Correlated_subquery_where_listContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_correlated_subquery_where_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			correlated_subquery_where_item();
			setState(786);
			_la = _input.LA(1);
			if (_la==AND_OR) {
				{
				setState(781);
				match(AND_OR);
				setState(784);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(782);
					correlated_subquery_where_item();
					}
					break;
				case 2:
					{
					setState(783);
					subquery_where_item();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subquery_where_listContext extends ParserRuleContext {
		public List<Subquery_where_itemContext> subquery_where_item() {
			return getRuleContexts(Subquery_where_itemContext.class);
		}
		public Subquery_where_itemContext subquery_where_item(int i) {
			return getRuleContext(Subquery_where_itemContext.class,i);
		}
		public TerminalNode AND_OR() { return getToken(mysql_expressionsParser.AND_OR, 0); }
		public Subquery_where_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery_where_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterSubquery_where_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitSubquery_where_list(this);
		}
	}

	public final Subquery_where_listContext subquery_where_list() throws RecognitionException {
		Subquery_where_listContext _localctx = new Subquery_where_listContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_subquery_where_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			subquery_where_item();
			setState(791);
			_la = _input.LA(1);
			if (_la==AND_OR) {
				{
				setState(789);
				match(AND_OR);
				setState(790);
				subquery_where_item();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Correlated_subquery_where_itemContext extends ParserRuleContext {
		public Subquery_tableContext subquery_table() {
			return getRuleContext(Subquery_tableContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(mysql_expressionsParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(mysql_expressionsParser.DOT, i);
		}
		public TerminalNode COMPARE_OP() { return getToken(mysql_expressionsParser.COMPARE_OP, 0); }
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public Correlated_subquery_where_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_correlated_subquery_where_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterCorrelated_subquery_where_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitCorrelated_subquery_where_item(this);
		}
	}

	public final Correlated_subquery_where_itemContext correlated_subquery_where_item() throws RecognitionException {
		Correlated_subquery_where_itemContext _localctx = new Correlated_subquery_where_itemContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_correlated_subquery_where_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			subquery_table();
			setState(794);
			match(DOT);
			setState(797);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(795);
				field();
				}
				break;
			case 2:
				{
				setState(796);
				field();
				}
				break;
			}
			setState(799);
			match(COMPARE_OP);
			setState(800);
			table();
			setState(801);
			match(DOT);
			setState(804);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(802);
				field();
				}
				break;
			case 2:
				{
				setState(803);
				field();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subquery_where_itemContext extends ParserRuleContext {
		public List<Subquery_tableContext> subquery_table() {
			return getRuleContexts(Subquery_tableContext.class);
		}
		public Subquery_tableContext subquery_table(int i) {
			return getRuleContext(Subquery_tableContext.class,i);
		}
		public TerminalNode DOT() { return getToken(mysql_expressionsParser.DOT, 0); }
		public TerminalNode COMPARE_OP() { return getToken(mysql_expressionsParser.COMPARE_OP, 0); }
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public TerminalNode DIGIT() { return getToken(mysql_expressionsParser.DIGIT, 0); }
		public TerminalNode CHAR() { return getToken(mysql_expressionsParser.CHAR, 0); }
		public Subquery_where_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery_where_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterSubquery_where_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitSubquery_where_item(this);
		}
	}

	public final Subquery_where_itemContext subquery_where_item() throws RecognitionException {
		Subquery_where_itemContext _localctx = new Subquery_where_itemContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_subquery_where_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			subquery_table();
			setState(807);
			match(DOT);
			setState(810);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(808);
				field();
				}
				break;
			case 2:
				{
				setState(809);
				field();
				}
				break;
			}
			setState(812);
			match(COMPARE_OP);
			setState(820);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				setState(813);
				match(DIGIT);
				}
				break;
			case CHAR:
				{
				setState(814);
				match(CHAR);
				}
				break;
			case SUBQUERY_TABLE_NAME:
			case CHILD_SUBQUERY_TABLE_NAME:
				{
				setState(815);
				subquery_table();
				setState(818);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(816);
					field();
					}
					break;
				case 2:
					{
					setState(817);
					field();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subquery_group_byContext extends ParserRuleContext {
		public TerminalNode GROUP_BY() { return getToken(mysql_expressionsParser.GROUP_BY, 0); }
		public List<Subquery_tableContext> subquery_table() {
			return getRuleContexts(Subquery_tableContext.class);
		}
		public Subquery_tableContext subquery_table(int i) {
			return getRuleContext(Subquery_tableContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(mysql_expressionsParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(mysql_expressionsParser.DOT, i);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(mysql_expressionsParser.COMMA, 0); }
		public Subquery_group_byContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery_group_by; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterSubquery_group_by(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitSubquery_group_by(this);
		}
	}

	public final Subquery_group_byContext subquery_group_by() throws RecognitionException {
		Subquery_group_byContext _localctx = new Subquery_group_byContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_subquery_group_by);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			match(GROUP_BY);
			setState(823);
			subquery_table();
			setState(824);
			match(DOT);
			setState(825);
			field();
			setState(831);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(826);
				match(COMMA);
				setState(827);
				subquery_table();
				setState(828);
				match(DOT);
				setState(829);
				field();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subquery_havingContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(mysql_expressionsParser.HAVING, 0); }
		public List<Subquery_having_itemContext> subquery_having_item() {
			return getRuleContexts(Subquery_having_itemContext.class);
		}
		public Subquery_having_itemContext subquery_having_item(int i) {
			return getRuleContext(Subquery_having_itemContext.class,i);
		}
		public List<TerminalNode> AND_OR() { return getTokens(mysql_expressionsParser.AND_OR); }
		public TerminalNode AND_OR(int i) {
			return getToken(mysql_expressionsParser.AND_OR, i);
		}
		public Subquery_havingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery_having; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterSubquery_having(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitSubquery_having(this);
		}
	}

	public final Subquery_havingContext subquery_having() throws RecognitionException {
		Subquery_havingContext _localctx = new Subquery_havingContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_subquery_having);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			match(HAVING);
			setState(834);
			subquery_having_item();
			setState(839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND_OR) {
				{
				{
				setState(835);
				match(AND_OR);
				setState(836);
				subquery_having_item();
				}
				}
				setState(841);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subquery_having_itemContext extends ParserRuleContext {
		public Subquery_tableContext subquery_table() {
			return getRuleContext(Subquery_tableContext.class,0);
		}
		public TerminalNode DOT() { return getToken(mysql_expressionsParser.DOT, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode COMPARE_OP() { return getToken(mysql_expressionsParser.COMPARE_OP, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Subquery_having_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery_having_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterSubquery_having_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitSubquery_having_item(this);
		}
	}

	public final Subquery_having_itemContext subquery_having_item() throws RecognitionException {
		Subquery_having_itemContext _localctx = new Subquery_having_itemContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_subquery_having_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			subquery_table();
			setState(843);
			match(DOT);
			setState(844);
			field();
			setState(845);
			match(COMPARE_OP);
			setState(846);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_by_clauseContext extends ParserRuleContext {
		public TerminalNode GROUP_BY() { return getToken(mysql_expressionsParser.GROUP_BY, 0); }
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(mysql_expressionsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mysql_expressionsParser.COMMA, i);
		}
		public Group_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterGroup_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitGroup_by_clause(this);
		}
	}

	public final Group_by_clauseContext group_by_clause() throws RecognitionException {
		Group_by_clauseContext _localctx = new Group_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_group_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			match(GROUP_BY);
			setState(849);
			field();
			setState(854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(850);
				match(COMMA);
				setState(851);
				field();
				}
				}
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Having_clauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(mysql_expressionsParser.HAVING, 0); }
		public List<Having_itemContext> having_item() {
			return getRuleContexts(Having_itemContext.class);
		}
		public Having_itemContext having_item(int i) {
			return getRuleContext(Having_itemContext.class,i);
		}
		public List<TerminalNode> AND_OR() { return getTokens(mysql_expressionsParser.AND_OR); }
		public TerminalNode AND_OR(int i) {
			return getToken(mysql_expressionsParser.AND_OR, i);
		}
		public Having_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterHaving_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitHaving_clause(this);
		}
	}

	public final Having_clauseContext having_clause() throws RecognitionException {
		Having_clauseContext _localctx = new Having_clauseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_having_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			match(HAVING);
			setState(858);
			having_item();
			setState(863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND_OR) {
				{
				{
				setState(859);
				match(AND_OR);
				setState(860);
				having_item();
				}
				}
				setState(865);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Having_itemContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode COMPARE_OP() { return getToken(mysql_expressionsParser.COMPARE_OP, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public General_subqueryContext general_subquery() {
			return getRuleContext(General_subqueryContext.class,0);
		}
		public Having_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterHaving_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitHaving_item(this);
		}
	}

	public final Having_itemContext having_item() throws RecognitionException {
		Having_itemContext _localctx = new Having_itemContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_having_item);
		try {
			setState(871);
			switch (_input.LA(1)) {
			case FIELDTK:
			case GRAVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(866);
				field();
				setState(867);
				match(COMPARE_OP);
				setState(868);
				value();
				}
				break;
			case TABLE_NAME:
			case ALIAS:
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(870);
				general_subquery();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_clauseContext extends ParserRuleContext {
		public TerminalNode ORDER_BY() { return getToken(mysql_expressionsParser.ORDER_BY, 0); }
		public TerminalNode ALIAS() { return getToken(mysql_expressionsParser.ALIAS, 0); }
		public TerminalNode DOT() { return getToken(mysql_expressionsParser.DOT, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(mysql_expressionsParser.COMMA, 0); }
		public Total_order_byContext total_order_by() {
			return getRuleContext(Total_order_byContext.class,0);
		}
		public TerminalNode DESC() { return getToken(mysql_expressionsParser.DESC, 0); }
		public Limit_ruleContext limit_rule() {
			return getRuleContext(Limit_ruleContext.class,0);
		}
		public Order_by_listContext order_by_list() {
			return getRuleContext(Order_by_listContext.class,0);
		}
		public Order_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterOrder_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitOrder_by_clause(this);
		}
	}

	public final Order_by_clauseContext order_by_clause() throws RecognitionException {
		Order_by_clauseContext _localctx = new Order_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_order_by_clause);
		int _la;
		try {
			setState(894);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(873);
				match(ORDER_BY);
				setState(874);
				match(ALIAS);
				setState(875);
				match(DOT);
				setState(876);
				field();
				setState(878);
				_la = _input.LA(1);
				if (_la==DESC) {
					{
					setState(877);
					match(DESC);
					}
				}

				setState(880);
				match(COMMA);
				setState(881);
				total_order_by();
				setState(883);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(882);
					limit_rule();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(885);
				match(ORDER_BY);
				setState(886);
				order_by_list();
				setState(892);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(887);
					match(COMMA);
					setState(888);
					total_order_by();
					setState(890);
					_la = _input.LA(1);
					if (_la==LIMIT) {
						{
						setState(889);
						limit_rule();
						}
					}

					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_listContext extends ParserRuleContext {
		public List<Order_by_itemContext> order_by_item() {
			return getRuleContexts(Order_by_itemContext.class);
		}
		public Order_by_itemContext order_by_item(int i) {
			return getRuleContext(Order_by_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(mysql_expressionsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mysql_expressionsParser.COMMA, i);
		}
		public Order_by_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterOrder_by_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitOrder_by_list(this);
		}
	}

	public final Order_by_listContext order_by_list() throws RecognitionException {
		Order_by_listContext _localctx = new Order_by_listContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_order_by_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			order_by_item();
			setState(901);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(897);
					match(COMMA);
					setState(898);
					order_by_item();
					}
					} 
				}
				setState(903);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_itemContext extends ParserRuleContext {
		public TerminalNode ALIAS() { return getToken(mysql_expressionsParser.ALIAS, 0); }
		public List<TerminalNode> DOT() { return getTokens(mysql_expressionsParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(mysql_expressionsParser.DOT, i);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public TerminalNode DESC() { return getToken(mysql_expressionsParser.DESC, 0); }
		public TerminalNode COMMA() { return getToken(mysql_expressionsParser.COMMA, 0); }
		public List<TableContext> table() {
			return getRuleContexts(TableContext.class);
		}
		public TableContext table(int i) {
			return getRuleContext(TableContext.class,i);
		}
		public TerminalNode CONCAT() { return getToken(mysql_expressionsParser.CONCAT, 0); }
		public TerminalNode LPAREN() { return getToken(mysql_expressionsParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(mysql_expressionsParser.RPAREN, 0); }
		public Order_by_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterOrder_by_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitOrder_by_item(this);
		}
	}

	public final Order_by_itemContext order_by_item() throws RecognitionException {
		Order_by_itemContext _localctx = new Order_by_itemContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_order_by_item);
		int _la;
		try {
			setState(930);
			switch (_input.LA(1)) {
			case ALIAS:
				enterOuterAlt(_localctx, 1);
				{
				setState(904);
				match(ALIAS);
				setState(905);
				match(DOT);
				setState(906);
				field();
				setState(912);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(907);
					match(COMMA);
					setState(908);
					table();
					setState(909);
					match(DOT);
					setState(910);
					field();
					}
				}

				setState(914);
				match(DESC);
				}
				break;
			case FIELDTK:
			case GRAVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(916);
				field();
				setState(917);
				match(DESC);
				}
				break;
			case CONCAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(919);
				match(CONCAT);
				setState(920);
				match(LPAREN);
				setState(921);
				table();
				setState(922);
				match(DOT);
				setState(923);
				field();
				setState(924);
				match(COMMA);
				setState(925);
				table();
				setState(926);
				match(DOT);
				setState(927);
				field();
				setState(928);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Total_order_byContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(mysql_expressionsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mysql_expressionsParser.COMMA, i);
		}
		public Total_order_byContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_total_order_by; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterTotal_order_by(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitTotal_order_by(this);
		}
	}

	public final Total_order_byContext total_order_by() throws RecognitionException {
		Total_order_byContext _localctx = new Total_order_byContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_total_order_by);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			field();
			setState(937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(933);
				match(COMMA);
				setState(934);
				field();
				}
				}
				setState(939);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Limit_ruleContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(mysql_expressionsParser.LIMIT, 0); }
		public TerminalNode LIMIT_SIZE() { return getToken(mysql_expressionsParser.LIMIT_SIZE, 0); }
		public TerminalNode OFFSET() { return getToken(mysql_expressionsParser.OFFSET, 0); }
		public TerminalNode DIGIT() { return getToken(mysql_expressionsParser.DIGIT, 0); }
		public Limit_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterLimit_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitLimit_rule(this);
		}
	}

	public final Limit_ruleContext limit_rule() throws RecognitionException {
		Limit_ruleContext _localctx = new Limit_ruleContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_limit_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			match(LIMIT);
			setState(941);
			match(LIMIT_SIZE);
			setState(944);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(942);
				match(OFFSET);
				setState(943);
				match(DIGIT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Membership_operatorContext extends ParserRuleContext {
		public TerminalNode COMPARE_OP() { return getToken(mysql_expressionsParser.COMPARE_OP, 0); }
		public All_anyContext all_any() {
			return getRuleContext(All_anyContext.class,0);
		}
		public TerminalNode IN() { return getToken(mysql_expressionsParser.IN, 0); }
		public TerminalNode NOT() { return getToken(mysql_expressionsParser.NOT, 0); }
		public Membership_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_membership_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterMembership_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitMembership_operator(this);
		}
	}

	public final Membership_operatorContext membership_operator() throws RecognitionException {
		Membership_operatorContext _localctx = new Membership_operatorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_membership_operator);
		int _la;
		try {
			setState(952);
			switch (_input.LA(1)) {
			case COMPARE_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(946);
				match(COMPARE_OP);
				setState(947);
				all_any();
				}
				break;
			case NOT:
			case IN:
				enterOuterAlt(_localctx, 2);
				{
				setState(949);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(948);
					match(NOT);
					}
				}

				setState(951);
				match(IN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class All_anyContext extends ParserRuleContext {
		public TerminalNode ANY() { return getToken(mysql_expressionsParser.ANY, 0); }
		public TerminalNode ALL() { return getToken(mysql_expressionsParser.ALL, 0); }
		public TerminalNode SOME() { return getToken(mysql_expressionsParser.SOME, 0); }
		public All_anyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_any; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterAll_any(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitAll_any(this);
		}
	}

	public final All_anyContext all_any() throws RecognitionException {
		All_anyContext _localctx = new All_anyContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_all_any);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << ALL) | (1L << SOME))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(mysql_expressionsParser.DIGIT, 0); }
		public TerminalNode CHAR() { return getToken(mysql_expressionsParser.CHAR, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			_la = _input.LA(1);
			if ( !(_la==DIGIT || _la==CHAR) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableContext extends ParserRuleContext {
		public TerminalNode TABLE_NAME() { return getToken(mysql_expressionsParser.TABLE_NAME, 0); }
		public TerminalNode ALIAS() { return getToken(mysql_expressionsParser.ALIAS, 0); }
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitTable(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			_la = _input.LA(1);
			if ( !(_la==TABLE_NAME || _la==ALIAS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_tableContext extends ParserRuleContext {
		public Boolean first_sq_table =  true;
		public TableContext a;
		public TerminalNode AS() { return getToken(mysql_expressionsParser.AS, 0); }
		public List<TableContext> table() {
			return getRuleContexts(TableContext.class);
		}
		public TableContext table(int i) {
			return getRuleContext(TableContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(mysql_expressionsParser.LPAREN, 0); }
		public From_subqueryContext from_subquery() {
			return getRuleContext(From_subqueryContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(mysql_expressionsParser.RPAREN, 0); }
		public TerminalNode ALIAS() { return getToken(mysql_expressionsParser.ALIAS, 0); }
		public New_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterNew_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitNew_table(this);
		}
	}

	public final New_tableContext new_table() throws RecognitionException {
		New_tableContext _localctx = new New_tableContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_new_table);
		try {
			setState(971);
			switch (_input.LA(1)) {
			case TABLE_NAME:
			case ALIAS:
				enterOuterAlt(_localctx, 1);
				{
				setState(960);
				((New_tableContext)_localctx).a = table();
				setState(961);
				match(AS);
				setState(962);
				table();
				((QueryContext)getInvokingContext(0)).tables.add(0);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(965);
				match(LPAREN);
				setState(966);
				from_subquery();
				setState(967);
				match(RPAREN);
				setState(968);
				match(AS);
				setState(969);
				match(ALIAS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_subqueryContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(mysql_expressionsParser.SELECT, 0); }
		public Subquery_tableContext subquery_table() {
			return getRuleContext(Subquery_tableContext.class,0);
		}
		public TerminalNode DOT() { return getToken(mysql_expressionsParser.DOT, 0); }
		public TerminalNode ASTERISK() { return getToken(mysql_expressionsParser.ASTERISK, 0); }
		public Subquery_bodyContext subquery_body() {
			return getRuleContext(Subquery_bodyContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(mysql_expressionsParser.DISTINCT, 0); }
		public TerminalNode SQL_SMALL_RESULT() { return getToken(mysql_expressionsParser.SQL_SMALL_RESULT, 0); }
		public From_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterFrom_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitFrom_subquery(this);
		}
	}

	public final From_subqueryContext from_subquery() throws RecognitionException {
		From_subqueryContext _localctx = new From_subqueryContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_from_subquery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			match(SELECT);
			setState(975);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(974);
				match(DISTINCT);
				}
			}

			setState(978);
			_la = _input.LA(1);
			if (_la==SQL_SMALL_RESULT) {
				{
				setState(977);
				match(SQL_SMALL_RESULT);
				}
			}

			setState(980);
			subquery_table();
			setState(981);
			match(DOT);
			setState(982);
			match(ASTERISK);
			setState(983);
			subquery_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_subquery_tableContext extends ParserRuleContext {
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public TerminalNode AS() { return getToken(mysql_expressionsParser.AS, 0); }
		public Subquery_tableContext subquery_table() {
			return getRuleContext(Subquery_tableContext.class,0);
		}
		public New_subquery_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_subquery_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterNew_subquery_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitNew_subquery_table(this);
		}
	}

	public final New_subquery_tableContext new_subquery_table() throws RecognitionException {
		New_subquery_tableContext _localctx = new New_subquery_tableContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_new_subquery_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			table();
			setState(986);
			match(AS);
			setState(987);
			subquery_table();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subquery_tableContext extends ParserRuleContext {
		public TerminalNode SUBQUERY_TABLE_NAME() { return getToken(mysql_expressionsParser.SUBQUERY_TABLE_NAME, 0); }
		public TerminalNode CHILD_SUBQUERY_TABLE_NAME() { return getToken(mysql_expressionsParser.CHILD_SUBQUERY_TABLE_NAME, 0); }
		public Subquery_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterSubquery_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitSubquery_table(this);
		}
	}

	public final Subquery_tableContext subquery_table() throws RecognitionException {
		Subquery_tableContext _localctx = new Subquery_tableContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_subquery_table);
		try {
			setState(992);
			switch (_input.LA(1)) {
			case SUBQUERY_TABLE_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(989);
				match(SUBQUERY_TABLE_NAME);

				        if(((New_tableContext)getInvokingContext(54)).first_sq_table){
				            ((New_tableContext)getInvokingContext(54)).first_sq_table =  false;
				            int index = Integer.parseInt(_input.getText(_localctx.start, _input.LT(-1)).trim().substring(_input.getText(_localctx.start, _input.LT(-1)).trim().length() - 1));
				            ((QueryContext)getInvokingContext(0)).tables.add(index);
				        }
				    
				}
				break;
			case CHILD_SUBQUERY_TABLE_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(991);
				match(CHILD_SUBQUERY_TABLE_NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldContext extends ParserRuleContext {
		public List<TerminalNode> GRAVE() { return getTokens(mysql_expressionsParser.GRAVE); }
		public TerminalNode GRAVE(int i) {
			return getToken(mysql_expressionsParser.GRAVE, i);
		}
		public TerminalNode PK() { return getToken(mysql_expressionsParser.PK, 0); }
		public TerminalNode COLUMN() { return getToken(mysql_expressionsParser.COLUMN, 0); }
		public TerminalNode FIELDTK() { return getToken(mysql_expressionsParser.FIELDTK, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_field);
		try {
			setState(1001);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(994);
				match(GRAVE);
				setState(995);
				match(PK);
				setState(996);
				match(GRAVE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(997);
				match(GRAVE);
				setState(998);
				match(COLUMN);
				setState(999);
				match(GRAVE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1000);
				match(FIELDTK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregateContext extends ParserRuleContext {
		public TerminalNode AGGREGATE_OP() { return getToken(mysql_expressionsParser.AGGREGATE_OP, 0); }
		public TerminalNode LPAREN() { return getToken(mysql_expressionsParser.LPAREN, 0); }
		public TerminalNode DISTINCT() { return getToken(mysql_expressionsParser.DISTINCT, 0); }
		public AggregateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).enterAggregate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_expressionsListener ) ((mysql_expressionsListener)listener).exitAggregate(this);
		}
	}

	public final AggregateContext aggregate() throws RecognitionException {
		AggregateContext _localctx = new AggregateContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_aggregate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003);
			match(AGGREGATE_OP);
			setState(1004);
			match(LPAREN);
			setState(1005);
			match(DISTINCT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3A\u03f2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\5\2|\n\2\3\2\3\2\5\2\u0080\n\2\3\2\5\2\u0083\n\2\3\2\5\2\u0086\n"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u008e\n\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\4\7\4\u009a\n\4\f\4\16\4\u009d\13\4\3\5\3\5\3\5\7\5\u00a2\n\5"+
		"\f\5\16\5\u00a5\13\5\3\6\3\6\3\6\7\6\u00aa\n\6\f\6\16\6\u00ad\13\6\3\7"+
		"\3\7\3\7\3\7\5\7\u00b3\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u00c1\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u00e3\n\n\3\13\3\13\5\13\u00e7\n\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u0119\n\r\r\r\16\r\u011a\3\r\3\r"+
		"\5\r\u011f\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u012c\n\16\3\17\3\17\3\17\5\17\u0131\n\17\3\17\3\17\5\17\u0135\n"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u013f\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u014a\n\21\3\22\3\22\5\22\u014e"+
		"\n\22\3\23\3\23\3\23\3\23\5\23\u0154\n\23\5\23\u0156\n\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\5\24\u015f\n\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u016f\n\25\3\25\3\25\5\25"+
		"\u0173\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u017c\n\26\3\27\3"+
		"\27\3\27\3\27\5\27\u0182\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0197\n\27"+
		"\3\27\3\27\3\27\3\27\7\27\u019d\n\27\f\27\16\27\u01a0\13\27\3\27\3\27"+
		"\3\27\3\27\5\27\u01a6\n\27\3\27\3\27\3\27\3\27\7\27\u01ac\n\27\f\27\16"+
		"\27\u01af\13\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u01d9\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01ef\n\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u0200\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u020a\n"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0214\n\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\5\33\u021e\n\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u0226\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u0231\n\33\3\33\3\33\5\33\u0235\n\33\3\34\3\34\3\34\3\34\3\34\5\34\u023c"+
		"\n\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\5\35\u0245\n\35\3\35\3\35\3\36"+
		"\3\36\3\36\5\36\u024c\n\36\3\36\5\36\u024f\n\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0262"+
		"\n\36\3\36\5\36\u0265\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u0270\n\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0278\n\36\3\37\3"+
		"\37\3\37\5\37\u027d\n\37\3\37\5\37\u0280\n\37\3\37\5\37\u0283\n\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \5 \u0293\n"+
		" \3 \5 \u0296\n \3 \5 \u0299\n \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u02a5"+
		"\n \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u02b0\n \3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\5\"\u02c7\n\"\3#\3#\3#\3#\5#"+
		"\u02cd\n#\3#\3#\5#\u02d1\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\5#\u02e4\n#\3#\3#\5#\u02e8\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0302\n#\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\5$\u030d\n$\3%\3%\3%\3%\5%\u0313\n%\5%\u0315\n%\3&\3&\3&"+
		"\5&\u031a\n&\3\'\3\'\3\'\3\'\5\'\u0320\n\'\3\'\3\'\3\'\3\'\3\'\5\'\u0327"+
		"\n\'\3(\3(\3(\3(\5(\u032d\n(\3(\3(\3(\3(\3(\3(\5(\u0335\n(\5(\u0337\n"+
		"(\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0342\n)\3*\3*\3*\3*\7*\u0348\n*\f*\16"+
		"*\u034b\13*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\7,\u0357\n,\f,\16,\u035a\13"+
		",\3-\3-\3-\3-\7-\u0360\n-\f-\16-\u0363\13-\3.\3.\3.\3.\3.\5.\u036a\n."+
		"\3/\3/\3/\3/\3/\5/\u0371\n/\3/\3/\3/\5/\u0376\n/\3/\3/\3/\3/\3/\5/\u037d"+
		"\n/\5/\u037f\n/\5/\u0381\n/\3\60\3\60\3\60\7\60\u0386\n\60\f\60\16\60"+
		"\u0389\13\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0393\n\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\5\61\u03a5\n\61\3\62\3\62\3\62\7\62\u03aa\n\62\f\62\16\62\u03ad"+
		"\13\62\3\63\3\63\3\63\3\63\5\63\u03b3\n\63\3\64\3\64\3\64\5\64\u03b8\n"+
		"\64\3\64\5\64\u03bb\n\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\38\38\38"+
		"\38\38\38\38\38\38\58\u03ce\n8\39\39\59\u03d2\n9\39\59\u03d5\n9\39\39"+
		"\39\39\39\3:\3:\3:\3:\3;\3;\3;\5;\u03e3\n;\3<\3<\3<\3<\3<\3<\3<\5<\u03ec"+
		"\n<\3=\3=\3=\3=\3=\2\2>\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvx\2\b\3\2\3\4\4\2\7\7\t"+
		"\t\3\2\23\24\3\2-.\3\2\b\n\4\2$$\'\'\u0428\2{\3\2\2\2\4\u0094\3\2\2\2"+
		"\6\u0096\3\2\2\2\b\u009e\3\2\2\2\n\u00a6\3\2\2\2\f\u00b2\3\2\2\2\16\u00b4"+
		"\3\2\2\2\20\u00bb\3\2\2\2\22\u00e2\3\2\2\2\24\u00e6\3\2\2\2\26\u00eb\3"+
		"\2\2\2\30\u011e\3\2\2\2\32\u012b\3\2\2\2\34\u0134\3\2\2\2\36\u0136\3\2"+
		"\2\2 \u0149\3\2\2\2\"\u014d\3\2\2\2$\u0155\3\2\2\2&\u015e\3\2\2\2(\u0172"+
		"\3\2\2\2*\u017b\3\2\2\2,\u01d8\3\2\2\2.\u01da\3\2\2\2\60\u0213\3\2\2\2"+
		"\62\u0215\3\2\2\2\64\u0234\3\2\2\2\66\u0236\3\2\2\28\u0241\3\2\2\2:\u0277"+
		"\3\2\2\2<\u0279\3\2\2\2>\u02af\3\2\2\2@\u02b1\3\2\2\2B\u02c2\3\2\2\2D"+
		"\u0301\3\2\2\2F\u0303\3\2\2\2H\u030e\3\2\2\2J\u0316\3\2\2\2L\u031b\3\2"+
		"\2\2N\u0328\3\2\2\2P\u0338\3\2\2\2R\u0343\3\2\2\2T\u034c\3\2\2\2V\u0352"+
		"\3\2\2\2X\u035b\3\2\2\2Z\u0369\3\2\2\2\\\u0380\3\2\2\2^\u0382\3\2\2\2"+
		"`\u03a4\3\2\2\2b\u03a6\3\2\2\2d\u03ae\3\2\2\2f\u03ba\3\2\2\2h\u03bc\3"+
		"\2\2\2j\u03be\3\2\2\2l\u03c0\3\2\2\2n\u03cd\3\2\2\2p\u03cf\3\2\2\2r\u03db"+
		"\3\2\2\2t\u03e2\3\2\2\2v\u03eb\3\2\2\2x\u03ed\3\2\2\2z|\5\4\3\2{z\3\2"+
		"\2\2{|\3\2\2\2|}\3\2\2\2}\177\7\6\2\2~\u0080\7\7\2\2\177~\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\u0083\7\26\2\2\u0082\u0081\3"+
		"\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0086\7\f\2\2\u0085"+
		"\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\5\b"+
		"\5\2\u0088\u0089\7\20\2\2\u0089\u008a\5\30\r\2\u008a\u008b\b\2\1\2\u008b"+
		"\u008d\5 \21\2\u008c\u008e\5V,\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2"+
		"\2\u008e\u008f\3\2\2\2\u008f\u0090\5X-\2\u0090\u0091\5\\/\2\u0091\u0092"+
		"\7\62\2\2\u0092\u0093\b\2\1\2\u0093\3\3\2\2\2\u0094\u0095\t\2\2\2\u0095"+
		"\5\3\2\2\2\u0096\u009b\5\f\7\2\u0097\u0098\7\35\2\2\u0098\u009a\5\f\7"+
		"\2\u0099\u0097\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\7\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a3\5\16\b\2\u009f"+
		"\u00a0\7\35\2\2\u00a0\u00a2\5\16\b\2\u00a1\u009f\3\2\2\2\u00a2\u00a5\3"+
		"\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\t\3\2\2\2\u00a5\u00a3"+
		"\3\2\2\2\u00a6\u00ab\5\20\t\2\u00a7\u00a8\7\35\2\2\u00a8\u00aa\5\20\t"+
		"\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\13\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b3\5\16\b\2\u00af"+
		"\u00b3\5\20\t\2\u00b0\u00b3\5\22\n\2\u00b1\u00b3\5\24\13\2\u00b2\u00ae"+
		"\3\2\2\2\u00b2\u00af\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3"+
		"\r\3\2\2\2\u00b4\u00b5\5l\67\2\u00b5\u00b6\7\34\2\2\u00b6\u00b7\5v<\2"+
		"\u00b7\u00b8\7\36\2\2\u00b8\u00b9\5v<\2\u00b9\u00ba\b\b\1\2\u00ba\17\3"+
		"\2\2\2\u00bb\u00bc\5x=\2\u00bc\u00bd\5l\67\2\u00bd\u00be\7\34\2\2\u00be"+
		"\u00c0\5v<\2\u00bf\u00c1\7<\2\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2"+
		"\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\7\36\2\2\u00c3\u00c4\5v<\2\u00c4\21"+
		"\3\2\2\2\u00c5\u00c6\7;\2\2\u00c6\u00c7\7;\2\2\u00c7\u00c8\5l\67\2\u00c8"+
		"\u00c9\7\34\2\2\u00c9\u00ca\5v<\2\u00ca\u00cb\7<\2\2\u00cb\u00cc\7>\2"+
		"\2\u00cc\u00cd\7;\2\2\u00cd\u00ce\5l\67\2\u00ce\u00cf\7\34\2\2\u00cf\u00d0"+
		"\5l\67\2\u00d0\u00d1\7<\2\2\u00d1\u00d2\7<\2\2\u00d2\u00d3\7\36\2\2\u00d3"+
		"\u00d4\5v<\2\u00d4\u00e3\3\2\2\2\u00d5\u00d6\7\r\2\2\u00d6\u00d7\7;\2"+
		"\2\u00d7\u00d8\5l\67\2\u00d8\u00d9\7\34\2\2\u00d9\u00da\5v<\2\u00da\u00db"+
		"\7\35\2\2\u00db\u00dc\5l\67\2\u00dc\u00dd\7\34\2\2\u00dd\u00de\5v<\2\u00de"+
		"\u00df\7<\2\2\u00df\u00e0\7\36\2\2\u00e0\u00e1\5v<\2\u00e1\u00e3\3\2\2"+
		"\2\u00e2\u00c5\3\2\2\2\u00e2\u00d5\3\2\2\2\u00e3\23\3\2\2\2\u00e4\u00e7"+
		"\5> \2\u00e5\u00e7\5@!\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e9\7\36\2\2\u00e9\u00ea\5v<\2\u00ea\25\3\2\2\2"+
		"\u00eb\u00ec\7;\2\2\u00ec\u00ed\7\6\2\2\u00ed\u00ee\5j\66\2\u00ee\u00ef"+
		"\7\16\2\2\u00ef\u00f0\t\3\2\2\u00f0\u00f1\7;\2\2\u00f1\u00f2\5j\66\2\u00f2"+
		"\u00f3\7 \2\2\u00f3\u00f4\7\5\2\2\u00f4\u00f5\7\36\2\2\u00f5\u00f6\5v"+
		"<\2\u00f6\27\3\2\2\2\u00f7\u00f8\7;\2\2\u00f8\u00f9\5n8\2\u00f9\u00fa"+
		"\5\34\17\2\u00fa\u00fb\5n8\2\u00fb\u00fc\7\17\2\2\u00fc\u00fd\7;\2\2\u00fd"+
		"\u00fe\5\36\20\2\u00fe\u00ff\7<\2\2\u00ff\u0100\7<\2\2\u0100\u011f\3\2"+
		"\2\2\u0101\u0102\7;\2\2\u0102\u0103\5\34\17\2\u0103\u0104\7;\2\2\u0104"+
		"\u0105\7;\2\2\u0105\u0106\5n8\2\u0106\u0107\5\34\17\2\u0107\u0108\5n8"+
		"\2\u0108\u0109\7\17\2\2\u0109\u010a\7;\2\2\u010a\u010b\5\36\20\2\u010b"+
		"\u010c\7<\2\2\u010c\u010d\7<\2\2\u010d\u010e\7<\2\2\u010e\u010f\7\17\2"+
		"\2\u010f\u0110\7;\2\2\u0110\u0111\5\36\20\2\u0111\u0112\7<\2\2\u0112\u0113"+
		"\7<\2\2\u0113\u011f\3\2\2\2\u0114\u0115\7;\2\2\u0115\u0118\5n8\2\u0116"+
		"\u0117\7\35\2\2\u0117\u0119\5n8\2\u0118\u0116\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011d\7<\2\2\u011d\u011f\3\2\2\2\u011e\u00f7\3\2\2\2\u011e\u0101\3\2"+
		"\2\2\u011e\u0114\3\2\2\2\u011f\31\3\2\2\2\u0120\u012c\5n8\2\u0121\u0122"+
		"\7;\2\2\u0122\u0123\5n8\2\u0123\u0124\5\34\17\2\u0124\u0125\5\30\r\2\u0125"+
		"\u0126\7\17\2\2\u0126\u0127\7;\2\2\u0127\u0128\5\36\20\2\u0128\u0129\7"+
		"<\2\2\u0129\u012a\7<\2\2\u012a\u012c\3\2\2\2\u012b\u0120\3\2\2\2\u012b"+
		"\u0121\3\2\2\2\u012c\33\3\2\2\2\u012d\u0135\7\22\2\2\u012e\u0130\t\4\2"+
		"\2\u012f\u0131\7\25\2\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0135\7\21\2\2\u0133\u0135\7\26\2\2\u0134\u012d\3"+
		"\2\2\2\u0134\u012e\3\2\2\2\u0134\u0133\3\2\2\2\u0135\35\3\2\2\2\u0136"+
		"\u0137\5l\67\2\u0137\u0138\7\34\2\2\u0138\u0139\5v<\2\u0139\u013a\7/\2"+
		"\2\u013a\u013b\5l\67\2\u013b\u013c\7\34\2\2\u013c\u013e\5v<\2\u013d\u013f"+
		"\5.\30\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\37\3\2\2\2\u0140"+
		"\u0141\7\27\2\2\u0141\u014a\5\"\22\2\u0142\u0143\7\27\2\2\u0143\u0144"+
		"\7;\2\2\u0144\u0145\5\"\22\2\u0145\u0146\7<\2\2\u0146\u0147\7\65\2\2\u0147"+
		"\u0148\5$\23\2\u0148\u014a\3\2\2\2\u0149\u0140\3\2\2\2\u0149\u0142\3\2"+
		"\2\2\u014a!\3\2\2\2\u014b\u014e\5\60\31\2\u014c\u014e\5\64\33\2\u014d"+
		"\u014b\3\2\2\2\u014d\u014c\3\2\2\2\u014e#\3\2\2\2\u014f\u0156\5&\24\2"+
		"\u0150\u0153\5*\26\2\u0151\u0152\7\65\2\2\u0152\u0154\5&\24\2\u0153\u0151"+
		"\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u014f\3\2\2\2\u0155"+
		"\u0150\3\2\2\2\u0156%\3\2\2\2\u0157\u015f\5(\25\2\u0158\u0159\7;\2\2\u0159"+
		"\u015a\5(\25\2\u015a\u015b\7\65\2\2\u015b\u015c\5(\25\2\u015c\u015d\7"+
		"<\2\2\u015d\u015f\3\2\2\2\u015e\u0157\3\2\2\2\u015e\u0158\3\2\2\2\u015f"+
		"\'\3\2\2\2\u0160\u0173\5\"\22\2\u0161\u0162\5l\67\2\u0162\u0163\7\34\2"+
		"\2\u0163\u0164\5v<\2\u0164\u0165\7?\2\2\u0165\u0166\5l\67\2\u0166\u0167"+
		"\7\34\2\2\u0167\u0168\5v<\2\u0168\u0173\3\2\2\2\u0169\u016a\5l\67\2\u016a"+
		"\u016b\7\34\2\2\u016b\u016c\5v<\2\u016c\u016e\7\66\2\2\u016d\u016f\7\67"+
		"\2\2\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u0171\7:\2\2\u0171\u0173\3\2\2\2\u0172\u0160\3\2\2\2\u0172\u0161\3\2"+
		"\2\2\u0172\u0169\3\2\2\2\u0173)\3\2\2\2\u0174\u017c\5,\27\2\u0175\u0176"+
		"\7;\2\2\u0176\u0177\5,\27\2\u0177\u0178\7\65\2\2\u0178\u0179\5,\27\2\u0179"+
		"\u017a\7<\2\2\u017a\u017c\3\2\2\2\u017b\u0174\3\2\2\2\u017b\u0175\3\2"+
		"\2\2\u017c+\3\2\2\2\u017d\u017e\5l\67\2\u017e\u017f\7\34\2\2\u017f\u0181"+
		"\5v<\2\u0180\u0182\7\67\2\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183\u0184\78\2\2\u0184\u0185\7-\2\2\u0185\u0186\7\65"+
		"\2\2\u0186\u0187\7;\2\2\u0187\u0188\7-\2\2\u0188\u0189\7>\2\2\u0189\u018a"+
		"\7-\2\2\u018a\u018b\7<\2\2\u018b\u01d9\3\2\2\2\u018c\u018d\5l\67\2\u018d"+
		"\u018e\7\34\2\2\u018e\u018f\5v<\2\u018f\u0190\7?\2\2\u0190\u0191\7.\2"+
		"\2\u0191\u01d9\3\2\2\2\u0192\u0193\5l\67\2\u0193\u0194\7\34\2\2\u0194"+
		"\u0196\5v<\2\u0195\u0197\7\67\2\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2"+
		"\2\2\u0197\u0198\3\2\2\2\u0198\u0199\79\2\2\u0199\u019e\7-\2\2\u019a\u019b"+
		"\7\35\2\2\u019b\u019d\7-\2\2\u019c\u019a\3\2\2\2\u019d\u01a0\3\2\2\2\u019e"+
		"\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01d9\3\2\2\2\u01a0\u019e\3\2"+
		"\2\2\u01a1\u01a2\5l\67\2\u01a2\u01a3\7\34\2\2\u01a3\u01a5\5v<\2\u01a4"+
		"\u01a6\7\67\2\2\u01a5\u01a4\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\3"+
		"\2\2\2\u01a7\u01a8\79\2\2\u01a8\u01ad\7.\2\2\u01a9\u01aa\7\35\2\2\u01aa"+
		"\u01ac\7.\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2"+
		"\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01d9\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0"+
		"\u01b1\5l\67\2\u01b1\u01b2\7\34\2\2\u01b2\u01b3\5v<\2\u01b3\u01b4\7?\2"+
		"\2\u01b4\u01b5\7-\2\2\u01b5\u01b6\7\65\2\2\u01b6\u01b7\5l\67\2\u01b7\u01b8"+
		"\7\34\2\2\u01b8\u01b9\5v<\2\u01b9\u01ba\7?\2\2\u01ba\u01bb\7;\2\2\u01bb"+
		"\u01bc\7-\2\2\u01bc\u01bd\7>\2\2\u01bd\u01be\7-\2\2\u01be\u01bf\7<\2\2"+
		"\u01bf\u01d9\3\2\2\2\u01c0\u01c1\5l\67\2\u01c1\u01c2\7\34\2\2\u01c2\u01c3"+
		"\5v<\2\u01c3\u01c4\7/\2\2\u01c4\u01c5\t\5\2\2\u01c5\u01d9\3\2\2\2\u01c6"+
		"\u01c7\5l\67\2\u01c7\u01c8\7\34\2\2\u01c8\u01c9\7\64\2\2\u01c9\u01ca\7"+
		"\r\2\2\u01ca\u01cb\7;\2\2\u01cb\u01cc\7.\2\2\u01cc\u01cd\7\35\2\2\u01cd"+
		"\u01ce\7\60\2\2\u01ce\u01cf\7<\2\2\u01cf\u01d9\3\2\2\2\u01d0\u01d1\5l"+
		"\67\2\u01d1\u01d2\7\34\2\2\u01d2\u01d3\5v<\2\u01d3\u01d4\7/\2\2\u01d4"+
		"\u01d5\5l\67\2\u01d5\u01d6\7\34\2\2\u01d6\u01d7\5v<\2\u01d7\u01d9\3\2"+
		"\2\2\u01d8\u017d\3\2\2\2\u01d8\u018c\3\2\2\2\u01d8\u0192\3\2\2\2\u01d8"+
		"\u01a1\3\2\2\2\u01d8\u01b0\3\2\2\2\u01d8\u01c0\3\2\2\2\u01d8\u01c6\3\2"+
		"\2\2\u01d8\u01d0\3\2\2\2\u01d9-\3\2\2\2\u01da\u01db\5t;\2\u01db\u01dc"+
		"\7\65\2\2\u01dc\u01dd\5\60\31\2\u01dd/\3\2\2\2\u01de\u01df\5l\67\2\u01df"+
		"\u01e0\7\34\2\2\u01e0\u01e1\5v<\2\u01e1\u01e2\7?\2\2\u01e2\u01e3\5> \2"+
		"\u01e3\u0214\3\2\2\2\u01e4\u01e5\7;\2\2\u01e5\u01e6\5l\67\2\u01e6\u01e7"+
		"\7\34\2\2\u01e7\u01e8\5v<\2\u01e8\u01e9\7\35\2\2\u01e9\u01ea\5l\67\2\u01ea"+
		"\u01eb\7\34\2\2\u01eb\u01ec\5v<\2\u01ec\u01ee\7<\2\2\u01ed\u01ef\7\67"+
		"\2\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0"+
		"\u01f1\79\2\2\u01f1\u01f2\5:\36\2\u01f2\u0214\3\2\2\2\u01f3\u01f4\5l\67"+
		"\2\u01f4\u01f5\7\34\2\2\u01f5\u01f6\5v<\2\u01f6\u01f7\5f\64\2\u01f7\u01f8"+
		"\5> \2\u01f8\u0214\3\2\2\2\u01f9\u01fa\7;\2\2\u01fa\u01fb\7-\2\2\u01fb"+
		"\u01fc\7\35\2\2\u01fc\u01fd\7-\2\2\u01fd\u01ff\7<\2\2\u01fe\u0200\7\67"+
		"\2\2\u01ff\u01fe\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\3\2\2\2\u0201"+
		"\u0202\79\2\2\u0202\u0214\5:\36\2\u0203\u0204\7;\2\2\u0204\u0205\7.\2"+
		"\2\u0205\u0206\7\35\2\2\u0206\u0207\7.\2\2\u0207\u0209\7<\2\2\u0208\u020a"+
		"\7\67\2\2\u0209\u0208\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b\3\2\2\2"+
		"\u020b\u020c\79\2\2\u020c\u0214\5:\36\2\u020d\u020e\5l\67\2\u020e\u020f"+
		"\7\34\2\2\u020f\u0210\5v<\2\u0210\u0211\5f\64\2\u0211\u0212\5\66\34\2"+
		"\u0212\u0214\3\2\2\2\u0213\u01de\3\2\2\2\u0213\u01e4\3\2\2\2\u0213\u01f3"+
		"\3\2\2\2\u0213\u01f9\3\2\2\2\u0213\u0203\3\2\2\2\u0213\u020d\3\2\2\2\u0214"+
		"\61\3\2\2\2\u0215\u0216\5l\67\2\u0216\u0217\7\34\2\2\u0217\u0218\5v<\2"+
		"\u0218\u0219\7?\2\2\u0219\u021a\5h\65\2\u021a\u021b\58\35\2\u021b\63\3"+
		"\2\2\2\u021c\u021e\7\67\2\2\u021d\u021c\3\2\2\2\u021d\u021e\3\2\2\2\u021e"+
		"\u021f\3\2\2\2\u021f\u0225\7\13\2\2\u0220\u0221\7;\2\2\u0221\u0222\5>"+
		" \2\u0222\u0223\7<\2\2\u0223\u0226\3\2\2\2\u0224\u0226\5<\37\2\u0225\u0220"+
		"\3\2\2\2\u0225\u0224\3\2\2\2\u0226\u0235\3\2\2\2\u0227\u0228\5l\67\2\u0228"+
		"\u0229\7\34\2\2\u0229\u022a\5v<\2\u022a\u022b\5f\64\2\u022b\u022c\5<\37"+
		"\2\u022c\u0235\3\2\2\2\u022d\u022e\5> \2\u022e\u0230\7\66\2\2\u022f\u0231"+
		"\7\67\2\2\u0230\u022f\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0232\3\2\2\2"+
		"\u0232\u0233\7:\2\2\u0233\u0235\3\2\2\2\u0234\u021d\3\2\2\2\u0234\u0227"+
		"\3\2\2\2\u0234\u022d\3\2\2\2\u0235\65\3\2\2\2\u0236\u0237\7;\2\2\u0237"+
		"\u0238\7\6\2\2\u0238\u0239\5j\66\2\u0239\u023b\7\16\2\2\u023a\u023c\t"+
		"\3\2\2\u023b\u023a\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023d\3\2\2\2\u023d"+
		"\u023e\7\6\2\2\u023e\u023f\5j\66\2\u023f\u0240\7<\2\2\u0240\67\3\2\2\2"+
		"\u0241\u0242\5> \2\u0242\u0244\7\16\2\2\u0243\u0245\t\3\2\2\u0244\u0243"+
		"\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0247\5> \2\u0247"+
		"9\3\2\2\2\u0248\u0249\7;\2\2\u0249\u024b\7\6\2\2\u024a\u024c\7\7\2\2\u024b"+
		"\u024a\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024e\3\2\2\2\u024d\u024f\7\f"+
		"\2\2\u024e\u024d\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0250\3\2\2\2\u0250"+
		"\u0251\5t;\2\u0251\u0252\7\34\2\2\u0252\u0253\5v<\2\u0253\u0254\7\36\2"+
		"\2\u0254\u0255\5t;\2\u0255\u0256\7\34\2\2\u0256\u0257\5v<\2\u0257\u0258"+
		"\7\35\2\2\u0258\u0259\5t;\2\u0259\u025a\7\34\2\2\u025a\u025b\5v<\2\u025b"+
		"\u025c\7\36\2\2\u025c\u025d\5t;\2\u025d\u025e\7\34\2\2\u025e\u025f\5v"+
		"<\2\u025f\u0261\5B\"\2\u0260\u0262\5P)\2\u0261\u0260\3\2\2\2\u0261\u0262"+
		"\3\2\2\2\u0262\u0264\3\2\2\2\u0263\u0265\5R*\2\u0264\u0263\3\2\2\2\u0264"+
		"\u0265\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0267\7<\2\2\u0267\u0278\3\2"+
		"\2\2\u0268\u0269\7;\2\2\u0269\u026a\7\6\2\2\u026a\u026b\5j\66\2\u026b"+
		"\u026c\7\35\2\2\u026c\u026d\5j\66\2\u026d\u026f\7\16\2\2\u026e\u0270\t"+
		"\3\2\2\u026f\u026e\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0271\3\2\2\2\u0271"+
		"\u0272\7\6\2\2\u0272\u0273\5j\66\2\u0273\u0274\7\35\2\2\u0274\u0275\5"+
		"j\66\2\u0275\u0276\7<\2\2\u0276\u0278\3\2\2\2\u0277\u0248\3\2\2\2\u0277"+
		"\u0268\3\2\2\2\u0278;\3\2\2\2\u0279\u027a\7;\2\2\u027a\u027c\7\6\2\2\u027b"+
		"\u027d\7\7\2\2\u027c\u027b\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027f\3\2"+
		"\2\2\u027e\u0280\7\f\2\2\u027f\u027e\3\2\2\2\u027f\u0280\3\2\2\2\u0280"+
		"\u0282\3\2\2\2\u0281\u0283\5x=\2\u0282\u0281\3\2\2\2\u0282\u0283\3\2\2"+
		"\2\u0283\u0284\3\2\2\2\u0284\u0285\7\34\2\2\u0285\u0286\5v<\2\u0286\u0287"+
		"\7\36\2\2\u0287\u0288\5t;\2\u0288\u0289\7\34\2\2\u0289\u028a\5v<\2\u028a"+
		"\u028b\7\20\2\2\u028b\u028c\5D#\2\u028c\u028d\5H%\2\u028d\u028e\7<\2\2"+
		"\u028e=\3\2\2\2\u028f\u0290\7;\2\2\u0290\u0292\7\6\2\2\u0291\u0293\7\7"+
		"\2\2\u0292\u0291\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0295\3\2\2\2\u0294"+
		"\u0296\7\f\2\2\u0295\u0294\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0298\3\2"+
		"\2\2\u0297\u0299\5x=\2\u0298\u0297\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029a"+
		"\3\2\2\2\u029a\u029b\5t;\2\u029b\u029c\7\34\2\2\u029c\u029d\5v<\2\u029d"+
		"\u029e\7<\2\2\u029e\u029f\7\36\2\2\u029f\u02a0\5v<\2\u02a0\u02a4\5B\""+
		"\2\u02a1\u02a2\5P)\2\u02a2\u02a3\5R*\2\u02a3\u02a5\3\2\2\2\u02a4\u02a1"+
		"\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a7\7<\2\2\u02a7"+
		"\u02b0\3\2\2\2\u02a8\u02a9\7;\2\2\u02a9\u02aa\7\6\2\2\u02aa\u02ab\5j\66"+
		"\2\u02ab\u02ac\7\20\2\2\u02ac\u02ad\7#\2\2\u02ad\u02ae\7<\2\2\u02ae\u02b0"+
		"\3\2\2\2\u02af\u028f\3\2\2\2\u02af\u02a8\3\2\2\2\u02b0?\3\2\2\2\u02b1"+
		"\u02b2\7;\2\2\u02b2\u02b3\7\6\2\2\u02b3\u02b4\7\7\2\2\u02b4\u02b5\7\f"+
		"\2\2\u02b5\u02b6\5x=\2\u02b6\u02b7\5t;\2\u02b7\u02b8\7\34\2\2\u02b8\u02b9"+
		"\5v<\2\u02b9\u02ba\7<\2\2\u02ba\u02bb\7\36\2\2\u02bb\u02bc\5v<\2\u02bc"+
		"\u02bd\7\20\2\2\u02bd\u02be\5D#\2\u02be\u02bf\7\27\2\2\u02bf\u02c0\5H"+
		"%\2\u02c0\u02c1\7<\2\2\u02c1A\3\2\2\2\u02c2\u02c3\7\20\2\2\u02c3\u02c6"+
		"\5D#\2\u02c4\u02c5\7\27\2\2\u02c5\u02c7\5J&\2\u02c6\u02c4\3\2\2\2\u02c6"+
		"\u02c7\3\2\2\2\u02c7C\3\2\2\2\u02c8\u02c9\7;\2\2\u02c9\u02ca\5r:\2\u02ca"+
		"\u02cc\5\34\17\2\u02cb\u02cd\7;\2\2\u02cc\u02cb\3\2\2\2\u02cc\u02cd\3"+
		"\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02d0\5r:\2\u02cf\u02d1\7<\2\2\u02d0"+
		"\u02cf\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d3\7\17"+
		"\2\2\u02d3\u02d4\7;\2\2\u02d4\u02d5\5F$\2\u02d5\u02d6\7<\2\2\u02d6\u02d7"+
		"\7<\2\2\u02d7\u0302\3\2\2\2\u02d8\u0302\5r:\2\u02d9\u02da\7;\2\2\u02da"+
		"\u02db\5r:\2\u02db\u02dc\7\35\2\2\u02dc\u02dd\5r:\2\u02dd\u02de\7<\2\2"+
		"\u02de\u0302\3\2\2\2\u02df\u02e0\7;\2\2\u02e0\u02e1\5r:\2\u02e1\u02e3"+
		"\5\34\17\2\u02e2\u02e4\7;\2\2\u02e3\u02e2\3\2\2\2\u02e3\u02e4\3\2\2\2"+
		"\u02e4\u02e5\3\2\2\2\u02e5\u02e7\5r:\2\u02e6\u02e8\7<\2\2\u02e7\u02e6"+
		"\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ea\7\17\2\2"+
		"\u02ea\u02eb\7;\2\2\u02eb\u02ec\5F$\2\u02ec\u02ed\7<\2\2\u02ed\u02ee\7"+
		"<\2\2\u02ee\u0302\3\2\2\2\u02ef\u02f0\7;\2\2\u02f0\u02f1\5r:\2\u02f1\u02f2"+
		"\5\34\17\2\u02f2\u02f3\7;\2\2\u02f3\u02f4\5r:\2\u02f4\u02f5\5\34\17\2"+
		"\u02f5\u02f6\5r:\2\u02f6\u02f7\7\17\2\2\u02f7\u02f8\7;\2\2\u02f8\u02f9"+
		"\5F$\2\u02f9\u02fa\7<\2\2\u02fa\u02fb\7<\2\2\u02fb\u02fc\7\17\2\2\u02fc"+
		"\u02fd\7;\2\2\u02fd\u02fe\5F$\2\u02fe\u02ff\7<\2\2\u02ff\u0300\7<\2\2"+
		"\u0300\u0302\3\2\2\2\u0301\u02c8\3\2\2\2\u0301\u02d8\3\2\2\2\u0301\u02d9"+
		"\3\2\2\2\u0301\u02df\3\2\2\2\u0301\u02ef\3\2\2\2\u0302E\3\2\2\2\u0303"+
		"\u0304\5t;\2\u0304\u0305\7\34\2\2\u0305\u0306\5v<\2\u0306\u0307\7/\2\2"+
		"\u0307\u0308\5t;\2\u0308\u0309\7\34\2\2\u0309\u030c\5v<\2\u030a\u030b"+
		"\7\65\2\2\u030b\u030d\5\"\22\2\u030c\u030a\3\2\2\2\u030c\u030d\3\2\2\2"+
		"\u030dG\3\2\2\2\u030e\u0314\5L\'\2\u030f\u0312\7\65\2\2\u0310\u0313\5"+
		"L\'\2\u0311\u0313\5N(\2\u0312\u0310\3\2\2\2\u0312\u0311\3\2\2\2\u0313"+
		"\u0315\3\2\2\2\u0314\u030f\3\2\2\2\u0314\u0315\3\2\2\2\u0315I\3\2\2\2"+
		"\u0316\u0319\5N(\2\u0317\u0318\7\65\2\2\u0318\u031a\5N(\2\u0319\u0317"+
		"\3\2\2\2\u0319\u031a\3\2\2\2\u031aK\3\2\2\2\u031b\u031c\5t;\2\u031c\u031f"+
		"\7\34\2\2\u031d\u0320\5v<\2\u031e\u0320\5v<\2\u031f\u031d\3\2\2\2\u031f"+
		"\u031e\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0322\7?\2\2\u0322\u0323\5l\67"+
		"\2\u0323\u0326\7\34\2\2\u0324\u0327\5v<\2\u0325\u0327\5v<\2\u0326\u0324"+
		"\3\2\2\2\u0326\u0325\3\2\2\2\u0327M\3\2\2\2\u0328\u0329\5t;\2\u0329\u032c"+
		"\7\34\2\2\u032a\u032d\5v<\2\u032b\u032d\5v<\2\u032c\u032a\3\2\2\2\u032c"+
		"\u032b\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u0336\7?\2\2\u032f\u0337\7-\2"+
		"\2\u0330\u0337\7.\2\2\u0331\u0334\5t;\2\u0332\u0335\5v<\2\u0333\u0335"+
		"\5v<\2\u0334\u0332\3\2\2\2\u0334\u0333\3\2\2\2\u0335\u0337\3\2\2\2\u0336"+
		"\u032f\3\2\2\2\u0336\u0330\3\2\2\2\u0336\u0331\3\2\2\2\u0337O\3\2\2\2"+
		"\u0338\u0339\7\30\2\2\u0339\u033a\5t;\2\u033a\u033b\7\34\2\2\u033b\u0341"+
		"\5v<\2\u033c\u033d\7\35\2\2\u033d\u033e\5t;\2\u033e\u033f\7\34\2\2\u033f"+
		"\u0340\5v<\2\u0340\u0342\3\2\2\2\u0341\u033c\3\2\2\2\u0341\u0342\3\2\2"+
		"\2\u0342Q\3\2\2\2\u0343\u0344\7\31\2\2\u0344\u0349\5T+\2\u0345\u0346\7"+
		"\65\2\2\u0346\u0348\5T+\2\u0347\u0345\3\2\2\2\u0348\u034b\3\2\2\2\u0349"+
		"\u0347\3\2\2\2\u0349\u034a\3\2\2\2\u034aS\3\2\2\2\u034b\u0349\3\2\2\2"+
		"\u034c\u034d\5t;\2\u034d\u034e\7\34\2\2\u034e\u034f\5v<\2\u034f\u0350"+
		"\7?\2\2\u0350\u0351\5j\66\2\u0351U\3\2\2\2\u0352\u0353\7\30\2\2\u0353"+
		"\u0358\5v<\2\u0354\u0355\7\35\2\2\u0355\u0357\5v<\2\u0356\u0354\3\2\2"+
		"\2\u0357\u035a\3\2\2\2\u0358\u0356\3\2\2\2\u0358\u0359\3\2\2\2\u0359W"+
		"\3\2\2\2\u035a\u0358\3\2\2\2\u035b\u035c\7\31\2\2\u035c\u0361\5Z.\2\u035d"+
		"\u035e\7\65\2\2\u035e\u0360\5Z.\2\u035f\u035d\3\2\2\2\u0360\u0363\3\2"+
		"\2\2\u0361\u035f\3\2\2\2\u0361\u0362\3\2\2\2\u0362Y\3\2\2\2\u0363\u0361"+
		"\3\2\2\2\u0364\u0365\5v<\2\u0365\u0366\7?\2\2\u0366\u0367\5j\66\2\u0367"+
		"\u036a\3\2\2\2\u0368\u036a\5\60\31\2\u0369\u0364\3\2\2\2\u0369\u0368\3"+
		"\2\2\2\u036a[\3\2\2\2\u036b\u036c\7\32\2\2\u036c\u036d\7\'\2\2\u036d\u036e"+
		"\7\34\2\2\u036e\u0370\5v<\2\u036f\u0371\7\37\2\2\u0370\u036f\3\2\2\2\u0370"+
		"\u0371\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0373\7\35\2\2\u0373\u0375\5"+
		"b\62\2\u0374\u0376\5d\63\2\u0375\u0374\3\2\2\2\u0375\u0376\3\2\2\2\u0376"+
		"\u0381\3\2\2\2\u0377\u0378\7\32\2\2\u0378\u037e\5^\60\2\u0379\u037a\7"+
		"\35\2\2\u037a\u037c\5b\62\2\u037b\u037d\5d\63\2\u037c\u037b\3\2\2\2\u037c"+
		"\u037d\3\2\2\2\u037d\u037f\3\2\2\2\u037e\u0379\3\2\2\2\u037e\u037f\3\2"+
		"\2\2\u037f\u0381\3\2\2\2\u0380\u036b\3\2\2\2\u0380\u0377\3\2\2\2\u0381"+
		"]\3\2\2\2\u0382\u0387\5`\61\2\u0383\u0384\7\35\2\2\u0384\u0386\5`\61\2"+
		"\u0385\u0383\3\2\2\2\u0386\u0389\3\2\2\2\u0387\u0385\3\2\2\2\u0387\u0388"+
		"\3\2\2\2\u0388_\3\2\2\2\u0389\u0387\3\2\2\2\u038a\u038b\7\'\2\2\u038b"+
		"\u038c\7\34\2\2\u038c\u0392\5v<\2\u038d\u038e\7\35\2\2\u038e\u038f\5l"+
		"\67\2\u038f\u0390\7\34\2\2\u0390\u0391\5v<\2\u0391\u0393\3\2\2\2\u0392"+
		"\u038d\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0395\7\37"+
		"\2\2\u0395\u03a5\3\2\2\2\u0396\u0397\5v<\2\u0397\u0398\7\37\2\2\u0398"+
		"\u03a5\3\2\2\2\u0399\u039a\7\r\2\2\u039a\u039b\7;\2\2\u039b\u039c\5l\67"+
		"\2\u039c\u039d\7\34\2\2\u039d\u039e\5v<\2\u039e\u039f\7\35\2\2\u039f\u03a0"+
		"\5l\67\2\u03a0\u03a1\7\34\2\2\u03a1\u03a2\5v<\2\u03a2\u03a3\7<\2\2\u03a3"+
		"\u03a5\3\2\2\2\u03a4\u038a\3\2\2\2\u03a4\u0396\3\2\2\2\u03a4\u0399\3\2"+
		"\2\2\u03a5a\3\2\2\2\u03a6\u03ab\5v<\2\u03a7\u03a8\7\35\2\2\u03a8\u03aa"+
		"\5v<\2\u03a9\u03a7\3\2\2\2\u03aa\u03ad\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ab"+
		"\u03ac\3\2\2\2\u03acc\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ae\u03af\7 \2\2\u03af"+
		"\u03b2\7!\2\2\u03b0\u03b1\7\"\2\2\u03b1\u03b3\7-\2\2\u03b2\u03b0\3\2\2"+
		"\2\u03b2\u03b3\3\2\2\2\u03b3e\3\2\2\2\u03b4\u03b5\7?\2\2\u03b5\u03bb\5"+
		"h\65\2\u03b6\u03b8\7\67\2\2\u03b7\u03b6\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8"+
		"\u03b9\3\2\2\2\u03b9\u03bb\79\2\2\u03ba\u03b4\3\2\2\2\u03ba\u03b7\3\2"+
		"\2\2\u03bbg\3\2\2\2\u03bc\u03bd\t\6\2\2\u03bdi\3\2\2\2\u03be\u03bf\t\5"+
		"\2\2\u03bfk\3\2\2\2\u03c0\u03c1\t\7\2\2\u03c1m\3\2\2\2\u03c2\u03c3\5l"+
		"\67\2\u03c3\u03c4\7\36\2\2\u03c4\u03c5\5l\67\2\u03c5\u03c6\b8\1\2\u03c6"+
		"\u03ce\3\2\2\2\u03c7\u03c8\7;\2\2\u03c8\u03c9\5p9\2\u03c9\u03ca\7<\2\2"+
		"\u03ca\u03cb\7\36\2\2\u03cb\u03cc\7\'\2\2\u03cc\u03ce\3\2\2\2\u03cd\u03c2"+
		"\3\2\2\2\u03cd\u03c7\3\2\2\2\u03ceo\3\2\2\2\u03cf\u03d1\7\6\2\2\u03d0"+
		"\u03d2\7\7\2\2\u03d1\u03d0\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d4\3\2"+
		"\2\2\u03d3\u03d5\7\f\2\2\u03d4\u03d3\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5"+
		"\u03d6\3\2\2\2\u03d6\u03d7\5t;\2\u03d7\u03d8\7\34\2\2\u03d8\u03d9\7\61"+
		"\2\2\u03d9\u03da\5B\"\2\u03daq\3\2\2\2\u03db\u03dc\5l\67\2\u03dc\u03dd"+
		"\7\36\2\2\u03dd\u03de\5t;\2\u03des\3\2\2\2\u03df\u03e0\7%\2\2\u03e0\u03e3"+
		"\b;\1\2\u03e1\u03e3\7&\2\2\u03e2\u03df\3\2\2\2\u03e2\u03e1\3\2\2\2\u03e3"+
		"u\3\2\2\2\u03e4\u03e5\7*\2\2\u03e5\u03e6\7)\2\2\u03e6\u03ec\7*\2\2\u03e7"+
		"\u03e8\7*\2\2\u03e8\u03e9\7+\2\2\u03e9\u03ec\7*\2\2\u03ea\u03ec\7(\2\2"+
		"\u03eb\u03e4\3\2\2\2\u03eb\u03e7\3\2\2\2\u03eb\u03ea\3\2\2\2\u03ecw\3"+
		"\2\2\2\u03ed\u03ee\7\63\2\2\u03ee\u03ef\7;\2\2\u03ef\u03f0\7\7\2\2\u03f0"+
		"y\3\2\2\2_{\177\u0082\u0085\u008d\u009b\u00a3\u00ab\u00b2\u00c0\u00e2"+
		"\u00e6\u011a\u011e\u012b\u0130\u0134\u013e\u0149\u014d\u0153\u0155\u015e"+
		"\u016e\u0172\u017b\u0181\u0196\u019e\u01a5\u01ad\u01d8\u01ee\u01ff\u0209"+
		"\u0213\u021d\u0225\u0230\u0234\u023b\u0244\u024b\u024e\u0261\u0264\u026f"+
		"\u0277\u027c\u027f\u0282\u0292\u0295\u0298\u02a4\u02af\u02c6\u02cc\u02d0"+
		"\u02e3\u02e7\u0301\u030c\u0312\u0314\u0319\u031f\u0326\u032c\u0334\u0336"+
		"\u0341\u0349\u0358\u0361\u0369\u0370\u0375\u037c\u037e\u0380\u0387\u0392"+
		"\u03a4\u03ab\u03b2\u03b7\u03ba\u03cd\u03d1\u03d4\u03e2\u03eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}