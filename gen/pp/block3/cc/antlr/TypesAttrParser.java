// Generated from D:/UTwente/Module 8/AntlrTest/src/main/java/pp/block3/cc/antlr\TypesAttr.g4 by ANTLR 4.5.1
package pp.block3.cc.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TypesAttrParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HAT=1, PLUS=2, EQUALS=3, LPAR=4, RPAR=5, NUMBER=6, BOOLEAN=7, STRING=8, 
		WS=9;
	public static final int
		RULE_type = 0;
	public static final String[] ruleNames = {
		"type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'^'", "'+'", "'='", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "HAT", "PLUS", "EQUALS", "LPAR", "RPAR", "NUMBER", "BOOLEAN", "STRING", 
		"WS"
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
	public String getGrammarFileName() { return "TypesAttr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	    private Type getType(String text){
	       if (text.equals("true") || text.equals("false")){
	            return Type.BOOL;
	       } else if (text.matches("-?\\d+(\\.\\d+)?")){
	            return Type.NUM;
	       } else {
	            return Type.STR;
	       }
	    }

	    private Type getHat(Type type1,Type type2){
	        if (type1 == Type.NUM && type2 == Type.NUM){
	            return Type.NUM;
	        } else if (type1 == Type.STR && type2 == Type.NUM){
	            return Type.STR;
	        } else {
	            return Type.ERR;
	        }
	    }

	    private Type getPlus(Type type1,Type type2){
	        if (type1 == Type.NUM && type2 == Type.NUM){
	            return Type.NUM;
	        } else if (type1 == Type.BOOL && type2 == Type.BOOL){
	            return Type.BOOL;
	        } else if (type1 == Type.STR){
	            return Type.STR;
	        } else if (type2 == Type.STR){
	            return Type.STR;
	        } else {
	            return Type.ERR;
	        }
	    }

	    private Type getEquals(Type type1,Type type2){
	        if (type1 == type2){
	            return Type.BOOL;
	        } else {
	            return Type.ERR;
	        }
	     }



	public TypesAttrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TypeContext extends ParserRuleContext {
		public Type val;
		public TypeContext t0;
		public Token NUMBER;
		public Token BOOLEAN;
		public Token STRING;
		public TypeContext t1;
		public TerminalNode LPAR() { return getToken(TypesAttrParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(TypesAttrParser.RPAR, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(TypesAttrParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(TypesAttrParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(TypesAttrParser.STRING, 0); }
		public TerminalNode HAT() { return getToken(TypesAttrParser.HAT, 0); }
		public TerminalNode PLUS() { return getToken(TypesAttrParser.PLUS, 0); }
		public TerminalNode EQUALS() { return getToken(TypesAttrParser.EQUALS, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypesAttrListener ) ((TypesAttrListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypesAttrListener ) ((TypesAttrListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypesAttrVisitor ) return ((TypesAttrVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			switch (_input.LA(1)) {
			case LPAR:
				{
				setState(3);
				match(LPAR);
				setState(4);
				((TypeContext)_localctx).t0 = type(0);
				setState(5);
				match(RPAR);
				((TypeContext)_localctx).val =  ((TypeContext)_localctx).t0.val;
				}
				break;
			case NUMBER:
				{
				setState(8);
				((TypeContext)_localctx).NUMBER = match(NUMBER);
				((TypeContext)_localctx).val =  getType((((TypeContext)_localctx).NUMBER!=null?((TypeContext)_localctx).NUMBER.getText():null));
				}
				break;
			case BOOLEAN:
				{
				setState(10);
				((TypeContext)_localctx).BOOLEAN = match(BOOLEAN);
				((TypeContext)_localctx).val =  getType((((TypeContext)_localctx).BOOLEAN!=null?((TypeContext)_localctx).BOOLEAN.getText():null));
				}
				break;
			case STRING:
				{
				setState(12);
				((TypeContext)_localctx).STRING = match(STRING);
				((TypeContext)_localctx).val =  getType((((TypeContext)_localctx).STRING!=null?((TypeContext)_localctx).STRING.getText():null));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(31);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.t0 = _prevctx;
						_localctx.t0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(16);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(17);
						match(HAT);
						setState(18);
						((TypeContext)_localctx).t1 = type(8);
						((TypeContext)_localctx).val =  getHat(((TypeContext)_localctx).t0.val,((TypeContext)_localctx).t1.val);
						}
						break;
					case 2:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.t0 = _prevctx;
						_localctx.t0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(21);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(22);
						match(PLUS);
						setState(23);
						((TypeContext)_localctx).t1 = type(7);
						((TypeContext)_localctx).val =  getPlus(((TypeContext)_localctx).t0.val,((TypeContext)_localctx).t1.val);
						}
						break;
					case 3:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.t0 = _prevctx;
						_localctx.t0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(26);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(27);
						match(EQUALS);
						setState(28);
						((TypeContext)_localctx).t1 = type(6);
						((TypeContext)_localctx).val =  getEquals(((TypeContext)_localctx).t0.val,((TypeContext)_localctx).t1.val);
						}
						break;
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\13\'\4\2\t\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\21\n\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\"\n\2\f\2\16\2%\13"+
		"\2\3\2\2\3\2\3\2\2\2+\2\20\3\2\2\2\4\5\b\2\1\2\5\6\7\6\2\2\6\7\5\2\2\2"+
		"\7\b\7\7\2\2\b\t\b\2\1\2\t\21\3\2\2\2\n\13\7\b\2\2\13\21\b\2\1\2\f\r\7"+
		"\t\2\2\r\21\b\2\1\2\16\17\7\n\2\2\17\21\b\2\1\2\20\4\3\2\2\2\20\n\3\2"+
		"\2\2\20\f\3\2\2\2\20\16\3\2\2\2\21#\3\2\2\2\22\23\f\t\2\2\23\24\7\3\2"+
		"\2\24\25\5\2\2\n\25\26\b\2\1\2\26\"\3\2\2\2\27\30\f\b\2\2\30\31\7\4\2"+
		"\2\31\32\5\2\2\t\32\33\b\2\1\2\33\"\3\2\2\2\34\35\f\7\2\2\35\36\7\5\2"+
		"\2\36\37\5\2\2\b\37 \b\2\1\2 \"\3\2\2\2!\22\3\2\2\2!\27\3\2\2\2!\34\3"+
		"\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\3\3\2\2\2%#\3\2\2\2\5\20!#";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}