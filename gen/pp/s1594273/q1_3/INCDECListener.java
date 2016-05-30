// Generated from D:/UTwente/Module 8/AntlrTest/src/main/java/pp/s1594273/q1_3\INCDEC.g4 by ANTLR 4.5.1
package pp.s1594273.q1_3;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link INCDECParser}.
 */
public interface INCDECListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link INCDECParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(INCDECParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link INCDECParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(INCDECParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link INCDECParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(INCDECParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link INCDECParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(INCDECParser.FContext ctx);
	/**
	 * Enter a parse tree produced by {@link INCDECParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(INCDECParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link INCDECParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(INCDECParser.TContext ctx);
}