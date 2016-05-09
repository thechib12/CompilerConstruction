// Generated from D:/UTwente/Module 8/AntlrTest/src/main/java/pp/block2/cc/antlr\Sentence2.g4 by ANTLR 4.5.1
package pp.block2.cc.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Sentence2Parser}.
 */
public interface Sentence2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Sentence2Parser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(Sentence2Parser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sentence2Parser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(Sentence2Parser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modSubject}
	 * labeled alternative in {@link Sentence2Parser#subject}.
	 * @param ctx the parse tree
	 */
	void enterModSubject(Sentence2Parser.ModSubjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modSubject}
	 * labeled alternative in {@link Sentence2Parser#subject}.
	 * @param ctx the parse tree
	 */
	void exitModSubject(Sentence2Parser.ModSubjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleSubject}
	 * labeled alternative in {@link Sentence2Parser#subject}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSubject(Sentence2Parser.SimpleSubjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleSubject}
	 * labeled alternative in {@link Sentence2Parser#subject}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSubject(Sentence2Parser.SimpleSubjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sentence2Parser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(Sentence2Parser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sentence2Parser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(Sentence2Parser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sentence2Parser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(Sentence2Parser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sentence2Parser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(Sentence2Parser.ModifierContext ctx);
}