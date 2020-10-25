// $ANTLR 3.5.1 C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g 2020-10-25 19:12:11

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
		"invalidRule", "iteracao", "comando", "rel", "prog", "stat", "expr"
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
				if ( (LA1_0==INT||LA1_0==7||LA1_0==20) ) {
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
	// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:20:1: comando : ( iteracao | expr );
	public final void comando() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "comando");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(20, 0);

		try {
			// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:20:8: ( iteracao | expr )
			int alt2=2;
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			int LA2_0 = input.LA(1);
			if ( (LA2_0==20) ) {
				alt2=1;
			}
			else if ( (LA2_0==INT||LA2_0==7) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:23:2: iteracao
					{
					dbg.location(23,2);
					pushFollow(FOLLOW_iteracao_in_comando60);
					iteracao();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:24:5: expr
					{
					dbg.location(24,5);
					pushFollow(FOLLOW_expr_in_comando66);
					expr();
					state._fsp--;

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
		dbg.location(25, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "comando");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "comando"



	// $ANTLR start "iteracao"
	// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:27:1: iteracao : 'while' rel 'do' ( comando )+ ;
	public final void iteracao() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "iteracao");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(27, 0);

		try {
			// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:27:9: ( 'while' rel 'do' ( comando )+ )
			dbg.enterAlt(1);

			// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:28:2: 'while' rel 'do' ( comando )+
			{
			dbg.location(28,2);
			match(input,20,FOLLOW_20_in_iteracao77); dbg.location(28,10);
			pushFollow(FOLLOW_rel_in_iteracao79);
			rel();
			state._fsp--;
			dbg.location(28,14);
			match(input,19,FOLLOW_19_in_iteracao81); dbg.location(28,19);
			// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:28:19: ( comando )+
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
				case INT:
					{
					alt3=1;
					}
					break;
				case 7:
					{
					alt3=1;
					}
					break;
				}
				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:28:19: comando
					{
					dbg.location(28,19);
					pushFollow(FOLLOW_comando_in_iteracao83);
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
		dbg.location(29, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "iteracao");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "iteracao"



	// $ANTLR start "expr"
	// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:31:1: expr returns [ double v ] : ( INT ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr ) | INT | '(' e= expr ')' );
	public final double expr() throws RecognitionException {
		double v = 0.0;


		Token INT1=null;
		Token INT2=null;
		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(31, 0);

		try {
			// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:31:26: ( INT ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr ) | INT | '(' e= expr ')' )
			int alt5=3;
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( (LA5_0==INT) ) {
				int LA5_1 = input.LA(2);
				if ( ((LA5_1 >= 9 && LA5_1 <= 12)) ) {
					alt5=1;
				}
				else if ( (LA5_1==EOF||LA5_1==INT||(LA5_1 >= 7 && LA5_1 <= 8)||(LA5_1 >= 19 && LA5_1 <= 20)) ) {
					alt5=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA5_0==7) ) {
				alt5=3;
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

					// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:32:2: INT ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr )
					{
					dbg.location(32,2);
					INT1=(Token)match(input,INT,FOLLOW_INT_in_expr98); dbg.location(32,6);
					v = Double.parseDouble( (INT1!=null?INT1.getText():null));dbg.location(33,5);
					// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:33:5: ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr )
					int alt4=4;
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

							// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:33:6: '+' e= expr
							{
							dbg.location(33,6);
							match(input,10,FOLLOW_10_in_expr108); dbg.location(33,12);
							pushFollow(FOLLOW_expr_in_expr114);
							e=expr();
							state._fsp--;
							dbg.location(33,19);
							v += e;dbg.location(33,33);
							System.out.println("Resultado: " + e);
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:34:7: '-' e= expr
							{
							dbg.location(34,7);
							match(input,11,FOLLOW_11_in_expr127); dbg.location(34,13);
							pushFollow(FOLLOW_expr_in_expr133);
							e=expr();
							state._fsp--;
							dbg.location(34,20);
							v -= e;dbg.location(34,34);
							System.out.println("Resultado: " + e);
							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:35:7: '*' e= expr
							{
							dbg.location(35,7);
							match(input,9,FOLLOW_9_in_expr146); dbg.location(35,13);
							pushFollow(FOLLOW_expr_in_expr152);
							e=expr();
							state._fsp--;
							dbg.location(35,20);
							v *= e;dbg.location(35,34);
							System.out.println("Resultado: " + e);
							}
							break;
						case 4 :
							dbg.enterAlt(4);

							// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:36:7: '/' e= expr
							{
							dbg.location(36,7);
							match(input,12,FOLLOW_12_in_expr165); dbg.location(36,13);
							pushFollow(FOLLOW_expr_in_expr171);
							e=expr();
							state._fsp--;
							dbg.location(36,20);
							v /= e;dbg.location(36,34);
							System.out.println("Resultado: " + e);
							}
							break;

					}
					} finally {dbg.exitSubRule(4);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:39:7: INT
					{
					dbg.location(39,7);
					INT2=(Token)match(input,INT,FOLLOW_INT_in_expr191); dbg.location(39,11);
					v = Double.parseDouble( (INT2!=null?INT2.getText():null));
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:41:7: '(' e= expr ')'
					{
					dbg.location(41,7);
					match(input,7,FOLLOW_7_in_expr202); dbg.location(41,13);
					pushFollow(FOLLOW_expr_in_expr208);
					e=expr();
					state._fsp--;
					dbg.location(41,20);
					v = e;dbg.location(41,33);
					match(input,8,FOLLOW_8_in_expr212); 
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
		dbg.location(42, 4);

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
	// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:44:1: rel returns [ boolean v ] : VAR ( '=' expr | '<>' expr | '<' expr | '>' expr | '<=' expr | '>=' expr ) ;
	public final boolean rel() throws RecognitionException {
		boolean v = false;


		try { dbg.enterRule(getGrammarFileName(), "rel");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(44, 0);

		try {
			// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:44:26: ( VAR ( '=' expr | '<>' expr | '<' expr | '>' expr | '<=' expr | '>=' expr ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:45:5: VAR ( '=' expr | '<>' expr | '<' expr | '>' expr | '<=' expr | '>=' expr )
			{
			dbg.location(45,5);
			match(input,VAR,FOLLOW_VAR_in_rel233); dbg.location(46,5);
			// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:46:5: ( '=' expr | '<>' expr | '<' expr | '>' expr | '<=' expr | '>=' expr )
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

					// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:46:7: '=' expr
					{
					dbg.location(46,7);
					match(input,16,FOLLOW_16_in_rel242); dbg.location(46,12);
					pushFollow(FOLLOW_expr_in_rel245);
					expr();
					state._fsp--;
					dbg.location(46,17);
					System.out.println("Lido '='");
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:47:7: '<>' expr
					{
					dbg.location(47,7);
					match(input,15,FOLLOW_15_in_rel256); dbg.location(47,12);
					pushFollow(FOLLOW_expr_in_rel258);
					expr();
					state._fsp--;
					dbg.location(47,17);
					System.out.println("Lido '<>'");
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:48:7: '<' expr
					{
					dbg.location(48,7);
					match(input,13,FOLLOW_13_in_rel269); dbg.location(48,12);
					pushFollow(FOLLOW_expr_in_rel272);
					expr();
					state._fsp--;
					dbg.location(48,17);
					System.out.println("Lido '<'");
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:49:7: '>' expr
					{
					dbg.location(49,7);
					match(input,17,FOLLOW_17_in_rel283); dbg.location(49,12);
					pushFollow(FOLLOW_expr_in_rel286);
					expr();
					state._fsp--;
					dbg.location(49,17);
					System.out.println("Lido '>'");
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:50:7: '<=' expr
					{
					dbg.location(50,7);
					match(input,14,FOLLOW_14_in_rel296); dbg.location(50,12);
					pushFollow(FOLLOW_expr_in_rel298);
					expr();
					state._fsp--;
					dbg.location(50,17);
					System.out.println("Lido '<='");
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:51:7: '>=' expr
					{
					dbg.location(51,7);
					match(input,18,FOLLOW_18_in_rel308); dbg.location(51,12);
					pushFollow(FOLLOW_expr_in_rel310);
					expr();
					state._fsp--;
					dbg.location(51,17);
					System.out.println("Lido '>='");
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
		dbg.location(52, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rel");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return v;
	}
	// $ANTLR end "rel"

	// Delegated rules



	public static final BitSet FOLLOW_stat_in_prog26 = new BitSet(new long[]{0x0000000000100090L});
	public static final BitSet FOLLOW_EOF_in_prog29 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comando_in_stat41 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iteracao_in_comando60 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_comando66 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_iteracao77 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rel_in_iteracao79 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_iteracao81 = new BitSet(new long[]{0x0000000000100090L});
	public static final BitSet FOLLOW_comando_in_iteracao83 = new BitSet(new long[]{0x0000000000100092L});
	public static final BitSet FOLLOW_INT_in_expr98 = new BitSet(new long[]{0x0000000000001E00L});
	public static final BitSet FOLLOW_10_in_expr108 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_expr114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_expr127 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_expr133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_expr146 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_expr152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_expr165 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_expr171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_expr191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_7_in_expr202 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_expr208 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_expr212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_rel233 = new BitSet(new long[]{0x000000000007E000L});
	public static final BitSet FOLLOW_16_in_rel242 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_rel245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_rel256 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_rel258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_rel269 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_rel272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_rel283 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_rel286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rel296 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_rel298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_rel308 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_rel310 = new BitSet(new long[]{0x0000000000000002L});
}
