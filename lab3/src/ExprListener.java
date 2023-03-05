// Generated from java-escape by ANTLR 4.11.1

import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(ExprParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(ExprParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(ExprParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(ExprParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#nlines}.
	 * @param ctx the parse tree
	 */
	void enterNlines(ExprParser.NlinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#nlines}.
	 * @param ctx the parse tree
	 */
	void exitNlines(ExprParser.NlinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExprParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterExpr1(ExprParser.Expr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitExpr1(ExprParser.Expr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(ExprParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(ExprParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#whileBody}.
	 * @param ctx the parse tree
	 */
	void enterWhileBody(ExprParser.WhileBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#whileBody}.
	 * @param ctx the parse tree
	 */
	void exitWhileBody(ExprParser.WhileBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void enterIfBody(ExprParser.IfBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void exitIfBody(ExprParser.IfBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#elseBody}.
	 * @param ctx the parse tree
	 */
	void enterElseBody(ExprParser.ElseBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#elseBody}.
	 * @param ctx the parse tree
	 */
	void exitElseBody(ExprParser.ElseBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#elIf}.
	 * @param ctx the parse tree
	 */
	void enterElIf(ExprParser.ElIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#elIf}.
	 * @param ctx the parse tree
	 */
	void exitElIf(ExprParser.ElIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#opBool}.
	 * @param ctx the parse tree
	 */
	void enterOpBool(ExprParser.OpBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#opBool}.
	 * @param ctx the parse tree
	 */
	void exitOpBool(ExprParser.OpBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#opBoolT}.
	 * @param ctx the parse tree
	 */
	void enterOpBoolT(ExprParser.OpBoolTContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#opBoolT}.
	 * @param ctx the parse tree
	 */
	void exitOpBoolT(ExprParser.OpBoolTContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(ExprParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(ExprParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(ExprParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(ExprParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#opT}.
	 * @param ctx the parse tree
	 */
	void enterOpT(ExprParser.OpTContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#opT}.
	 * @param ctx the parse tree
	 */
	void exitOpT(ExprParser.OpTContext ctx);
}