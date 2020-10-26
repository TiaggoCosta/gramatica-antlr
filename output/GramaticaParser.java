// $ANTLR 3.5.1 C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g 2020-10-25 22:06:18

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class GramaticaParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "VAR", "WS", "'('", "')'", 
		"'*'", "'+'", "'-'", "'/'", "'<'", "'<='", "'<>'", "'='", "'>'", "'>='", 
		"'do'", "'while'"
	};
	public static final int EOF=-1;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int INT=4;
	public static final int VAR=5;
	public static final int WS=6;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "prog", "comando", "iteracao", "rel", "stat", "expr"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public GramaticaParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public GramaticaParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public GramaticaParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return GramaticaParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g"; }



	// $ANTLR start "prog"
	// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:12:1: prog : ( stat )* EOF ;
	public final void prog() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "prog");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(12, 0);

		try {
			// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:12:5: ( ( stat )* EOF )
			dbg.enterAlt(1);

			// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:13:4: ( stat )* EOF
			{
			dbg.location(13,4);
			// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:13:4: ( stat )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= INT && LA1_0 <= VAR)||LA1_0==20) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:13:4: stat
					{
					dbg.location(13,4);
					pushFollow(FOLLOW_stat_in_prog26);
					stat();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(13,10);
			match(input,EOF,FOLLOW_EOF_in_prog29); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(14, 3);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "prog");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "prog"



	// $ANTLR start "stat"
	// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:16:1: stat : comando ;
	public final void stat() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "stat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(16, 0);

		try {
			// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:16:5: ( comando )
			dbg.enterAlt(1);

			// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:17:2: comando
			{
			dbg.location(17,2);
			pushFollow(FOLLOW_comando_in_stat41);
			comando();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(18, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "stat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "stat"



	// $ANTLR start "comando"
	// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:20:1: comando : ( iteracao | VAR | INT );
	public final void comando() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "comando");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(20, 0);

		try {
			// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:20:8: ( iteracao | VAR | INT )
			int alt2=3;
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			switch ( input.LA(1) ) {
			case 20:
				{
				alt2=1;
				}
				break;
			case VAR:
				{
				alt2=2;
				}
				break;
			case INT:
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:21:5: iteracao
					{
					dbg.location(21,5);
					pushFollow(FOLLOW_iteracao_in_comando56);
					iteracao();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:24:7: VAR
					{
					dbg.location(24,7);
					match(input,VAR,FOLLOW_VAR_in_comando71); 
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:25:7: INT
					{
					dbg.location(25,7);
					match(input,INT,FOLLOW_INT_in_comando79); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(28, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "comando");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "comando"



	// $ANTLR start "iteracao"
	// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:30:1: iteracao : 'while' e= rel 'do' ( comando )+ ;
	public final void iteracao() throws RecognitionException {
		boolean e =false;

		try { dbg.enterRule(getGrammarFileName(), "iteracao");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(30, 0);

		try {
			// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:30:9: ( 'while' e= rel 'do' ( comando )+ )
			dbg.enterAlt(1);

			// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:31:2: 'while' e= rel 'do' ( comando )+
			{
			dbg.location(31,2);
			match(input,20,FOLLOW_20_in_iteracao96); dbg.location(31,12);
			pushFollow(FOLLOW_rel_in_iteracao102);
			e=rel();
			state._fsp--;
			dbg.location(31,18);
			System.out.println("Resultado relacional: " + e);dbg.location(31,73);
			match(input,19,FOLLOW_19_in_iteracao106); dbg.location(31,78);
			// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:31:78: ( comando )+
			int cnt3=0;
			try { dbg.enterSubRule(3);

			loop3:
			while (true) {
				int alt3=2;
				try { dbg.enterDecision(3, decisionCanBacktrack[3]);

				switch ( input.LA(1) ) {
				case 20:
					{
					alt3=1;
					}
					break;
				case VAR:
					{
					alt3=1;
					}
					break;
				case INT:
					{
					alt3=1;
					}
					break;
				}
				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:31:78: comando
					{
					dbg.location(31,78);
					pushFollow(FOLLOW_comando_in_iteracao108);
					comando();
					state._fsp--;

					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt3++;
			}
			} finally {dbg.exitSubRule(3);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(32, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "iteracao");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "iteracao"



	// $ANTLR start "expr"
	// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:34:1: expr returns [ double v ] : ( INT ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr |) | '(' e= expr ')' );
	public final double expr() throws RecognitionException {
		double v = 0.0;


		Token INT1=null;
		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(34, 0);

		try {
			// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:34:26: ( INT ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr |) | '(' e= expr ')' )
			int alt5=2;
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( (LA5_0==INT) ) {
				alt5=1;
			}
			else if ( (LA5_0==7) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:35:2: INT ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr |)
					{
					dbg.location(35,2);
					INT1=(Token)match(input,INT,FOLLOW_INT_in_expr123); dbg.location(35,6);
					v = Double.parseDouble( (INT1!=null?INT1.getText():null));dbg.location(36,5);
					// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:36:5: ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr |)
					int alt4=5;
					try { dbg.enterSubRule(4);
					try { dbg.enterDecision(4, decisionCanBacktrack[4]);

					switch ( input.LA(1) ) {
					case 10:
						{
						alt4=1;
						}
						break;
					case 11:
						{
						alt4=2;
						}
						break;
					case 9:
						{
						alt4=3;
						}
						break;
					case 12:
						{
						alt4=4;
						}
						break;
					case 8:
					case 13:
					case 14:
					case 15:
					case 16:
					case 17:
					case 18:
					case 19:
						{
						alt4=5;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(4);}

					switch (alt4) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:36:6: '+' e= expr
							{
							dbg.location(36,6);
							match(input,10,FOLLOW_10_in_expr133); dbg.location(36,12);
							pushFollow(FOLLOW_expr_in_expr139);
							e=expr();
							state._fsp--;
							dbg.location(36,19);
							v += e;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:37:7: '-' e= expr
							{
							dbg.location(37,7);
							match(input,11,FOLLOW_11_in_expr150); dbg.location(37,13);
							pushFollow(FOLLOW_expr_in_expr156);
							e=expr();
							state._fsp--;
							dbg.location(37,20);
							v -= e;
							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:38:7: '*' e= expr
							{
							dbg.location(38,7);
							match(input,9,FOLLOW_9_in_expr167); dbg.location(38,13);
							pushFollow(FOLLOW_expr_in_expr173);
							e=expr();
							state._fsp--;
							dbg.location(38,20);
							v *= e;
							}
							break;
						case 4 :
							dbg.enterAlt(4);

							// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:39:7: '/' e= expr
							{
							dbg.location(39,7);
							match(input,12,FOLLOW_12_in_expr184); dbg.location(39,13);
							pushFollow(FOLLOW_expr_in_expr190);
							e=expr();
							state._fsp--;
							dbg.location(39,20);
							v /= e;
							}
							break;
						case 5 :
							dbg.enterAlt(5);

							// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:41:5: 
							{
							}
							break;

					}
					} finally {dbg.exitSubRule(4);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:42:7: '(' e= expr ')'
					{
					dbg.location(42,7);
					match(input,7,FOLLOW_7_in_expr213); dbg.location(42,13);
					pushFollow(FOLLOW_expr_in_expr219);
					e=expr();
					state._fsp--;
					dbg.location(42,20);
					v = e;dbg.location(42,33);
					match(input,8,FOLLOW_8_in_expr223); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(43, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return v;
	}
	// $ANTLR end "expr"



	// $ANTLR start "rel"
	// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:45:1: rel returns [ boolean t ] : (d= expr ) ( '=' e= expr | '<>' e= expr | '<' e= expr | '>' e= expr | '<=' e= expr | '>=' e= expr ) ;
	public final boolean rel() throws RecognitionException {
		boolean t = false;


		double d =0.0;
		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "rel");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(45, 0);

		try {
			// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:45:26: ( (d= expr ) ( '=' e= expr | '<>' e= expr | '<' e= expr | '>' e= expr | '<=' e= expr | '>=' e= expr ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:46:5: (d= expr ) ( '=' e= expr | '<>' e= expr | '<' e= expr | '>' e= expr | '<=' e= expr | '>=' e= expr )
			{
			dbg.location(46,5);
			// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:46:5: (d= expr )
			dbg.enterAlt(1);

			// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:46:7: d= expr
			{
			dbg.location(46,9);
			pushFollow(FOLLOW_expr_in_rel250);
			d=expr();
			state._fsp--;
			dbg.location(46,16);
			System.out.println("Resultado: " + d);
			}
			dbg.location(47,5);
			// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:47:5: ( '=' e= expr | '<>' e= expr | '<' e= expr | '>' e= expr | '<=' e= expr | '>=' e= expr )
			int alt6=6;
			try { dbg.enterSubRule(6);
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			switch ( input.LA(1) ) {
			case 16:
				{
				alt6=1;
				}
				break;
			case 15:
				{
				alt6=2;
				}
				break;
			case 13:
				{
				alt6=3;
				}
				break;
			case 17:
				{
				alt6=4;
				}
				break;
			case 14:
				{
				alt6=5;
				}
				break;
			case 18:
				{
				alt6=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:47:7: '=' e= expr
					{
					dbg.location(47,7);
					match(input,16,FOLLOW_16_in_rel262); dbg.location(47,14);
					pushFollow(FOLLOW_expr_in_rel269);
					e=expr();
					state._fsp--;
					dbg.location(47,21);
					System.out.println("Lido '='");dbg.location(47,56);
					System.out.println("Resultado: " + e);dbg.location(47,100);
					t = d == e;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:48:7: '<>' e= expr
					{
					dbg.location(48,7);
					match(input,15,FOLLOW_15_in_rel284); dbg.location(48,14);
					pushFollow(FOLLOW_expr_in_rel290);
					e=expr();
					state._fsp--;
					dbg.location(48,21);
					System.out.println("Lido '<>'");dbg.location(48,56);
					System.out.println("Resultado: " + e);dbg.location(48,100);
					t = d != e;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:49:7: '<' e= expr
					{
					dbg.location(49,7);
					match(input,13,FOLLOW_13_in_rel304); dbg.location(49,14);
					pushFollow(FOLLOW_expr_in_rel311);
					e=expr();
					state._fsp--;
					dbg.location(49,21);
					System.out.println("Lido '<'");dbg.location(49,56);
					System.out.println("Resultado: " + e);dbg.location(49,100);
					t = d <  e;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:50:7: '>' e= expr
					{
					dbg.location(50,7);
					match(input,17,FOLLOW_17_in_rel326); dbg.location(50,14);
					pushFollow(FOLLOW_expr_in_rel333);
					e=expr();
					state._fsp--;
					dbg.location(50,21);
					System.out.println("Lido '>'");dbg.location(50,56);
					System.out.println("Resultado: " + e);dbg.location(50,100);
					t = d >  e;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:51:7: '<=' e= expr
					{
					dbg.location(51,7);
					match(input,14,FOLLOW_14_in_rel348); dbg.location(51,14);
					pushFollow(FOLLOW_expr_in_rel354);
					e=expr();
					state._fsp--;
					dbg.location(51,21);
					System.out.println("Lido '<='");dbg.location(51,56);
					System.out.println("Resultado: " + e);dbg.location(51,100);
					t = d <= e;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:52:7: '>=' e= expr
					{
					dbg.location(52,7);
					match(input,18,FOLLOW_18_in_rel368); dbg.location(52,14);
					pushFollow(FOLLOW_expr_in_rel374);
					e=expr();
					state._fsp--;
					dbg.location(52,21);
					System.out.println("Lido '>='");dbg.location(52,56);
					System.out.println("Resultado: " + e);dbg.location(52,100);
					t = d >= e;
					}
					break;

			}
			} finally {dbg.exitSubRule(6);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(54, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rel");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return t;
	}
	// $ANTLR end "rel"

	// Delegated rules



	public static final BitSet FOLLOW_stat_in_prog26 = new BitSet(new long[]{0x0000000000100030L});
	public static final BitSet FOLLOW_EOF_in_prog29 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comando_in_stat41 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iteracao_in_comando56 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_comando71 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_comando79 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_iteracao96 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_rel_in_iteracao102 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_iteracao106 = new BitSet(new long[]{0x0000000000100030L});
	public static final BitSet FOLLOW_comando_in_iteracao108 = new BitSet(new long[]{0x0000000000100032L});
	public static final BitSet FOLLOW_INT_in_expr123 = new BitSet(new long[]{0x0000000000001E02L});
	public static final BitSet FOLLOW_10_in_expr133 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_expr139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_expr150 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_expr156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_expr167 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_expr173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_expr184 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_expr190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_7_in_expr213 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_expr219 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_expr223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_rel250 = new BitSet(new long[]{0x000000000007E000L});
	public static final BitSet FOLLOW_16_in_rel262 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_rel269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_rel284 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_rel290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_rel304 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_rel311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_rel326 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_rel333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rel348 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_rel354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_rel368 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_rel374 = new BitSet(new long[]{0x0000000000000002L});
}
