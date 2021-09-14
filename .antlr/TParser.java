// Generated from c:\Users\zozot\Desktop\Antlr\T.g by ANTLR 4.8
import java.util.Collection;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TParser extends Parser {
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
	public String getGrammarFileName() { return "T.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	actions act=new actions();
	public TParser(TokenStream input) {
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
		public Token ID;
		public Token Int;
		public Token String;
		public AddContext add;
		public SlicingContext slicing;
		public List<TerminalNode> ID() { return getTokens(TParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TParser.ID, i);
		}
		public TerminalNode Int() { return getToken(TParser.Int, 0); }
		public TerminalNode String() { return getToken(TParser.String, 0); }
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
			setState(65);
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
				act.gen_var((((AssignContext)_localctx).s1!=null?((AssignContext)_localctx).s1.getText():null),act.var.get((((AssignContext)_localctx).s2!=null?((AssignContext)_localctx).s2.getText():null)));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				((AssignContext)_localctx).ID = match(ID);
				setState(45);
				match(T__0);
				setState(46);
				((AssignContext)_localctx).Int = match(Int);
				act.gen_var((((AssignContext)_localctx).ID!=null?((AssignContext)_localctx).ID.getText():null),Integer.parseInt((((AssignContext)_localctx).Int!=null?((AssignContext)_localctx).Int.getText():null)));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				((AssignContext)_localctx).ID = match(ID);
				setState(49);
				match(T__0);
				setState(50);
				((AssignContext)_localctx).String = match(String);
				act.gen_var((((AssignContext)_localctx).ID!=null?((AssignContext)_localctx).ID.getText():null),(((AssignContext)_localctx).String!=null?((AssignContext)_localctx).String.getText():null).substring(1,(((AssignContext)_localctx).String!=null?((AssignContext)_localctx).String.getText():null).length()-1));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				((AssignContext)_localctx).ID = match(ID);
				setState(53);
				match(T__0);
				setState(54);
				tup_main((((AssignContext)_localctx).ID!=null?((AssignContext)_localctx).ID.getText():null));
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				((AssignContext)_localctx).ID = match(ID);
				setState(56);
				match(T__0);
				setState(57);
				((AssignContext)_localctx).add = add();
				act.gen_var((((AssignContext)_localctx).ID!=null?((AssignContext)_localctx).ID.getText():null),((AssignContext)_localctx).add.a);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(60);
				((AssignContext)_localctx).ID = match(ID);
				setState(61);
				match(T__0);
				setState(62);
				((AssignContext)_localctx).slicing = slicing();
				act.slicing_assignment((((AssignContext)_localctx).ID!=null?((AssignContext)_localctx).ID.getText():null),((AssignContext)_localctx).slicing.a);
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
		public Object a;
		public Token ID;
		public Token Int;
		public Token s1;
		public Token s2;
		public Token s3;
		public List<TerminalNode> ID() { return getTokens(TParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TParser.ID, i);
		}
		public List<TerminalNode> Int() { return getTokens(TParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(TParser.Int, i);
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
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				((SlicingContext)_localctx).ID = match(ID);
				setState(68);
				match(T__1);
				setState(69);
				((SlicingContext)_localctx).Int = match(Int);
				setState(70);
				match(T__2);
				a=act.slice((((SlicingContext)_localctx).ID!=null?((SlicingContext)_localctx).ID.getText():null),(((SlicingContext)_localctx).Int!=null?((SlicingContext)_localctx).Int.getText():null),"null","Int");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				((SlicingContext)_localctx).ID = match(ID);
				setState(73);
				match(T__1);
				setState(74);
				((SlicingContext)_localctx).s1 = match(Int);
				setState(75);
				match(T__3);
				setState(76);
				((SlicingContext)_localctx).s2 = match(Int);
				setState(77);
				match(T__2);
				((SlicingContext)_localctx).a = act.slice_Int((((SlicingContext)_localctx).ID!=null?((SlicingContext)_localctx).ID.getText():null),(((SlicingContext)_localctx).s1!=null?((SlicingContext)_localctx).s1.getText():null),(((SlicingContext)_localctx).s2!=null?((SlicingContext)_localctx).s2.getText():null),"Int");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				((SlicingContext)_localctx).ID = match(ID);
				setState(80);
				match(T__1);
				setState(81);
				((SlicingContext)_localctx).Int = match(Int);
				setState(82);
				match(T__3);
				setState(83);
				match(T__2);
				((SlicingContext)_localctx).a = act.slice((((SlicingContext)_localctx).ID!=null?((SlicingContext)_localctx).ID.getText():null),(((SlicingContext)_localctx).Int!=null?((SlicingContext)_localctx).Int.getText():null),"x:","Int");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				((SlicingContext)_localctx).ID = match(ID);
				setState(86);
				match(T__1);
				setState(87);
				match(T__3);
				setState(88);
				((SlicingContext)_localctx).Int = match(Int);
				setState(89);
				match(T__2);
				((SlicingContext)_localctx).a = act.slice((((SlicingContext)_localctx).ID!=null?((SlicingContext)_localctx).ID.getText():null),(((SlicingContext)_localctx).Int!=null?((SlicingContext)_localctx).Int.getText():null),":x","Int");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
				((SlicingContext)_localctx).s1 = match(ID);
				setState(92);
				match(T__1);
				setState(93);
				((SlicingContext)_localctx).s2 = match(ID);
				setState(94);
				match(T__2);
				((SlicingContext)_localctx).a = act.slice((((SlicingContext)_localctx).s1!=null?((SlicingContext)_localctx).s1.getText():null),(((SlicingContext)_localctx).s2!=null?((SlicingContext)_localctx).s2.getText():null),"null","ID");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(96);
				((SlicingContext)_localctx).s1 = match(ID);
				setState(97);
				match(T__1);
				setState(98);
				((SlicingContext)_localctx).s2 = match(ID);
				setState(99);
				match(T__3);
				setState(100);
				((SlicingContext)_localctx).s3 = match(ID);
				setState(101);
				match(T__2);
				((SlicingContext)_localctx).a = act.slice_Int((((SlicingContext)_localctx).s1!=null?((SlicingContext)_localctx).s1.getText():null),(((SlicingContext)_localctx).s2!=null?((SlicingContext)_localctx).s2.getText():null),(((SlicingContext)_localctx).s3!=null?((SlicingContext)_localctx).s3.getText():null),"ID");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(103);
				((SlicingContext)_localctx).s1 = match(ID);
				setState(104);
				match(T__1);
				setState(105);
				((SlicingContext)_localctx).s2 = match(ID);
				setState(106);
				match(T__3);
				setState(107);
				match(T__2);
				((SlicingContext)_localctx).a = act.slice((((SlicingContext)_localctx).s1!=null?((SlicingContext)_localctx).s1.getText():null),(((SlicingContext)_localctx).s2!=null?((SlicingContext)_localctx).s2.getText():null),"x:","ID");
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(109);
				((SlicingContext)_localctx).s1 = match(ID);
				setState(110);
				match(T__1);
				setState(111);
				match(T__3);
				setState(112);
				((SlicingContext)_localctx).s2 = match(ID);
				setState(113);
				match(T__2);
				((SlicingContext)_localctx).a = act.slice((((SlicingContext)_localctx).s1!=null?((SlicingContext)_localctx).s1.getText():null),(((SlicingContext)_localctx).s2!=null?((SlicingContext)_localctx).s2.getText():null),":x","ID");
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(115);
				((SlicingContext)_localctx).s1 = match(ID);
				setState(116);
				match(T__1);
				setState(117);
				((SlicingContext)_localctx).Int = match(Int);
				setState(118);
				match(T__3);
				setState(119);
				((SlicingContext)_localctx).s2 = match(ID);
				setState(120);
				match(T__2);
				((SlicingContext)_localctx).a = act.slice_Int((((SlicingContext)_localctx).s1!=null?((SlicingContext)_localctx).s1.getText():null),(((SlicingContext)_localctx).Int!=null?((SlicingContext)_localctx).Int.getText():null),(((SlicingContext)_localctx).s2!=null?((SlicingContext)_localctx).s2.getText():null),"MIX1");
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(122);
				((SlicingContext)_localctx).s1 = match(ID);
				setState(123);
				match(T__1);
				setState(124);
				((SlicingContext)_localctx).s2 = match(ID);
				setState(125);
				match(T__3);
				setState(126);
				((SlicingContext)_localctx).Int = match(Int);
				setState(127);
				match(T__2);
				((SlicingContext)_localctx).a = act.slice_Int((((SlicingContext)_localctx).s1!=null?((SlicingContext)_localctx).s1.getText():null),(((SlicingContext)_localctx).Int!=null?((SlicingContext)_localctx).Int.getText():null),(((SlicingContext)_localctx).s2!=null?((SlicingContext)_localctx).s2.getText():null),"MIX2");
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(129);
				((SlicingContext)_localctx).ID = match(ID);
				setState(130);
				match(T__1);
				setState(131);
				match(T__3);
				setState(132);
				match(T__2);
				((SlicingContext)_localctx).a = act.tup.get((((SlicingContext)_localctx).ID!=null?((SlicingContext)_localctx).ID.getText():null));
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
		public ArrayList<Object> a;
		public Token s1;
		public Token s2;
		public Token s3;
		public Int_tupleContext int_tuple;
		public List<TerminalNode> ID() { return getTokens(TParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TParser.ID, i);
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
		((UnpackContext)_localctx).a =  new ArrayList<Object>();
		int _la;
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(T__4);
				setState(137);
				((UnpackContext)_localctx).s1 = match(ID);
				a.add((((UnpackContext)_localctx).s1!=null?((UnpackContext)_localctx).s1.getText():null));
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(139);
					match(T__5);
					setState(140);
					((UnpackContext)_localctx).s2 = match(ID);
					a.add((((UnpackContext)_localctx).s2!=null?((UnpackContext)_localctx).s2.getText():null));
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(147);
				match(T__6);
				setState(148);
				match(T__0);
				setState(149);
				((UnpackContext)_localctx).s3 = match(ID);
				act.unpack(_localctx.a,(((UnpackContext)_localctx).s3!=null?((UnpackContext)_localctx).s3.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(T__4);
				setState(152);
				((UnpackContext)_localctx).s1 = match(ID);
				a.add((((UnpackContext)_localctx).s1!=null?((UnpackContext)_localctx).s1.getText():null));
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(154);
					match(T__5);
					setState(155);
					((UnpackContext)_localctx).s2 = match(ID);
					a.add((((UnpackContext)_localctx).s2!=null?((UnpackContext)_localctx).s2.getText():null));
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(162);
				match(T__6);
				setState(163);
				match(T__0);
				setState(164);
				((UnpackContext)_localctx).int_tuple = int_tuple();
				act.unpack(_localctx.a,((UnpackContext)_localctx).int_tuple.a);
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
		public Object a;
		public Token s1;
		public Token s2;
		public Token s3;
		public Token s4;
		public Token s5;
		public Token s6;
		public Int_tupleContext int_tuple;
		public List<TerminalNode> ID() { return getTokens(TParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TParser.ID, i);
		}
		public List<TerminalNode> Int() { return getTokens(TParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(TParser.Int, i);
		}
		public List<TerminalNode> String() { return getTokens(TParser.String); }
		public TerminalNode String(int i) {
			return getToken(TParser.String, i);
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
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(169);
				((AddContext)_localctx).s1 = match(ID);
				((AddContext)_localctx).a = act.getID((((AddContext)_localctx).s1!=null?((AddContext)_localctx).s1.getText():null));
				}
				break;
			case Int:
				{
				setState(171);
				((AddContext)_localctx).s2 = match(Int);
				((AddContext)_localctx).a = Integer.parseInt((((AddContext)_localctx).s2!=null?((AddContext)_localctx).s2.getText():null));
				}
				break;
			case String:
				{
				setState(173);
				((AddContext)_localctx).s3 = match(String);
				((AddContext)_localctx).a = (((AddContext)_localctx).s3!=null?((AddContext)_localctx).s3.getText():null).substring(0,(((AddContext)_localctx).s3!=null?((AddContext)_localctx).s3.getText():null).length()-1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(189); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(177);
				match(T__7);
				setState(187);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(178);
					((AddContext)_localctx).s4 = match(ID);
					((AddContext)_localctx).a = act.addID((((AddContext)_localctx).s4!=null?((AddContext)_localctx).s4.getText():null),a);
					}
					break;
				case Int:
					{
					setState(180);
					((AddContext)_localctx).s5 = match(Int);
					((AddContext)_localctx).a = (Integer)a+Integer.parseInt((((AddContext)_localctx).s5!=null?((AddContext)_localctx).s5.getText():null));
					}
					break;
				case String:
					{
					setState(182);
					((AddContext)_localctx).s6 = match(String);
					((AddContext)_localctx).a = (String)a+(((AddContext)_localctx).s6!=null?((AddContext)_localctx).s6.getText():null).substring(1,(((AddContext)_localctx).s6!=null?((AddContext)_localctx).s6.getText():null).length()-1);
					}
					break;
				case T__4:
					{
					setState(184);
					((AddContext)_localctx).int_tuple = int_tuple();
					((AddContext)_localctx).a = act.concat_tup(a,((AddContext)_localctx).int_tuple.a);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(191); 
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
		public String Id;
		public Int_tupleContext int_tuple;
		public Token ID;
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public List<Int_tupleContext> int_tuple() {
			return getRuleContexts(Int_tupleContext.class);
		}
		public Int_tupleContext int_tuple(int i) {
			return getRuleContext(Int_tupleContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(TParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TParser.ID, i);
		}
		public Tup_mainContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Tup_mainContext(ParserRuleContext parent, int invokingState, String Id) {
			super(parent, invokingState);
			this.Id = Id;
		}
		@Override public int getRuleIndex() { return RULE_tup_main; }
	}

	public final Tup_mainContext tup_main(String Id) throws RecognitionException {
		Tup_mainContext _localctx = new Tup_mainContext(_ctx, getState(), Id);
		enterRule(_localctx, 14, RULE_tup_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			act.gen_tup(_localctx.Id);
			setState(194);
			tuple(_localctx.Id);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(195);
				match(T__7);
				setState(201);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(196);
					((Tup_mainContext)_localctx).int_tuple = int_tuple();
					act.tup.get(_localctx.Id).addAll(((Tup_mainContext)_localctx).int_tuple.a);
					}
					break;
				case ID:
					{
					setState(199);
					((Tup_mainContext)_localctx).ID = match(ID);
					act.tup.get(_localctx.Id).addAll(act.tup.get((((Tup_mainContext)_localctx).ID!=null?((Tup_mainContext)_localctx).ID.getText():null)));
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(207);
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
		public String Id;
		public Token s1;
		public Token s2;
		public Int_tupleContext s3;
		public Token s7;
		public Token s4;
		public Token s5;
		public Int_tupleContext s6;
		public Token s8;
		public List<TerminalNode> Int() { return getTokens(TParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(TParser.Int, i);
		}
		public List<TerminalNode> String() { return getTokens(TParser.String); }
		public TerminalNode String(int i) {
			return getToken(TParser.String, i);
		}
		public List<Int_tupleContext> int_tuple() {
			return getRuleContexts(Int_tupleContext.class);
		}
		public Int_tupleContext int_tuple(int i) {
			return getRuleContext(Int_tupleContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(TParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TParser.ID, i);
		}
		public TupleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TupleContext(ParserRuleContext parent, int invokingState, String Id) {
			super(parent, invokingState);
			this.Id = Id;
		}
		@Override public int getRuleIndex() { return RULE_tuple; }
	}

	public final TupleContext tuple(String Id) throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState(), Id);
		enterRule(_localctx, 16, RULE_tuple);
		int _la;
		try {
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(T__4);
				setState(218);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Int:
					{
					setState(209);
					((TupleContext)_localctx).s1 = match(Int);
					act.push_tup(_localctx.Id,Integer.parseInt((((TupleContext)_localctx).s1!=null?((TupleContext)_localctx).s1.getText():null)));
					}
					break;
				case String:
					{
					setState(211);
					((TupleContext)_localctx).s2 = match(String);
					act.push_tup(_localctx.Id,(((TupleContext)_localctx).s2!=null?((TupleContext)_localctx).s2.getText():null));
					}
					break;
				case T__4:
					{
					setState(213);
					((TupleContext)_localctx).s3 = int_tuple();
					act.push_tup(_localctx.Id,((TupleContext)_localctx).s3.a);
					}
					break;
				case ID:
					{
					setState(216);
					((TupleContext)_localctx).s7 = match(ID);
					act.push_tup(_localctx.Id,act.getID((((TupleContext)_localctx).s7!=null?((TupleContext)_localctx).s7.getText():null)));
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(220);
					match(T__5);
					setState(230);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Int:
						{
						setState(221);
						((TupleContext)_localctx).s4 = match(Int);
						act.push_tup(_localctx.Id,Integer.parseInt((((TupleContext)_localctx).s4!=null?((TupleContext)_localctx).s4.getText():null)));
						}
						break;
					case String:
						{
						setState(223);
						((TupleContext)_localctx).s5 = match(String);
						act.push_tup(_localctx.Id,(((TupleContext)_localctx).s5!=null?((TupleContext)_localctx).s5.getText():null));
						}
						break;
					case T__4:
						{
						setState(225);
						((TupleContext)_localctx).s6 = int_tuple();
						act.push_tup(_localctx.Id,((TupleContext)_localctx).s6.a);
						}
						break;
					case ID:
						{
						setState(228);
						((TupleContext)_localctx).s8 = match(ID);
						act.push_tup(_localctx.Id,act.getID((((TupleContext)_localctx).s8!=null?((TupleContext)_localctx).s8.getText():null)));
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(237);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(T__4);
				setState(239);
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
		public ArrayList<Object> a;
		public Token s1;
		public Token s2;
		public Int_tupleContext s3;
		public Token s4;
		public Token s5;
		public Int_tupleContext s6;
		public List<TerminalNode> Int() { return getTokens(TParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(TParser.Int, i);
		}
		public List<TerminalNode> String() { return getTokens(TParser.String); }
		public TerminalNode String(int i) {
			return getToken(TParser.String, i);
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
		((Int_tupleContext)_localctx).a =  new ArrayList<Object>();
		int _la;
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(T__4);
				setState(250);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Int:
					{
					setState(243);
					((Int_tupleContext)_localctx).s1 = match(Int);
					_localctx.a.add(Integer.parseInt((((Int_tupleContext)_localctx).s1!=null?((Int_tupleContext)_localctx).s1.getText():null)));
					}
					break;
				case String:
					{
					setState(245);
					((Int_tupleContext)_localctx).s2 = match(String);
					_localctx.a.add((((Int_tupleContext)_localctx).s2!=null?((Int_tupleContext)_localctx).s2.getText():null));
					}
					break;
				case T__4:
					{
					setState(247);
					((Int_tupleContext)_localctx).s3 = int_tuple();
					_localctx.a.add(((Int_tupleContext)_localctx).s3.a);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(252);
					match(T__5);
					setState(260);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Int:
						{
						setState(253);
						((Int_tupleContext)_localctx).s4 = match(Int);
						_localctx.a.add(Integer.parseInt((((Int_tupleContext)_localctx).s4!=null?((Int_tupleContext)_localctx).s4.getText():null)));
						}
						break;
					case String:
						{
						setState(255);
						((Int_tupleContext)_localctx).s5 = match(String);
						_localctx.a.add((((Int_tupleContext)_localctx).s5!=null?((Int_tupleContext)_localctx).s5.getText():null));
						}
						break;
					case T__4:
						{
						setState(257);
						((Int_tupleContext)_localctx).s6 = int_tuple();
						_localctx.a.add(((Int_tupleContext)_localctx).s6.a);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(267);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(T__4);
				setState(269);
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
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(T__8);
				setState(273);
				match(T__4);
				setState(274);
				print_var();
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(275);
					match(T__5);
					System.out.print(" ");
					setState(277);
					print_var();
					}
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(283);
				match(T__6);
				System.out.print('\n');
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(T__8);
				setState(287);
				match(T__4);
				setState(288);
				match(T__6);
				System.out.println();
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
		public Token String;
		public Int_tupleContext int_tuple;
		public Token Int;
		public Token ID;
		public AddContext add;
		public SlicingContext slicing;
		public TerminalNode String() { return getToken(TParser.String, 0); }
		public Int_tupleContext int_tuple() {
			return getRuleContext(Int_tupleContext.class,0);
		}
		public TerminalNode Int() { return getToken(TParser.Int, 0); }
		public TerminalNode ID() { return getToken(TParser.ID, 0); }
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
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				((Print_varContext)_localctx).String = match(String);
				String s=(((Print_varContext)_localctx).String!=null?((Print_varContext)_localctx).String.getText():null).replace("\\n",System.lineSeparator()).replace("\\t","    "); System.out.print(s.substring(1,(((Print_varContext)_localctx).String!=null?((Print_varContext)_localctx).String.getText():null).length()-1));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				((Print_varContext)_localctx).int_tuple = int_tuple();
				System.out.print(act.print_sliced_tup(((Print_varContext)_localctx).int_tuple.a));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				((Print_varContext)_localctx).Int = match(Int);
				System.out.print(Integer.parseInt((((Print_varContext)_localctx).Int!=null?((Print_varContext)_localctx).Int.getText():null)));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(299);
				((Print_varContext)_localctx).ID = match(ID);
				act.print((((Print_varContext)_localctx).ID!=null?((Print_varContext)_localctx).ID.getText():null));
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(301);
				((Print_varContext)_localctx).add = add();
				System.out.print(((Print_varContext)_localctx).add.a);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(304);
				((Print_varContext)_localctx).slicing = slicing();
				System.out.print(act.print_sliced_tup(((Print_varContext)_localctx).slicing.a));
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20\u0138\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\7\3\37\n\3\f\3\16\3\"\13\3\3\4\3"+
		"\4\3\4\3\4\3\4\5\4)\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5D\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0089\n\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\7\7\u0091\n\7\f\7\16\7\u0094\13\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00a0\n\7\f\7\16\7\u00a3\13\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7\u00aa\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b2\n\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00be\n\b\6\b\u00c0\n\b\r\b\16\b\u00c1"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00cc\n\t\7\t\u00ce\n\t\f\t\16\t"+
		"\u00d1\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00dd\n\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00e9\n\n\7\n\u00eb\n\n\f\n\16"+
		"\n\u00ee\13\n\3\n\3\n\3\n\5\n\u00f3\n\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u00fd\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u0107\n\13\7\13\u0109\n\13\f\13\16\13\u010c\13\13\3\13\3\13\3\13\5\13"+
		"\u0111\n\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0119\n\f\f\f\16\f\u011c\13\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0125\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0136\n\r\3\r\2\2\16\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\2\2\2\u015f\2\32\3\2\2\2\4\34\3\2\2\2\6(\3\2\2\2\b"+
		"C\3\2\2\2\n\u0088\3\2\2\2\f\u00a9\3\2\2\2\16\u00b1\3\2\2\2\20\u00c3\3"+
		"\2\2\2\22\u00f2\3\2\2\2\24\u0110\3\2\2\2\26\u0124\3\2\2\2\30\u0135\3\2"+
		"\2\2\32\33\5\4\3\2\33\3\3\2\2\2\34 \5\6\4\2\35\37\5\6\4\2\36\35\3\2\2"+
		"\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\5\3\2\2\2\" \3\2\2\2#)\5\b\5\2"+
		"$)\5\n\6\2%)\5\f\7\2&)\5\26\f\2\')\5\16\b\2(#\3\2\2\2($\3\2\2\2(%\3\2"+
		"\2\2(&\3\2\2\2(\'\3\2\2\2)\7\3\2\2\2*+\7\16\2\2+,\7\3\2\2,-\7\16\2\2-"+
		"D\b\5\1\2./\7\16\2\2/\60\7\3\2\2\60\61\7\f\2\2\61D\b\5\1\2\62\63\7\16"+
		"\2\2\63\64\7\3\2\2\64\65\7\r\2\2\65D\b\5\1\2\66\67\7\16\2\2\678\7\3\2"+
		"\28D\5\20\t\29:\7\16\2\2:;\7\3\2\2;<\5\16\b\2<=\b\5\1\2=D\3\2\2\2>?\7"+
		"\16\2\2?@\7\3\2\2@A\5\n\6\2AB\b\5\1\2BD\3\2\2\2C*\3\2\2\2C.\3\2\2\2C\62"+
		"\3\2\2\2C\66\3\2\2\2C9\3\2\2\2C>\3\2\2\2D\t\3\2\2\2EF\7\16\2\2FG\7\4\2"+
		"\2GH\7\f\2\2HI\7\5\2\2I\u0089\b\6\1\2JK\7\16\2\2KL\7\4\2\2LM\7\f\2\2M"+
		"N\7\6\2\2NO\7\f\2\2OP\7\5\2\2P\u0089\b\6\1\2QR\7\16\2\2RS\7\4\2\2ST\7"+
		"\f\2\2TU\7\6\2\2UV\7\5\2\2V\u0089\b\6\1\2WX\7\16\2\2XY\7\4\2\2YZ\7\6\2"+
		"\2Z[\7\f\2\2[\\\7\5\2\2\\\u0089\b\6\1\2]^\7\16\2\2^_\7\4\2\2_`\7\16\2"+
		"\2`a\7\5\2\2a\u0089\b\6\1\2bc\7\16\2\2cd\7\4\2\2de\7\16\2\2ef\7\6\2\2"+
		"fg\7\16\2\2gh\7\5\2\2h\u0089\b\6\1\2ij\7\16\2\2jk\7\4\2\2kl\7\16\2\2l"+
		"m\7\6\2\2mn\7\5\2\2n\u0089\b\6\1\2op\7\16\2\2pq\7\4\2\2qr\7\6\2\2rs\7"+
		"\16\2\2st\7\5\2\2t\u0089\b\6\1\2uv\7\16\2\2vw\7\4\2\2wx\7\f\2\2xy\7\6"+
		"\2\2yz\7\16\2\2z{\7\5\2\2{\u0089\b\6\1\2|}\7\16\2\2}~\7\4\2\2~\177\7\16"+
		"\2\2\177\u0080\7\6\2\2\u0080\u0081\7\f\2\2\u0081\u0082\7\5\2\2\u0082\u0089"+
		"\b\6\1\2\u0083\u0084\7\16\2\2\u0084\u0085\7\4\2\2\u0085\u0086\7\6\2\2"+
		"\u0086\u0087\7\5\2\2\u0087\u0089\b\6\1\2\u0088E\3\2\2\2\u0088J\3\2\2\2"+
		"\u0088Q\3\2\2\2\u0088W\3\2\2\2\u0088]\3\2\2\2\u0088b\3\2\2\2\u0088i\3"+
		"\2\2\2\u0088o\3\2\2\2\u0088u\3\2\2\2\u0088|\3\2\2\2\u0088\u0083\3\2\2"+
		"\2\u0089\13\3\2\2\2\u008a\u008b\7\7\2\2\u008b\u008c\7\16\2\2\u008c\u0092"+
		"\b\7\1\2\u008d\u008e\7\b\2\2\u008e\u008f\7\16\2\2\u008f\u0091\b\7\1\2"+
		"\u0090\u008d\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7\t\2\2\u0096"+
		"\u0097\7\3\2\2\u0097\u0098\7\16\2\2\u0098\u00aa\b\7\1\2\u0099\u009a\7"+
		"\7\2\2\u009a\u009b\7\16\2\2\u009b\u00a1\b\7\1\2\u009c\u009d\7\b\2\2\u009d"+
		"\u009e\7\16\2\2\u009e\u00a0\b\7\1\2\u009f\u009c\3\2\2\2\u00a0\u00a3\3"+
		"\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a4\u00a5\7\t\2\2\u00a5\u00a6\7\3\2\2\u00a6\u00a7\5\24"+
		"\13\2\u00a7\u00a8\b\7\1\2\u00a8\u00aa\3\2\2\2\u00a9\u008a\3\2\2\2\u00a9"+
		"\u0099\3\2\2\2\u00aa\r\3\2\2\2\u00ab\u00ac\7\16\2\2\u00ac\u00b2\b\b\1"+
		"\2\u00ad\u00ae\7\f\2\2\u00ae\u00b2\b\b\1\2\u00af\u00b0\7\r\2\2\u00b0\u00b2"+
		"\b\b\1\2\u00b1\u00ab\3\2\2\2\u00b1\u00ad\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2"+
		"\u00bf\3\2\2\2\u00b3\u00bd\7\n\2\2\u00b4\u00b5\7\16\2\2\u00b5\u00be\b"+
		"\b\1\2\u00b6\u00b7\7\f\2\2\u00b7\u00be\b\b\1\2\u00b8\u00b9\7\r\2\2\u00b9"+
		"\u00be\b\b\1\2\u00ba\u00bb\5\24\13\2\u00bb\u00bc\b\b\1\2\u00bc\u00be\3"+
		"\2\2\2\u00bd\u00b4\3\2\2\2\u00bd\u00b6\3\2\2\2\u00bd\u00b8\3\2\2\2\u00bd"+
		"\u00ba\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00b3\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\17\3\2\2\2\u00c3\u00c4"+
		"\b\t\1\2\u00c4\u00cf\5\22\n\2\u00c5\u00cb\7\n\2\2\u00c6\u00c7\5\24\13"+
		"\2\u00c7\u00c8\b\t\1\2\u00c8\u00cc\3\2\2\2\u00c9\u00ca\7\16\2\2\u00ca"+
		"\u00cc\b\t\1\2\u00cb\u00c6\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00ce\3\2"+
		"\2\2\u00cd\u00c5\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\21\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00dc\7\7\2"+
		"\2\u00d3\u00d4\7\f\2\2\u00d4\u00dd\b\n\1\2\u00d5\u00d6\7\r\2\2\u00d6\u00dd"+
		"\b\n\1\2\u00d7\u00d8\5\24\13\2\u00d8\u00d9\b\n\1\2\u00d9\u00dd\3\2\2\2"+
		"\u00da\u00db\7\16\2\2\u00db\u00dd\b\n\1\2\u00dc\u00d3\3\2\2\2\u00dc\u00d5"+
		"\3\2\2\2\u00dc\u00d7\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00ec\3\2\2\2\u00de"+
		"\u00e8\7\b\2\2\u00df\u00e0\7\f\2\2\u00e0\u00e9\b\n\1\2\u00e1\u00e2\7\r"+
		"\2\2\u00e2\u00e9\b\n\1\2\u00e3\u00e4\5\24\13\2\u00e4\u00e5\b\n\1\2\u00e5"+
		"\u00e9\3\2\2\2\u00e6\u00e7\7\16\2\2\u00e7\u00e9\b\n\1\2\u00e8\u00df\3"+
		"\2\2\2\u00e8\u00e1\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9"+
		"\u00eb\3\2\2\2\u00ea\u00de\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2"+
		"\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef"+
		"\u00f3\7\t\2\2\u00f0\u00f1\7\7\2\2\u00f1\u00f3\7\t\2\2\u00f2\u00d2\3\2"+
		"\2\2\u00f2\u00f0\3\2\2\2\u00f3\23\3\2\2\2\u00f4\u00fc\7\7\2\2\u00f5\u00f6"+
		"\7\f\2\2\u00f6\u00fd\b\13\1\2\u00f7\u00f8\7\r\2\2\u00f8\u00fd\b\13\1\2"+
		"\u00f9\u00fa\5\24\13\2\u00fa\u00fb\b\13\1\2\u00fb\u00fd\3\2\2\2\u00fc"+
		"\u00f5\3\2\2\2\u00fc\u00f7\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fd\u010a\3\2"+
		"\2\2\u00fe\u0106\7\b\2\2\u00ff\u0100\7\f\2\2\u0100\u0107\b\13\1\2\u0101"+
		"\u0102\7\r\2\2\u0102\u0107\b\13\1\2\u0103\u0104\5\24\13\2\u0104\u0105"+
		"\b\13\1\2\u0105\u0107\3\2\2\2\u0106\u00ff\3\2\2\2\u0106\u0101\3\2\2\2"+
		"\u0106\u0103\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u00fe\3\2\2\2\u0109\u010c"+
		"\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010d\u0111\7\t\2\2\u010e\u010f\7\7\2\2\u010f\u0111\7\t"+
		"\2\2\u0110\u00f4\3\2\2\2\u0110\u010e\3\2\2\2\u0111\25\3\2\2\2\u0112\u0113"+
		"\7\13\2\2\u0113\u0114\7\7\2\2\u0114\u011a\5\30\r\2\u0115\u0116\7\b\2\2"+
		"\u0116\u0117\b\f\1\2\u0117\u0119\5\30\r\2\u0118\u0115\3\2\2\2\u0119\u011c"+
		"\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011d\u011e\7\t\2\2\u011e\u011f\b\f\1\2\u011f\u0125\3\2"+
		"\2\2\u0120\u0121\7\13\2\2\u0121\u0122\7\7\2\2\u0122\u0123\7\t\2\2\u0123"+
		"\u0125\b\f\1\2\u0124\u0112\3\2\2\2\u0124\u0120\3\2\2\2\u0125\27\3\2\2"+
		"\2\u0126\u0127\7\r\2\2\u0127\u0136\b\r\1\2\u0128\u0129\5\24\13\2\u0129"+
		"\u012a\b\r\1\2\u012a\u0136\3\2\2\2\u012b\u012c\7\f\2\2\u012c\u0136\b\r"+
		"\1\2\u012d\u012e\7\16\2\2\u012e\u0136\b\r\1\2\u012f\u0130\5\16\b\2\u0130"+
		"\u0131\b\r\1\2\u0131\u0136\3\2\2\2\u0132\u0133\5\n\6\2\u0133\u0134\b\r"+
		"\1\2\u0134\u0136\3\2\2\2\u0135\u0126\3\2\2\2\u0135\u0128\3\2\2\2\u0135"+
		"\u012b\3\2\2\2\u0135\u012d\3\2\2\2\u0135\u012f\3\2\2\2\u0135\u0132\3\2"+
		"\2\2\u0136\31\3\2\2\2\31 (C\u0088\u0092\u00a1\u00a9\u00b1\u00bd\u00c1"+
		"\u00cb\u00cf\u00dc\u00e8\u00ec\u00f2\u00fc\u0106\u010a\u0110\u011a\u0124"+
		"\u0135";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}