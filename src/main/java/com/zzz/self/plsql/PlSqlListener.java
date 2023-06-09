// Generated from F:/antlr/src/main/java/com/zzz/self/plsql\PlSql.g4 by ANTLR 4.12.0
package com.zzz.self.plsql;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlSqlParser}.
 */
public interface PlSqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStatement(PlSqlParser.SelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStatement(PlSqlParser.SelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(PlSqlParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(PlSqlParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#selectList}.
	 * @param ctx the parse tree
	 */
	void enterSelectList(PlSqlParser.SelectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#selectList}.
	 * @param ctx the parse tree
	 */
	void exitSelectList(PlSqlParser.SelectListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void enterSelectItem(PlSqlParser.SelectItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void exitSelectItem(PlSqlParser.SelectItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#columnIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterColumnIdentifier(PlSqlParser.ColumnIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#columnIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitColumnIdentifier(PlSqlParser.ColumnIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(PlSqlParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(PlSqlParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(PlSqlParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(PlSqlParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(PlSqlParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(PlSqlParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(PlSqlParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(PlSqlParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PlSqlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PlSqlParser.ExpressionContext ctx);
}