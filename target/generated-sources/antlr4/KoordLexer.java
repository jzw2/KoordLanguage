// Generated from /Users/johnwang/Desktop/koord/src/main/antlr4/Koord.g4 by ANTLR 4.7.2

  import java.util.*;             

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KoordLexer extends Lexer {
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
		SKIP_=62;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ARROW", "AGENT", "MODULE", "USING", "DEF", "TYPE", "FUN", "ADT", "ACTUATORS", 
			"SENSORS", "ALLWRITE", "ALLREAD", "LOCAL", "LIST", "MAP", "QUEUE", "INIT", 
			"INT", "FLOAT", "BOOL", "STRINGTYPE", "POS", "INPUTMAP", "IF", "ELSE", 
			"ATOMIC", "PRE", "EFF", "TRUE", "FALSE", "PID", "NUMAGENTS", "COLON", 
			"COMMA", "SEMICOLON", "LPAR", "RPAR", "LBRACE", "RBRACE", "LCURLY", "RCURLY", 
			"LANGLE", "RANGLE", "AND", "OR", "NOT", "LID", "CID", "MODULENAME", "VARNAME", 
			"INUM", "FNUM", "PLUS", "MINUS", "TIMES", "BY", "EQ", "GEQ", "LEQ", "NEQ", 
			"ASGN", "STRING", "NEWLINE", "SKIP_", "WS"
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
			"ASGN", "STRING", "NEWLINE", "SKIP_"
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

	 //this must be put on the top, and not after the grammar rules
	                
	  private int prevNumSpaces = 0;             
	  private Queue<Token> tokens = new LinkedList<>();
	  private Deque<Integer> spaces = new LinkedList<>();

	  @Override
	  public void emit(Token t) {
	    super.setToken(t);
	    //System.out.println("added token" + t.toString());
	    tokens.offer(t);
	  }

	  private CommonToken commonToken(int type, String text) {
	    int stop = this.getCharIndex() - 1;
	    int start = text.isEmpty() ? stop : stop - text.length() + 1;
	    CommonToken t = new CommonToken(this._tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, start, stop);
	    t.setText(text);
	    return t;
	  }
	  @Override
	  public Token nextToken() {
	    if (_input.LA(1) == EOF && !spaces.isEmpty()) {
	        if (spaces.peek() != 0) {

	            emit(commonToken(KoordParser.NEWLINE, "<newline>"));
	            while (spaces.peek() != 0) {
	                spaces.poll();
	                emit(commonToken(KoordParser.DEDENT, "dedent"));
	            }
	        }
	    }
	    Token next = super.nextToken();
	    return tokens.isEmpty() ? next : tokens.poll();
	  }


	public KoordLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Koord.g4"; }

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
		case 62:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			      if (spaces.isEmpty()) {
			        spaces.push(0);
			      }
			      Integer numSpaces = (int) getText().chars().filter(x -> x == ' ').count();
			      if (_input.LA(1) != '\n')            {
			        emit(commonToken(NEWLINE, "<newline>"));

			        if (numSpaces > spaces.peek()) {
			            emit(commonToken(KoordParser.INDENT, "<indent>"));
			            spaces.push(numSpaces);
			        } else if (spaces.peek() > numSpaces ) {
			          while (spaces.peek() > numSpaces) {

			            emit(commonToken(KoordParser.DEDENT, "<dedent>"));
			            spaces.pop();
			          }
			        } 
			      } else {
			        skip();
			      }
			   
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2@\u01b9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3"+
		")\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3-\3-\5-\u0159\n-\3.\3.\3.\3.\5.\u015f"+
		"\n.\3/\3/\3\60\3\60\7\60\u0165\n\60\f\60\16\60\u0168\13\60\3\61\3\61\7"+
		"\61\u016c\n\61\f\61\16\61\u016f\13\61\3\62\3\62\3\63\3\63\3\63\3\63\3"+
		"\63\5\63\u0178\n\63\3\64\6\64\u017b\n\64\r\64\16\64\u017c\3\65\6\65\u0180"+
		"\n\65\r\65\16\65\u0181\3\65\3\65\6\65\u0186\n\65\r\65\16\65\u0187\5\65"+
		"\u018a\n\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3"+
		"<\3=\3=\3=\3>\3>\3?\3?\7?\u01a4\n?\f?\16?\u01a7\13?\3?\3?\3@\3@\5@\u01ad"+
		"\n@\3@\3@\3A\3A\3A\3A\3B\6B\u01b6\nB\rB\16B\u01b7\3\u01a5\2C\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\2a\2c\61e\62g\63i\64k\65m\66o\67q8s9u"+
		":w;y<{=}>\177?\u0081@\u0083\2\3\2\b\3\2c|\5\2\62;C\\c|\3\2C\\\3\2\62;"+
		"\3\2\60\60\4\2\13\13\"\"\2\u01c1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y"+
		"\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\3\u0085\3"+
		"\2\2\2\5\u0088\3\2\2\2\7\u008e\3\2\2\2\t\u0095\3\2\2\2\13\u009b\3\2\2"+
		"\2\r\u009f\3\2\2\2\17\u00a4\3\2\2\2\21\u00a8\3\2\2\2\23\u00ac\3\2\2\2"+
		"\25\u00b6\3\2\2\2\27\u00be\3\2\2\2\31\u00c7\3\2\2\2\33\u00cf\3\2\2\2\35"+
		"\u00d5\3\2\2\2\37\u00da\3\2\2\2!\u00de\3\2\2\2#\u00e4\3\2\2\2%\u00e9\3"+
		"\2\2\2\'\u00ed\3\2\2\2)\u00f3\3\2\2\2+\u00fb\3\2\2\2-\u0102\3\2\2\2/\u0106"+
		"\3\2\2\2\61\u010f\3\2\2\2\63\u0112\3\2\2\2\65\u0117\3\2\2\2\67\u011e\3"+
		"\2\2\29\u0122\3\2\2\2;\u0126\3\2\2\2=\u012b\3\2\2\2?\u0131\3\2\2\2A\u0135"+
		"\3\2\2\2C\u013d\3\2\2\2E\u013f\3\2\2\2G\u0141\3\2\2\2I\u0143\3\2\2\2K"+
		"\u0145\3\2\2\2M\u0147\3\2\2\2O\u0149\3\2\2\2Q\u014b\3\2\2\2S\u014d\3\2"+
		"\2\2U\u014f\3\2\2\2W\u0151\3\2\2\2Y\u0158\3\2\2\2[\u015e\3\2\2\2]\u0160"+
		"\3\2\2\2_\u0162\3\2\2\2a\u0169\3\2\2\2c\u0170\3\2\2\2e\u0177\3\2\2\2g"+
		"\u017a\3\2\2\2i\u017f\3\2\2\2k\u018b\3\2\2\2m\u018d\3\2\2\2o\u018f\3\2"+
		"\2\2q\u0191\3\2\2\2s\u0193\3\2\2\2u\u0196\3\2\2\2w\u0199\3\2\2\2y\u019c"+
		"\3\2\2\2{\u019f\3\2\2\2}\u01a1\3\2\2\2\177\u01aa\3\2\2\2\u0081\u01b0\3"+
		"\2\2\2\u0083\u01b5\3\2\2\2\u0085\u0086\7/\2\2\u0086\u0087\7@\2\2\u0087"+
		"\4\3\2\2\2\u0088\u0089\7c\2\2\u0089\u008a\7i\2\2\u008a\u008b\7g\2\2\u008b"+
		"\u008c\7p\2\2\u008c\u008d\7v\2\2\u008d\6\3\2\2\2\u008e\u008f\7o\2\2\u008f"+
		"\u0090\7q\2\2\u0090\u0091\7f\2\2\u0091\u0092\7w\2\2\u0092\u0093\7n\2\2"+
		"\u0093\u0094\7g\2\2\u0094\b\3\2\2\2\u0095\u0096\7w\2\2\u0096\u0097\7u"+
		"\2\2\u0097\u0098\7k\2\2\u0098\u0099\7p\2\2\u0099\u009a\7i\2\2\u009a\n"+
		"\3\2\2\2\u009b\u009c\7f\2\2\u009c\u009d\7g\2\2\u009d\u009e\7h\2\2\u009e"+
		"\f\3\2\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1\7{\2\2\u00a1\u00a2\7r\2\2\u00a2"+
		"\u00a3\7g\2\2\u00a3\16\3\2\2\2\u00a4\u00a5\7h\2\2\u00a5\u00a6\7w\2\2\u00a6"+
		"\u00a7\7p\2\2\u00a7\20\3\2\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7f\2\2\u00aa"+
		"\u00ab\7v\2\2\u00ab\22\3\2\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7e\2\2\u00ae"+
		"\u00af\7v\2\2\u00af\u00b0\7w\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7v\2\2"+
		"\u00b2\u00b3\7q\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7u\2\2\u00b5\24\3\2"+
		"\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7p\2\2\u00b9\u00ba"+
		"\7u\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7u\2\2\u00bd"+
		"\26\3\2\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7n\2\2\u00c1"+
		"\u00c2\7y\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7v\2\2"+
		"\u00c5\u00c6\7g\2\2\u00c6\30\3\2\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7"+
		"n\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd"+
		"\7c\2\2\u00cd\u00ce\7f\2\2\u00ce\32\3\2\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1"+
		"\7q\2\2\u00d1\u00d2\7e\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7n\2\2\u00d4"+
		"\34\3\2\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7u\2\2\u00d8"+
		"\u00d9\7v\2\2\u00d9\36\3\2\2\2\u00da\u00db\7o\2\2\u00db\u00dc\7c\2\2\u00dc"+
		"\u00dd\7r\2\2\u00dd \3\2\2\2\u00de\u00df\7s\2\2\u00df\u00e0\7w\2\2\u00e0"+
		"\u00e1\7g\2\2\u00e1\u00e2\7w\2\2\u00e2\u00e3\7g\2\2\u00e3\"\3\2\2\2\u00e4"+
		"\u00e5\7k\2\2\u00e5\u00e6\7p\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7v\2\2"+
		"\u00e8$\3\2\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec\7v\2"+
		"\2\u00ec&\3\2\2\2\u00ed\u00ee\7h\2\2\u00ee\u00ef\7n\2\2\u00ef\u00f0\7"+
		"q\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7v\2\2\u00f2(\3\2\2\2\u00f3\u00f4"+
		"\7d\2\2\u00f4\u00f5\7q\2\2\u00f5\u00f6\7q\2\2\u00f6\u00f7\7n\2\2\u00f7"+
		"\u00f8\7g\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa\7p\2\2\u00fa*\3\2\2\2\u00fb"+
		"\u00fc\7u\2\2\u00fc\u00fd\7v\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff\7k\2\2"+
		"\u00ff\u0100\7p\2\2\u0100\u0101\7i\2\2\u0101,\3\2\2\2\u0102\u0103\7r\2"+
		"\2\u0103\u0104\7q\2\2\u0104\u0105\7u\2\2\u0105.\3\2\2\2\u0106\u0107\7"+
		"k\2\2\u0107\u0108\7p\2\2\u0108\u0109\7r\2\2\u0109\u010a\7w\2\2\u010a\u010b"+
		"\7v\2\2\u010b\u010c\7O\2\2\u010c\u010d\7c\2\2\u010d\u010e\7r\2\2\u010e"+
		"\60\3\2\2\2\u010f\u0110\7k\2\2\u0110\u0111\7h\2\2\u0111\62\3\2\2\2\u0112"+
		"\u0113\7g\2\2\u0113\u0114\7n\2\2\u0114\u0115\7u\2\2\u0115\u0116\7g\2\2"+
		"\u0116\64\3\2\2\2\u0117\u0118\7c\2\2\u0118\u0119\7v\2\2\u0119\u011a\7"+
		"q\2\2\u011a\u011b\7o\2\2\u011b\u011c\7k\2\2\u011c\u011d\7e\2\2\u011d\66"+
		"\3\2\2\2\u011e\u011f\7r\2\2\u011f\u0120\7t\2\2\u0120\u0121\7g\2\2\u0121"+
		"8\3\2\2\2\u0122\u0123\7g\2\2\u0123\u0124\7h\2\2\u0124\u0125\7h\2\2\u0125"+
		":\3\2\2\2\u0126\u0127\7v\2\2\u0127\u0128\7t\2\2\u0128\u0129\7w\2\2\u0129"+
		"\u012a\7g\2\2\u012a<\3\2\2\2\u012b\u012c\7h\2\2\u012c\u012d\7c\2\2\u012d"+
		"\u012e\7n\2\2\u012e\u012f\7u\2\2\u012f\u0130\7g\2\2\u0130>\3\2\2\2\u0131"+
		"\u0132\7r\2\2\u0132\u0133\7k\2\2\u0133\u0134\7f\2\2\u0134@\3\2\2\2\u0135"+
		"\u0136\7p\2\2\u0136\u0137\7w\2\2\u0137\u0138\7o\2\2\u0138\u0139\7D\2\2"+
		"\u0139\u013a\7q\2\2\u013a\u013b\7v\2\2\u013b\u013c\7u\2\2\u013cB\3\2\2"+
		"\2\u013d\u013e\7<\2\2\u013eD\3\2\2\2\u013f\u0140\7.\2\2\u0140F\3\2\2\2"+
		"\u0141\u0142\7=\2\2\u0142H\3\2\2\2\u0143\u0144\7*\2\2\u0144J\3\2\2\2\u0145"+
		"\u0146\7+\2\2\u0146L\3\2\2\2\u0147\u0148\7]\2\2\u0148N\3\2\2\2\u0149\u014a"+
		"\7_\2\2\u014aP\3\2\2\2\u014b\u014c\7}\2\2\u014cR\3\2\2\2\u014d\u014e\7"+
		"\177\2\2\u014eT\3\2\2\2\u014f\u0150\7>\2\2\u0150V\3\2\2\2\u0151\u0152"+
		"\7@\2\2\u0152X\3\2\2\2\u0153\u0154\7(\2\2\u0154\u0159\7(\2\2\u0155\u0156"+
		"\7c\2\2\u0156\u0157\7p\2\2\u0157\u0159\7f\2\2\u0158\u0153\3\2\2\2\u0158"+
		"\u0155\3\2\2\2\u0159Z\3\2\2\2\u015a\u015b\7~\2\2\u015b\u015f\7~\2\2\u015c"+
		"\u015d\7q\2\2\u015d\u015f\7t\2\2\u015e\u015a\3\2\2\2\u015e\u015c\3\2\2"+
		"\2\u015f\\\3\2\2\2\u0160\u0161\7#\2\2\u0161^\3\2\2\2\u0162\u0166\t\2\2"+
		"\2\u0163\u0165\t\3\2\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164"+
		"\3\2\2\2\u0166\u0167\3\2\2\2\u0167`\3\2\2\2\u0168\u0166\3\2\2\2\u0169"+
		"\u016d\t\4\2\2\u016a\u016c\t\3\2\2\u016b\u016a\3\2\2\2\u016c\u016f\3\2"+
		"\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016eb\3\2\2\2\u016f\u016d"+
		"\3\2\2\2\u0170\u0171\5a\61\2\u0171d\3\2\2\2\u0172\u0178\5_\60\2\u0173"+
		"\u0174\5a\61\2\u0174\u0175\7\60\2\2\u0175\u0176\5_\60\2\u0176\u0178\3"+
		"\2\2\2\u0177\u0172\3\2\2\2\u0177\u0173\3\2\2\2\u0178f\3\2\2\2\u0179\u017b"+
		"\t\5\2\2\u017a\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017a\3\2\2\2\u017c"+
		"\u017d\3\2\2\2\u017dh\3\2\2\2\u017e\u0180\t\5\2\2\u017f\u017e\3\2\2\2"+
		"\u0180\u0181\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0189"+
		"\3\2\2\2\u0183\u0185\t\6\2\2\u0184\u0186\t\5\2\2\u0185\u0184\3\2\2\2\u0186"+
		"\u0187\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2"+
		"\2\2\u0189\u0183\3\2\2\2\u0189\u018a\3\2\2\2\u018aj\3\2\2\2\u018b\u018c"+
		"\7-\2\2\u018cl\3\2\2\2\u018d\u018e\7/\2\2\u018en\3\2\2\2\u018f\u0190\7"+
		",\2\2\u0190p\3\2\2\2\u0191\u0192\7\61\2\2\u0192r\3\2\2\2\u0193\u0194\7"+
		"?\2\2\u0194\u0195\7?\2\2\u0195t\3\2\2\2\u0196\u0197\7@\2\2\u0197\u0198"+
		"\7?\2\2\u0198v\3\2\2\2\u0199\u019a\7>\2\2\u019a\u019b\7?\2\2\u019bx\3"+
		"\2\2\2\u019c\u019d\7#\2\2\u019d\u019e\7?\2\2\u019ez\3\2\2\2\u019f\u01a0"+
		"\7?\2\2\u01a0|\3\2\2\2\u01a1\u01a5\7$\2\2\u01a2\u01a4\13\2\2\2\u01a3\u01a2"+
		"\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6"+
		"\u01a8\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01a9\7$\2\2\u01a9~\3\2\2\2\u01aa"+
		"\u01ac\7\f\2\2\u01ab\u01ad\5\u0083B\2\u01ac\u01ab\3\2\2\2\u01ac\u01ad"+
		"\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\b@\2\2\u01af\u0080\3\2\2\2\u01b0"+
		"\u01b1\5\u0083B\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\bA\3\2\u01b3\u0082\3"+
		"\2\2\2\u01b4\u01b6\t\7\2\2\u01b5\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7"+
		"\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u0084\3\2\2\2\17\2\u0158\u015e"+
		"\u0166\u016d\u0177\u017c\u0181\u0187\u0189\u01a5\u01ac\u01b7\4\3@\2\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}