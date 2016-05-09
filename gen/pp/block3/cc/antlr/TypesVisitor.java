// Generated from D:/UTwente/Module 8/AntlrTest/src/main/java/pp/block3/cc/antlr\Types.g4 by ANTLR 4.5.1
package pp.block3.cc.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TypesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TypesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code par}
	 * labeled alternative in {@link TypesParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(TypesParser.ParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link TypesParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(TypesParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link TypesParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(TypesParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link TypesParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(TypesParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equals}
	 * labeled alternative in {@link TypesParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals(TypesParser.EqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hat}
	 * labeled alternative in {@link TypesParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHat(TypesParser.HatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link TypesParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(TypesParser.PlusContext ctx);
}