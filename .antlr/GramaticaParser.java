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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, INT=15, VAR=16, WS=17;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_comando = 2, RULE_iteracao = 3, RULE_expr = 4, 
		RULE_rel = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "comando", "iteracao", "expr", "rel"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'while'", "'do'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'='", 
			"'<>'", "'<'", "'>'", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "INT", "VAR", "WS"
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
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << INT) | (1L << VAR))) != 0)) {
				{
				{
				setState(12);
				stat();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18);
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
			setState(20);
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
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				iteracao();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				match(VAR);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(24);
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
			setState(27);
			match(T__0);
			setState(28);
			((IteracaoContext)_localctx).e = rel();
			System.out.println("Resultado relacional: " + ((IteracaoContext)_localctx).e.t);
			setState(30);
			match(T__1);
			setState(32); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(31);
					comando();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(34); 
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
		enterRule(_localctx, 8, RULE_expr);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				((ExprContext)_localctx).INT = match(INT);
				((ExprContext)_localctx).v =  Double.parseDouble( (((ExprContext)_localctx).INT!=null?((ExprContext)_localctx).INT.getText():null));
				setState(55);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(38);
					match(T__2);
					setState(39);
					((ExprContext)_localctx).e = expr();
					_localctx.v += ((ExprContext)_localctx).e.v;
					}
					break;
				case T__3:
					{
					setState(42);
					match(T__3);
					setState(43);
					((ExprContext)_localctx).e = expr();
					_localctx.v -= ((ExprContext)_localctx).e.v;
					}
					break;
				case T__4:
					{
					setState(46);
					match(T__4);
					setState(47);
					((ExprContext)_localctx).e = expr();
					_localctx.v *= ((ExprContext)_localctx).e.v;
					}
					break;
				case T__5:
					{
					setState(50);
					match(T__5);
					setState(51);
					((ExprContext)_localctx).e = expr();
					_localctx.v /= ((ExprContext)_localctx).e.v;
					}
					break;
				case T__1:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(T__6);
				setState(58);
				((ExprContext)_localctx).e = expr();
				((ExprContext)_localctx).v =  ((ExprContext)_localctx).e.v;
				setState(60);
				match(T__7);
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
		enterRule(_localctx, 10, RULE_rel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(64);
			((RelContext)_localctx).d = expr();
			System.out.println("Resultado: " + ((RelContext)_localctx).d.v);
			}
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				{
				setState(67);
				match(T__8);
				setState(68);
				((RelContext)_localctx).e = expr();
				System.out.println("Lido '='");
				System.out.println("Resultado: " + ((RelContext)_localctx).e.v);
				((RelContext)_localctx).t =  ((RelContext)_localctx).d.v == ((RelContext)_localctx).e.v;
				}
				break;
			case T__9:
				{
				setState(73);
				match(T__9);
				setState(74);
				((RelContext)_localctx).e = expr();
				System.out.println("Lido '<>'");
				System.out.println("Resultado: " + ((RelContext)_localctx).e.v);
				((RelContext)_localctx).t =  ((RelContext)_localctx).d.v != ((RelContext)_localctx).e.v;
				}
				break;
			case T__10:
				{
				setState(79);
				match(T__10);
				setState(80);
				((RelContext)_localctx).e = expr();
				System.out.println("Lido '<'");
				System.out.println("Resultado: " + ((RelContext)_localctx).e.v);
				((RelContext)_localctx).t =  ((RelContext)_localctx).d.v <  ((RelContext)_localctx).e.v;
				}
				break;
			case T__11:
				{
				setState(85);
				match(T__11);
				setState(86);
				((RelContext)_localctx).e = expr();
				System.out.println("Lido '>'");
				System.out.println("Resultado: " + ((RelContext)_localctx).e.v);
				((RelContext)_localctx).t =  ((RelContext)_localctx).d.v >  ((RelContext)_localctx).e.v;
				}
				break;
			case T__12:
				{
				setState(91);
				match(T__12);
				setState(92);
				((RelContext)_localctx).e = expr();
				System.out.println("Lido '<='");
				System.out.println("Resultado: " + ((RelContext)_localctx).e.v);
				((RelContext)_localctx).t =  ((RelContext)_localctx).d.v <= ((RelContext)_localctx).e.v;
				}
				break;
			case T__13:
				{
				setState(97);
				match(T__13);
				setState(98);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23l\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\4\5\4\34\n\4\3\5\3\5\3\5\3\5\3\5\6\5#\n\5\r\5\16"+
		"\5$\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6:\n\6\3\6\3\6\3\6\3\6\3\6\5\6A\n\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7j"+
		"\n\7\3\7\2\2\b\2\4\6\b\n\f\2\2\2s\2\21\3\2\2\2\4\26\3\2\2\2\6\33\3\2\2"+
		"\2\b\35\3\2\2\2\n@\3\2\2\2\fB\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20\23"+
		"\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\24\3\2\2\2\23\21\3\2\2\2\24\25"+
		"\7\2\2\3\25\3\3\2\2\2\26\27\5\6\4\2\27\5\3\2\2\2\30\34\5\b\5\2\31\34\7"+
		"\22\2\2\32\34\7\21\2\2\33\30\3\2\2\2\33\31\3\2\2\2\33\32\3\2\2\2\34\7"+
		"\3\2\2\2\35\36\7\3\2\2\36\37\5\f\7\2\37 \b\5\1\2 \"\7\4\2\2!#\5\6\4\2"+
		"\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\t\3\2\2\2&\'\7\21\2\2\'9\b"+
		"\6\1\2()\7\5\2\2)*\5\n\6\2*+\b\6\1\2+:\3\2\2\2,-\7\6\2\2-.\5\n\6\2./\b"+
		"\6\1\2/:\3\2\2\2\60\61\7\7\2\2\61\62\5\n\6\2\62\63\b\6\1\2\63:\3\2\2\2"+
		"\64\65\7\b\2\2\65\66\5\n\6\2\66\67\b\6\1\2\67:\3\2\2\28:\3\2\2\29(\3\2"+
		"\2\29,\3\2\2\29\60\3\2\2\29\64\3\2\2\298\3\2\2\2:A\3\2\2\2;<\7\t\2\2<"+
		"=\5\n\6\2=>\b\6\1\2>?\7\n\2\2?A\3\2\2\2@&\3\2\2\2@;\3\2\2\2A\13\3\2\2"+
		"\2BC\5\n\6\2CD\b\7\1\2Di\3\2\2\2EF\7\13\2\2FG\5\n\6\2GH\b\7\1\2HI\b\7"+
		"\1\2IJ\b\7\1\2Jj\3\2\2\2KL\7\f\2\2LM\5\n\6\2MN\b\7\1\2NO\b\7\1\2OP\b\7"+
		"\1\2Pj\3\2\2\2QR\7\r\2\2RS\5\n\6\2ST\b\7\1\2TU\b\7\1\2UV\b\7\1\2Vj\3\2"+
		"\2\2WX\7\16\2\2XY\5\n\6\2YZ\b\7\1\2Z[\b\7\1\2[\\\b\7\1\2\\j\3\2\2\2]^"+
		"\7\17\2\2^_\5\n\6\2_`\b\7\1\2`a\b\7\1\2ab\b\7\1\2bj\3\2\2\2cd\7\20\2\2"+
		"de\5\n\6\2ef\b\7\1\2fg\b\7\1\2gh\b\7\1\2hj\3\2\2\2iE\3\2\2\2iK\3\2\2\2"+
		"iQ\3\2\2\2iW\3\2\2\2i]\3\2\2\2ic\3\2\2\2j\r\3\2\2\2\b\21\33$9@i";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}