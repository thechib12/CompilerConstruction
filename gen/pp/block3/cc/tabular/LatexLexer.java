// Generated from D:/UTwente/Module 8/AntlrTest/src/main/java/pp/block3/cc/tabular\Latex.g4 by ANTLR 4.5.1
package pp.block3.cc.tabular;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LatexLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, LBRACK=3, RBRACK=4, OPTIONS=5, BEGINTABLE=6, ENDTABLE=7, 
		WORD=8, KEYWORDS=9, NEWLINE=10, COMMENT=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "LBRACK", "RBRACK", "OPTIONS", "BEGINTABLE", "ENDTABLE", 
		"WORD", "KEYWORDS", "NEWLINE", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'&'", "'\\\\'", "'{'", "'}'", null, "'\\begin{tabular}'", "'\\end{tabular}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "LBRACK", "RBRACK", "OPTIONS", "BEGINTABLE", "ENDTABLE", 
		"WORD", "KEYWORDS", "NEWLINE", "COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public LatexLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Latex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\rc\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\6\6$\n\6\r\6\16\6"+
		"%\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\6\tG\n\t\r\t"+
		"\16\tH\3\n\3\n\3\n\3\n\5\nO\n\n\3\13\6\13R\n\13\r\13\16\13S\3\f\3\f\7"+
		"\fX\n\f\f\f\16\f[\13\f\3\f\6\f^\n\f\r\f\16\f_\3\f\3\f\2\2\r\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\3\2\7\5\2eenntt\b\2\f\f%(^^"+
		"`a}}\177\u0080\7\2%&((^^}}\177\177\5\2\'\'aa\u0080\u0080\4\2\f\f\17\17"+
		"i\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\3\31\3\2\2\2\5\33\3\2\2\2\7\36\3\2\2\2\t \3\2\2\2\13#\3\2\2\2\r\'\3\2"+
		"\2\2\17\67\3\2\2\2\21F\3\2\2\2\23N\3\2\2\2\25Q\3\2\2\2\27U\3\2\2\2\31"+
		"\32\7(\2\2\32\4\3\2\2\2\33\34\7^\2\2\34\35\7^\2\2\35\6\3\2\2\2\36\37\7"+
		"}\2\2\37\b\3\2\2\2 !\7\177\2\2!\n\3\2\2\2\"$\t\2\2\2#\"\3\2\2\2$%\3\2"+
		"\2\2%#\3\2\2\2%&\3\2\2\2&\f\3\2\2\2\'(\7^\2\2()\7d\2\2)*\7g\2\2*+\7i\2"+
		"\2+,\7k\2\2,-\7p\2\2-.\7}\2\2./\7v\2\2/\60\7c\2\2\60\61\7d\2\2\61\62\7"+
		"w\2\2\62\63\7n\2\2\63\64\7c\2\2\64\65\7t\2\2\65\66\7\177\2\2\66\16\3\2"+
		"\2\2\678\7^\2\289\7g\2\29:\7p\2\2:;\7f\2\2;<\7}\2\2<=\7v\2\2=>\7c\2\2"+
		">?\7d\2\2?@\7w\2\2@A\7n\2\2AB\7c\2\2BC\7t\2\2CD\7\177\2\2D\20\3\2\2\2"+
		"EG\n\3\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\22\3\2\2\2JO\t\4\2"+
		"\2KL\7\u00cd\2\2LO\7\u2022\2\2MO\t\5\2\2NJ\3\2\2\2NK\3\2\2\2NM\3\2\2\2"+
		"O\24\3\2\2\2PR\t\6\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\26\3\2"+
		"\2\2UY\7\'\2\2VX\n\6\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z]\3\2"+
		"\2\2[Y\3\2\2\2\\^\t\6\2\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`a\3"+
		"\2\2\2ab\b\f\2\2b\30\3\2\2\2\t\2%HNSY_\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}