// Generated from /Users/johnwang/Desktop/koord/src/main/antlr4/Koord.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KoordParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ARROW=1, AGENT=2, MODULE=3, USING=4, DEF=5, TYPE=6, FUN=7, ADT=8, ACTUATORS=9, 
		SENSORS=10, ALLWRITE=11, ALLREAD=12, LOCAL=13, LIST=14, MAP=15, QUEUE=16, 
		INIT=17, INT=18, FLOAT=19, BOOL=20, STRINGTYPE=21, POS=22, INPUTMAP=23, 
		IF=24, ELSE=25, ATOMIC=26, PRE=27, EFF=28, TRUE=29, FALSE=30, PID=31, 
		NUMAGENTS=32, COLON=33, COMMA=34, SEMICOLON=35, LPAR=36, RPAR=37, LBRACE=38, 
		RBRACE=39, LCURLY=40, RCURLY=41, LANGLE=42, RANGLE=43, AND=44, OR=45, 
		NOT=46, MODULENAME=47, VARNAME=48, INUM=49, FNUM=50, PLUS=51, MINUS=52, 
		TIMES=53, BY=54, EQ=55, GEQ=56, LEQ=57, NEQ=58, ASGN=59, STRING=60, NEWLINE=61, 
		SKIP_=62, INDENT=63, DEDENT=64, CID=65;
	public static final int
		RULE_lexemes = 0, RULE_top = 1, RULE_program = 2, RULE_defs = 3, RULE_funcdef = 4, 
		RULE_param = 5, RULE_event = 6, RULE_statementblock = 7, RULE_stmt = 8, 
		RULE_funccall = 9, RULE_arglist = 10, RULE_assign = 11, RULE_expr = 12, 
		RULE_bexpr = 13, RULE_aexpr = 14, RULE_number = 15, RULE_relop = 16, RULE_type = 17, 
		RULE_decblock = 18, RULE_decl = 19, RULE_arraydec = 20, RULE_module = 21, 
		RULE_actuatordecls = 22, RULE_sensordecls = 23, RULE_init = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"lexemes", "top", "program", "defs", "funcdef", "param", "event", "statementblock", 
			"stmt", "funccall", "arglist", "assign", "expr", "bexpr", "aexpr", "number", 
			"relop", "type", "decblock", "decl", "arraydec", "module", "actuatordecls", 
			"sensordecls", "init"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'->'", "'agent'", "'module'", "'using'", "'def'", "'type'", "'fun'", 
			"'adt'", "'actuators'", "'sensors'", "'allwrite'", "'allread'", "'local'", 
			"'list'", "'map'", "'queue'", "'init'", "'int'", "'float'", "'boolean'", 
			"'string'", "'pos'", "'inputMap'", "'if'", "'else'", "'atomic'", "'pre'", 
			"'eff'", "'true'", "'false'", "'pid'", "'numBots'", "':'", "','", "';'", 
			"'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'>'", null, null, "'!'", 
			null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'=='", "'>='", "'<='", 
			"'!='", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ARROW", "AGENT", "MODULE", "USING", "DEF", "TYPE", "FUN", "ADT", 
			"ACTUATORS", "SENSORS", "ALLWRITE", "ALLREAD", "LOCAL", "LIST", "MAP", 
			"QUEUE", "INIT", "INT", "FLOAT", "BOOL", "STRINGTYPE", "POS", "INPUTMAP", 
			"IF", "ELSE", "ATOMIC", "PRE", "EFF", "TRUE", "FALSE", "PID", "NUMAGENTS", 
			"COLON", "COMMA", "SEMICOLON", "LPAR", "RPAR", "LBRACE", "RBRACE", "LCURLY", 
			"RCURLY", "LANGLE", "RANGLE", "AND", "OR", "NOT", "MODULENAME", "VARNAME", 
			"INUM", "FNUM", "PLUS", "MINUS", "TIMES", "BY", "EQ", "GEQ", "LEQ", "NEQ", 
			"ASGN", "STRING", "NEWLINE", "SKIP_", "INDENT", "DEDENT", "CID"
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
	public String getGrammarFileName() { return "Koord.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KoordParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class LexemesContext extends ParserRuleContext {
		public TerminalNode AGENT() { return getToken(KoordParser.AGENT, 0); }
		public TerminalNode MODULE() { return getToken(KoordParser.MODULE, 0); }
		public TerminalNode DEF() { return getToken(KoordParser.DEF, 0); }
		public TerminalNode TYPE() { return getToken(KoordParser.TYPE, 0); }
		public TerminalNode FUN() { return getToken(KoordParser.FUN, 0); }
		public TerminalNode ACTUATORS() { return getToken(KoordParser.ACTUATORS, 0); }
		public TerminalNode SENSORS() { return getToken(KoordParser.SENSORS, 0); }
		public TerminalNode ALLWRITE() { return getToken(KoordParser.ALLWRITE, 0); }
		public TerminalNode ALLREAD() { return getToken(KoordParser.ALLREAD, 0); }
		public TerminalNode LOCAL() { return getToken(KoordParser.LOCAL, 0); }
		public TerminalNode LIST() { return getToken(KoordParser.LIST, 0); }
		public TerminalNode MAP() { return getToken(KoordParser.MAP, 0); }
		public TerminalNode QUEUE() { return getToken(KoordParser.QUEUE, 0); }
		public TerminalNode INIT() { return getToken(KoordParser.INIT, 0); }
		public TerminalNode INT() { return getToken(KoordParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(KoordParser.FLOAT, 0); }
		public TerminalNode BOOL() { return getToken(KoordParser.BOOL, 0); }
		public TerminalNode POS() { return getToken(KoordParser.POS, 0); }
		public TerminalNode IF() { return getToken(KoordParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(KoordParser.ELSE, 0); }
		public TerminalNode ATOMIC() { return getToken(KoordParser.ATOMIC, 0); }
		public TerminalNode PRE() { return getToken(KoordParser.PRE, 0); }
		public TerminalNode EFF() { return getToken(KoordParser.EFF, 0); }
		public TerminalNode TRUE() { return getToken(KoordParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(KoordParser.FALSE, 0); }
		public TerminalNode PID() { return getToken(KoordParser.PID, 0); }
		public TerminalNode NUMAGENTS() { return getToken(KoordParser.NUMAGENTS, 0); }
		public TerminalNode COLON() { return getToken(KoordParser.COLON, 0); }
		public TerminalNode COMMA() { return getToken(KoordParser.COMMA, 0); }
		public TerminalNode SEMICOLON() { return getToken(KoordParser.SEMICOLON, 0); }
		public TerminalNode LPAR() { return getToken(KoordParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(KoordParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(KoordParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(KoordParser.RBRACE, 0); }
		public TerminalNode LCURLY() { return getToken(KoordParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(KoordParser.RCURLY, 0); }
		public TerminalNode LANGLE() { return getToken(KoordParser.LANGLE, 0); }
		public TerminalNode RANGLE() { return getToken(KoordParser.RANGLE, 0); }
		public TerminalNode AND() { return getToken(KoordParser.AND, 0); }
		public TerminalNode OR() { return getToken(KoordParser.OR, 0); }
		public TerminalNode NOT() { return getToken(KoordParser.NOT, 0); }
		public TerminalNode VARNAME() { return getToken(KoordParser.VARNAME, 0); }
		public TerminalNode CID() { return getToken(KoordParser.CID, 0); }
		public TerminalNode INUM() { return getToken(KoordParser.INUM, 0); }
		public TerminalNode FNUM() { return getToken(KoordParser.FNUM, 0); }
		public TerminalNode PLUS() { return getToken(KoordParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(KoordParser.MINUS, 0); }
		public TerminalNode TIMES() { return getToken(KoordParser.TIMES, 0); }
		public TerminalNode BY() { return getToken(KoordParser.BY, 0); }
		public TerminalNode EQ() { return getToken(KoordParser.EQ, 0); }
		public TerminalNode GEQ() { return getToken(KoordParser.GEQ, 0); }
		public TerminalNode LEQ() { return getToken(KoordParser.LEQ, 0); }
		public TerminalNode NEQ() { return getToken(KoordParser.NEQ, 0); }
		public TerminalNode ASGN() { return getToken(KoordParser.ASGN, 0); }
		public TerminalNode NEWLINE() { return getToken(KoordParser.NEWLINE, 0); }
		public TerminalNode SKIP_() { return getToken(KoordParser.SKIP_, 0); }
		public TerminalNode INDENT() { return getToken(KoordParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(KoordParser.DEDENT, 0); }
		public LexemesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexemes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).enterLexemes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).exitLexemes(this);
		}
	}

	public final LexemesContext lexemes() throws RecognitionException {
		LexemesContext _localctx = new LexemesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_lexemes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_la = _input.LA(1);
			if ( !(((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (AGENT - 2)) | (1L << (MODULE - 2)) | (1L << (DEF - 2)) | (1L << (TYPE - 2)) | (1L << (FUN - 2)) | (1L << (ACTUATORS - 2)) | (1L << (SENSORS - 2)) | (1L << (ALLWRITE - 2)) | (1L << (ALLREAD - 2)) | (1L << (LOCAL - 2)) | (1L << (LIST - 2)) | (1L << (MAP - 2)) | (1L << (QUEUE - 2)) | (1L << (INIT - 2)) | (1L << (INT - 2)) | (1L << (FLOAT - 2)) | (1L << (BOOL - 2)) | (1L << (POS - 2)) | (1L << (IF - 2)) | (1L << (ELSE - 2)) | (1L << (ATOMIC - 2)) | (1L << (PRE - 2)) | (1L << (EFF - 2)) | (1L << (TRUE - 2)) | (1L << (FALSE - 2)) | (1L << (PID - 2)) | (1L << (NUMAGENTS - 2)) | (1L << (COLON - 2)) | (1L << (COMMA - 2)) | (1L << (SEMICOLON - 2)) | (1L << (LPAR - 2)) | (1L << (RPAR - 2)) | (1L << (LBRACE - 2)) | (1L << (RBRACE - 2)) | (1L << (LCURLY - 2)) | (1L << (RCURLY - 2)) | (1L << (LANGLE - 2)) | (1L << (RANGLE - 2)) | (1L << (AND - 2)) | (1L << (OR - 2)) | (1L << (NOT - 2)) | (1L << (VARNAME - 2)) | (1L << (INUM - 2)) | (1L << (FNUM - 2)) | (1L << (PLUS - 2)) | (1L << (MINUS - 2)) | (1L << (TIMES - 2)) | (1L << (BY - 2)) | (1L << (EQ - 2)) | (1L << (GEQ - 2)) | (1L << (LEQ - 2)) | (1L << (NEQ - 2)) | (1L << (ASGN - 2)) | (1L << (NEWLINE - 2)) | (1L << (SKIP_ - 2)) | (1L << (INDENT - 2)) | (1L << (DEDENT - 2)) | (1L << (CID - 2)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class TopContext extends ParserRuleContext {
		public List<LexemesContext> lexemes() {
			return getRuleContexts(LexemesContext.class);
		}
		public LexemesContext lexemes(int i) {
			return getRuleContext(LexemesContext.class,i);
		}
		public TopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).enterTop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).exitTop(this);
		}
	}

	public final TopContext top() throws RecognitionException {
		TopContext _localctx = new TopContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_top);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				lexemes();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (AGENT - 2)) | (1L << (MODULE - 2)) | (1L << (DEF - 2)) | (1L << (TYPE - 2)) | (1L << (FUN - 2)) | (1L << (ACTUATORS - 2)) | (1L << (SENSORS - 2)) | (1L << (ALLWRITE - 2)) | (1L << (ALLREAD - 2)) | (1L << (LOCAL - 2)) | (1L << (LIST - 2)) | (1L << (MAP - 2)) | (1L << (QUEUE - 2)) | (1L << (INIT - 2)) | (1L << (INT - 2)) | (1L << (FLOAT - 2)) | (1L << (BOOL - 2)) | (1L << (POS - 2)) | (1L << (IF - 2)) | (1L << (ELSE - 2)) | (1L << (ATOMIC - 2)) | (1L << (PRE - 2)) | (1L << (EFF - 2)) | (1L << (TRUE - 2)) | (1L << (FALSE - 2)) | (1L << (PID - 2)) | (1L << (NUMAGENTS - 2)) | (1L << (COLON - 2)) | (1L << (COMMA - 2)) | (1L << (SEMICOLON - 2)) | (1L << (LPAR - 2)) | (1L << (RPAR - 2)) | (1L << (LBRACE - 2)) | (1L << (RBRACE - 2)) | (1L << (LCURLY - 2)) | (1L << (RCURLY - 2)) | (1L << (LANGLE - 2)) | (1L << (RANGLE - 2)) | (1L << (AND - 2)) | (1L << (OR - 2)) | (1L << (NOT - 2)) | (1L << (VARNAME - 2)) | (1L << (INUM - 2)) | (1L << (FNUM - 2)) | (1L << (PLUS - 2)) | (1L << (MINUS - 2)) | (1L << (TIMES - 2)) | (1L << (BY - 2)) | (1L << (EQ - 2)) | (1L << (GEQ - 2)) | (1L << (LEQ - 2)) | (1L << (NEQ - 2)) | (1L << (ASGN - 2)) | (1L << (NEWLINE - 2)) | (1L << (SKIP_ - 2)) | (1L << (INDENT - 2)) | (1L << (DEDENT - 2)) | (1L << (CID - 2)))) != 0) );
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

	public static class ProgramContext extends ParserRuleContext {
		public DefsContext defs() {
			return getRuleContext(DefsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(KoordParser.EOF, 0); }
		public List<ModuleContext> module() {
			return getRuleContexts(ModuleContext.class);
		}
		public ModuleContext module(int i) {
			return getRuleContext(ModuleContext.class,i);
		}
		public List<DecblockContext> decblock() {
			return getRuleContexts(DecblockContext.class);
		}
		public DecblockContext decblock(int i) {
			return getRuleContext(DecblockContext.class,i);
		}
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public List<EventContext> event() {
			return getRuleContexts(EventContext.class);
		}
		public EventContext event(int i) {
			return getRuleContext(EventContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			defs();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==USING) {
				{
				{
				setState(58);
				module();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALLWRITE) | (1L << ALLREAD) | (1L << LOCAL))) != 0)) {
				{
				{
				setState(64);
				decblock();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INIT) {
				{
				setState(70);
				init();
				}
			}

			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				event();
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VARNAME );
			setState(78);
			match(EOF);
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

	public static class DefsContext extends ParserRuleContext {
		public List<FuncdefContext> funcdef() {
			return getRuleContexts(FuncdefContext.class);
		}
		public FuncdefContext funcdef(int i) {
			return getRuleContext(FuncdefContext.class,i);
		}
		public DefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).enterDefs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).exitDefs(this);
		}
	}

	public final DefsContext defs() throws RecognitionException {
		DefsContext _localctx = new DefsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_defs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF) {
				{
				{
				setState(80);
				funcdef();
				}
				}
				setState(85);
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

	public static class FuncdefContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(KoordParser.DEF, 0); }
		public TerminalNode VARNAME() { return getToken(KoordParser.VARNAME, 0); }
		public TerminalNode LPAR() { return getToken(KoordParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(KoordParser.RPAR, 0); }
		public TerminalNode ARROW() { return getToken(KoordParser.ARROW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KoordParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(KoordParser.NEWLINE, 0); }
		public StatementblockContext statementblock() {
			return getRuleContext(StatementblockContext.class,0);
		}
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KoordParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KoordParser.COMMA, i);
		}
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).enterFuncdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).exitFuncdef(this);
		}
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(DEF);
			setState(87);
			match(VARNAME);
			setState(88);
			match(LPAR);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUEUE) | (1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << STRINGTYPE) | (1L << POS))) != 0)) {
				{
				setState(89);
				param();
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(90);
					match(COMMA);
					setState(91);
					param();
					}
					}
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(99);
			match(RPAR);
			setState(100);
			match(ARROW);
			setState(101);
			type();
			setState(102);
			match(COLON);
			setState(103);
			match(NEWLINE);
			setState(104);
			statementblock();
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

	public static class ParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VARNAME() { return getToken(KoordParser.VARNAME, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			type();
			setState(107);
			match(VARNAME);
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

	public static class EventContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(KoordParser.VARNAME, 0); }
		public List<TerminalNode> COLON() { return getTokens(KoordParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(KoordParser.COLON, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(KoordParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(KoordParser.NEWLINE, i);
		}
		public TerminalNode INDENT() { return getToken(KoordParser.INDENT, 0); }
		public TerminalNode PRE() { return getToken(KoordParser.PRE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EFF() { return getToken(KoordParser.EFF, 0); }
		public StatementblockContext statementblock() {
			return getRuleContext(StatementblockContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(KoordParser.DEDENT, 0); }
		public EventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).enterEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).exitEvent(this);
		}
	}

	public final EventContext event() throws RecognitionException {
		EventContext _localctx = new EventContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_event);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(VARNAME);
			setState(110);
			match(COLON);
			setState(111);
			match(NEWLINE);
			setState(112);
			match(INDENT);
			setState(113);
			match(PRE);
			setState(114);
			match(COLON);
			setState(115);
			expr();
			setState(116);
			match(NEWLINE);
			setState(117);
			match(EFF);
			setState(118);
			match(COLON);
			setState(119);
			match(NEWLINE);
			setState(120);
			statementblock();
			setState(121);
			match(DEDENT);
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

	public static class StatementblockContext extends ParserRuleContext {
		public TerminalNode INDENT() { return getToken(KoordParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(KoordParser.DEDENT, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StatementblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).enterStatementblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).exitStatementblock(this);
		}
	}

	public final StatementblockContext statementblock() throws RecognitionException {
		StatementblockContext _localctx = new StatementblockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statementblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(INDENT);
			setState(125); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(124);
				stmt();
				}
				}
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << ATOMIC) | (1L << VARNAME))) != 0) );
			setState(129);
			match(DEDENT);
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

	public static class StmtContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(KoordParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(KoordParser.NEWLINE, i);
		}
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public TerminalNode IF() { return getToken(KoordParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(KoordParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(KoordParser.COLON, i);
		}
		public List<StatementblockContext> statementblock() {
			return getRuleContexts(StatementblockContext.class);
		}
		public StatementblockContext statementblock(int i) {
			return getRuleContext(StatementblockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(KoordParser.ELSE, 0); }
		public TerminalNode ATOMIC() { return getToken(KoordParser.ATOMIC, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmt);
		int _la;
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				assign();
				setState(132);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				funccall();
				setState(135);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				match(IF);
				setState(138);
				expr();
				setState(139);
				match(COLON);
				setState(140);
				match(NEWLINE);
				setState(141);
				statementblock();
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(142);
					match(ELSE);
					setState(143);
					match(COLON);
					setState(144);
					match(NEWLINE);
					setState(145);
					statementblock();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				match(ATOMIC);
				setState(149);
				match(COLON);
				setState(150);
				match(NEWLINE);
				setState(151);
				statementblock();
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

	public static class FunccallContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(KoordParser.VARNAME, 0); }
		public TerminalNode LPAR() { return getToken(KoordParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(KoordParser.RPAR, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public FunccallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).enterFunccall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).exitFunccall(this);
		}
	}

	public final FunccallContext funccall() throws RecognitionException {
		FunccallContext _localctx = new FunccallContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funccall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(VARNAME);
			setState(155);
			match(LPAR);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << PID) | (1L << NUMAGENTS) | (1L << LPAR) | (1L << NOT) | (1L << VARNAME) | (1L << INUM) | (1L << FNUM) | (1L << MINUS) | (1L << STRING))) != 0)) {
				{
				setState(156);
				arglist();
				}
			}

			setState(159);
			match(RPAR);
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

	public static class ArglistContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KoordParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KoordParser.COMMA, i);
		}
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).enterArglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).exitArglist(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arglist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			expr();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(162);
				match(COMMA);
				setState(163);
				expr();
				}
				}
				setState(168);
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(KoordParser.VARNAME, 0); }
		public TerminalNode ASGN() { return getToken(KoordParser.ASGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(KoordParser.LBRACE, 0); }
		public AexprContext aexpr() {
			return getRuleContext(AexprContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(KoordParser.RBRACE, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(VARNAME);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(170);
				match(LBRACE);
				setState(171);
				aexpr(0);
				setState(172);
				match(RBRACE);
				}
			}

			setState(176);
			match(ASGN);
			setState(177);
			expr();
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

	public static class ExprContext extends ParserRuleContext {
		public AexprContext aexpr() {
			return getRuleContext(AexprContext.class,0);
		}
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				aexpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				bexpr(0);
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

	public static class BexprContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(KoordParser.NOT, 0); }
		public List<BexprContext> bexpr() {
			return getRuleContexts(BexprContext.class);
		}
		public BexprContext bexpr(int i) {
			return getRuleContext(BexprContext.class,i);
		}
		public TerminalNode LPAR() { return getToken(KoordParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(KoordParser.RPAR, 0); }
		public List<AexprContext> aexpr() {
			return getRuleContexts(AexprContext.class);
		}
		public AexprContext aexpr(int i) {
			return getRuleContext(AexprContext.class,i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public TerminalNode FALSE() { return getToken(KoordParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(KoordParser.TRUE, 0); }
		public TerminalNode VARNAME() { return getToken(KoordParser.VARNAME, 0); }
		public TerminalNode AND() { return getToken(KoordParser.AND, 0); }
		public TerminalNode OR() { return getToken(KoordParser.OR, 0); }
		public BexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).enterBexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).exitBexpr(this);
		}
	}

	public final BexprContext bexpr() throws RecognitionException {
		return bexpr(0);
	}

	private BexprContext bexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BexprContext _localctx = new BexprContext(_ctx, _parentState);
		BexprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_bexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(184);
				match(NOT);
				setState(185);
				bexpr(8);
				}
				break;
			case 2:
				{
				setState(186);
				match(LPAR);
				setState(187);
				bexpr(0);
				setState(188);
				match(RPAR);
				}
				break;
			case 3:
				{
				setState(190);
				aexpr(0);
				setState(191);
				relop();
				setState(192);
				aexpr(0);
				}
				break;
			case 4:
				{
				setState(194);
				match(FALSE);
				}
				break;
			case 5:
				{
				setState(195);
				match(TRUE);
				}
				break;
			case 6:
				{
				setState(196);
				match(VARNAME);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(205);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(199);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(200);
						match(AND);
						setState(201);
						bexpr(6);
						}
						break;
					case 2:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(202);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(203);
						match(OR);
						setState(204);
						bexpr(5);
						}
						break;
					}
					} 
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class AexprContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(KoordParser.LPAR, 0); }
		public List<AexprContext> aexpr() {
			return getRuleContexts(AexprContext.class);
		}
		public AexprContext aexpr(int i) {
			return getRuleContext(AexprContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(KoordParser.RPAR, 0); }
		public TerminalNode MINUS() { return getToken(KoordParser.MINUS, 0); }
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode VARNAME() { return getToken(KoordParser.VARNAME, 0); }
		public TerminalNode LBRACE() { return getToken(KoordParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(KoordParser.RBRACE, 0); }
		public TerminalNode NUMAGENTS() { return getToken(KoordParser.NUMAGENTS, 0); }
		public TerminalNode STRING() { return getToken(KoordParser.STRING, 0); }
		public TerminalNode TIMES() { return getToken(KoordParser.TIMES, 0); }
		public TerminalNode BY() { return getToken(KoordParser.BY, 0); }
		public TerminalNode PLUS() { return getToken(KoordParser.PLUS, 0); }
		public AexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).enterAexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).exitAexpr(this);
		}
	}

	public final AexprContext aexpr() throws RecognitionException {
		return aexpr(0);
	}

	private AexprContext aexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AexprContext _localctx = new AexprContext(_ctx, _parentState);
		AexprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_aexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(211);
				match(LPAR);
				setState(212);
				aexpr(0);
				setState(213);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(215);
				match(MINUS);
				setState(216);
				aexpr(9);
				}
				break;
			case 3:
				{
				setState(217);
				funccall();
				}
				break;
			case 4:
				{
				setState(218);
				number();
				}
				break;
			case 5:
				{
				setState(219);
				match(VARNAME);
				setState(220);
				match(LBRACE);
				setState(221);
				aexpr(0);
				setState(222);
				match(RBRACE);
				}
				break;
			case 6:
				{
				setState(224);
				match(NUMAGENTS);
				}
				break;
			case 7:
				{
				setState(225);
				match(STRING);
				}
				break;
			case 8:
				{
				setState(226);
				match(VARNAME);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(235);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new AexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_aexpr);
						setState(229);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(230);
						_la = _input.LA(1);
						if ( !(_la==TIMES || _la==BY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(231);
						aexpr(9);
						}
						break;
					case 2:
						{
						_localctx = new AexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_aexpr);
						setState(232);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(233);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(234);
						aexpr(8);
						}
						break;
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode FNUM() { return getToken(KoordParser.FNUM, 0); }
		public TerminalNode INUM() { return getToken(KoordParser.INUM, 0); }
		public TerminalNode PID() { return getToken(KoordParser.PID, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PID) | (1L << INUM) | (1L << FNUM))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class RelopContext extends ParserRuleContext {
		public TerminalNode LANGLE() { return getToken(KoordParser.LANGLE, 0); }
		public TerminalNode RANGLE() { return getToken(KoordParser.RANGLE, 0); }
		public TerminalNode GEQ() { return getToken(KoordParser.GEQ, 0); }
		public TerminalNode LEQ() { return getToken(KoordParser.LEQ, 0); }
		public TerminalNode EQ() { return getToken(KoordParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(KoordParser.NEQ, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).exitRelop(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LANGLE) | (1L << RANGLE) | (1L << EQ) | (1L << GEQ) | (1L << LEQ) | (1L << NEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(KoordParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(KoordParser.BOOL, 0); }
		public TerminalNode FLOAT() { return getToken(KoordParser.FLOAT, 0); }
		public TerminalNode POS() { return getToken(KoordParser.POS, 0); }
		public TerminalNode QUEUE() { return getToken(KoordParser.QUEUE, 0); }
		public TerminalNode STRINGTYPE() { return getToken(KoordParser.STRINGTYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUEUE) | (1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << STRINGTYPE) | (1L << POS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class DecblockContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(KoordParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(KoordParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(KoordParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(KoordParser.DEDENT, 0); }
		public TerminalNode ALLWRITE() { return getToken(KoordParser.ALLWRITE, 0); }
		public TerminalNode ALLREAD() { return getToken(KoordParser.ALLREAD, 0); }
		public TerminalNode LOCAL() { return getToken(KoordParser.LOCAL, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public DecblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).enterDecblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).exitDecblock(this);
		}
	}

	public final DecblockContext decblock() throws RecognitionException {
		DecblockContext _localctx = new DecblockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_decblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALLWRITE) | (1L << ALLREAD) | (1L << LOCAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(247);
			match(COLON);
			setState(248);
			match(NEWLINE);
			setState(249);
			match(INDENT);
			setState(251); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(250);
				decl();
				}
				}
				setState(253); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUEUE) | (1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << STRINGTYPE) | (1L << POS))) != 0) );
			setState(255);
			match(DEDENT);
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

	public static class DeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VARNAME() { return getToken(KoordParser.VARNAME, 0); }
		public TerminalNode NEWLINE() { return getToken(KoordParser.NEWLINE, 0); }
		public ArraydecContext arraydec() {
			return getRuleContext(ArraydecContext.class,0);
		}
		public TerminalNode ASGN() { return getToken(KoordParser.ASGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			type();
			setState(258);
			match(VARNAME);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(259);
				arraydec();
				}
			}

			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASGN) {
				{
				setState(262);
				match(ASGN);
				setState(263);
				expr();
				}
			}

			setState(266);
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

	public static class ArraydecContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(KoordParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(KoordParser.RBRACE, 0); }
		public ArraydecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraydec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).enterArraydec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).exitArraydec(this);
		}
	}

	public final ArraydecContext arraydec() throws RecognitionException {
		ArraydecContext _localctx = new ArraydecContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arraydec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(LBRACE);
			setState(269);
			match(RBRACE);
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

	public static class ModuleContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(KoordParser.USING, 0); }
		public TerminalNode MODULENAME() { return getToken(KoordParser.MODULENAME, 0); }
		public TerminalNode COLON() { return getToken(KoordParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(KoordParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(KoordParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(KoordParser.DEDENT, 0); }
		public List<ActuatordeclsContext> actuatordecls() {
			return getRuleContexts(ActuatordeclsContext.class);
		}
		public ActuatordeclsContext actuatordecls(int i) {
			return getRuleContext(ActuatordeclsContext.class,i);
		}
		public List<SensordeclsContext> sensordecls() {
			return getRuleContexts(SensordeclsContext.class);
		}
		public SensordeclsContext sensordecls(int i) {
			return getRuleContext(SensordeclsContext.class,i);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).exitModule(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(USING);
			setState(272);
			match(MODULENAME);
			setState(273);
			match(COLON);
			setState(274);
			match(NEWLINE);
			setState(275);
			match(INDENT);
			setState(278); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(278);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ACTUATORS:
					{
					setState(276);
					actuatordecls();
					}
					break;
				case SENSORS:
					{
					setState(277);
					sensordecls();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(280); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ACTUATORS || _la==SENSORS );
			setState(282);
			match(DEDENT);
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

	public static class ActuatordeclsContext extends ParserRuleContext {
		public TerminalNode ACTUATORS() { return getToken(KoordParser.ACTUATORS, 0); }
		public TerminalNode COLON() { return getToken(KoordParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(KoordParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(KoordParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(KoordParser.DEDENT, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public ActuatordeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actuatordecls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).enterActuatordecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).exitActuatordecls(this);
		}
	}

	public final ActuatordeclsContext actuatordecls() throws RecognitionException {
		ActuatordeclsContext _localctx = new ActuatordeclsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_actuatordecls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(ACTUATORS);
			setState(285);
			match(COLON);
			setState(286);
			match(NEWLINE);
			setState(287);
			match(INDENT);
			setState(289); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(288);
				decl();
				}
				}
				setState(291); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUEUE) | (1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << STRINGTYPE) | (1L << POS))) != 0) );
			setState(293);
			match(DEDENT);
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

	public static class SensordeclsContext extends ParserRuleContext {
		public TerminalNode SENSORS() { return getToken(KoordParser.SENSORS, 0); }
		public TerminalNode COLON() { return getToken(KoordParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(KoordParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(KoordParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(KoordParser.DEDENT, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public SensordeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sensordecls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).enterSensordecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).exitSensordecls(this);
		}
	}

	public final SensordeclsContext sensordecls() throws RecognitionException {
		SensordeclsContext _localctx = new SensordeclsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_sensordecls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(SENSORS);
			setState(296);
			match(COLON);
			setState(297);
			match(NEWLINE);
			setState(298);
			match(INDENT);
			setState(300); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(299);
				decl();
				}
				}
				setState(302); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUEUE) | (1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << STRINGTYPE) | (1L << POS))) != 0) );
			setState(304);
			match(DEDENT);
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

	public static class InitContext extends ParserRuleContext {
		public TerminalNode INIT() { return getToken(KoordParser.INIT, 0); }
		public TerminalNode COLON() { return getToken(KoordParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(KoordParser.NEWLINE, 0); }
		public StatementblockContext statementblock() {
			return getRuleContext(StatementblockContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoordListener ) ((KoordListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(INIT);
			setState(307);
			match(COLON);
			setState(308);
			match(NEWLINE);
			setState(309);
			statementblock();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return bexpr_sempred((BexprContext)_localctx, predIndex);
		case 14:
			return aexpr_sempred((AexprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean bexpr_sempred(BexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean aexpr_sempred(AexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3C\u013a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\3\6\38\n\3\r\3\16\39\3\4\3\4\7\4>\n\4\f\4\16\4A\13"+
		"\4\3\4\7\4D\n\4\f\4\16\4G\13\4\3\4\5\4J\n\4\3\4\6\4M\n\4\r\4\16\4N\3\4"+
		"\3\4\3\5\7\5T\n\5\f\5\16\5W\13\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6_\n\6\f\6"+
		"\16\6b\13\6\5\6d\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\6\t\u0080\n\t\r"+
		"\t\16\t\u0081\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u0095\n\n\3\n\3\n\3\n\3\n\5\n\u009b\n\n\3\13\3\13\3\13"+
		"\5\13\u00a0\n\13\3\13\3\13\3\f\3\f\3\f\7\f\u00a7\n\f\f\f\16\f\u00aa\13"+
		"\f\3\r\3\r\3\r\3\r\3\r\5\r\u00b1\n\r\3\r\3\r\3\r\3\16\3\16\5\16\u00b8"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00c8\n\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00d0\n\17\f"+
		"\17\16\17\u00d3\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00e6\n\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\7\20\u00ee\n\20\f\20\16\20\u00f1\13\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\6\24\u00fe\n\24\r\24\16\24\u00ff\3"+
		"\24\3\24\3\25\3\25\3\25\5\25\u0107\n\25\3\25\3\25\5\25\u010b\n\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\6\27\u0119\n\27"+
		"\r\27\16\27\u011a\3\27\3\27\3\30\3\30\3\30\3\30\3\30\6\30\u0124\n\30\r"+
		"\30\16\30\u0125\3\30\3\30\3\31\3\31\3\31\3\31\3\31\6\31\u012f\n\31\r\31"+
		"\16\31\u0130\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\2\4\34\36\33\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\t\t\2\4\5\7\t\13"+
		"\26\30\30\32\60\62=?C\3\2\678\3\2\65\66\4\2!!\63\64\4\2,-9<\4\2\22\22"+
		"\24\30\3\2\r\17\2\u0148\2\64\3\2\2\2\4\67\3\2\2\2\6;\3\2\2\2\bU\3\2\2"+
		"\2\nX\3\2\2\2\fl\3\2\2\2\16o\3\2\2\2\20}\3\2\2\2\22\u009a\3\2\2\2\24\u009c"+
		"\3\2\2\2\26\u00a3\3\2\2\2\30\u00ab\3\2\2\2\32\u00b7\3\2\2\2\34\u00c7\3"+
		"\2\2\2\36\u00e5\3\2\2\2 \u00f2\3\2\2\2\"\u00f4\3\2\2\2$\u00f6\3\2\2\2"+
		"&\u00f8\3\2\2\2(\u0103\3\2\2\2*\u010e\3\2\2\2,\u0111\3\2\2\2.\u011e\3"+
		"\2\2\2\60\u0129\3\2\2\2\62\u0134\3\2\2\2\64\65\t\2\2\2\65\3\3\2\2\2\66"+
		"8\5\2\2\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:\5\3\2\2\2;?\5"+
		"\b\5\2<>\5,\27\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@E\3\2\2\2A?\3"+
		"\2\2\2BD\5&\24\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FI\3\2\2\2GE\3"+
		"\2\2\2HJ\5\62\32\2IH\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KM\5\16\b\2LK\3\2\2\2"+
		"MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\7\2\2\3Q\7\3\2\2\2RT\5\n\6"+
		"\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\t\3\2\2\2WU\3\2\2\2XY\7\7"+
		"\2\2YZ\7\62\2\2Zc\7&\2\2[`\5\f\7\2\\]\7$\2\2]_\5\f\7\2^\\\3\2\2\2_b\3"+
		"\2\2\2`^\3\2\2\2`a\3\2\2\2ad\3\2\2\2b`\3\2\2\2c[\3\2\2\2cd\3\2\2\2de\3"+
		"\2\2\2ef\7\'\2\2fg\7\3\2\2gh\5$\23\2hi\7#\2\2ij\7?\2\2jk\5\20\t\2k\13"+
		"\3\2\2\2lm\5$\23\2mn\7\62\2\2n\r\3\2\2\2op\7\62\2\2pq\7#\2\2qr\7?\2\2"+
		"rs\7A\2\2st\7\35\2\2tu\7#\2\2uv\5\32\16\2vw\7?\2\2wx\7\36\2\2xy\7#\2\2"+
		"yz\7?\2\2z{\5\20\t\2{|\7B\2\2|\17\3\2\2\2}\177\7A\2\2~\u0080\5\22\n\2"+
		"\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2"+
		"\2\u0082\u0083\3\2\2\2\u0083\u0084\7B\2\2\u0084\21\3\2\2\2\u0085\u0086"+
		"\5\30\r\2\u0086\u0087\7?\2\2\u0087\u009b\3\2\2\2\u0088\u0089\5\24\13\2"+
		"\u0089\u008a\7?\2\2\u008a\u009b\3\2\2\2\u008b\u008c\7\32\2\2\u008c\u008d"+
		"\5\32\16\2\u008d\u008e\7#\2\2\u008e\u008f\7?\2\2\u008f\u0094\5\20\t\2"+
		"\u0090\u0091\7\33\2\2\u0091\u0092\7#\2\2\u0092\u0093\7?\2\2\u0093\u0095"+
		"\5\20\t\2\u0094\u0090\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u009b\3\2\2\2"+
		"\u0096\u0097\7\34\2\2\u0097\u0098\7#\2\2\u0098\u0099\7?\2\2\u0099\u009b"+
		"\5\20\t\2\u009a\u0085\3\2\2\2\u009a\u0088\3\2\2\2\u009a\u008b\3\2\2\2"+
		"\u009a\u0096\3\2\2\2\u009b\23\3\2\2\2\u009c\u009d\7\62\2\2\u009d\u009f"+
		"\7&\2\2\u009e\u00a0\5\26\f\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a2\7\'\2\2\u00a2\25\3\2\2\2\u00a3\u00a8\5\32\16"+
		"\2\u00a4\u00a5\7$\2\2\u00a5\u00a7\5\32\16\2\u00a6\u00a4\3\2\2\2\u00a7"+
		"\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\27\3\2\2"+
		"\2\u00aa\u00a8\3\2\2\2\u00ab\u00b0\7\62\2\2\u00ac\u00ad\7(\2\2\u00ad\u00ae"+
		"\5\36\20\2\u00ae\u00af\7)\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ac\3\2\2\2"+
		"\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\7=\2\2\u00b3\u00b4"+
		"\5\32\16\2\u00b4\31\3\2\2\2\u00b5\u00b8\5\36\20\2\u00b6\u00b8\5\34\17"+
		"\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\33\3\2\2\2\u00b9\u00ba"+
		"\b\17\1\2\u00ba\u00bb\7\60\2\2\u00bb\u00c8\5\34\17\n\u00bc\u00bd\7&\2"+
		"\2\u00bd\u00be\5\34\17\2\u00be\u00bf\7\'\2\2\u00bf\u00c8\3\2\2\2\u00c0"+
		"\u00c1\5\36\20\2\u00c1\u00c2\5\"\22\2\u00c2\u00c3\5\36\20\2\u00c3\u00c8"+
		"\3\2\2\2\u00c4\u00c8\7 \2\2\u00c5\u00c8\7\37\2\2\u00c6\u00c8\7\62\2\2"+
		"\u00c7\u00b9\3\2\2\2\u00c7\u00bc\3\2\2\2\u00c7\u00c0\3\2\2\2\u00c7\u00c4"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00d1\3\2\2\2\u00c9"+
		"\u00ca\f\7\2\2\u00ca\u00cb\7.\2\2\u00cb\u00d0\5\34\17\b\u00cc\u00cd\f"+
		"\6\2\2\u00cd\u00ce\7/\2\2\u00ce\u00d0\5\34\17\7\u00cf\u00c9\3\2\2\2\u00cf"+
		"\u00cc\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\35\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\b\20\1\2\u00d5\u00d6"+
		"\7&\2\2\u00d6\u00d7\5\36\20\2\u00d7\u00d8\7\'\2\2\u00d8\u00e6\3\2\2\2"+
		"\u00d9\u00da\7\66\2\2\u00da\u00e6\5\36\20\13\u00db\u00e6\5\24\13\2\u00dc"+
		"\u00e6\5 \21\2\u00dd\u00de\7\62\2\2\u00de\u00df\7(\2\2\u00df\u00e0\5\36"+
		"\20\2\u00e0\u00e1\7)\2\2\u00e1\u00e6\3\2\2\2\u00e2\u00e6\7\"\2\2\u00e3"+
		"\u00e6\7>\2\2\u00e4\u00e6\7\62\2\2\u00e5\u00d4\3\2\2\2\u00e5\u00d9\3\2"+
		"\2\2\u00e5\u00db\3\2\2\2\u00e5\u00dc\3\2\2\2\u00e5\u00dd\3\2\2\2\u00e5"+
		"\u00e2\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00ef\3\2"+
		"\2\2\u00e7\u00e8\f\n\2\2\u00e8\u00e9\t\3\2\2\u00e9\u00ee\5\36\20\13\u00ea"+
		"\u00eb\f\t\2\2\u00eb\u00ec\t\4\2\2\u00ec\u00ee\5\36\20\n\u00ed\u00e7\3"+
		"\2\2\2\u00ed\u00ea\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\37\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\t\5\2"+
		"\2\u00f3!\3\2\2\2\u00f4\u00f5\t\6\2\2\u00f5#\3\2\2\2\u00f6\u00f7\t\7\2"+
		"\2\u00f7%\3\2\2\2\u00f8\u00f9\t\b\2\2\u00f9\u00fa\7#\2\2\u00fa\u00fb\7"+
		"?\2\2\u00fb\u00fd\7A\2\2\u00fc\u00fe\5(\25\2\u00fd\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101\u0102\7B\2\2\u0102\'\3\2\2\2\u0103\u0104\5$\23\2\u0104\u0106"+
		"\7\62\2\2\u0105\u0107\5*\26\2\u0106\u0105\3\2\2\2\u0106\u0107\3\2\2\2"+
		"\u0107\u010a\3\2\2\2\u0108\u0109\7=\2\2\u0109\u010b\5\32\16\2\u010a\u0108"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\7?\2\2\u010d"+
		")\3\2\2\2\u010e\u010f\7(\2\2\u010f\u0110\7)\2\2\u0110+\3\2\2\2\u0111\u0112"+
		"\7\6\2\2\u0112\u0113\7\61\2\2\u0113\u0114\7#\2\2\u0114\u0115\7?\2\2\u0115"+
		"\u0118\7A\2\2\u0116\u0119\5.\30\2\u0117\u0119\5\60\31\2\u0118\u0116\3"+
		"\2\2\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\7B\2\2\u011d-\3\2\2\2\u011e"+
		"\u011f\7\13\2\2\u011f\u0120\7#\2\2\u0120\u0121\7?\2\2\u0121\u0123\7A\2"+
		"\2\u0122\u0124\5(\25\2\u0123\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0123"+
		"\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\7B\2\2\u0128"+
		"/\3\2\2\2\u0129\u012a\7\f\2\2\u012a\u012b\7#\2\2\u012b\u012c\7?\2\2\u012c"+
		"\u012e\7A\2\2\u012d\u012f\5(\25\2\u012e\u012d\3\2\2\2\u012f\u0130\3\2"+
		"\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0133\7B\2\2\u0133\61\3\2\2\2\u0134\u0135\7\23\2\2\u0135\u0136\7#\2\2"+
		"\u0136\u0137\7?\2\2\u0137\u0138\5\20\t\2\u0138\63\3\2\2\2\369?EINU`c\u0081"+
		"\u0094\u009a\u009f\u00a8\u00b0\u00b7\u00c7\u00cf\u00d1\u00e5\u00ed\u00ef"+
		"\u00ff\u0106\u010a\u0118\u011a\u0125\u0130";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}