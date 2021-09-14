// Generated from c:\Users\zozot\Desktop\Antlr\T_no_sem.g by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class T_no_semParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		Int=10, String=11, ID=12, WS=13, COMMENTS=14;
	public static final int
		RULE_prog = 0, RULE_statementlist = 1, RULE_statement = 2, RULE_assign = 3, 
		RULE_slicing = 4, RULE_unpack = 5, RULE_add = 6, RULE_tup_main = 7, RULE_tuple = 8, 
		RULE_int_tuple = 9, RULE_print = 10, RULE_print_var = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "statementlist", "statement", "assign", "slicing", "unpack", 
			"add", "tup_main", "tuple", "int_tuple", "print", "print_var"
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

	@Override
	public String getGrammarFileName() { return "T_no_sem.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public T_no_semParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public StatementlistContext statementlist() {
			return getRuleContext(StatementlistContext.class,0);
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
			setState(24);
			statementlist();
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

	public static class StatementlistContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementlist; }
	}

	public final StatementlistContext statementlist() throws RecognitionException {
		StatementlistContext _localctx = new StatementlistContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statementlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			statement();
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << Int) | (1L << String) | (1L << ID))) != 0)) {
				{
				{
				setState(27);
				statement();
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class StatementContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public SlicingContext slicing() {
			return getRuleContext(SlicingContext.class,0);
		}
		public UnpackContext unpack() {
			return getRuleContext(UnpackContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				slicing();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				unpack();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				print();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(37);
				add();
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

	public static class AssignContext extends ParserRuleContext {
		public Token s1;
		public Token s2;
		public List<TerminalNode> ID() { return getTokens(T_no_semParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(T_no_semParser.ID, i);
		}
		public TerminalNode Int() { return getToken(T_no_semParser.Int, 0); }
		public TerminalNode String() { return getToken(T_no_semParser.String, 0); }
		public Tup_mainContext tup_main() {
			return getRuleContext(Tup_mainContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public SlicingContext slicing() {
			return getRuleContext(SlicingContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assign);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				((AssignContext)_localctx).s1 = match(ID);
				setState(41);
				match(T__0);
				setState(42);
				((AssignContext)_localctx).s2 = match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(ID);
				setState(44);
				match(T__0);
				setState(45);
				match(Int);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				match(ID);
				setState(47);
				match(T__0);
				setState(48);
				match(String);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				match(ID);
				setState(50);
				match(T__0);
				setState(51);
				tup_main();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				match(ID);
				setState(53);
				match(T__0);
				setState(54);
				add();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(55);
				match(ID);
				setState(56);
				match(T__0);
				setState(57);
				slicing();
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

	public static class SlicingContext extends ParserRuleContext {
		public Token s1;
		public Token s2;
		public Token s3;
		public List<TerminalNode> ID() { return getTokens(T_no_semParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(T_no_semParser.ID, i);
		}
		public List<TerminalNode> Int() { return getTokens(T_no_semParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(T_no_semParser.Int, i);
		}
		public SlicingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slicing; }
	}

	public final SlicingContext slicing() throws RecognitionException {
		SlicingContext _localctx = new SlicingContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_slicing);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(ID);
				setState(61);
				match(T__1);
				setState(62);
				match(Int);
				setState(63);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(ID);
				setState(65);
				match(T__1);
				setState(66);
				((SlicingContext)_localctx).s1 = match(Int);
				setState(67);
				match(T__3);
				setState(68);
				((SlicingContext)_localctx).s2 = match(Int);
				setState(69);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				match(ID);
				setState(71);
				match(T__1);
				setState(72);
				match(Int);
				setState(73);
				match(T__3);
				setState(74);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				match(ID);
				setState(76);
				match(T__1);
				setState(77);
				match(T__3);
				setState(78);
				match(Int);
				setState(79);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				((SlicingContext)_localctx).s1 = match(ID);
				setState(81);
				match(T__1);
				setState(82);
				((SlicingContext)_localctx).s2 = match(ID);
				setState(83);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
				((SlicingContext)_localctx).s1 = match(ID);
				setState(85);
				match(T__1);
				setState(86);
				((SlicingContext)_localctx).s2 = match(ID);
				setState(87);
				match(T__3);
				setState(88);
				((SlicingContext)_localctx).s3 = match(ID);
				setState(89);
				match(T__2);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(90);
				((SlicingContext)_localctx).s1 = match(ID);
				setState(91);
				match(T__1);
				setState(92);
				((SlicingContext)_localctx).s2 = match(ID);
				setState(93);
				match(T__3);
				setState(94);
				match(T__2);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(95);
				((SlicingContext)_localctx).s1 = match(ID);
				setState(96);
				match(T__1);
				setState(97);
				match(T__3);
				setState(98);
				((SlicingContext)_localctx).s2 = match(ID);
				setState(99);
				match(T__2);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(100);
				((SlicingContext)_localctx).s1 = match(ID);
				setState(101);
				match(T__1);
				setState(102);
				match(Int);
				setState(103);
				match(T__3);
				setState(104);
				((SlicingContext)_localctx).s2 = match(ID);
				setState(105);
				match(T__2);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(106);
				((SlicingContext)_localctx).s1 = match(ID);
				setState(107);
				match(T__1);
				setState(108);
				((SlicingContext)_localctx).s2 = match(ID);
				setState(109);
				match(T__3);
				setState(110);
				match(Int);
				setState(111);
				match(T__2);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(112);
				match(ID);
				setState(113);
				match(T__1);
				setState(114);
				match(T__3);
				setState(115);
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

	public static class UnpackContext extends ParserRuleContext {
		public Token s1;
		public Token s2;
		public Token s3;
		public List<TerminalNode> ID() { return getTokens(T_no_semParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(T_no_semParser.ID, i);
		}
		public Int_tupleContext int_tuple() {
			return getRuleContext(Int_tupleContext.class,0);
		}
		public UnpackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpack; }
	}

	public final UnpackContext unpack() throws RecognitionException {
		UnpackContext _localctx = new UnpackContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_unpack);
		int _la;
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(T__4);
				setState(119);
				((UnpackContext)_localctx).s1 = match(ID);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(120);
					match(T__5);
					setState(121);
					((UnpackContext)_localctx).s2 = match(ID);
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(127);
				match(T__6);
				setState(128);
				match(T__0);
				setState(129);
				((UnpackContext)_localctx).s3 = match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(T__4);
				setState(131);
				((UnpackContext)_localctx).s1 = match(ID);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(132);
					match(T__5);
					setState(133);
					((UnpackContext)_localctx).s2 = match(ID);
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(139);
				match(T__6);
				setState(140);
				match(T__0);
				setState(141);
				int_tuple();
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

	public static class AddContext extends ParserRuleContext {
		public Token s1;
		public Token s2;
		public Token s3;
		public Token s4;
		public Token s5;
		public Token s6;
		public List<TerminalNode> ID() { return getTokens(T_no_semParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(T_no_semParser.ID, i);
		}
		public List<TerminalNode> Int() { return getTokens(T_no_semParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(T_no_semParser.Int, i);
		}
		public List<TerminalNode> String() { return getTokens(T_no_semParser.String); }
		public TerminalNode String(int i) {
			return getToken(T_no_semParser.String, i);
		}
		public List<Int_tupleContext> int_tuple() {
			return getRuleContexts(Int_tupleContext.class);
		}
		public Int_tupleContext int_tuple(int i) {
			return getRuleContext(Int_tupleContext.class,i);
		}
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(144);
				((AddContext)_localctx).s1 = match(ID);
				}
				break;
			case Int:
				{
				setState(145);
				((AddContext)_localctx).s2 = match(Int);
				}
				break;
			case String:
				{
				setState(146);
				((AddContext)_localctx).s3 = match(String);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(156); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(149);
				match(T__7);
				setState(154);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(150);
					((AddContext)_localctx).s4 = match(ID);
					}
					break;
				case Int:
					{
					setState(151);
					((AddContext)_localctx).s5 = match(Int);
					}
					break;
				case String:
					{
					setState(152);
					((AddContext)_localctx).s6 = match(String);
					}
					break;
				case T__4:
					{
					setState(153);
					int_tuple();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__7 );
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

	public static class Tup_mainContext extends ParserRuleContext {
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public List<Int_tupleContext> int_tuple() {
			return getRuleContexts(Int_tupleContext.class);
		}
		public Int_tupleContext int_tuple(int i) {
			return getRuleContext(Int_tupleContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(T_no_semParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(T_no_semParser.ID, i);
		}
		public Tup_mainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tup_main; }
	}

	public final Tup_mainContext tup_main() throws RecognitionException {
		Tup_mainContext _localctx = new Tup_mainContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tup_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			tuple();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(161);
				match(T__7);
				setState(164);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(162);
					int_tuple();
					}
					break;
				case ID:
					{
					setState(163);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TupleContext extends ParserRuleContext {
		public Token s1;
		public Token s2;
		public Int_tupleContext s3;
		public Token s7;
		public Token s4;
		public Token s5;
		public Int_tupleContext s6;
		public Token s8;
		public List<TerminalNode> Int() { return getTokens(T_no_semParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(T_no_semParser.Int, i);
		}
		public List<TerminalNode> String() { return getTokens(T_no_semParser.String); }
		public TerminalNode String(int i) {
			return getToken(T_no_semParser.String, i);
		}
		public List<Int_tupleContext> int_tuple() {
			return getRuleContexts(Int_tupleContext.class);
		}
		public Int_tupleContext int_tuple(int i) {
			return getRuleContext(Int_tupleContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(T_no_semParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(T_no_semParser.ID, i);
		}
		public TupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple; }
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tuple);
		int _la;
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(T__4);
				setState(176);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Int:
					{
					setState(172);
					((TupleContext)_localctx).s1 = match(Int);
					}
					break;
				case String:
					{
					setState(173);
					((TupleContext)_localctx).s2 = match(String);
					}
					break;
				case T__4:
					{
					setState(174);
					((TupleContext)_localctx).s3 = int_tuple();
					}
					break;
				case ID:
					{
					setState(175);
					((TupleContext)_localctx).s7 = match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(178);
					match(T__5);
					setState(183);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Int:
						{
						setState(179);
						((TupleContext)_localctx).s4 = match(Int);
						}
						break;
					case String:
						{
						setState(180);
						((TupleContext)_localctx).s5 = match(String);
						}
						break;
					case T__4:
						{
						setState(181);
						((TupleContext)_localctx).s6 = int_tuple();
						}
						break;
					case ID:
						{
						setState(182);
						((TupleContext)_localctx).s8 = match(ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(190);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(T__4);
				setState(192);
				match(T__6);
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

	public static class Int_tupleContext extends ParserRuleContext {
		public Token s1;
		public Token s2;
		public Int_tupleContext s3;
		public Token s4;
		public Token s5;
		public Int_tupleContext s6;
		public List<TerminalNode> Int() { return getTokens(T_no_semParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(T_no_semParser.Int, i);
		}
		public List<TerminalNode> String() { return getTokens(T_no_semParser.String); }
		public TerminalNode String(int i) {
			return getToken(T_no_semParser.String, i);
		}
		public List<Int_tupleContext> int_tuple() {
			return getRuleContexts(Int_tupleContext.class);
		}
		public Int_tupleContext int_tuple(int i) {
			return getRuleContext(Int_tupleContext.class,i);
		}
		public Int_tupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_tuple; }
	}

	public final Int_tupleContext int_tuple() throws RecognitionException {
		Int_tupleContext _localctx = new Int_tupleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_int_tuple);
		int _la;
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(T__4);
				setState(199);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Int:
					{
					setState(196);
					((Int_tupleContext)_localctx).s1 = match(Int);
					}
					break;
				case String:
					{
					setState(197);
					((Int_tupleContext)_localctx).s2 = match(String);
					}
					break;
				case T__4:
					{
					setState(198);
					((Int_tupleContext)_localctx).s3 = int_tuple();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(201);
					match(T__5);
					setState(205);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Int:
						{
						setState(202);
						((Int_tupleContext)_localctx).s4 = match(Int);
						}
						break;
					case String:
						{
						setState(203);
						((Int_tupleContext)_localctx).s5 = match(String);
						}
						break;
					case T__4:
						{
						setState(204);
						((Int_tupleContext)_localctx).s6 = int_tuple();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(211);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(212);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(T__4);
				setState(214);
				match(T__6);
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

	public static class PrintContext extends ParserRuleContext {
		public List<Print_varContext> print_var() {
			return getRuleContexts(Print_varContext.class);
		}
		public Print_varContext print_var(int i) {
			return getRuleContext(Print_varContext.class,i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_print);
		int _la;
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(T__8);
				setState(218);
				match(T__4);
				setState(219);
				print_var();
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(220);
					match(T__5);
					setState(221);
					print_var();
					}
					}
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(227);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(T__8);
				setState(230);
				match(T__4);
				setState(231);
				match(T__6);
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

	public static class Print_varContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(T_no_semParser.String, 0); }
		public Int_tupleContext int_tuple() {
			return getRuleContext(Int_tupleContext.class,0);
		}
		public TerminalNode Int() { return getToken(T_no_semParser.Int, 0); }
		public TerminalNode ID() { return getToken(T_no_semParser.ID, 0); }
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public SlicingContext slicing() {
			return getRuleContext(SlicingContext.class,0);
		}
		public Print_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_var; }
	}

	public final Print_varContext print_var() throws RecognitionException {
		Print_varContext _localctx = new Print_varContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_print_var);
		try {
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(String);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				int_tuple();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				match(Int);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(237);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(238);
				add();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(239);
				slicing();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20\u00f5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\7\3\37\n\3\f\3\16\3\"\13\3\3\4\3"+
		"\4\3\4\3\4\3\4\5\4)\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5=\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6w\n\6\3\7\3\7\3"+
		"\7\3\7\7\7}\n\7\f\7\16\7\u0080\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0089"+
		"\n\7\f\7\16\7\u008c\13\7\3\7\3\7\3\7\5\7\u0091\n\7\3\b\3\b\3\b\5\b\u0096"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u009d\n\b\6\b\u009f\n\b\r\b\16\b\u00a0\3"+
		"\t\3\t\3\t\3\t\5\t\u00a7\n\t\7\t\u00a9\n\t\f\t\16\t\u00ac\13\t\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u00b3\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ba\n\n\7\n\u00bc"+
		"\n\n\f\n\16\n\u00bf\13\n\3\n\3\n\3\n\5\n\u00c4\n\n\3\13\3\13\3\13\3\13"+
		"\5\13\u00ca\n\13\3\13\3\13\3\13\3\13\5\13\u00d0\n\13\7\13\u00d2\n\13\f"+
		"\13\16\13\u00d5\13\13\3\13\3\13\3\13\5\13\u00da\n\13\3\f\3\f\3\f\3\f\3"+
		"\f\7\f\u00e1\n\f\f\f\16\f\u00e4\13\f\3\f\3\f\3\f\3\f\3\f\5\f\u00eb\n\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00f3\n\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\2\2\2\u011c\2\32\3\2\2\2\4\34\3\2\2\2\6(\3\2\2\2\b<\3\2\2\2"+
		"\nv\3\2\2\2\f\u0090\3\2\2\2\16\u0095\3\2\2\2\20\u00a2\3\2\2\2\22\u00c3"+
		"\3\2\2\2\24\u00d9\3\2\2\2\26\u00ea\3\2\2\2\30\u00f2\3\2\2\2\32\33\5\4"+
		"\3\2\33\3\3\2\2\2\34 \5\6\4\2\35\37\5\6\4\2\36\35\3\2\2\2\37\"\3\2\2\2"+
		" \36\3\2\2\2 !\3\2\2\2!\5\3\2\2\2\" \3\2\2\2#)\5\b\5\2$)\5\n\6\2%)\5\f"+
		"\7\2&)\5\26\f\2\')\5\16\b\2(#\3\2\2\2($\3\2\2\2(%\3\2\2\2(&\3\2\2\2(\'"+
		"\3\2\2\2)\7\3\2\2\2*+\7\16\2\2+,\7\3\2\2,=\7\16\2\2-.\7\16\2\2./\7\3\2"+
		"\2/=\7\f\2\2\60\61\7\16\2\2\61\62\7\3\2\2\62=\7\r\2\2\63\64\7\16\2\2\64"+
		"\65\7\3\2\2\65=\5\20\t\2\66\67\7\16\2\2\678\7\3\2\28=\5\16\b\29:\7\16"+
		"\2\2:;\7\3\2\2;=\5\n\6\2<*\3\2\2\2<-\3\2\2\2<\60\3\2\2\2<\63\3\2\2\2<"+
		"\66\3\2\2\2<9\3\2\2\2=\t\3\2\2\2>?\7\16\2\2?@\7\4\2\2@A\7\f\2\2Aw\7\5"+
		"\2\2BC\7\16\2\2CD\7\4\2\2DE\7\f\2\2EF\7\6\2\2FG\7\f\2\2Gw\7\5\2\2HI\7"+
		"\16\2\2IJ\7\4\2\2JK\7\f\2\2KL\7\6\2\2Lw\7\5\2\2MN\7\16\2\2NO\7\4\2\2O"+
		"P\7\6\2\2PQ\7\f\2\2Qw\7\5\2\2RS\7\16\2\2ST\7\4\2\2TU\7\16\2\2Uw\7\5\2"+
		"\2VW\7\16\2\2WX\7\4\2\2XY\7\16\2\2YZ\7\6\2\2Z[\7\16\2\2[w\7\5\2\2\\]\7"+
		"\16\2\2]^\7\4\2\2^_\7\16\2\2_`\7\6\2\2`w\7\5\2\2ab\7\16\2\2bc\7\4\2\2"+
		"cd\7\6\2\2de\7\16\2\2ew\7\5\2\2fg\7\16\2\2gh\7\4\2\2hi\7\f\2\2ij\7\6\2"+
		"\2jk\7\16\2\2kw\7\5\2\2lm\7\16\2\2mn\7\4\2\2no\7\16\2\2op\7\6\2\2pq\7"+
		"\f\2\2qw\7\5\2\2rs\7\16\2\2st\7\4\2\2tu\7\6\2\2uw\7\5\2\2v>\3\2\2\2vB"+
		"\3\2\2\2vH\3\2\2\2vM\3\2\2\2vR\3\2\2\2vV\3\2\2\2v\\\3\2\2\2va\3\2\2\2"+
		"vf\3\2\2\2vl\3\2\2\2vr\3\2\2\2w\13\3\2\2\2xy\7\7\2\2y~\7\16\2\2z{\7\b"+
		"\2\2{}\7\16\2\2|z\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081"+
		"\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\t\2\2\u0082\u0083\7\3\2\2\u0083"+
		"\u0091\7\16\2\2\u0084\u0085\7\7\2\2\u0085\u008a\7\16\2\2\u0086\u0087\7"+
		"\b\2\2\u0087\u0089\7\16\2\2\u0088\u0086\3\2\2\2\u0089\u008c\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008d\u008e\7\t\2\2\u008e\u008f\7\3\2\2\u008f\u0091\5\24\13\2\u0090"+
		"x\3\2\2\2\u0090\u0084\3\2\2\2\u0091\r\3\2\2\2\u0092\u0096\7\16\2\2\u0093"+
		"\u0096\7\f\2\2\u0094\u0096\7\r\2\2\u0095\u0092\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0095\u0094\3\2\2\2\u0096\u009e\3\2\2\2\u0097\u009c\7\n\2\2\u0098"+
		"\u009d\7\16\2\2\u0099\u009d\7\f\2\2\u009a\u009d\7\r\2\2\u009b\u009d\5"+
		"\24\13\2\u009c\u0098\3\2\2\2\u009c\u0099\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009b\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u0097\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\17\3\2\2\2\u00a2\u00aa"+
		"\5\22\n\2\u00a3\u00a6\7\n\2\2\u00a4\u00a7\5\24\13\2\u00a5\u00a7\7\16\2"+
		"\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a3"+
		"\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\21\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b2\7\7\2\2\u00ae\u00b3\7\f\2"+
		"\2\u00af\u00b3\7\r\2\2\u00b0\u00b3\5\24\13\2\u00b1\u00b3\7\16\2\2\u00b2"+
		"\u00ae\3\2\2\2\u00b2\u00af\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2"+
		"\2\2\u00b3\u00bd\3\2\2\2\u00b4\u00b9\7\b\2\2\u00b5\u00ba\7\f\2\2\u00b6"+
		"\u00ba\7\r\2\2\u00b7\u00ba\5\24\13\2\u00b8\u00ba\7\16\2\2\u00b9\u00b5"+
		"\3\2\2\2\u00b9\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba"+
		"\u00bc\3\2\2\2\u00bb\u00b4\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0"+
		"\u00c4\7\t\2\2\u00c1\u00c2\7\7\2\2\u00c2\u00c4\7\t\2\2\u00c3\u00ad\3\2"+
		"\2\2\u00c3\u00c1\3\2\2\2\u00c4\23\3\2\2\2\u00c5\u00c9\7\7\2\2\u00c6\u00ca"+
		"\7\f\2\2\u00c7\u00ca\7\r\2\2\u00c8\u00ca\5\24\13\2\u00c9\u00c6\3\2\2\2"+
		"\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00d3\3\2\2\2\u00cb\u00cf"+
		"\7\b\2\2\u00cc\u00d0\7\f\2\2\u00cd\u00d0\7\r\2\2\u00ce\u00d0\5\24\13\2"+
		"\u00cf\u00cc\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d2"+
		"\3\2\2\2\u00d1\u00cb\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00da\7\t"+
		"\2\2\u00d7\u00d8\7\7\2\2\u00d8\u00da\7\t\2\2\u00d9\u00c5\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00da\25\3\2\2\2\u00db\u00dc\7\13\2\2\u00dc\u00dd\7\7\2"+
		"\2\u00dd\u00e2\5\30\r\2\u00de\u00df\7\b\2\2\u00df\u00e1\5\30\r\2\u00e0"+
		"\u00de\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\7\t\2\2\u00e6"+
		"\u00eb\3\2\2\2\u00e7\u00e8\7\13\2\2\u00e8\u00e9\7\7\2\2\u00e9\u00eb\7"+
		"\t\2\2\u00ea\u00db\3\2\2\2\u00ea\u00e7\3\2\2\2\u00eb\27\3\2\2\2\u00ec"+
		"\u00f3\7\r\2\2\u00ed\u00f3\5\24\13\2\u00ee\u00f3\7\f\2\2\u00ef\u00f3\7"+
		"\16\2\2\u00f0\u00f3\5\16\b\2\u00f1\u00f3\5\n\6\2\u00f2\u00ec\3\2\2\2\u00f2"+
		"\u00ed\3\2\2\2\u00f2\u00ee\3\2\2\2\u00f2\u00ef\3\2\2\2\u00f2\u00f0\3\2"+
		"\2\2\u00f2\u00f1\3\2\2\2\u00f3\31\3\2\2\2\31 (<v~\u008a\u0090\u0095\u009c"+
		"\u00a0\u00a6\u00aa\u00b2\u00b9\u00bd\u00c3\u00c9\u00cf\u00d3\u00d9\u00e2"+
		"\u00ea\u00f2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}