// Generated from D:/UTwente/Module 8/AntlrTest/src/main/java/pp/block1/cc/antlr\SixDigits.g4 by ANTLR 4.5.1
package pp.block1.cc.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SixDigits extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WORD=1;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LETTER", "NUMBER", "ANUM", "WORD"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WORD"
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


	public SixDigits(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SixDigits.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\3\32\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\3\3\3\3\4\3\4\5\4\22\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\2\2\6\3\2\5\2\7\2\t\3\3\2\3\4\2C\\c|\27\2\t\3\2\2\2"+
		"\3\13\3\2\2\2\5\r\3\2\2\2\7\21\3\2\2\2\t\23\3\2\2\2\13\f\t\2\2\2\f\4\3"+
		"\2\2\2\r\16\4\62;\2\16\6\3\2\2\2\17\22\5\3\2\2\20\22\5\5\3\2\21\17\3\2"+
		"\2\2\21\20\3\2\2\2\22\b\3\2\2\2\23\24\5\3\2\2\24\25\5\7\4\2\25\26\5\7"+
		"\4\2\26\27\5\7\4\2\27\30\5\7\4\2\30\31\5\7\4\2\31\n\3\2\2\2\4\2\21\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}