// $ANTLR 3.5.1 C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g 2020-11-06 16:22:27

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
		"invalidRule", "prog", "atribuicao", "stat", "teste", "comando", "iteracao", 
		"rel", "expr", "teste2", "comandos"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false
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


	    HashMap<String, Double> memory = new HashMap<>();



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
			rel();
			state._fsp--;
			dbg.location(39,14);
			match(input,21,FOLLOW_21_in_iteracao141); dbg.location(39,19);
			pushFollow(FOLLOW_comandos_in_iteracao143);
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
		dbg.location(40, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "iteracao");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "iteracao"



	// $ANTLR start "atribuicao"
	// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:42:1: atribuicao : VAR ':=' expr ;
	public final void atribuicao() throws RecognitionException {
		Token VAR1=null;
		double expr2 =0.0;

		try { dbg.enterRule(getGrammarFileName(), "atribuicao");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(42, 0);

		try {
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:43:5: ( VAR ':=' expr )
			dbg.enterAlt(1);

			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:44:5: VAR ':=' expr
			{
			dbg.location(44,5);
			VAR1=(Token)match(input,VAR,FOLLOW_VAR_in_atribuicao161); dbg.location(44,9);
			match(input,13,FOLLOW_13_in_atribuicao163); dbg.location(44,14);
			pushFollow(FOLLOW_expr_in_atribuicao165);
			expr2=expr();
			state._fsp--;
			dbg.location(45,5);
			 memory.put((VAR1!=null?VAR1.getText():null), new Double(expr2)); dbg.location(46,5);
			 System.out.println("Variavel " + (VAR1!=null?VAR1.getText():null) + " : " + expr2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(47, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atribuicao");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "atribuicao"



	// $ANTLR start "teste"
	// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:49:1: teste : ( 'if' rel 'then' comandos ) teste2 ;
	public final void teste() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "teste");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(49, 0);

		try {
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:50:5: ( ( 'if' rel 'then' comandos ) teste2 )
			dbg.enterAlt(1);

			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:51:2: ( 'if' rel 'then' comandos ) teste2
			{
			dbg.location(51,2);
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:51:2: ( 'if' rel 'then' comandos )
			dbg.enterAlt(1);

			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:51:3: 'if' rel 'then' comandos
			{
			dbg.location(51,3);
			match(input,23,FOLLOW_23_in_teste198); dbg.location(51,8);
			pushFollow(FOLLOW_rel_in_teste200);
			rel();
			state._fsp--;
			dbg.location(51,12);
			match(input,24,FOLLOW_24_in_teste202); dbg.location(51,19);
			pushFollow(FOLLOW_comandos_in_teste204);
			comandos();
			state._fsp--;

			}
			dbg.location(51,29);
			pushFollow(FOLLOW_teste2_in_teste207);
			teste2();
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
		dbg.location(52, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "teste");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "teste"



	// $ANTLR start "teste2"
	// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:54:1: teste2 : ( ( 'else' comandos ) |);
	public final void teste2() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "teste2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(54, 0);

		try {
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:55:5: ( ( 'else' comandos ) |)
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

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:56:2: ( 'else' comandos )
					{
					dbg.location(56,2);
					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:56:2: ( 'else' comandos )
					dbg.enterAlt(1);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:56:3: 'else' comandos
					{
					dbg.location(56,3);
					match(input,22,FOLLOW_22_in_teste2226); dbg.location(56,10);
					pushFollow(FOLLOW_comandos_in_teste2228);
					comandos();
					state._fsp--;

					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:58:2: 
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
		dbg.location(58, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "teste2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "teste2"



	// $ANTLR start "expr"
	// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:60:1: expr returns [ double v ] : ( ( INT | VAR ) ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr |) | '(' e= expr ')' );
	public final double expr() throws RecognitionException {
		double v = 0.0;


		Token INT3=null;
		Token VAR4=null;
		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(60, 0);

		try {
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:61:5: ( ( INT | VAR ) ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr |) | '(' e= expr ')' )
			int alt7=2;
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			int LA7_0 = input.LA(1);
			if ( ((LA7_0 >= INT && LA7_0 <= VAR)) ) {
				alt7=1;
			}
			else if ( (LA7_0==7) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:62:5: ( INT | VAR ) ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr |)
					{
					dbg.location(62,5);
					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:62:5: ( INT | VAR )
					int alt5=2;
					try { dbg.enterSubRule(5);
					try { dbg.enterDecision(5, decisionCanBacktrack[5]);

					int LA5_0 = input.LA(1);
					if ( (LA5_0==INT) ) {
						alt5=1;
					}
					else if ( (LA5_0==VAR) ) {
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

							// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:62:7: INT
							{
							dbg.location(62,7);
							INT3=(Token)match(input,INT,FOLLOW_INT_in_expr256); dbg.location(62,11);
							 v = Double.parseDouble((INT3!=null?INT3.getText():null)); dbg.location(62,51);
							System.out.println("lido: " + v);
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:63:7: VAR
							{
							dbg.location(63,7);
							VAR4=(Token)match(input,VAR,FOLLOW_VAR_in_expr268); dbg.location(63,11);
							 v = memory.getOrDefault((VAR4!=null?VAR4.getText():null), 0.0); dbg.location(63,57);
							System.out.println("lido: " + v);
							}
							break;

					}
					} finally {dbg.exitSubRule(5);}
					dbg.location(64,5);
					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:64:5: ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr |)
					int alt6=5;
					try { dbg.enterSubRule(6);
					try { dbg.enterDecision(6, decisionCanBacktrack[6]);

					switch ( input.LA(1) ) {
					case 10:
						{
						alt6=1;
						}
						break;
					case 11:
						{
						alt6=2;
						}
						break;
					case 9:
						{
						alt6=3;
						}
						break;
					case 12:
						{
						alt6=4;
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
						alt6=5;
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

							// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:64:7: '+' e= expr
							{
							dbg.location(64,7);
							match(input,10,FOLLOW_10_in_expr282); dbg.location(64,11);
							System.out.println("lido: + ");dbg.location(64,47);
							pushFollow(FOLLOW_expr_in_expr290);
							e=expr();
							state._fsp--;
							dbg.location(64,54);
							v += e;dbg.location(64,68);
							System.out.println("Resultado da soma: " + v);
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:65:7: '-' e= expr
							{
							dbg.location(65,7);
							match(input,11,FOLLOW_11_in_expr302); dbg.location(65,11);
							System.out.println("lido: - ");dbg.location(65,47);
							pushFollow(FOLLOW_expr_in_expr310);
							e=expr();
							state._fsp--;
							dbg.location(65,54);
							v -= e;dbg.location(65,68);
							System.out.println("Resultado da subtracao: " + v);
							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:66:7: '*' e= expr
							{
							dbg.location(66,7);
							match(input,9,FOLLOW_9_in_expr322); dbg.location(66,11);
							System.out.println("lido: * ");dbg.location(66,47);
							pushFollow(FOLLOW_expr_in_expr330);
							e=expr();
							state._fsp--;
							dbg.location(66,54);
							v *= e;dbg.location(66,68);
							System.out.println("Resultado da multiplicacao: " + v);
							}
							break;
						case 4 :
							dbg.enterAlt(4);

							// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:67:7: '/' e= expr
							{
							dbg.location(67,7);
							match(input,12,FOLLOW_12_in_expr342); dbg.location(67,11);
							System.out.println("lido: / ");dbg.location(67,47);
							pushFollow(FOLLOW_expr_in_expr350);
							e=expr();
							state._fsp--;
							dbg.location(67,54);
							v /= e;dbg.location(67,68);
							System.out.println("Resultado da divisao: " + v);
							}
							break;
						case 5 :
							dbg.enterAlt(5);

							// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:69:5: 
							{
							}
							break;

					}
					} finally {dbg.exitSubRule(6);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:70:7: '(' e= expr ')'
					{
					dbg.location(70,7);
					match(input,7,FOLLOW_7_in_expr374); dbg.location(70,13);
					pushFollow(FOLLOW_expr_in_expr380);
					e=expr();
					state._fsp--;
					dbg.location(70,20);
					v = e;dbg.location(70,33);
					match(input,8,FOLLOW_8_in_expr384); 
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
		dbg.location(71, 4);

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
	// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:73:1: rel returns [ boolean t ] : (e= expr ) ( '=' d= expr | '<>' d= expr | '<' d= expr | '>' d= expr | '<=' d= expr | '>=' d= expr ) ;
	public final boolean rel() throws RecognitionException {
		boolean t = false;


		double e =0.0;
		double d =0.0;

		try { dbg.enterRule(getGrammarFileName(), "rel");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(73, 0);

		try {
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:74:5: ( (e= expr ) ( '=' d= expr | '<>' d= expr | '<' d= expr | '>' d= expr | '<=' d= expr | '>=' d= expr ) )
			dbg.enterAlt(1);

			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:75:5: (e= expr ) ( '=' d= expr | '<>' d= expr | '<' d= expr | '>' d= expr | '<=' d= expr | '>=' d= expr )
			{
			dbg.location(75,5);
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:75:5: (e= expr )
			dbg.enterAlt(1);

			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:75:7: e= expr
			{
			dbg.location(75,9);
			pushFollow(FOLLOW_expr_in_rel416);
			e=expr();
			state._fsp--;

			}
			dbg.location(76,5);
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:76:5: ( '=' d= expr | '<>' d= expr | '<' d= expr | '>' d= expr | '<=' d= expr | '>=' d= expr )
			int alt8=6;
			try { dbg.enterSubRule(8);
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			switch ( input.LA(1) ) {
			case 18:
				{
				alt8=1;
				}
				break;
			case 17:
				{
				alt8=2;
				}
				break;
			case 15:
				{
				alt8=3;
				}
				break;
			case 19:
				{
				alt8=4;
				}
				break;
			case 16:
				{
				alt8=5;
				}
				break;
			case 20:
				{
				alt8=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:76:7: '=' d= expr
					{
					dbg.location(76,7);
					match(input,18,FOLLOW_18_in_rel427); dbg.location(76,14);
					pushFollow(FOLLOW_expr_in_rel434);
					d=expr();
					state._fsp--;
					dbg.location(76,21);
					t = e == d;dbg.location(76,42);
					System.out.println(e + " = " + d + " : " + t);
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:77:7: '<>' d= expr
					{
					dbg.location(77,7);
					match(input,17,FOLLOW_17_in_rel446); dbg.location(77,14);
					pushFollow(FOLLOW_expr_in_rel452);
					d=expr();
					state._fsp--;
					dbg.location(77,21);
					t = e != d;dbg.location(77,42);
					System.out.println(e + " <> " + d + " : " + t);
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:78:7: '<' d= expr
					{
					dbg.location(78,7);
					match(input,15,FOLLOW_15_in_rel464); dbg.location(78,14);
					pushFollow(FOLLOW_expr_in_rel471);
					d=expr();
					state._fsp--;
					dbg.location(78,21);
					t = e <  d;dbg.location(78,42);
					System.out.println(e + " < " + d + " : " + t);
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:79:7: '>' d= expr
					{
					dbg.location(79,7);
					match(input,19,FOLLOW_19_in_rel483); dbg.location(79,14);
					pushFollow(FOLLOW_expr_in_rel490);
					d=expr();
					state._fsp--;
					dbg.location(79,21);
					t = e >  d;dbg.location(79,42);
					System.out.println(e + " > " + d + " : " + t);
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:80:7: '<=' d= expr
					{
					dbg.location(80,7);
					match(input,16,FOLLOW_16_in_rel502); dbg.location(80,14);
					pushFollow(FOLLOW_expr_in_rel508);
					d=expr();
					state._fsp--;
					dbg.location(80,21);
					t = e <= d;dbg.location(80,42);
					System.out.println(e + " <= " + d + " : " + t);
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:81:7: '>=' d= expr
					{
					dbg.location(81,7);
					match(input,20,FOLLOW_20_in_rel520); dbg.location(81,14);
					pushFollow(FOLLOW_expr_in_rel526);
					d=expr();
					state._fsp--;
					dbg.location(81,21);
					t = e >= d;dbg.location(81,42);
					System.out.println(e + " >= " + d + " : " + t);
					}
					break;

			}
			} finally {dbg.exitSubRule(8);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(83, 4);

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
	public static final BitSet FOLLOW_25_in_iteracao137 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_rel_in_iteracao139 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_iteracao141 = new BitSet(new long[]{0x0000000002800020L});
	public static final BitSet FOLLOW_comandos_in_iteracao143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atribuicao161 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_atribuicao163 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_in_atribuicao165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_teste198 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_rel_in_teste200 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_teste202 = new BitSet(new long[]{0x0000000002800020L});
	public static final BitSet FOLLOW_comandos_in_teste204 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_teste2_in_teste207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_teste2226 = new BitSet(new long[]{0x0000000002800020L});
	public static final BitSet FOLLOW_comandos_in_teste2228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_expr256 = new BitSet(new long[]{0x0000000000001E02L});
	public static final BitSet FOLLOW_VAR_in_expr268 = new BitSet(new long[]{0x0000000000001E02L});
	public static final BitSet FOLLOW_10_in_expr282 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_in_expr290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_expr302 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_in_expr310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_expr322 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_in_expr330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_expr342 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_in_expr350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_7_in_expr374 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_in_expr380 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_expr384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_rel416 = new BitSet(new long[]{0x00000000001F8000L});
	public static final BitSet FOLLOW_18_in_rel427 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_in_rel434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_rel446 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_in_rel452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_rel464 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_in_rel471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_rel483 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_in_rel490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_rel502 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_in_rel508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_rel520 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_in_rel526 = new BitSet(new long[]{0x0000000000000002L});
}
