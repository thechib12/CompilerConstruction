// Generated from D:/UTwente/Module 8/AntlrTest/src/main/java/pp/s1594273/q1_3\INCDEC.g4 by ANTLR 4.5.1
package pp.s1594273.q1_3;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link INCDECParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface INCDECVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link INCDECParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(INCDECParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link INCDECParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF(INCDECParser.FContext ctx);
	/**
	 * Visit a parse tree produced by {@link INCDECParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(INCDECParser.TContext ctx);
}