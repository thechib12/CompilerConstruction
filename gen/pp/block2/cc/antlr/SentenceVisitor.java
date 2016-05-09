// Generated from D:/UTwente/Module 8/AntlrTest/src/main/java/pp/block2/cc/antlr\Sentence.g4 by ANTLR 4.5.1
package pp.block2.cc.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SentenceParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SentenceVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SentenceParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(SentenceParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SentenceParser#subject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubject(SentenceParser.SubjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SentenceParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(SentenceParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SentenceParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(SentenceParser.ModifierContext ctx);
}