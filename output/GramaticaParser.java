// $ANTLR 3.5.1 C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g 2020-11-08 18:45:11

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "DO", "ELSE", "IF", "INT", "THEN", 
		"VAR", "WHILE", "WS", "'('", "')'", "'*'", "'+'", "'-'", "'/'", "':='", 
		"';'", "'<'", "'<='", "'<>'", "'='", "'>'", "'>='"
	};
	public static final int EOF=-1;
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
	public static final int DO=4;
	public static final int ELSE=5;
	public static final int IF=6;
	public static final int INT=7;
	public static final int THEN=8;
	public static final int VAR=9;
	public static final int WHILE=10;
	public static final int WS=11;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "prog", "comandos", "atribuicao", "comando", "expr", "condicao", 
		"rel", "stat", "iteracao"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false
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
	    boolean result = false;



	// $ANTLR start "prog"
	// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:16:1: prog : ( stat )+ EOF ;
	public final void prog() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "prog");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(16, 0);

		try {
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:17:5: ( ( stat )+ EOF )
			dbg.enterAlt(1);

			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:18:5: ( stat )+ EOF
			{
			dbg.location(18,5);
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:18:5: ( stat )+
			int cnt1=0;
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==IF||(LA1_0 >= VAR && LA1_0 <= WHILE)) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:18:5: stat
					{
					dbg.location(18,5);
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
			dbg.location(18,11);
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
		dbg.location(19, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "prog");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "prog"



	// $ANTLR start "stat"
	// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:21:1: stat : comandos ;
	public final void stat() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "stat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(21, 0);

		try {
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:22:5: ( comandos )
			dbg.enterAlt(1);

			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:23:2: comandos
			{
			dbg.location(23,2);
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
		dbg.location(24, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "stat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "stat"



	// $ANTLR start "comandos"
	// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:26:1: comandos : ( comando ';' )+ ;
	public final void comandos() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "comandos");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(26, 0);

		try {
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:27:5: ( ( comando ';' )+ )
			dbg.enterAlt(1);

			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:28:5: ( comando ';' )+
			{
			dbg.location(28,5);
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:28:5: ( comando ';' )+
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
				case WHILE:
					{
					alt2=1;
					}
					break;
				case IF:
					{
					alt2=1;
					}
					break;
				}
				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:28:6: comando ';'
					{
					dbg.location(28,6);
					pushFollow(FOLLOW_comando_in_comandos82);
					comando();
					state._fsp--;
					dbg.location(28,14);
					match(input,19,FOLLOW_19_in_comandos84); 
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
		dbg.location(29, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "comandos");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "comandos"



	// $ANTLR start "comando"
	// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:31:1: comando : ( atribuicao | iteracao | condicao );
	public final void comando() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "comando");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(31, 0);

		try {
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:32:5: ( atribuicao | iteracao | condicao )
			int alt3=3;
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			switch ( input.LA(1) ) {
			case VAR:
				{
				alt3=1;
				}
				break;
			case WHILE:
				{
				alt3=2;
				}
				break;
			case IF:
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

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:33:5: atribuicao
					{
					dbg.location(33,5);
					pushFollow(FOLLOW_atribuicao_in_comando108);
					atribuicao();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:34:7: iteracao
					{
					dbg.location(34,7);
					pushFollow(FOLLOW_iteracao_in_comando116);
					iteracao();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:35:4: condicao
					{
					dbg.location(35,4);
					pushFollow(FOLLOW_condicao_in_comando121);
					condicao();
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
		dbg.location(36, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "comando");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "comando"



	// $ANTLR start "iteracao"
	// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:38:1: iteracao : 'while' rel 'do' comandos ;
	public final void iteracao() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "iteracao");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(38, 0);

		try {
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:39:5: ( 'while' rel 'do' comandos )
			dbg.enterAlt(1);

			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:40:2: 'while' rel 'do' comandos
			{
			dbg.location(40,2);
			match(input,WHILE,FOLLOW_WHILE_in_iteracao137); dbg.location(40,10);
			pushFollow(FOLLOW_rel_in_iteracao139);
			rel();
			state._fsp--;
			dbg.location(40,14);
			match(input,DO,FOLLOW_DO_in_iteracao141); dbg.location(40,19);
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
		Token VAR1=null;
		double expr2 =0.0;

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
			VAR1=(Token)match(input,VAR,FOLLOW_VAR_in_atribuicao161); dbg.location(45,9);
			match(input,18,FOLLOW_18_in_atribuicao163); dbg.location(45,14);
			pushFollow(FOLLOW_expr_in_atribuicao165);
			expr2=expr();
			state._fsp--;
			dbg.location(46,5);
			 memory.put((VAR1!=null?VAR1.getText():null), new Double(expr2)); dbg.location(47,5);
			 System.out.println("Variavel " + (VAR1!=null?VAR1.getText():null) + " = " + expr2 + " inserida na memória"); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(48, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atribuicao");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "atribuicao"



	// $ANTLR start "condicao"
	// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:50:1: condicao : IF rel ( THEN comandos )? ( ELSE comandos )? ;
	public final void condicao() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "condicao");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(50, 0);

		try {
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:51:5: ( IF rel ( THEN comandos )? ( ELSE comandos )? )
			dbg.enterAlt(1);

			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:53:7: IF rel ( THEN comandos )? ( ELSE comandos )?
			{
			dbg.location(53,7);
			match(input,IF,FOLLOW_IF_in_condicao209); dbg.location(53,10);
			pushFollow(FOLLOW_rel_in_condicao211);
			rel();
			state._fsp--;
			dbg.location(54,8);
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:54:8: ( THEN comandos )?
			int alt4=2;
			try { dbg.enterSubRule(4);
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==THEN) ) {
				alt4=1;
			}
			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:54:9: THEN comandos
					{
					dbg.location(54,9);
					match(input,THEN,FOLLOW_THEN_in_condicao221); dbg.location(54,14);
					pushFollow(FOLLOW_comandos_in_condicao223);
					comandos();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(4);}
			dbg.location(55,8);
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:55:8: ( ELSE comandos )?
			int alt5=2;
			try { dbg.enterSubRule(5);
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( (LA5_0==ELSE) ) {
				alt5=1;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:55:9: ELSE comandos
					{
					dbg.location(55,9);
					match(input,ELSE,FOLLOW_ELSE_in_condicao235); dbg.location(55,14);
					pushFollow(FOLLOW_comandos_in_condicao237);
					comandos();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(5);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(56, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "condicao");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "condicao"



	// $ANTLR start "expr"
	// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:64:1: expr returns [ double v ] : ( ( INT | VAR ) ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr |) | '(' e= expr ')' );
	public final double expr() throws RecognitionException {
		double v = 0.0;


		Token INT3=null;
		Token VAR4=null;
		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(64, 0);

		try {
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:65:5: ( ( INT | VAR ) ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr |) | '(' e= expr ')' )
			int alt8=2;
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			int LA8_0 = input.LA(1);
			if ( (LA8_0==INT||LA8_0==VAR) ) {
				alt8=1;
			}
			else if ( (LA8_0==12) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:68:5: ( INT | VAR ) ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr |)
					{
					dbg.location(68,5);
					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:68:5: ( INT | VAR )
					int alt6=2;
					try { dbg.enterSubRule(6);
					try { dbg.enterDecision(6, decisionCanBacktrack[6]);

					int LA6_0 = input.LA(1);
					if ( (LA6_0==INT) ) {
						alt6=1;
					}
					else if ( (LA6_0==VAR) ) {
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

							// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:68:7: INT
							{
							dbg.location(68,7);
							INT3=(Token)match(input,INT,FOLLOW_INT_in_expr283); dbg.location(68,11);
							 v = Double.parseDouble((INT3!=null?INT3.getText():null)); dbg.location(68,51);
							System.out.println("Lido valor constante: " + v);
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:69:7: VAR
							{
							dbg.location(69,7);
							VAR4=(Token)match(input,VAR,FOLLOW_VAR_in_expr295); dbg.location(69,11);
							 v = memory.getOrDefault((VAR4!=null?VAR4.getText():null), 0.0); dbg.location(69,57);
							System.out.println("Lido da memória de variáveis: " + v);
							}
							break;

					}
					} finally {dbg.exitSubRule(6);}
					dbg.location(70,5);
					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:70:5: ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr |)
					int alt7=5;
					try { dbg.enterSubRule(7);
					try { dbg.enterDecision(7, decisionCanBacktrack[7]);

					switch ( input.LA(1) ) {
					case 15:
						{
						alt7=1;
						}
						break;
					case 16:
						{
						alt7=2;
						}
						break;
					case 14:
						{
						alt7=3;
						}
						break;
					case 17:
						{
						alt7=4;
						}
						break;
					case DO:
					case ELSE:
					case THEN:
					case 13:
					case 19:
					case 20:
					case 21:
					case 22:
					case 23:
					case 24:
					case 25:
						{
						alt7=5;
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

							// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:70:7: '+' e= expr
							{
							dbg.location(70,7);
							match(input,15,FOLLOW_15_in_expr309); dbg.location(70,11);
							System.out.println("lido: + ");dbg.location(70,47);
							pushFollow(FOLLOW_expr_in_expr317);
							e=expr();
							state._fsp--;
							dbg.location(70,54);
							v += e;dbg.location(70,68);
							System.out.println("Resultado da soma: " + v);
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:71:7: '-' e= expr
							{
							dbg.location(71,7);
							match(input,16,FOLLOW_16_in_expr329); dbg.location(71,11);
							System.out.println("lido: - ");dbg.location(71,47);
							pushFollow(FOLLOW_expr_in_expr337);
							e=expr();
							state._fsp--;
							dbg.location(71,54);
							v -= e;dbg.location(71,68);
							System.out.println("Resultado da subtracao: " + v);
							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:72:7: '*' e= expr
							{
							dbg.location(72,7);
							match(input,14,FOLLOW_14_in_expr349); dbg.location(72,11);
							System.out.println("lido: * ");dbg.location(72,47);
							pushFollow(FOLLOW_expr_in_expr357);
							e=expr();
							state._fsp--;
							dbg.location(72,54);
							v *= e;dbg.location(72,68);
							System.out.println("Resultado da multiplicacao: " + v);
							}
							break;
						case 4 :
							dbg.enterAlt(4);

							// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:73:7: '/' e= expr
							{
							dbg.location(73,7);
							match(input,17,FOLLOW_17_in_expr369); dbg.location(73,11);
							System.out.println("lido: / ");dbg.location(73,47);
							pushFollow(FOLLOW_expr_in_expr377);
							e=expr();
							state._fsp--;
							dbg.location(73,54);
							v /= e;dbg.location(73,68);
							System.out.println("Resultado da divisao: " + v);
							}
							break;
						case 5 :
							dbg.enterAlt(5);

							// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:75:5: 
							{
							}
							break;

					}
					} finally {dbg.exitSubRule(7);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:76:7: '(' e= expr ')'
					{
					dbg.location(76,7);
					match(input,12,FOLLOW_12_in_expr401); dbg.location(76,13);
					pushFollow(FOLLOW_expr_in_expr407);
					e=expr();
					state._fsp--;
					dbg.location(76,20);
					v = e;dbg.location(76,33);
					match(input,13,FOLLOW_13_in_expr411); 
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
		dbg.location(77, 4);

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
	// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:79:1: rel returns [ boolean t ] : (e= expr ) ( '=' d= expr | '<>' d= expr | '<' d= expr | '>' d= expr | '<=' d= expr | '>=' d= expr ) ;
	public final boolean rel() throws RecognitionException {
		boolean t = false;


		double e =0.0;
		double d =0.0;

		try { dbg.enterRule(getGrammarFileName(), "rel");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(79, 0);

		try {
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:80:5: ( (e= expr ) ( '=' d= expr | '<>' d= expr | '<' d= expr | '>' d= expr | '<=' d= expr | '>=' d= expr ) )
			dbg.enterAlt(1);

			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:81:5: (e= expr ) ( '=' d= expr | '<>' d= expr | '<' d= expr | '>' d= expr | '<=' d= expr | '>=' d= expr )
			{
			dbg.location(81,5);
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:81:5: (e= expr )
			dbg.enterAlt(1);

			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:81:7: e= expr
			{
			dbg.location(81,9);
			pushFollow(FOLLOW_expr_in_rel444);
			e=expr();
			state._fsp--;

			}
			dbg.location(82,5);
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:82:5: ( '=' d= expr | '<>' d= expr | '<' d= expr | '>' d= expr | '<=' d= expr | '>=' d= expr )
			int alt9=6;
			try { dbg.enterSubRule(9);
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			switch ( input.LA(1) ) {
			case 23:
				{
				alt9=1;
				}
				break;
			case 22:
				{
				alt9=2;
				}
				break;
			case 20:
				{
				alt9=3;
				}
				break;
			case 24:
				{
				alt9=4;
				}
				break;
			case 21:
				{
				alt9=5;
				}
				break;
			case 25:
				{
				alt9=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:82:7: '=' d= expr
					{
					dbg.location(82,7);
					match(input,23,FOLLOW_23_in_rel455); dbg.location(82,12);
					System.out.println("Lido expr rel: = ");dbg.location(82,57);
					pushFollow(FOLLOW_expr_in_rel464);
					d=expr();
					state._fsp--;
					dbg.location(82,64);
					t = e == d;dbg.location(82,85);
					System.out.println("Resultado expr rel " + e + " = " + d + " : " + t); result = t;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:83:7: '<>' d= expr
					{
					dbg.location(83,7);
					match(input,22,FOLLOW_22_in_rel477); dbg.location(83,12);
					System.out.println("Lido expr rel: <> ");dbg.location(83,58);
					pushFollow(FOLLOW_expr_in_rel485);
					d=expr();
					state._fsp--;
					dbg.location(83,65);
					t = e != d;dbg.location(83,86);
					System.out.println("Resultado expr rel " + e + " <> " + d + " : " + t); result = t;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:84:7: '<' d= expr
					{
					dbg.location(84,7);
					match(input,20,FOLLOW_20_in_rel498); dbg.location(84,12);
					System.out.println("Lido expr rel: < ");dbg.location(84,57);
					pushFollow(FOLLOW_expr_in_rel507);
					d=expr();
					state._fsp--;
					dbg.location(84,64);
					t = e <  d;dbg.location(84,85);
					System.out.println("Resultado expr rel " + e + " < " + d + " : " + t); result = t;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:85:7: '>' d= expr
					{
					dbg.location(85,7);
					match(input,24,FOLLOW_24_in_rel519); dbg.location(85,12);
					System.out.println("Lido expr rel: > ");dbg.location(85,57);
					pushFollow(FOLLOW_expr_in_rel528);
					d=expr();
					state._fsp--;
					dbg.location(85,64);
					t = e >  d;dbg.location(85,85);
					System.out.println("Resultado expr rel " + e + " > " + d + " : " + t); result = t;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:86:7: '<=' d= expr
					{
					dbg.location(86,7);
					match(input,21,FOLLOW_21_in_rel541); dbg.location(86,12);
					System.out.println("Lido expr rel: <= ");dbg.location(86,58);
					pushFollow(FOLLOW_expr_in_rel549);
					d=expr();
					state._fsp--;
					dbg.location(86,65);
					t = e <= d;dbg.location(86,86);
					System.out.println("Resultado expr rel " + e + " <= " + d + " : " + t); result = t;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:87:7: '>=' d= expr
					{
					dbg.location(87,7);
					match(input,25,FOLLOW_25_in_rel561); dbg.location(87,12);
					System.out.println("Lido expr rel: >= ");dbg.location(87,58);
					pushFollow(FOLLOW_expr_in_rel569);
					d=expr();
					state._fsp--;
					dbg.location(87,65);
					t = e >= d;dbg.location(87,86);
					System.out.println("Resultado expr rel " + e + " >= " + d + " : " + t); result = t;
					}
					break;

			}
			} finally {dbg.exitSubRule(9);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(89, 4);

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



	public static final BitSet FOLLOW_stat_in_prog41 = new BitSet(new long[]{0x0000000000000640L});
	public static final BitSet FOLLOW_EOF_in_prog44 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comandos_in_stat62 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comando_in_comandos82 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_comandos84 = new BitSet(new long[]{0x0000000000000642L});
	public static final BitSet FOLLOW_atribuicao_in_comando108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iteracao_in_comando116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condicao_in_comando121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_iteracao137 = new BitSet(new long[]{0x0000000000001280L});
	public static final BitSet FOLLOW_rel_in_iteracao139 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_DO_in_iteracao141 = new BitSet(new long[]{0x0000000000000640L});
	public static final BitSet FOLLOW_comandos_in_iteracao143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atribuicao161 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_atribuicao163 = new BitSet(new long[]{0x0000000000001280L});
	public static final BitSet FOLLOW_expr_in_atribuicao165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_condicao209 = new BitSet(new long[]{0x0000000000001280L});
	public static final BitSet FOLLOW_rel_in_condicao211 = new BitSet(new long[]{0x0000000000000122L});
	public static final BitSet FOLLOW_THEN_in_condicao221 = new BitSet(new long[]{0x0000000000000640L});
	public static final BitSet FOLLOW_comandos_in_condicao223 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ELSE_in_condicao235 = new BitSet(new long[]{0x0000000000000640L});
	public static final BitSet FOLLOW_comandos_in_condicao237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_expr283 = new BitSet(new long[]{0x000000000003C002L});
	public static final BitSet FOLLOW_VAR_in_expr295 = new BitSet(new long[]{0x000000000003C002L});
	public static final BitSet FOLLOW_15_in_expr309 = new BitSet(new long[]{0x0000000000001280L});
	public static final BitSet FOLLOW_expr_in_expr317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_expr329 = new BitSet(new long[]{0x0000000000001280L});
	public static final BitSet FOLLOW_expr_in_expr337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_expr349 = new BitSet(new long[]{0x0000000000001280L});
	public static final BitSet FOLLOW_expr_in_expr357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_expr369 = new BitSet(new long[]{0x0000000000001280L});
	public static final BitSet FOLLOW_expr_in_expr377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_expr401 = new BitSet(new long[]{0x0000000000001280L});
	public static final BitSet FOLLOW_expr_in_expr407 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_expr411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_rel444 = new BitSet(new long[]{0x0000000003F00000L});
	public static final BitSet FOLLOW_23_in_rel455 = new BitSet(new long[]{0x0000000000001280L});
	public static final BitSet FOLLOW_expr_in_rel464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_rel477 = new BitSet(new long[]{0x0000000000001280L});
	public static final BitSet FOLLOW_expr_in_rel485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_rel498 = new BitSet(new long[]{0x0000000000001280L});
	public static final BitSet FOLLOW_expr_in_rel507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_rel519 = new BitSet(new long[]{0x0000000000001280L});
	public static final BitSet FOLLOW_expr_in_rel528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_rel541 = new BitSet(new long[]{0x0000000000001280L});
	public static final BitSet FOLLOW_expr_in_rel549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_rel561 = new BitSet(new long[]{0x0000000000001280L});
	public static final BitSet FOLLOW_expr_in_rel569 = new BitSet(new long[]{0x0000000000000002L});
}
