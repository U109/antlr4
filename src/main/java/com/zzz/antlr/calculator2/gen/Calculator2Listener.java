// Generated from F:/antlr/src/main/java/com/zzz/antlr/calculator2/g4\Calculator2.g4 by ANTLR 4.12.0
package com.zzz.antlr.calculator2.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Calculator2Parser}.
 */
public interface Calculator2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Calculator2Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(Calculator2Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Calculator2Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(Calculator2Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link Calculator2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(Calculator2Parser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link Calculator2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(Calculator2Parser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link Calculator2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(Calculator2Parser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link Calculator2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(Calculator2Parser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link Calculator2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(Calculator2Parser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link Calculator2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(Calculator2Parser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link Calculator2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(Calculator2Parser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link Calculator2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(Calculator2Parser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link Calculator2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(Calculator2Parser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link Calculator2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(Calculator2Parser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link Calculator2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(Calculator2Parser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link Calculator2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(Calculator2Parser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link Calculator2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(Calculator2Parser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link Calculator2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(Calculator2Parser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link Calculator2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(Calculator2Parser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link Calculator2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(Calculator2Parser.IntContext ctx);
}