// Generated from D:/UTwente/Module 8/AntlrTest/src/main/java/pp/block3/cc/antlr\TypesAttr.g4 by ANTLR 4.5.1
package pp.block3.cc.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TypesAttrParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TypesAttrVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TypesAttrParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(TypesAttrParser.TypeContext ctx);
}