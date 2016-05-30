// Generated from D:/UTwente/Module 8/AntlrTest/src/main/java/pp/s1594273/q1_4\NumberAttr.g4 by ANTLR 4.5.1
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
public class NumberAttrParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WS=3, DIGIT=4;
	public static final int
		RULE_num = 0, RULE_seq = 1, RULE_prf = 2, RULE_dig = 3;
	public static final String[] ruleNames = {
		"num", "seq", "prf", "dig"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'b'", "'x'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "WS", "DIGIT"
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
	public String getGrammarFileName() { return "NumberAttr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private int getValue(String text, int base) {
	        return Integer.parseInt(text, base);
	    }

	public NumberAttrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class NumContext extends ParserRuleContext {
		public int val;
		public SeqContext e1;
		public PrfContext e0;
		public SeqContext seq() {
			return getRuleContext(SeqContext.class,0);
		}
		public PrfContext prf() {
			return getRuleContext(PrfContext.class,0);
		}
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberAttrListener ) ((NumberAttrListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberAttrListener ) ((NumberAttrListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberAttrVisitor ) return ((NumberAttrVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_num);
		try {
			setState(15);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(8);
				((NumContext)_localctx).e1 = seq();
				((NumContext)_localctx).val =  getValue(((NumContext)_localctx).e1.val, 10);
				}
				break;
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(11);
				((NumContext)_localctx).e0 = prf();
				setState(12);
				((NumContext)_localctx).e1 = seq();
				((NumContext)_localctx).val =  getValue(((NumContext)_localctx).e1.val, ((NumContext)_localctx).e0.base);
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
		public String val;
		public DigContext e0;
		public SeqContext e1;
		public DigContext dig() {
			return getRuleContext(DigContext.class,0);
		}
		public SeqContext seq() {
			return getRuleContext(SeqContext.class,0);
		}
		public SeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberAttrListener ) ((NumberAttrListener)listener).enterSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberAttrListener ) ((NumberAttrListener)listener).exitSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberAttrVisitor ) return ((NumberAttrVisitor<? extends T>)visitor).visitSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeqContext seq() throws RecognitionException {
		SeqContext _localctx = new SeqContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_seq);
		try {
			setState(24);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				((SeqContext)_localctx).e0 = dig();
				((SeqContext)_localctx).val =  ((SeqContext)_localctx).e0.val;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				((SeqContext)_localctx).e0 = dig();
				setState(21);
				((SeqContext)_localctx).e1 = seq();
				((SeqContext)_localctx).val =  ((SeqContext)_localctx).e0.val + ((SeqContext)_localctx).e1.val;
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
		public int base;
		public Token e0;
		public PrfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberAttrListener ) ((NumberAttrListener)listener).enterPrf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberAttrListener ) ((NumberAttrListener)listener).exitPrf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberAttrVisitor ) return ((NumberAttrVisitor<? extends T>)visitor).visitPrf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrfContext prf() throws RecognitionException {
		PrfContext _localctx = new PrfContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_prf);
		try {
			setState(30);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				((PrfContext)_localctx).e0 = match(T__0);
				((PrfContext)_localctx).base =  2;
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				((PrfContext)_localctx).e0 = match(T__1);
				((PrfContext)_localctx).base =  16;
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
		public String val;
		public Token DIGIT;
		public TerminalNode DIGIT() { return getToken(NumberAttrParser.DIGIT, 0); }
		public DigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberAttrListener ) ((NumberAttrListener)listener).enterDig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberAttrListener ) ((NumberAttrListener)listener).exitDig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumberAttrVisitor ) return ((NumberAttrVisitor<? extends T>)visitor).visitDig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigContext dig() throws RecognitionException {
		DigContext _localctx = new DigContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			((DigContext)_localctx).DIGIT = match(DIGIT);
			((DigContext)_localctx).val =  ((DigContext)_localctx).DIGIT.getText();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\6&\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\22\n\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3\33\n\3\3\4\3\4\3\4\3\4\5\4!\n\4\3\5\3\5\3\5\3\5\2"+
		"\2\6\2\4\6\b\2\2$\2\21\3\2\2\2\4\32\3\2\2\2\6 \3\2\2\2\b\"\3\2\2\2\n\13"+
		"\5\4\3\2\13\f\b\2\1\2\f\22\3\2\2\2\r\16\5\6\4\2\16\17\5\4\3\2\17\20\b"+
		"\2\1\2\20\22\3\2\2\2\21\n\3\2\2\2\21\r\3\2\2\2\22\3\3\2\2\2\23\24\5\b"+
		"\5\2\24\25\b\3\1\2\25\33\3\2\2\2\26\27\5\b\5\2\27\30\5\4\3\2\30\31\b\3"+
		"\1\2\31\33\3\2\2\2\32\23\3\2\2\2\32\26\3\2\2\2\33\5\3\2\2\2\34\35\7\3"+
		"\2\2\35!\b\4\1\2\36\37\7\4\2\2\37!\b\4\1\2 \34\3\2\2\2 \36\3\2\2\2!\7"+
		"\3\2\2\2\"#\7\6\2\2#$\b\5\1\2$\t\3\2\2\2\5\21\32 ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}