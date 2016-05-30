// Generated from D:/UTwente/Module 8/AntlrTest/src/main/java/pp/s1594273/q1_4\Number.g4 by ANTLR 4.5.1
package pp.s1594273.q1_4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NumberParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, DIGIT=3;
	public static final int
		RULE_num = 0, RULE_seq = 1, RULE_prf = 2, RULE_dig = 3;
	public static final String[] ruleNames = {
		"num", "seq", "prf", "dig"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'x'", "'b'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "DIGIT"
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
	public String getGrammarFileName() { return "Number.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NumberParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class NumContext extends ParserRuleContext {
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
	 
		public NumContext() { }
		public void copyFrom(NumContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SeqnumContext extends NumContext {
		public SeqContext seq() {
			return getRuleContext(SeqContext.class,0);
		}
		public SeqnumContext(NumContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberListener ) ((NumberListener)listener).enterSeqnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberListener ) ((NumberListener)listener).exitSeqnum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberVisitor ) return ((NumberVisitor<? extends T>)visitor).visitSeqnum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrfnumContext extends NumContext {
		public PrfContext prf() {
			return getRuleContext(PrfContext.class,0);
		}
		public SeqContext seq() {
			return getRuleContext(SeqContext.class,0);
		}
		public PrfnumContext(NumContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberListener ) ((NumberListener)listener).enterPrfnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberListener ) ((NumberListener)listener).exitPrfnum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberVisitor ) return ((NumberVisitor<? extends T>)visitor).visitPrfnum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_num);
		try {
			setState(12);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
				_localctx = new PrfnumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(8);
				prf();
				setState(9);
				seq();
				}
				break;
			case DIGIT:
				_localctx = new SeqnumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(11);
				seq();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SeqContext extends ParserRuleContext {
		public SeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seq; }
	 
		public SeqContext() { }
		public void copyFrom(SeqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingledigContext extends SeqContext {
		public DigContext dig() {
			return getRuleContext(DigContext.class,0);
		}
		public SingledigContext(SeqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberListener ) ((NumberListener)listener).enterSingledig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberListener ) ((NumberListener)listener).exitSingledig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberVisitor ) return ((NumberVisitor<? extends T>)visitor).visitSingledig(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeqdigContext extends SeqContext {
		public DigContext dig() {
			return getRuleContext(DigContext.class,0);
		}
		public SeqContext seq() {
			return getRuleContext(SeqContext.class,0);
		}
		public SeqdigContext(SeqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberListener ) ((NumberListener)listener).enterSeqdig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberListener ) ((NumberListener)listener).exitSeqdig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberVisitor ) return ((NumberVisitor<? extends T>)visitor).visitSeqdig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeqContext seq() throws RecognitionException {
		SeqContext _localctx = new SeqContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_seq);
		try {
			setState(18);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new SingledigContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				dig();
				}
				break;
			case 2:
				_localctx = new SeqdigContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				dig();
				setState(16);
				seq();
				}
				break;
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

	public static class PrfContext extends ParserRuleContext {
		public PrfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prf; }
	 
		public PrfContext() { }
		public void copyFrom(PrfContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BinaryContext extends PrfContext {
		public BinaryContext(PrfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberListener ) ((NumberListener)listener).enterBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberListener ) ((NumberListener)listener).exitBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberVisitor ) return ((NumberVisitor<? extends T>)visitor).visitBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HexContext extends PrfContext {
		public HexContext(PrfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberListener ) ((NumberListener)listener).enterHex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberListener ) ((NumberListener)listener).exitHex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberVisitor ) return ((NumberVisitor<? extends T>)visitor).visitHex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrfContext prf() throws RecognitionException {
		PrfContext _localctx = new PrfContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_prf);
		try {
			setState(22);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new HexContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				match(T__0);
				}
				break;
			case T__1:
				_localctx = new BinaryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DigContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(NumberParser.DIGIT, 0); }
		public DigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberListener ) ((NumberListener)listener).enterDig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberListener ) ((NumberListener)listener).exitDig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberVisitor ) return ((NumberVisitor<? extends T>)visitor).visitDig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigContext dig() throws RecognitionException {
		DigContext _localctx = new DigContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(DIGIT);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\5\35\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\5\2\17\n\2\3\3\3\3\3\3\3\3\5\3\25"+
		"\n\3\3\4\3\4\5\4\31\n\4\3\5\3\5\3\5\2\2\6\2\4\6\b\2\2\33\2\16\3\2\2\2"+
		"\4\24\3\2\2\2\6\30\3\2\2\2\b\32\3\2\2\2\n\13\5\6\4\2\13\f\5\4\3\2\f\17"+
		"\3\2\2\2\r\17\5\4\3\2\16\n\3\2\2\2\16\r\3\2\2\2\17\3\3\2\2\2\20\25\5\b"+
		"\5\2\21\22\5\b\5\2\22\23\5\4\3\2\23\25\3\2\2\2\24\20\3\2\2\2\24\21\3\2"+
		"\2\2\25\5\3\2\2\2\26\31\7\3\2\2\27\31\7\4\2\2\30\26\3\2\2\2\30\27\3\2"+
		"\2\2\31\7\3\2\2\2\32\33\7\5\2\2\33\t\3\2\2\2\5\16\24\30";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}