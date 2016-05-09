// Generated from D:/UTwente/Module 8/AntlrTest/src/main/java/pp/block2/cc/antlr\Arithmetic.g4 by ANTLR 4.5.1
package pp.block2.cc.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArithmeticParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArithmeticVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ArithmeticParser#goal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoal(ArithmeticParser.GoalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ArithmeticParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(ArithmeticParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticParser#exponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponent(ArithmeticParser.ExponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(ArithmeticParser.FactorContext ctx);
}