// Generated from D:/UTwente/Module 8/AntlrTest/src/main/java/pp/block2/cc/antlr\Sentence2.g4 by ANTLR 4.5.1
package pp.block2.cc.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Sentence2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Sentence2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Sentence2Parser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(Sentence2Parser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modSubject}
	 * labeled alternative in {@link Sentence2Parser#subject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModSubject(Sentence2Parser.ModSubjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleSubject}
	 * labeled alternative in {@link Sentence2Parser#subject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSubject(Sentence2Parser.SimpleSubjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sentence2Parser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(Sentence2Parser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sentence2Parser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(Sentence2Parser.ModifierContext ctx);
}