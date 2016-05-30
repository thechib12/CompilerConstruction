// Generated from D:/UTwente/Module 8/AntlrTest/src/main/java/pp/s1594273/q1_2\Decimal.g4 by ANTLR 4.5.1
package pp.s1594273.q1_2;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Decimal extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FLOAT=1, DOUBLE=2, WS=3;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"DIGIT", "NUMBER", "F_SUFFIX", "D_SUFFIX", "EXPONENT", "DOT", "UNDERSCORE", 
		"FLOAT", "DOUBLE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "FLOAT", "DOUBLE", "WS"
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


	public Decimal(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Decimal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\5R\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\7\2 \n\2\f\2\16\2#\13\2\3"+
		"\3\3\3\7\3\'\n\3\f\3\16\3*\13\3\3\3\3\3\6\3.\n\3\r\3\16\3/\5\3\62\n\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\5\tA\n\t\3\t\3\t"+
		"\3\n\3\n\5\nG\n\n\3\n\5\nJ\n\n\3\13\6\13M\n\13\r\13\16\13N\3\13\3\13\2"+
		"\2\f\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\3\23\4\25\5\3\2\6\4\2HHhh\4\2FF"+
		"ff\4\2GGgg\5\2\13\f\17\17\"\"S\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\3\27\3\2\2\2\5\61\3\2\2\2\7\63\3\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2\r:"+
		"\3\2\2\2\17<\3\2\2\2\21>\3\2\2\2\23D\3\2\2\2\25L\3\2\2\2\27!\4\62;\2\30"+
		"\32\5\17\b\2\31\30\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34"+
		"\36\3\2\2\2\35\33\3\2\2\2\36 \4\62;\2\37\33\3\2\2\2 #\3\2\2\2!\37\3\2"+
		"\2\2!\"\3\2\2\2\"\4\3\2\2\2#!\3\2\2\2$\62\5\3\2\2%\'\5\3\2\2&%\3\2\2\2"+
		"\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)+\3\2\2\2*(\3\2\2\2+-\5\r\7\2,.\5\3\2"+
		"\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61$\3\2\2\2"+
		"\61(\3\2\2\2\62\6\3\2\2\2\63\64\t\2\2\2\64\b\3\2\2\2\65\66\t\3\2\2\66"+
		"\n\3\2\2\2\678\t\4\2\289\5\3\2\29\f\3\2\2\2:;\7\60\2\2;\16\3\2\2\2<=\7"+
		"a\2\2=\20\3\2\2\2>@\5\5\3\2?A\5\13\6\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2B"+
		"C\5\7\4\2C\22\3\2\2\2DF\5\5\3\2EG\5\13\6\2FE\3\2\2\2FG\3\2\2\2GI\3\2\2"+
		"\2HJ\5\t\5\2IH\3\2\2\2IJ\3\2\2\2J\24\3\2\2\2KM\t\5\2\2LK\3\2\2\2MN\3\2"+
		"\2\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\b\13\2\2Q\26\3\2\2\2\f\2\33!(/\61"+
		"@FIN\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}