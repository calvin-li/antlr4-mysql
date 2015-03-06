// Generated from mysql_expressions.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mysql_expressionsParser}.
 */
public interface mysql_expressionsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(mysql_expressionsParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(mysql_expressionsParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#explain}.
	 * @param ctx the parse tree
	 */
	void enterExplain(mysql_expressionsParser.ExplainContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#explain}.
	 * @param ctx the parse tree
	 */
	void exitExplain(mysql_expressionsParser.ExplainContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(mysql_expressionsParser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(mysql_expressionsParser.Select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#simple_select_list}.
	 * @param ctx the parse tree
	 */
	void enterSimple_select_list(mysql_expressionsParser.Simple_select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#simple_select_list}.
	 * @param ctx the parse tree
	 */
	void exitSimple_select_list(mysql_expressionsParser.Simple_select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#aggregate_select_list}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_select_list(mysql_expressionsParser.Aggregate_select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#aggregate_select_list}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_select_list(mysql_expressionsParser.Aggregate_select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#new_select_item}.
	 * @param ctx the parse tree
	 */
	void enterNew_select_item(mysql_expressionsParser.New_select_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#new_select_item}.
	 * @param ctx the parse tree
	 */
	void exitNew_select_item(mysql_expressionsParser.New_select_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#nonaggregate_select_item}.
	 * @param ctx the parse tree
	 */
	void enterNonaggregate_select_item(mysql_expressionsParser.Nonaggregate_select_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#nonaggregate_select_item}.
	 * @param ctx the parse tree
	 */
	void exitNonaggregate_select_item(mysql_expressionsParser.Nonaggregate_select_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#aggregate_select_item}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_select_item(mysql_expressionsParser.Aggregate_select_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#aggregate_select_item}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_select_item(mysql_expressionsParser.Aggregate_select_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#combo_select_item}.
	 * @param ctx the parse tree
	 */
	void enterCombo_select_item(mysql_expressionsParser.Combo_select_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#combo_select_item}.
	 * @param ctx the parse tree
	 */
	void exitCombo_select_item(mysql_expressionsParser.Combo_select_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#select_subquery}.
	 * @param ctx the parse tree
	 */
	void enterSelect_subquery(mysql_expressionsParser.Select_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#select_subquery}.
	 * @param ctx the parse tree
	 */
	void exitSelect_subquery(mysql_expressionsParser.Select_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#select_subquery_body_disabled}.
	 * @param ctx the parse tree
	 */
	void enterSelect_subquery_body_disabled(mysql_expressionsParser.Select_subquery_body_disabledContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#select_subquery_body_disabled}.
	 * @param ctx the parse tree
	 */
	void exitSelect_subquery_body_disabled(mysql_expressionsParser.Select_subquery_body_disabledContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#join_list}.
	 * @param ctx the parse tree
	 */
	void enterJoin_list(mysql_expressionsParser.Join_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#join_list}.
	 * @param ctx the parse tree
	 */
	void exitJoin_list(mysql_expressionsParser.Join_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#join_list_disabled}.
	 * @param ctx the parse tree
	 */
	void enterJoin_list_disabled(mysql_expressionsParser.Join_list_disabledContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#join_list_disabled}.
	 * @param ctx the parse tree
	 */
	void exitJoin_list_disabled(mysql_expressionsParser.Join_list_disabledContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#join_type}.
	 * @param ctx the parse tree
	 */
	void enterJoin_type(mysql_expressionsParser.Join_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#join_type}.
	 * @param ctx the parse tree
	 */
	void exitJoin_type(mysql_expressionsParser.Join_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#join_condition_item}.
	 * @param ctx the parse tree
	 */
	void enterJoin_condition_item(mysql_expressionsParser.Join_condition_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#join_condition_item}.
	 * @param ctx the parse tree
	 */
	void exitJoin_condition_item(mysql_expressionsParser.Join_condition_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(mysql_expressionsParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(mysql_expressionsParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#where_subquery}.
	 * @param ctx the parse tree
	 */
	void enterWhere_subquery(mysql_expressionsParser.Where_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#where_subquery}.
	 * @param ctx the parse tree
	 */
	void exitWhere_subquery(mysql_expressionsParser.Where_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#where_list}.
	 * @param ctx the parse tree
	 */
	void enterWhere_list(mysql_expressionsParser.Where_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#where_list}.
	 * @param ctx the parse tree
	 */
	void exitWhere_list(mysql_expressionsParser.Where_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#generic_where_list}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_where_list(mysql_expressionsParser.Generic_where_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#generic_where_list}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_where_list(mysql_expressionsParser.Generic_where_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#where_item}.
	 * @param ctx the parse tree
	 */
	void enterWhere_item(mysql_expressionsParser.Where_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#where_item}.
	 * @param ctx the parse tree
	 */
	void exitWhere_item(mysql_expressionsParser.Where_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#ranged_where_list}.
	 * @param ctx the parse tree
	 */
	void enterRanged_where_list(mysql_expressionsParser.Ranged_where_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#ranged_where_list}.
	 * @param ctx the parse tree
	 */
	void exitRanged_where_list(mysql_expressionsParser.Ranged_where_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#ranged_where_item}.
	 * @param ctx the parse tree
	 */
	void enterRanged_where_item(mysql_expressionsParser.Ranged_where_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#ranged_where_item}.
	 * @param ctx the parse tree
	 */
	void exitRanged_where_item(mysql_expressionsParser.Ranged_where_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#on_subquery}.
	 * @param ctx the parse tree
	 */
	void enterOn_subquery(mysql_expressionsParser.On_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#on_subquery}.
	 * @param ctx the parse tree
	 */
	void exitOn_subquery(mysql_expressionsParser.On_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#general_subquery}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_subquery(mysql_expressionsParser.General_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#general_subquery}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_subquery(mysql_expressionsParser.General_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#general_subquery_union_test_disabled}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_subquery_union_test_disabled(mysql_expressionsParser.General_subquery_union_test_disabledContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#general_subquery_union_test_disabled}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_subquery_union_test_disabled(mysql_expressionsParser.General_subquery_union_test_disabledContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#special_subquery}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_subquery(mysql_expressionsParser.Special_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#special_subquery}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_subquery(mysql_expressionsParser.Special_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#single_union_subquery}.
	 * @param ctx the parse tree
	 */
	void enterSingle_union_subquery(mysql_expressionsParser.Single_union_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#single_union_subquery}.
	 * @param ctx the parse tree
	 */
	void exitSingle_union_subquery(mysql_expressionsParser.Single_union_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#single_union_subquery_disabled}.
	 * @param ctx the parse tree
	 */
	void enterSingle_union_subquery_disabled(mysql_expressionsParser.Single_union_subquery_disabledContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#single_union_subquery_disabled}.
	 * @param ctx the parse tree
	 */
	void exitSingle_union_subquery_disabled(mysql_expressionsParser.Single_union_subquery_disabledContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#double_subquery}.
	 * @param ctx the parse tree
	 */
	void enterDouble_subquery(mysql_expressionsParser.Double_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#double_subquery}.
	 * @param ctx the parse tree
	 */
	void exitDouble_subquery(mysql_expressionsParser.Double_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#correlated_subquery}.
	 * @param ctx the parse tree
	 */
	void enterCorrelated_subquery(mysql_expressionsParser.Correlated_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#correlated_subquery}.
	 * @param ctx the parse tree
	 */
	void exitCorrelated_subquery(mysql_expressionsParser.Correlated_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#single_subquery}.
	 * @param ctx the parse tree
	 */
	void enterSingle_subquery(mysql_expressionsParser.Single_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#single_subquery}.
	 * @param ctx the parse tree
	 */
	void exitSingle_subquery(mysql_expressionsParser.Single_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#int_scalar_subquery}.
	 * @param ctx the parse tree
	 */
	void enterInt_scalar_subquery(mysql_expressionsParser.Int_scalar_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#int_scalar_subquery}.
	 * @param ctx the parse tree
	 */
	void exitInt_scalar_subquery(mysql_expressionsParser.Int_scalar_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#subquery_body}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_body(mysql_expressionsParser.Subquery_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#subquery_body}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_body(mysql_expressionsParser.Subquery_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#subquery_join_list}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_join_list(mysql_expressionsParser.Subquery_join_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#subquery_join_list}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_join_list(mysql_expressionsParser.Subquery_join_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#subquery_join_condition_item}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_join_condition_item(mysql_expressionsParser.Subquery_join_condition_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#subquery_join_condition_item}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_join_condition_item(mysql_expressionsParser.Subquery_join_condition_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#correlated_subquery_where_list}.
	 * @param ctx the parse tree
	 */
	void enterCorrelated_subquery_where_list(mysql_expressionsParser.Correlated_subquery_where_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#correlated_subquery_where_list}.
	 * @param ctx the parse tree
	 */
	void exitCorrelated_subquery_where_list(mysql_expressionsParser.Correlated_subquery_where_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#subquery_where_list}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_where_list(mysql_expressionsParser.Subquery_where_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#subquery_where_list}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_where_list(mysql_expressionsParser.Subquery_where_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#correlated_subquery_where_item}.
	 * @param ctx the parse tree
	 */
	void enterCorrelated_subquery_where_item(mysql_expressionsParser.Correlated_subquery_where_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#correlated_subquery_where_item}.
	 * @param ctx the parse tree
	 */
	void exitCorrelated_subquery_where_item(mysql_expressionsParser.Correlated_subquery_where_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#subquery_where_item}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_where_item(mysql_expressionsParser.Subquery_where_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#subquery_where_item}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_where_item(mysql_expressionsParser.Subquery_where_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#subquery_group_by}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_group_by(mysql_expressionsParser.Subquery_group_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#subquery_group_by}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_group_by(mysql_expressionsParser.Subquery_group_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#subquery_having}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_having(mysql_expressionsParser.Subquery_havingContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#subquery_having}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_having(mysql_expressionsParser.Subquery_havingContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#subquery_having_item}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_having_item(mysql_expressionsParser.Subquery_having_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#subquery_having_item}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_having_item(mysql_expressionsParser.Subquery_having_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_clause(mysql_expressionsParser.Group_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_clause(mysql_expressionsParser.Group_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void enterHaving_clause(mysql_expressionsParser.Having_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void exitHaving_clause(mysql_expressionsParser.Having_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#having_item}.
	 * @param ctx the parse tree
	 */
	void enterHaving_item(mysql_expressionsParser.Having_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#having_item}.
	 * @param ctx the parse tree
	 */
	void exitHaving_item(mysql_expressionsParser.Having_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(mysql_expressionsParser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(mysql_expressionsParser.Order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#order_by_list}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_list(mysql_expressionsParser.Order_by_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#order_by_list}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_list(mysql_expressionsParser.Order_by_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#order_by_item}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_item(mysql_expressionsParser.Order_by_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#order_by_item}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_item(mysql_expressionsParser.Order_by_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#total_order_by}.
	 * @param ctx the parse tree
	 */
	void enterTotal_order_by(mysql_expressionsParser.Total_order_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#total_order_by}.
	 * @param ctx the parse tree
	 */
	void exitTotal_order_by(mysql_expressionsParser.Total_order_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#limit_rule}.
	 * @param ctx the parse tree
	 */
	void enterLimit_rule(mysql_expressionsParser.Limit_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#limit_rule}.
	 * @param ctx the parse tree
	 */
	void exitLimit_rule(mysql_expressionsParser.Limit_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#membership_operator}.
	 * @param ctx the parse tree
	 */
	void enterMembership_operator(mysql_expressionsParser.Membership_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#membership_operator}.
	 * @param ctx the parse tree
	 */
	void exitMembership_operator(mysql_expressionsParser.Membership_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#all_any}.
	 * @param ctx the parse tree
	 */
	void enterAll_any(mysql_expressionsParser.All_anyContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#all_any}.
	 * @param ctx the parse tree
	 */
	void exitAll_any(mysql_expressionsParser.All_anyContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(mysql_expressionsParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(mysql_expressionsParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(mysql_expressionsParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(mysql_expressionsParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#new_table}.
	 * @param ctx the parse tree
	 */
	void enterNew_table(mysql_expressionsParser.New_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#new_table}.
	 * @param ctx the parse tree
	 */
	void exitNew_table(mysql_expressionsParser.New_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#from_subquery}.
	 * @param ctx the parse tree
	 */
	void enterFrom_subquery(mysql_expressionsParser.From_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#from_subquery}.
	 * @param ctx the parse tree
	 */
	void exitFrom_subquery(mysql_expressionsParser.From_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#new_subquery_table}.
	 * @param ctx the parse tree
	 */
	void enterNew_subquery_table(mysql_expressionsParser.New_subquery_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#new_subquery_table}.
	 * @param ctx the parse tree
	 */
	void exitNew_subquery_table(mysql_expressionsParser.New_subquery_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#subquery_table}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_table(mysql_expressionsParser.Subquery_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#subquery_table}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_table(mysql_expressionsParser.Subquery_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(mysql_expressionsParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(mysql_expressionsParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_expressionsParser#aggregate}.
	 * @param ctx the parse tree
	 */
	void enterAggregate(mysql_expressionsParser.AggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_expressionsParser#aggregate}.
	 * @param ctx the parse tree
	 */
	void exitAggregate(mysql_expressionsParser.AggregateContext ctx);
}