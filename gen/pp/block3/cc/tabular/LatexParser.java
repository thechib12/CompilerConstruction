// Generated from D:/UTwente/Module 8/AntlrTest/src/main/java/pp/block3/cc/tabular\Latex.g4 by ANTLR 4.5.1
package pp.block3.cc.tabular;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LatexParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, LBRACK=3, RBRACK=4, OPTIONS=5, BEGINTABLE=6, ENDTABLE=7, 
		WORD=8, KEYWORDS=9, NEWLINE=10, COMMENT=11;
	public static final int
		RULE_table = 0, RULE_arguments = 1, RULE_rows = 2, RULE_rowentry = 3;
	public static final String[] ruleNames = {
		"table", "arguments", "rows", "rowentry"
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

	@Override
	public String getGrammarFileName() { return "Latex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LatexParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TableContext extends ParserRuleContext {
		public TerminalNode BEGINTABLE() { return getToken(LatexParser.BEGINTABLE, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LatexParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LatexParser.NEWLINE, i);
		}
		public TerminalNode ENDTABLE() { return getToken(LatexParser.ENDTABLE, 0); }
		public List<RowsContext> rows() {
			return getRuleContexts(RowsContext.class);
		}
		public RowsContext rows(int i) {
			return getRuleContext(RowsContext.class,i);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			match(BEGINTABLE);
			setState(9);
			arguments();
			setState(10);
			match(NEWLINE);
			setState(14);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << WORD))) != 0)) {
				{
				{
				setState(11);
				rows();
				}
				}
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(17);
			match(ENDTABLE);
			setState(18);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(LatexParser.LBRACK, 0); }
		public TerminalNode OPTIONS() { return getToken(LatexParser.OPTIONS, 0); }
		public TerminalNode RBRACK() { return getToken(LatexParser.RBRACK, 0); }
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_arguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(LBRACK);
			setState(21);
			match(OPTIONS);
			setState(22);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowsContext extends ParserRuleContext {
		public List<RowentryContext> rowentry() {
			return getRuleContexts(RowentryContext.class);
		}
		public RowentryContext rowentry(int i) {
			return getRuleContext(RowentryContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(LatexParser.NEWLINE, 0); }
		public RowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterRows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitRows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitRows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowsContext rows() throws RecognitionException {
		RowsContext _localctx = new RowsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_rows);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			rowentry();
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(25);
				match(T__0);
				setState(26);
				rowentry();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			match(T__1);
			setState(33);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowentryContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(LatexParser.WORD, 0); }
		public RowentryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowentry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterRowentry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitRowentry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitRowentry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowentryContext rowentry() throws RecognitionException {
		RowentryContext _localctx = new RowentryContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rowentry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
				{
				}
				break;
			case WORD:
				{
				setState(36);
				match(WORD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\r*\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\7\2\17\n\2\f\2\16\2\22\13\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4\36\n\4\f\4\16\4!\13\4\3\4\3\4\3\4"+
		"\3\5\3\5\5\5(\n\5\3\5\2\2\6\2\4\6\b\2\2(\2\n\3\2\2\2\4\26\3\2\2\2\6\32"+
		"\3\2\2\2\b\'\3\2\2\2\n\13\7\b\2\2\13\f\5\4\3\2\f\20\7\f\2\2\r\17\5\6\4"+
		"\2\16\r\3\2\2\2\17\22\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\23\3\2\2"+
		"\2\22\20\3\2\2\2\23\24\7\t\2\2\24\25\7\f\2\2\25\3\3\2\2\2\26\27\7\5\2"+
		"\2\27\30\7\7\2\2\30\31\7\6\2\2\31\5\3\2\2\2\32\37\5\b\5\2\33\34\7\3\2"+
		"\2\34\36\5\b\5\2\35\33\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 "+
		"\"\3\2\2\2!\37\3\2\2\2\"#\7\4\2\2#$\7\f\2\2$\7\3\2\2\2%(\3\2\2\2&(\7\n"+
		"\2\2\'%\3\2\2\2\'&\3\2\2\2(\t\3\2\2\2\5\20\37\'";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}