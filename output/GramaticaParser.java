// $ANTLR 3.5.1 C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g 2020-11-05 20:12:56

    import java.util.HashMap;


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
		"'*'", "'+'", "'-'", "'/'", "':='", "';'", "'<'", "'<='", "'<>'", "'='", 
		"'>'", "'>='", "'do'", "'else'", "'if'", "'then'", "'while'"
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
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int INT=4;
	public static final int VAR=5;
	public static final int WS=6;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "comandos", "teste2", "stat", "iteracao", "expr", "teste", 
		"prog", "atribuicao", "rel", "comando"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false
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
	@Override public String getGrammarFileName() { return "C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g"; }


	    HashMap memory = new HashMap();



	// $ANTLR start "prog"
	// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:15:1: prog : ( stat )+ EOF ;
	public final void prog() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "prog");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(15, 0);

		try {
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:16:5: ( ( stat )+ EOF )
			dbg.enterAlt(1);

			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:17:5: ( stat )+ EOF
			{
			dbg.location(17,5);
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:17:5: ( stat )+
			int cnt1=0;
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==VAR||LA1_0==23||LA1_0==25) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:17:5: stat
					{
					dbg.location(17,5);
					pushFollow(FOLLOW_stat_in_prog41);
					stat();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt1++;
			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(17,11);
			match(input,EOF,FOLLOW_EOF_in_prog44); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(18, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "prog");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "prog"



	// $ANTLR start "stat"
	// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:20:1: stat : comandos ;
	public final void stat() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "stat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(20, 0);

		try {
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:21:5: ( comandos )
			dbg.enterAlt(1);

			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:22:2: comandos
			{
			dbg.location(22,2);
			pushFollow(FOLLOW_comandos_in_stat62);
			comandos();
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
		dbg.location(23, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "stat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "stat"



	// $ANTLR start "comandos"
	// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:25:1: comandos : ( comando ';' )+ ;
	public final void comandos() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "comandos");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(25, 0);

		try {
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:26:5: ( ( comando ';' )+ )
			dbg.enterAlt(1);

			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:27:5: ( comando ';' )+
			{
			dbg.location(27,5);
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:27:5: ( comando ';' )+
			int cnt2=0;
			try { dbg.enterSubRule(2);

			loop2:
			while (true) {
				int alt2=2;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				switch ( input.LA(1) ) {
				case VAR:
					{
					alt2=1;
					}
					break;
				case 25:
					{
					alt2=1;
					}
					break;
				case 23:
					{
					alt2=1;
					}
					break;
				}
				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:27:6: comando ';'
					{
					dbg.location(27,6);
					pushFollow(FOLLOW_comando_in_comandos82);
					comando();
					state._fsp--;
					dbg.location(27,14);
					match(input,14,FOLLOW_14_in_comandos84); 
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt2++;
			}
			} finally {dbg.exitSubRule(2);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(28, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "comandos");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "comandos"



	// $ANTLR start "comando"
	// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:30:1: comando : ( atribuicao | iteracao | teste );
	public final void comando() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "comando");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(30, 0);

		try {
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:31:5: ( atribuicao | iteracao | teste )
			int alt3=3;
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			switch ( input.LA(1) ) {
			case VAR:
				{
				alt3=1;
				}
				break;
			case 25:
				{
				alt3=2;
				}
				break;
			case 23:
				{
				alt3=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:32:5: atribuicao
					{
					dbg.location(32,5);
					pushFollow(FOLLOW_atribuicao_in_comando108);
					atribuicao();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:33:7: iteracao
					{
					dbg.location(33,7);
					pushFollow(FOLLOW_iteracao_in_comando116);
					iteracao();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:34:4: teste
					{
					dbg.location(34,4);
					pushFollow(FOLLOW_teste_in_comando121);
					teste();
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
		dbg.location(35, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "comando");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "comando"



	// $ANTLR start "iteracao"
	// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:37:1: iteracao : 'while' rel 'do' comandos ;
	public final void iteracao() throws RecognitionException {
		boolean rel1 =false;

		try { dbg.enterRule(getGrammarFileName(), "iteracao");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(37, 0);

		try {
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:38:5: ( 'while' rel 'do' comandos )
			dbg.enterAlt(1);

			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:39:2: 'while' rel 'do' comandos
			{
			dbg.location(39,2);
			match(input,25,FOLLOW_25_in_iteracao137); dbg.location(39,10);
			pushFollow(FOLLOW_rel_in_iteracao139);
			rel1=rel();
			state._fsp--;
			dbg.location(39,15);
			match(input,21,FOLLOW_21_in_iteracao142); dbg.location(39,20);
			pushFollow(FOLLOW_comandos_in_iteracao144);
			comandos();
			state._fsp--;
			dbg.location(40,5);
			 System.out.println("Resultado relacional: " + rel1); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(41, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "iteracao");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "iteracao"



	// $ANTLR start "atribuicao"
	// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:43:1: atribuicao : VAR ':=' expr ;
	public final void atribuicao() throws RecognitionException {
		Token VAR2=null;
		double expr3 =0.0;

		try { dbg.enterRule(getGrammarFileName(), "atribuicao");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(43, 0);

		try {
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:44:5: ( VAR ':=' expr )
			dbg.enterAlt(1);

			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:45:5: VAR ':=' expr
			{
			dbg.location(45,5);
			VAR2=(Token)match(input,VAR,FOLLOW_VAR_in_atribuicao169); dbg.location(45,9);
			match(input,13,FOLLOW_13_in_atribuicao171); dbg.location(45,14);
			pushFollow(FOLLOW_expr_in_atribuicao173);
			expr3=expr();
			state._fsp--;
			dbg.location(46,5);
			 memory.put((VAR2!=null?VAR2.getText():null), new Double(expr3)); dbg.location(47,5);
			 System.out.println("Variavel " + (VAR2!=null?VAR2.getText():null) + " = " + expr3); dbg.location(48,5);
			 System.out.println("memory: " + (VAR2!=null?VAR2.getText():null) + " = " + memory.get((VAR2!=null?VAR2.getText():null))); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(49, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atribuicao");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "atribuicao"



	// $ANTLR start "teste"
	// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:51:1: teste : ( 'if' rel 'then' comandos ) teste2 ;
	public final void teste() throws RecognitionException {
		boolean rel4 =false;

		try { dbg.enterRule(getGrammarFileName(), "teste");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(51, 0);

		try {
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:52:5: ( ( 'if' rel 'then' comandos ) teste2 )
			dbg.enterAlt(1);

			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:53:2: ( 'if' rel 'then' comandos ) teste2
			{
			dbg.location(53,2);
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:53:2: ( 'if' rel 'then' comandos )
			dbg.enterAlt(1);

			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:53:3: 'if' rel 'then' comandos
			{
			dbg.location(53,3);
			match(input,23,FOLLOW_23_in_teste212); dbg.location(53,8);
			pushFollow(FOLLOW_rel_in_teste214);
			rel4=rel();
			state._fsp--;
			dbg.location(53,12);
			match(input,24,FOLLOW_24_in_teste216); dbg.location(53,19);
			pushFollow(FOLLOW_comandos_in_teste218);
			comandos();
			state._fsp--;

			}
			dbg.location(53,29);
			pushFollow(FOLLOW_teste2_in_teste221);
			teste2();
			state._fsp--;
			dbg.location(54,5);
			 System.out.println("Resultado relacional: " + rel4); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(55, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "teste");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "teste"



	// $ANTLR start "teste2"
	// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:57:1: teste2 : ( ( 'else' comandos ) |);
	public final void teste2() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "teste2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(57, 0);

		try {
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:58:5: ( ( 'else' comandos ) |)
			int alt4=2;
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==22) ) {
				alt4=1;
			}
			else if ( (LA4_0==14) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:59:2: ( 'else' comandos )
					{
					dbg.location(59,2);
					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:59:2: ( 'else' comandos )
					dbg.enterAlt(1);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:59:3: 'else' comandos
					{
					dbg.location(59,3);
					match(input,22,FOLLOW_22_in_teste2246); dbg.location(59,10);
					pushFollow(FOLLOW_comandos_in_teste2248);
					comandos();
					state._fsp--;

					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:61:2: 
					{
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
		dbg.location(61, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "teste2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "teste2"



	// $ANTLR start "expr"
	// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:63:1: expr returns [ double v ] : ( INT ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr |) | '(' e= expr ')' );
	public final double expr() throws RecognitionException {
		double v = 0.0;


		Token INT5=null;
		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(63, 0);

		try {
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:64:5: ( INT ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr |) | '(' e= expr ')' )
			int alt6=2;
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==INT) ) {
				alt6=1;
			}
			else if ( (LA6_0==7) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:65:5: INT ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr |)
					{
					dbg.location(65,5);
					INT5=(Token)match(input,INT,FOLLOW_INT_in_expr274); dbg.location(65,9);
					 v = Double.parseDouble((INT5!=null?INT5.getText():null)); dbg.location(66,5);
					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:66:5: ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr |)
					int alt5=5;
					try { dbg.enterSubRule(5);
					try { dbg.enterDecision(5, decisionCanBacktrack[5]);

					switch ( input.LA(1) ) {
					case 10:
						{
						alt5=1;
						}
						break;
					case 11:
						{
						alt5=2;
						}
						break;
					case 9:
						{
						alt5=3;
						}
						break;
					case 12:
						{
						alt5=4;
						}
						break;
					case 8:
					case 14:
					case 15:
					case 16:
					case 17:
					case 18:
					case 19:
					case 20:
					case 21:
					case 24:
						{
						alt5=5;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 5, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(5);}

					switch (alt5) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:66:7: '+' e= expr
							{
							dbg.location(66,7);
							match(input,10,FOLLOW_10_in_expr285); dbg.location(66,13);
							pushFollow(FOLLOW_expr_in_expr291);
							e=expr();
							state._fsp--;
							dbg.location(66,20);
							v += e;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:67:7: '-' e= expr
							{
							dbg.location(67,7);
							match(input,11,FOLLOW_11_in_expr302); dbg.location(67,13);
							pushFollow(FOLLOW_expr_in_expr308);
							e=expr();
							state._fsp--;
							dbg.location(67,20);
							v -= e;
							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:68:7: '*' e= expr
							{
							dbg.location(68,7);
							match(input,9,FOLLOW_9_in_expr319); dbg.location(68,13);
							pushFollow(FOLLOW_expr_in_expr325);
							e=expr();
							state._fsp--;
							dbg.location(68,20);
							v *= e;
							}
							break;
						case 4 :
							dbg.enterAlt(4);

							// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:69:7: '/' e= expr
							{
							dbg.location(69,7);
							match(input,12,FOLLOW_12_in_expr336); dbg.location(69,13);
							pushFollow(FOLLOW_expr_in_expr342);
							e=expr();
							state._fsp--;
							dbg.location(69,20);
							v /= e;
							}
							break;
						case 5 :
							dbg.enterAlt(5);

							// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:71:5: 
							{
							}
							break;

					}
					} finally {dbg.exitSubRule(5);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:72:7: '(' e= expr ')'
					{
					dbg.location(72,7);
					match(input,7,FOLLOW_7_in_expr365); dbg.location(72,13);
					pushFollow(FOLLOW_expr_in_expr371);
					e=expr();
					state._fsp--;
					dbg.location(72,20);
					v = e;dbg.location(72,33);
					match(input,8,FOLLOW_8_in_expr375); 
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
		dbg.location(73, 4);

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
	// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:75:1: rel returns [ boolean t ] : (e= expr ) ( '=' d= expr | '<>' d= expr | '<' d= expr | '>' d= expr | '<=' d= expr | '>=' d= expr ) ;
	public final boolean rel() throws RecognitionException {
		boolean t = false;


		double e =0.0;
		double d =0.0;

		try { dbg.enterRule(getGrammarFileName(), "rel");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(75, 0);

		try {
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:76:5: ( (e= expr ) ( '=' d= expr | '<>' d= expr | '<' d= expr | '>' d= expr | '<=' d= expr | '>=' d= expr ) )
			dbg.enterAlt(1);

			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:77:5: (e= expr ) ( '=' d= expr | '<>' d= expr | '<' d= expr | '>' d= expr | '<=' d= expr | '>=' d= expr )
			{
			dbg.location(77,5);
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:77:5: (e= expr )
			dbg.enterAlt(1);

			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:77:7: e= expr
			{
			dbg.location(77,9);
			pushFollow(FOLLOW_expr_in_rel407);
			e=expr();
			state._fsp--;
			dbg.location(77,16);
			System.out.println("Resultado: " + e);
			}
			dbg.location(78,5);
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:78:5: ( '=' d= expr | '<>' d= expr | '<' d= expr | '>' d= expr | '<=' d= expr | '>=' d= expr )
			int alt7=6;
			try { dbg.enterSubRule(7);
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			switch ( input.LA(1) ) {
			case 18:
				{
				alt7=1;
				}
				break;
			case 17:
				{
				alt7=2;
				}
				break;
			case 15:
				{
				alt7=3;
				}
				break;
			case 19:
				{
				alt7=4;
				}
				break;
			case 16:
				{
				alt7=5;
				}
				break;
			case 20:
				{
				alt7=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:78:7: '=' d= expr
					{
					dbg.location(78,7);
					match(input,18,FOLLOW_18_in_rel419); dbg.location(78,14);
					pushFollow(FOLLOW_expr_in_rel426);
					d=expr();
					state._fsp--;
					dbg.location(78,21);
					System.out.println("Lido '='" );dbg.location(78,56);
					System.out.println("Resultado: " + d);dbg.location(78,100);
					t = e == d;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:79:7: '<>' d= expr
					{
					dbg.location(79,7);
					match(input,17,FOLLOW_17_in_rel440); dbg.location(79,14);
					pushFollow(FOLLOW_expr_in_rel446);
					d=expr();
					state._fsp--;
					dbg.location(79,21);
					System.out.println("Lido '<>'");dbg.location(79,56);
					System.out.println("Resultado: " + d);dbg.location(79,100);
					t = e != d;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:80:7: '<' d= expr
					{
					dbg.location(80,7);
					match(input,15,FOLLOW_15_in_rel460); dbg.location(80,14);
					pushFollow(FOLLOW_expr_in_rel467);
					d=expr();
					state._fsp--;
					dbg.location(80,21);
					System.out.println("Lido '<'" );dbg.location(80,56);
					System.out.println("Resultado: " + d);dbg.location(80,100);
					t = e <  d;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:81:7: '>' d= expr
					{
					dbg.location(81,7);
					match(input,19,FOLLOW_19_in_rel481); dbg.location(81,14);
					pushFollow(FOLLOW_expr_in_rel488);
					d=expr();
					state._fsp--;
					dbg.location(81,21);
					System.out.println("Lido '>'" );dbg.location(81,56);
					System.out.println("Resultado: " + d);dbg.location(81,100);
					t = e >  d;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:82:7: '<=' d= expr
					{
					dbg.location(82,7);
					match(input,16,FOLLOW_16_in_rel502); dbg.location(82,14);
					pushFollow(FOLLOW_expr_in_rel508);
					d=expr();
					state._fsp--;
					dbg.location(82,21);
					System.out.println("Lido '<='");dbg.location(82,56);
					System.out.println("Resultado: " + d);dbg.location(82,100);
					t = e <= d;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:83:7: '>=' d= expr
					{
					dbg.location(83,7);
					match(input,20,FOLLOW_20_in_rel522); dbg.location(83,14);
					pushFollow(FOLLOW_expr_in_rel528);
					d=expr();
					state._fsp--;
					dbg.location(83,21);
					System.out.println("Lido '>='");dbg.location(83,56);
					System.out.println("Resultado: " + d);dbg.location(83,100);
					t = e >= d;
					}
					break;

			}
			} finally {dbg.exitSubRule(7);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(85, 4);

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



	public static final BitSet FOLLOW_stat_in_prog41 = new BitSet(new long[]{0x0000000002800020L});
	public static final BitSet FOLLOW_EOF_in_prog44 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comandos_in_stat62 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comando_in_comandos82 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_comandos84 = new BitSet(new long[]{0x0000000002800022L});
	public static final BitSet FOLLOW_atribuicao_in_comando108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iteracao_in_comando116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_teste_in_comando121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_iteracao137 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_rel_in_iteracao139 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_iteracao142 = new BitSet(new long[]{0x0000000002800020L});
	public static final BitSet FOLLOW_comandos_in_iteracao144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atribuicao169 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_atribuicao171 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_atribuicao173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_teste212 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_rel_in_teste214 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_teste216 = new BitSet(new long[]{0x0000000002800020L});
	public static final BitSet FOLLOW_comandos_in_teste218 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_teste2_in_teste221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_teste2246 = new BitSet(new long[]{0x0000000002800020L});
	public static final BitSet FOLLOW_comandos_in_teste2248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_expr274 = new BitSet(new long[]{0x0000000000001E02L});
	public static final BitSet FOLLOW_10_in_expr285 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_expr291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_expr302 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_expr308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_expr319 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_expr325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_expr336 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_expr342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_7_in_expr365 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_expr371 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_expr375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_rel407 = new BitSet(new long[]{0x00000000001F8000L});
	public static final BitSet FOLLOW_18_in_rel419 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_rel426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_rel440 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_rel446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_rel460 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_rel467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_rel481 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_rel488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_rel502 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_rel508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_rel522 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_rel528 = new BitSet(new long[]{0x0000000000000002L});
}
