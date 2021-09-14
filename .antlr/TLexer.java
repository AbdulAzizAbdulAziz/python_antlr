// Generated from c:\Users\zozot\Desktop\Antlr\T.g by ANTLR 4.8
import java.util.Collection;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		Int=10, String=11, ID=12, WS=13, COMMENTS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"Int", "String", "ID", "WS", "COMMENTS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'['", "']'", "':'", "'('", "','", "')'", "'+'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "Int", "String", 
			"ID", "WS", "COMMENTS"
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

	actions act=new actions();

	public TLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "T.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 12:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 13:
			COMMENTS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void COMMENTS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20i\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\5\13\67"+
		"\n\13\3\13\3\13\7\13;\n\13\f\13\16\13>\13\13\3\f\3\f\7\fB\n\f\f\f\16\f"+
		"E\13\f\3\f\3\f\3\f\7\fJ\n\f\f\f\16\fM\13\f\3\f\5\fP\n\f\3\r\3\r\3\r\7"+
		"\rU\n\r\f\r\16\rX\13\r\3\16\6\16[\n\16\r\16\16\16\\\3\16\3\16\3\17\3\17"+
		"\7\17c\n\17\f\17\16\17f\13\17\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\3\2\7\3\2$$\3\2))\5\2C"+
		"\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2q\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\3\37\3\2\2\2\5!\3\2\2\2\7#\3\2\2\2\t%\3\2\2\2\13\'\3\2\2\2"+
		"\r)\3\2\2\2\17+\3\2\2\2\21-\3\2\2\2\23/\3\2\2\2\25\66\3\2\2\2\27O\3\2"+
		"\2\2\31Q\3\2\2\2\33Z\3\2\2\2\35`\3\2\2\2\37 \7?\2\2 \4\3\2\2\2!\"\7]\2"+
		"\2\"\6\3\2\2\2#$\7_\2\2$\b\3\2\2\2%&\7<\2\2&\n\3\2\2\2\'(\7*\2\2(\f\3"+
		"\2\2\2)*\7.\2\2*\16\3\2\2\2+,\7+\2\2,\20\3\2\2\2-.\7-\2\2.\22\3\2\2\2"+
		"/\60\7r\2\2\60\61\7t\2\2\61\62\7k\2\2\62\63\7p\2\2\63\64\7v\2\2\64\24"+
		"\3\2\2\2\65\67\7/\2\2\66\65\3\2\2\2\66\67\3\2\2\2\678\3\2\2\28<\4\62;"+
		"\29;\4\62;\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\26\3\2\2\2><\3\2"+
		"\2\2?C\7$\2\2@B\n\2\2\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2"+
		"\2\2EC\3\2\2\2FP\7$\2\2GK\7)\2\2HJ\n\3\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2"+
		"\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NP\7)\2\2O?\3\2\2\2OG\3\2\2\2P\30\3\2"+
		"\2\2QV\t\4\2\2RU\5\25\13\2SU\t\4\2\2TR\3\2\2\2TS\3\2\2\2UX\3\2\2\2VT\3"+
		"\2\2\2VW\3\2\2\2W\32\3\2\2\2XV\3\2\2\2Y[\t\5\2\2ZY\3\2\2\2[\\\3\2\2\2"+
		"\\Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\b\16\2\2_\34\3\2\2\2`d\7%\2\2ac\n\6"+
		"\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\b\17"+
		"\3\2h\36\3\2\2\2\f\2\66<CKOTV\\d\4\3\16\2\3\17\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}