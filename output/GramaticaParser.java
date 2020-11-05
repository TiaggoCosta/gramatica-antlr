// $ANTLR 3.5.1 C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g 2020-11-04 01:34:54

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class GramaticaParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "VAR", "WS", "'*'", "'+'", 
		"'-'", "'/'", "';'", "'<'", "'<='", "'<>'", "'='", "'>'", "'>='", "'do'", 
		"'else'", "'if'", "'then'", "'while'"
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
	public static final int INT=4;
	public static final int VAR=5;
	public static final int WS=6;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "comandos", "expr", "prog", "comando", "teste", "stat", 
		"iteracao", "teste2", "rel"
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
	@Override public String getGrammarFileName() { return "C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g"; }



	// $ANTLR start "prog"
	// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:7:1: prog : ( stat )* EOF ;
	public final void prog() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "prog");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(7, 0);

		try {
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:8:5: ( ( stat )* EOF )
			dbg.enterAlt(1);

			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:9:5: ( stat )* EOF
			{
			dbg.location(9,5);
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:9:5: ( stat )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==INT||LA1_0==20||LA1_0==22) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:9:5: stat
					{
					dbg.location(9,5);
					pushFollow(FOLLOW_stat_in_prog29);
					stat();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(9,11);
			match(input,EOF,FOLLOW_EOF_in_prog32); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(10, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "prog");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "prog"



	// $ANTLR start "stat"
	// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:12:1: stat : comandos ;
	public final void stat() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "stat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(12, 0);

		try {
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:13:5: ( comandos )
			dbg.enterAlt(1);

			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:14:2: comandos
			{
			dbg.location(14,2);
			pushFollow(FOLLOW_comandos_in_stat50);
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
		dbg.location(15, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "stat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "stat"



	// $ANTLR start "comandos"
	// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:17:1: comandos : ( comando ';' )+ ;
	public final void comandos() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "comandos");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(17, 0);

		try {
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:18:5: ( ( comando ';' )+ )
			dbg.enterAlt(1);

			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:19:5: ( comando ';' )+
			{
			dbg.location(19,5);
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:19:5: ( comando ';' )+
			int cnt2=0;
			try { dbg.enterSubRule(2);

			loop2:
			while (true) {
				int alt2=2;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				switch ( input.LA(1) ) {
				case 22:
					{
					alt2=1;
					}
					break;
				case 20:
					{
					alt2=1;
					}
					break;
				case INT:
					{
					alt2=1;
					}
					break;
				}
				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:19:6: comando ';'
					{
					dbg.location(19,6);
					pushFollow(FOLLOW_comando_in_comandos70);
					comando();
					state._fsp--;
					dbg.location(19,14);
					match(input,11,FOLLOW_11_in_comandos72); 
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
		dbg.location(20, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "comandos");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "comandos"



	// $ANTLR start "comando"
	// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:22:1: comando : ( iteracao | teste | INT );
	public final void comando() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "comando");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(22, 0);

		try {
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:23:5: ( iteracao | teste | INT )
			int alt3=3;
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			switch ( input.LA(1) ) {
			case 22:
				{
				alt3=1;
				}
				break;
			case 20:
				{
				alt3=2;
				}
				break;
			case INT:
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

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:24:5: iteracao
					{
					dbg.location(24,5);
					pushFollow(FOLLOW_iteracao_in_comando96);
					iteracao();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:26:4: teste
					{
					dbg.location(26,4);
					pushFollow(FOLLOW_teste_in_comando106);
					teste();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:29:4: INT
					{
					dbg.location(29,4);
					match(input,INT,FOLLOW_INT_in_comando117); 
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
		dbg.location(32, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "comando");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "comando"



	// $ANTLR start "iteracao"
	// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:34:1: iteracao : 'while' e= rel 'do' comandos ;
	public final void iteracao() throws RecognitionException {
		boolean e =false;

		try { dbg.enterRule(getGrammarFileName(), "iteracao");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(34, 0);

		try {
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:35:5: ( 'while' e= rel 'do' comandos )
			dbg.enterAlt(1);

			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:36:2: 'while' e= rel 'do' comandos
			{
			dbg.location(36,2);
			match(input,22,FOLLOW_22_in_iteracao140); dbg.location(36,12);
			pushFollow(FOLLOW_rel_in_iteracao146);
			e=rel();
			state._fsp--;
			dbg.location(36,18);
			System.out.println("Resultado relacional: " + e);dbg.location(36,73);
			match(input,18,FOLLOW_18_in_iteracao150); dbg.location(36,78);
			pushFollow(FOLLOW_comandos_in_iteracao152);
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
		dbg.location(37, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "iteracao");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "iteracao"



	// $ANTLR start "teste"
	// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:39:1: teste : ( 'if' rel 'then' comandos ) teste2 ;
	public final void teste() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "teste");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(39, 0);

		try {
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:40:5: ( ( 'if' rel 'then' comandos ) teste2 )
			dbg.enterAlt(1);

			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:41:2: ( 'if' rel 'then' comandos ) teste2
			{
			dbg.location(41,2);
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:41:2: ( 'if' rel 'then' comandos )
			dbg.enterAlt(1);

			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:41:3: 'if' rel 'then' comandos
			{
			dbg.location(41,3);
			match(input,20,FOLLOW_20_in_teste169); dbg.location(41,8);
			pushFollow(FOLLOW_rel_in_teste171);
			rel();
			state._fsp--;
			dbg.location(41,12);
			match(input,21,FOLLOW_21_in_teste173); dbg.location(41,19);
			pushFollow(FOLLOW_comandos_in_teste175);
			comandos();
			state._fsp--;

			}
			dbg.location(41,29);
			pushFollow(FOLLOW_teste2_in_teste178);
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
		dbg.location(42, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "teste");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "teste"



	// $ANTLR start "teste2"
	// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:44:1: teste2 : ( ( 'else' comandos ) |);
	public final void teste2() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "teste2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(44, 0);

		try {
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:45:5: ( ( 'else' comandos ) |)
			int alt4=2;
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==19) ) {
				alt4=1;
			}
			else if ( (LA4_0==11) ) {
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

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:46:2: ( 'else' comandos )
					{
					dbg.location(46,2);
					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:46:2: ( 'else' comandos )
					dbg.enterAlt(1);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:46:3: 'else' comandos
					{
					dbg.location(46,3);
					match(input,19,FOLLOW_19_in_teste2197); dbg.location(46,10);
					pushFollow(FOLLOW_comandos_in_teste2199);
					comandos();
					state._fsp--;

					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:48:2: 
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
		dbg.location(48, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "teste2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "teste2"



	// $ANTLR start "expr"
	// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:50:1: expr returns [ double v ] : INT ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr |) ;
	public final double expr() throws RecognitionException {
		double v = 0.0;


		Token INT1=null;
		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(50, 0);

		try {
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:51:5: ( INT ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr |) )
			dbg.enterAlt(1);

			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:52:5: INT ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr |)
			{
			dbg.location(52,5);
			INT1=(Token)match(input,INT,FOLLOW_INT_in_expr225); dbg.location(52,9);
			v = Double.parseDouble( (INT1!=null?INT1.getText():null));dbg.location(53,5);
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:53:5: ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr |)
			int alt5=5;
			try { dbg.enterSubRule(5);
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			switch ( input.LA(1) ) {
			case 8:
				{
				alt5=1;
				}
				break;
			case 9:
				{
				alt5=2;
				}
				break;
			case 7:
				{
				alt5=3;
				}
				break;
			case 10:
				{
				alt5=4;
				}
				break;
			case 12:
			case 13:
			case 14:
			case 15:
			case 16:
			case 17:
			case 18:
			case 21:
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

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:53:6: '+' e= expr
					{
					dbg.location(53,6);
					match(input,8,FOLLOW_8_in_expr235); dbg.location(53,12);
					pushFollow(FOLLOW_expr_in_expr241);
					e=expr();
					state._fsp--;
					dbg.location(53,19);
					v += e;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:54:7: '-' e= expr
					{
					dbg.location(54,7);
					match(input,9,FOLLOW_9_in_expr252); dbg.location(54,13);
					pushFollow(FOLLOW_expr_in_expr258);
					e=expr();
					state._fsp--;
					dbg.location(54,20);
					v -= e;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:55:7: '*' e= expr
					{
					dbg.location(55,7);
					match(input,7,FOLLOW_7_in_expr269); dbg.location(55,13);
					pushFollow(FOLLOW_expr_in_expr275);
					e=expr();
					state._fsp--;
					dbg.location(55,20);
					v *= e;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:56:7: '/' e= expr
					{
					dbg.location(56,7);
					match(input,10,FOLLOW_10_in_expr286); dbg.location(56,13);
					pushFollow(FOLLOW_expr_in_expr292);
					e=expr();
					state._fsp--;
					dbg.location(56,20);
					v /= e;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:58:5: 
					{
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
		dbg.location(60, 4);

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
	// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:62:1: rel returns [ boolean t ] : (d= expr ) ( '=' e= expr | '<>' e= expr | '<' e= expr | '>' e= expr | '<=' e= expr | '>=' e= expr ) ;
	public final boolean rel() throws RecognitionException {
		boolean t = false;


		double d =0.0;
		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "rel");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(62, 0);

		try {
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:63:5: ( (d= expr ) ( '=' e= expr | '<>' e= expr | '<' e= expr | '>' e= expr | '<=' e= expr | '>=' e= expr ) )
			dbg.enterAlt(1);

			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:64:5: (d= expr ) ( '=' e= expr | '<>' e= expr | '<' e= expr | '>' e= expr | '<=' e= expr | '>=' e= expr )
			{
			dbg.location(64,5);
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:64:5: (d= expr )
			dbg.enterAlt(1);

			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:64:7: d= expr
			{
			dbg.location(64,9);
			pushFollow(FOLLOW_expr_in_rel344);
			d=expr();
			state._fsp--;
			dbg.location(64,16);
			System.out.println("Resultado: " + d);
			}
			dbg.location(65,5);
			// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:65:5: ( '=' e= expr | '<>' e= expr | '<' e= expr | '>' e= expr | '<=' e= expr | '>=' e= expr )
			int alt6=6;
			try { dbg.enterSubRule(6);
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			switch ( input.LA(1) ) {
			case 15:
				{
				alt6=1;
				}
				break;
			case 14:
				{
				alt6=2;
				}
				break;
			case 12:
				{
				alt6=3;
				}
				break;
			case 16:
				{
				alt6=4;
				}
				break;
			case 13:
				{
				alt6=5;
				}
				break;
			case 17:
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

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:65:7: '=' e= expr
					{
					dbg.location(65,7);
					match(input,15,FOLLOW_15_in_rel356); dbg.location(65,14);
					pushFollow(FOLLOW_expr_in_rel363);
					e=expr();
					state._fsp--;
					dbg.location(65,21);
					System.out.println("Lido '='");dbg.location(65,56);
					System.out.println("Resultado: " + e);dbg.location(65,100);
					t = d == e;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:66:7: '<>' e= expr
					{
					dbg.location(66,7);
					match(input,14,FOLLOW_14_in_rel378); dbg.location(66,14);
					pushFollow(FOLLOW_expr_in_rel384);
					e=expr();
					state._fsp--;
					dbg.location(66,21);
					System.out.println("Lido '<>'");dbg.location(66,56);
					System.out.println("Resultado: " + e);dbg.location(66,100);
					t = d != e;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:67:7: '<' e= expr
					{
					dbg.location(67,7);
					match(input,12,FOLLOW_12_in_rel398); dbg.location(67,14);
					pushFollow(FOLLOW_expr_in_rel405);
					e=expr();
					state._fsp--;
					dbg.location(67,21);
					System.out.println("Lido '<'");dbg.location(67,56);
					System.out.println("Resultado: " + e);dbg.location(67,100);
					t = d <  e;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:68:7: '>' e= expr
					{
					dbg.location(68,7);
					match(input,16,FOLLOW_16_in_rel420); dbg.location(68,14);
					pushFollow(FOLLOW_expr_in_rel427);
					e=expr();
					state._fsp--;
					dbg.location(68,21);
					System.out.println("Lido '>'");dbg.location(68,56);
					System.out.println("Resultado: " + e);dbg.location(68,100);
					t = d >  e;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:69:7: '<=' e= expr
					{
					dbg.location(69,7);
					match(input,13,FOLLOW_13_in_rel442); dbg.location(69,14);
					pushFollow(FOLLOW_expr_in_rel448);
					e=expr();
					state._fsp--;
					dbg.location(69,21);
					System.out.println("Lido '<='");dbg.location(69,56);
					System.out.println("Resultado: " + e);dbg.location(69,100);
					t = d <= e;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\jenif\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:70:7: '>=' e= expr
					{
					dbg.location(70,7);
					match(input,17,FOLLOW_17_in_rel462); dbg.location(70,14);
					pushFollow(FOLLOW_expr_in_rel468);
					e=expr();
					state._fsp--;
					dbg.location(70,21);
					System.out.println("Lido '>='");dbg.location(70,56);
					System.out.println("Resultado: " + e);dbg.location(70,100);
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
		dbg.location(72, 4);

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



	public static final BitSet FOLLOW_stat_in_prog29 = new BitSet(new long[]{0x0000000000500010L});
	public static final BitSet FOLLOW_EOF_in_prog32 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comandos_in_stat50 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comando_in_comandos70 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_comandos72 = new BitSet(new long[]{0x0000000000500012L});
	public static final BitSet FOLLOW_iteracao_in_comando96 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_teste_in_comando106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_comando117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_iteracao140 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_iteracao146 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_iteracao150 = new BitSet(new long[]{0x0000000000500010L});
	public static final BitSet FOLLOW_comandos_in_iteracao152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_teste169 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_teste171 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_teste173 = new BitSet(new long[]{0x0000000000500010L});
	public static final BitSet FOLLOW_comandos_in_teste175 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_teste2_in_teste178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_teste2197 = new BitSet(new long[]{0x0000000000500010L});
	public static final BitSet FOLLOW_comandos_in_teste2199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_expr225 = new BitSet(new long[]{0x0000000000000782L});
	public static final BitSet FOLLOW_8_in_expr235 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_expr_in_expr241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_expr252 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_expr_in_expr258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_7_in_expr269 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_expr_in_expr275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_expr286 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_expr_in_expr292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_rel344 = new BitSet(new long[]{0x000000000003F000L});
	public static final BitSet FOLLOW_15_in_rel356 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_expr_in_rel363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rel378 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_expr_in_rel384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_rel398 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_expr_in_rel405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_rel420 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_expr_in_rel427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_rel442 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_expr_in_rel448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_rel462 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_expr_in_rel468 = new BitSet(new long[]{0x0000000000000002L});
}
