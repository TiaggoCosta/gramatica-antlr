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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		INT=18, VAR=19, WS=20;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_comando = 2, RULE_iteracao = 3, RULE_teste = 4, 
		RULE_teste2 = 5, RULE_expr = 6, RULE_rel = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "comando", "iteracao", "teste", "teste2", "expr", "rel"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'while'", "'do'", "'if'", "'then'", "'else'", "'+'", "'-'", "'*'", 
			"'/'", "'('", "')'", "'='", "'<>'", "'<'", "'>'", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "INT", "VAR", "WS"
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
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << INT) | (1L << VAR))) != 0)) {
				{
				{
				setState(16);
				stat();
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(22);
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
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
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
			setState(24);
			comando();
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
		public TerminalNode VAR() { return getToken(GramaticaParser.VAR, 0); }
		public TerminalNode INT() { return getToken(GramaticaParser.INT, 0); }
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comando);
		try {
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				iteracao();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				teste();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				match(VAR);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(29);
				match(INT);
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
		public RelContext rel() {
			return getRuleContext(RelContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public IteracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteracao; }
	}

	public final IteracaoContext iteracao() throws RecognitionException {
		IteracaoContext _localctx = new IteracaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_iteracao);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T__0);
			setState(33);
			((IteracaoContext)_localctx).e = rel();
			System.out.println("Resultado relacional: " + ((IteracaoContext)_localctx).e.t);
			setState(35);
			match(T__1);
			setState(37); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(36);
					comando();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(39); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class TesteContext extends ParserRuleContext {
		public Teste2Context teste2() {
			return getRuleContext(Teste2Context.class,0);
		}
		public RelContext rel() {
			return getRuleContext(RelContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public TesteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_teste; }
	}

	public final TesteContext teste() throws RecognitionException {
		TesteContext _localctx = new TesteContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_teste);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(41);
			match(T__2);
			setState(42);
			rel();
			setState(43);
			match(T__3);
			setState(45); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(44);
					comando();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(47); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
			setState(49);
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
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public Teste2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_teste2; }
	}

	public final Teste2Context teste2() throws RecognitionException {
		Teste2Context _localctx = new Teste2Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_teste2);
		try {
			int _alt;
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(51);
				match(T__4);
				setState(53); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(52);
						comando();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(55); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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
		enterRule(_localctx, 12, RULE_expr);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				((ExprContext)_localctx).INT = match(INT);
				((ExprContext)_localctx).v =  Double.parseDouble( (((ExprContext)_localctx).INT!=null?((ExprContext)_localctx).INT.getText():null));
				setState(79);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
					{
					setState(62);
					match(T__5);
					setState(63);
					((ExprContext)_localctx).e = expr();
					_localctx.v += ((ExprContext)_localctx).e.v;
					}
					break;
				case T__6:
					{
					setState(66);
					match(T__6);
					setState(67);
					((ExprContext)_localctx).e = expr();
					_localctx.v -= ((ExprContext)_localctx).e.v;
					}
					break;
				case T__7:
					{
					setState(70);
					match(T__7);
					setState(71);
					((ExprContext)_localctx).e = expr();
					_localctx.v *= ((ExprContext)_localctx).e.v;
					}
					break;
				case T__8:
					{
					setState(74);
					match(T__8);
					setState(75);
					((ExprContext)_localctx).e = expr();
					_localctx.v /= ((ExprContext)_localctx).e.v;
					}
					break;
				case T__1:
				case T__3:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(T__9);
				setState(82);
				((ExprContext)_localctx).e = expr();
				((ExprContext)_localctx).v =  ((ExprContext)_localctx).e.v;
				setState(84);
				match(T__10);
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
		enterRule(_localctx, 14, RULE_rel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(88);
			((RelContext)_localctx).d = expr();
			System.out.println("Resultado: " + ((RelContext)_localctx).d.v);
			}
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				setState(91);
				match(T__11);
				setState(92);
				((RelContext)_localctx).e = expr();
				System.out.println("Lido '='");
				System.out.println("Resultado: " + ((RelContext)_localctx).e.v);
				((RelContext)_localctx).t =  ((RelContext)_localctx).d.v == ((RelContext)_localctx).e.v;
				}
				break;
			case T__12:
				{
				setState(97);
				match(T__12);
				setState(98);
				((RelContext)_localctx).e = expr();
				System.out.println("Lido '<>'");
				System.out.println("Resultado: " + ((RelContext)_localctx).e.v);
				((RelContext)_localctx).t =  ((RelContext)_localctx).d.v != ((RelContext)_localctx).e.v;
				}
				break;
			case T__13:
				{
				setState(103);
				match(T__13);
				setState(104);
				((RelContext)_localctx).e = expr();
				System.out.println("Lido '<'");
				System.out.println("Resultado: " + ((RelContext)_localctx).e.v);
				((RelContext)_localctx).t =  ((RelContext)_localctx).d.v <  ((RelContext)_localctx).e.v;
				}
				break;
			case T__14:
				{
				setState(109);
				match(T__14);
				setState(110);
				((RelContext)_localctx).e = expr();
				System.out.println("Lido '>'");
				System.out.println("Resultado: " + ((RelContext)_localctx).e.v);
				((RelContext)_localctx).t =  ((RelContext)_localctx).d.v >  ((RelContext)_localctx).e.v;
				}
				break;
			case T__15:
				{
				setState(115);
				match(T__15);
				setState(116);
				((RelContext)_localctx).e = expr();
				System.out.println("Lido '<='");
				System.out.println("Resultado: " + ((RelContext)_localctx).e.v);
				((RelContext)_localctx).t =  ((RelContext)_localctx).d.v <= ((RelContext)_localctx).e.v;
				}
				break;
			case T__16:
				{
				setState(121);
				match(T__16);
				setState(122);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\u0084\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\7\2\24\n"+
		"\2\f\2\16\2\27\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\5\4!\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\6\5(\n\5\r\5\16\5)\3\6\3\6\3\6\3\6\6\6\60\n\6\r\6\16\6\61\3"+
		"\6\3\6\3\7\3\7\6\78\n\7\r\7\16\79\3\7\5\7=\n\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bR\n\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\bY\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0082\n\t\3\t\2\2\n\2\4\6\b"+
		"\n\f\16\20\2\2\2\u008d\2\25\3\2\2\2\4\32\3\2\2\2\6 \3\2\2\2\b\"\3\2\2"+
		"\2\n+\3\2\2\2\f<\3\2\2\2\16X\3\2\2\2\20Z\3\2\2\2\22\24\5\4\3\2\23\22\3"+
		"\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\30\3\2\2\2\27\25\3"+
		"\2\2\2\30\31\7\2\2\3\31\3\3\2\2\2\32\33\5\6\4\2\33\5\3\2\2\2\34!\5\b\5"+
		"\2\35!\5\n\6\2\36!\7\25\2\2\37!\7\24\2\2 \34\3\2\2\2 \35\3\2\2\2 \36\3"+
		"\2\2\2 \37\3\2\2\2!\7\3\2\2\2\"#\7\3\2\2#$\5\20\t\2$%\b\5\1\2%\'\7\4\2"+
		"\2&(\5\6\4\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\t\3\2\2\2+,\7"+
		"\5\2\2,-\5\20\t\2-/\7\6\2\2.\60\5\6\4\2/.\3\2\2\2\60\61\3\2\2\2\61/\3"+
		"\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\5\f\7\2\64\13\3\2\2\2\65\67\7"+
		"\7\2\2\668\5\6\4\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:=\3\2"+
		"\2\2;=\3\2\2\2<\65\3\2\2\2<;\3\2\2\2=\r\3\2\2\2>?\7\24\2\2?Q\b\b\1\2@"+
		"A\7\b\2\2AB\5\16\b\2BC\b\b\1\2CR\3\2\2\2DE\7\t\2\2EF\5\16\b\2FG\b\b\1"+
		"\2GR\3\2\2\2HI\7\n\2\2IJ\5\16\b\2JK\b\b\1\2KR\3\2\2\2LM\7\13\2\2MN\5\16"+
		"\b\2NO\b\b\1\2OR\3\2\2\2PR\3\2\2\2Q@\3\2\2\2QD\3\2\2\2QH\3\2\2\2QL\3\2"+
		"\2\2QP\3\2\2\2RY\3\2\2\2ST\7\f\2\2TU\5\16\b\2UV\b\b\1\2VW\7\r\2\2WY\3"+
		"\2\2\2X>\3\2\2\2XS\3\2\2\2Y\17\3\2\2\2Z[\5\16\b\2[\\\b\t\1\2\\\u0081\3"+
		"\2\2\2]^\7\16\2\2^_\5\16\b\2_`\b\t\1\2`a\b\t\1\2ab\b\t\1\2b\u0082\3\2"+
		"\2\2cd\7\17\2\2de\5\16\b\2ef\b\t\1\2fg\b\t\1\2gh\b\t\1\2h\u0082\3\2\2"+
		"\2ij\7\20\2\2jk\5\16\b\2kl\b\t\1\2lm\b\t\1\2mn\b\t\1\2n\u0082\3\2\2\2"+
		"op\7\21\2\2pq\5\16\b\2qr\b\t\1\2rs\b\t\1\2st\b\t\1\2t\u0082\3\2\2\2uv"+
		"\7\22\2\2vw\5\16\b\2wx\b\t\1\2xy\b\t\1\2yz\b\t\1\2z\u0082\3\2\2\2{|\7"+
		"\23\2\2|}\5\16\b\2}~\b\t\1\2~\177\b\t\1\2\177\u0080\b\t\1\2\u0080\u0082"+
		"\3\2\2\2\u0081]\3\2\2\2\u0081c\3\2\2\2\u0081i\3\2\2\2\u0081o\3\2\2\2\u0081"+
		"u\3\2\2\2\u0081{\3\2\2\2\u0082\21\3\2\2\2\13\25 )\619<QX\u0081";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}