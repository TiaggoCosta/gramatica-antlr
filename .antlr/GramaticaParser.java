// Generated from c:\Users\Tiago\OneDrive\Documents\vscode\java\gramatica-antlr\Gramatica.g by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, INT=17, 
		VAR=18, WS=19;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_comandos = 2, RULE_comando = 3, RULE_iteracao = 4, 
		RULE_teste = 5, RULE_teste2 = 6, RULE_expr = 7, RULE_rel = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "comandos", "comando", "iteracao", "teste", "teste2", 
			"expr", "rel"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'while'", "'do'", "'if'", "'then'", "'else'", "'+'", "'-'", 
			"'*'", "'/'", "'='", "'<>'", "'<'", "'>'", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "INT", "VAR", "WS"
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
	public String getGrammarFileName() { return "Gramatica.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GramaticaParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==T__3) {
				{
				{
				setState(18);
				stat();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
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

	public static class StatContext extends ParserRuleContext {
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			comandos();
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

	public static class ComandosContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comandos);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(31); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(28);
					comando();
					setState(29);
					match(T__0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(33); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ComandoContext extends ParserRuleContext {
		public IteracaoContext iteracao() {
			return getRuleContext(IteracaoContext.class,0);
		}
		public TesteContext teste() {
			return getRuleContext(TesteContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comando);
		try {
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				iteracao();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				teste();
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

	public static class IteracaoContext extends ParserRuleContext {
		public RelContext e;
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public RelContext rel() {
			return getRuleContext(RelContext.class,0);
		}
		public IteracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteracao; }
	}

	public final IteracaoContext iteracao() throws RecognitionException {
		IteracaoContext _localctx = new IteracaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_iteracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__1);
			setState(40);
			((IteracaoContext)_localctx).e = rel();
			System.out.println("Resultado relacional: " + ((IteracaoContext)_localctx).e.t);
			setState(42);
			match(T__2);
			setState(43);
			comandos();
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

	public static class TesteContext extends ParserRuleContext {
		public Teste2Context teste2() {
			return getRuleContext(Teste2Context.class,0);
		}
		public RelContext rel() {
			return getRuleContext(RelContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TesteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_teste; }
	}

	public final TesteContext teste() throws RecognitionException {
		TesteContext _localctx = new TesteContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_teste);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(45);
			match(T__3);
			setState(46);
			rel();
			setState(47);
			match(T__4);
			setState(48);
			comandos();
			}
			setState(50);
			teste2();
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

	public static class Teste2Context extends ParserRuleContext {
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Teste2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_teste2; }
	}

	public final Teste2Context teste2() throws RecognitionException {
		Teste2Context _localctx = new Teste2Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_teste2);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(52);
				match(T__5);
				setState(53);
				comandos();
				}
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExprContext extends ParserRuleContext {
		public double v;
		public Token INT;
		public ExprContext e;
		public TerminalNode INT() { return getToken(GramaticaParser.INT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			((ExprContext)_localctx).INT = match(INT);
			((ExprContext)_localctx).v =  Double.parseDouble( (((ExprContext)_localctx).INT!=null?((ExprContext)_localctx).INT.getText():null));
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(59);
				match(T__6);
				setState(60);
				((ExprContext)_localctx).e = expr();
				_localctx.v += ((ExprContext)_localctx).e.v;
				}
				break;
			case T__7:
				{
				setState(63);
				match(T__7);
				setState(64);
				((ExprContext)_localctx).e = expr();
				_localctx.v -= ((ExprContext)_localctx).e.v;
				}
				break;
			case T__8:
				{
				setState(67);
				match(T__8);
				setState(68);
				((ExprContext)_localctx).e = expr();
				_localctx.v *= ((ExprContext)_localctx).e.v;
				}
				break;
			case T__9:
				{
				setState(71);
				match(T__9);
				setState(72);
				((ExprContext)_localctx).e = expr();
				_localctx.v /= ((ExprContext)_localctx).e.v;
				}
				break;
			case T__2:
			case T__4:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
				{
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

	public static class RelContext extends ParserRuleContext {
		public boolean t;
		public ExprContext d;
		public ExprContext e;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel; }
	}

	public final RelContext rel() throws RecognitionException {
		RelContext _localctx = new RelContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(78);
			((RelContext)_localctx).d = expr();
			System.out.println("Resultado: " + ((RelContext)_localctx).d.v);
			}
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				{
				setState(81);
				match(T__10);
				setState(82);
				((RelContext)_localctx).e = expr();
				System.out.println("Lido '='");
				System.out.println("Resultado: " + ((RelContext)_localctx).e.v);
				((RelContext)_localctx).t =  ((RelContext)_localctx).d.v == ((RelContext)_localctx).e.v;
				}
				break;
			case T__11:
				{
				setState(87);
				match(T__11);
				setState(88);
				((RelContext)_localctx).e = expr();
				System.out.println("Lido '<>'");
				System.out.println("Resultado: " + ((RelContext)_localctx).e.v);
				((RelContext)_localctx).t =  ((RelContext)_localctx).d.v != ((RelContext)_localctx).e.v;
				}
				break;
			case T__12:
				{
				setState(93);
				match(T__12);
				setState(94);
				((RelContext)_localctx).e = expr();
				System.out.println("Lido '<'");
				System.out.println("Resultado: " + ((RelContext)_localctx).e.v);
				((RelContext)_localctx).t =  ((RelContext)_localctx).d.v <  ((RelContext)_localctx).e.v;
				}
				break;
			case T__13:
				{
				setState(99);
				match(T__13);
				setState(100);
				((RelContext)_localctx).e = expr();
				System.out.println("Lido '>'");
				System.out.println("Resultado: " + ((RelContext)_localctx).e.v);
				((RelContext)_localctx).t =  ((RelContext)_localctx).d.v >  ((RelContext)_localctx).e.v;
				}
				break;
			case T__14:
				{
				setState(105);
				match(T__14);
				setState(106);
				((RelContext)_localctx).e = expr();
				System.out.println("Lido '<='");
				System.out.println("Resultado: " + ((RelContext)_localctx).e.v);
				((RelContext)_localctx).t =  ((RelContext)_localctx).d.v <= ((RelContext)_localctx).e.v;
				}
				break;
			case T__15:
				{
				setState(111);
				match(T__15);
				setState(112);
				((RelContext)_localctx).e = expr();
				System.out.println("Lido '>='");
				System.out.println("Resultado: " + ((RelContext)_localctx).e.v);
				((RelContext)_localctx).t =  ((RelContext)_localctx).d.v >= ((RelContext)_localctx).e.v;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25z\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\7\2\26"+
		"\n\2\f\2\16\2\31\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\6\4\"\n\4\r\4\16\4#"+
		"\3\5\3\5\5\5(\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\5\b:\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tO\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nx\n\n\3\n\2"+
		"\2\13\2\4\6\b\n\f\16\20\22\2\2\2}\2\27\3\2\2\2\4\34\3\2\2\2\6!\3\2\2\2"+
		"\b\'\3\2\2\2\n)\3\2\2\2\f/\3\2\2\2\169\3\2\2\2\20;\3\2\2\2\22P\3\2\2\2"+
		"\24\26\5\4\3\2\25\24\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2"+
		"\30\32\3\2\2\2\31\27\3\2\2\2\32\33\7\2\2\3\33\3\3\2\2\2\34\35\5\6\4\2"+
		"\35\5\3\2\2\2\36\37\5\b\5\2\37 \7\3\2\2 \"\3\2\2\2!\36\3\2\2\2\"#\3\2"+
		"\2\2#!\3\2\2\2#$\3\2\2\2$\7\3\2\2\2%(\5\n\6\2&(\5\f\7\2\'%\3\2\2\2\'&"+
		"\3\2\2\2(\t\3\2\2\2)*\7\4\2\2*+\5\22\n\2+,\b\6\1\2,-\7\5\2\2-.\5\6\4\2"+
		".\13\3\2\2\2/\60\7\6\2\2\60\61\5\22\n\2\61\62\7\7\2\2\62\63\5\6\4\2\63"+
		"\64\3\2\2\2\64\65\5\16\b\2\65\r\3\2\2\2\66\67\7\b\2\2\67:\5\6\4\28:\3"+
		"\2\2\29\66\3\2\2\298\3\2\2\2:\17\3\2\2\2;<\7\23\2\2<N\b\t\1\2=>\7\t\2"+
		"\2>?\5\20\t\2?@\b\t\1\2@O\3\2\2\2AB\7\n\2\2BC\5\20\t\2CD\b\t\1\2DO\3\2"+
		"\2\2EF\7\13\2\2FG\5\20\t\2GH\b\t\1\2HO\3\2\2\2IJ\7\f\2\2JK\5\20\t\2KL"+
		"\b\t\1\2LO\3\2\2\2MO\3\2\2\2N=\3\2\2\2NA\3\2\2\2NE\3\2\2\2NI\3\2\2\2N"+
		"M\3\2\2\2O\21\3\2\2\2PQ\5\20\t\2QR\b\n\1\2Rw\3\2\2\2ST\7\r\2\2TU\5\20"+
		"\t\2UV\b\n\1\2VW\b\n\1\2WX\b\n\1\2Xx\3\2\2\2YZ\7\16\2\2Z[\5\20\t\2[\\"+
		"\b\n\1\2\\]\b\n\1\2]^\b\n\1\2^x\3\2\2\2_`\7\17\2\2`a\5\20\t\2ab\b\n\1"+
		"\2bc\b\n\1\2cd\b\n\1\2dx\3\2\2\2ef\7\20\2\2fg\5\20\t\2gh\b\n\1\2hi\b\n"+
		"\1\2ij\b\n\1\2jx\3\2\2\2kl\7\21\2\2lm\5\20\t\2mn\b\n\1\2no\b\n\1\2op\b"+
		"\n\1\2px\3\2\2\2qr\7\22\2\2rs\5\20\t\2st\b\n\1\2tu\b\n\1\2uv\b\n\1\2v"+
		"x\3\2\2\2wS\3\2\2\2wY\3\2\2\2w_\3\2\2\2we\3\2\2\2wk\3\2\2\2wq\3\2\2\2"+
		"x\23\3\2\2\2\b\27#\'9Nw";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}