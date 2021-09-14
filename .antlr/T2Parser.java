// Generated from c:\Users\zozot\Desktop\Antlr\T2.g by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class T2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, Letter=4, NZDigit=5, Digit=6, Int=7, String=8, 
		WS=9;
	public static final int
		RULE_prog = 0, RULE_tup = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "tup"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "Letter", "NZDigit", "Digit", "Int", "String", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "T2.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public T2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TupContext tup() {
			return getRuleContext(TupContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			tup();
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

	public static class TupContext extends ParserRuleContext {
		public List<TerminalNode> Int() { return getTokens(T2Parser.Int); }
		public TerminalNode Int(int i) {
			return getToken(T2Parser.Int, i);
		}
		public List<TerminalNode> String() { return getTokens(T2Parser.String); }
		public TerminalNode String(int i) {
			return getToken(T2Parser.String, i);
		}
		public List<TupContext> tup() {
			return getRuleContexts(TupContext.class);
		}
		public TupContext tup(int i) {
			return getRuleContext(TupContext.class,i);
		}
		public TupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tup; }
	}

	public final TupContext tup() throws RecognitionException {
		TupContext _localctx = new TupContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tup);
		int _la;
		try {
			setState(26);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(6);
				match(T__0);
				setState(10);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Int:
					{
					setState(7);
					match(Int);
					}
					break;
				case String:
					{
					setState(8);
					match(String);
					}
					break;
				case T__0:
					{
					setState(9);
					tup();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(12);
					match(T__1);
					setState(16);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Int:
						{
						setState(13);
						match(Int);
						}
						break;
					case String:
						{
						setState(14);
						match(String);
						}
						break;
					case T__0:
						{
						setState(15);
						tup();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(22);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(23);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				match(T__0);
				setState(25);
				match(T__2);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13\37\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\3\3\3\3\3\3\3\5\3\r\n\3\3\3\3\3\3\3\3\3\5\3\23\n\3\7\3"+
		"\25\n\3\f\3\16\3\30\13\3\3\3\3\3\3\3\5\3\35\n\3\3\3\2\2\4\2\4\2\2\2\""+
		"\2\6\3\2\2\2\4\34\3\2\2\2\6\7\5\4\3\2\7\3\3\2\2\2\b\f\7\3\2\2\t\r\7\t"+
		"\2\2\n\r\7\n\2\2\13\r\5\4\3\2\f\t\3\2\2\2\f\n\3\2\2\2\f\13\3\2\2\2\r\26"+
		"\3\2\2\2\16\22\7\4\2\2\17\23\7\t\2\2\20\23\7\n\2\2\21\23\5\4\3\2\22\17"+
		"\3\2\2\2\22\20\3\2\2\2\22\21\3\2\2\2\23\25\3\2\2\2\24\16\3\2\2\2\25\30"+
		"\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\31\3\2\2\2\30\26\3\2\2\2\31\35"+
		"\7\5\2\2\32\33\7\3\2\2\33\35\7\5\2\2\34\b\3\2\2\2\34\32\3\2\2\2\35\5\3"+
		"\2\2\2\6\f\22\26\34";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}