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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, VAR=7, INT=8, NEWLINE=9, 
		ID=10, FLOAT=11, COMMENT=12, WS=13, STRING=14, CHAR=15;
	public static final int
		RULE_prog = 0, RULE_expr = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "VAR", "INT", "NEWLINE", "ID", 
			"FLOAT", "COMMENT", "WS", "STRING", "CHAR"
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
		public double v;
		public ExprContext e;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GramaticaParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GramaticaParser.NEWLINE, i);
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
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4);
				((ProgContext)_localctx).e = expr();
				((ProgContext)_localctx).v =  ((ProgContext)_localctx).e.v;
				System.out.println("Resultado: " + _localctx.v);
				setState(10);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(7);
					match(NEWLINE);
					}
					}
					setState(12);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 || _la==INT );
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
		enterRule(_localctx, 2, RULE_expr);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				match(INT);
				((ExprContext)_localctx).v =  Double.parseDouble( (((ExprContext)_localctx).INT!=null?((ExprContext)_localctx).INT.getText():null));
				setState(35);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(19);
					match(T__0);
					setState(20);
					((ExprContext)_localctx).e = expr();
					_localctx.v += ((ExprContext)_localctx).e.v;
					}
					break;
				case T__1:
					{
					setState(23);
					match(T__1);
					setState(24);
					((ExprContext)_localctx).e = expr();
					_localctx.v -= ((ExprContext)_localctx).e.v;
					}
					break;
				case T__2:
					{
					setState(27);
					match(T__2);
					setState(28);
					((ExprContext)_localctx).e = expr();
					_localctx.v *= ((ExprContext)_localctx).e.v;
					}
					break;
				case T__3:
					{
					setState(31);
					match(T__3);
					setState(32);
					((ExprContext)_localctx).e = expr();
					_localctx.v /= ((ExprContext)_localctx).e.v;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(INT);
				((ExprContext)_localctx).v =  Double.parseDouble( (((ExprContext)_localctx).INT!=null?((ExprContext)_localctx).INT.getText():null));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				match(T__4);
				setState(40);
				((ExprContext)_localctx).e = expr();
				((ExprContext)_localctx).v =  ((ExprContext)_localctx).e.v;
				setState(42);
				match(T__5);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21\61\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\3\2\7\2\13\n\2\f\2\16\2\16\13\2\6\2\20\n\2\r\2\16\2\21"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3&\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\3\2\2\4\2\4\2\2\2\65"+
		"\2\17\3\2\2\2\4.\3\2\2\2\6\7\5\4\3\2\7\b\b\2\1\2\b\f\b\2\1\2\t\13\7\13"+
		"\2\2\n\t\3\2\2\2\13\16\3\2\2\2\f\n\3\2\2\2\f\r\3\2\2\2\r\20\3\2\2\2\16"+
		"\f\3\2\2\2\17\6\3\2\2\2\20\21\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\3"+
		"\3\2\2\2\23\24\7\n\2\2\24%\b\3\1\2\25\26\7\3\2\2\26\27\5\4\3\2\27\30\b"+
		"\3\1\2\30&\3\2\2\2\31\32\7\4\2\2\32\33\5\4\3\2\33\34\b\3\1\2\34&\3\2\2"+
		"\2\35\36\7\5\2\2\36\37\5\4\3\2\37 \b\3\1\2 &\3\2\2\2!\"\7\6\2\2\"#\5\4"+
		"\3\2#$\b\3\1\2$&\3\2\2\2%\25\3\2\2\2%\31\3\2\2\2%\35\3\2\2\2%!\3\2\2\2"+
		"&/\3\2\2\2\'(\7\n\2\2(/\b\3\1\2)*\7\7\2\2*+\5\4\3\2+,\b\3\1\2,-\7\b\2"+
		"\2-/\3\2\2\2.\23\3\2\2\2.\'\3\2\2\2.)\3\2\2\2/\5\3\2\2\2\6\f\21%.";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}