<<<<<<< HEAD
// $ANTLR 3.5.1 C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g 2020-10-25 22:06:18
=======
// $ANTLR 3.5.1 C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g 2020-10-25 22:09:56
>>>>>>> 309f8f37f577629b48c59d410af8510986d325eb

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
		"'do'", "'else'", "'if'", "'then'", "'while'"
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
	public static final int INT=4;
	public static final int VAR=5;
	public static final int WS=6;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
<<<<<<< HEAD
		"invalidRule", "prog", "comando", "iteracao", "rel", "stat", "expr"
=======
		"invalidRule", "comando", "teste2", "teste", "prog", "stat", "iteracao", 
		"rel", "expr"
>>>>>>> 309f8f37f577629b48c59d410af8510986d325eb
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
<<<<<<< HEAD
		false, false, false, false, false, false
=======
		false, false, false, false, false, false, false, false, false, false
>>>>>>> 309f8f37f577629b48c59d410af8510986d325eb
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
	@Override public String getGrammarFileName() { return "C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g"; }



	// $ANTLR start "prog"
	// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:12:1: prog : ( stat )* EOF ;
	public final void prog() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "prog");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(12, 0);

		try {
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:12:5: ( ( stat )* EOF )
			dbg.enterAlt(1);

			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:13:4: ( stat )* EOF
			{
			dbg.location(13,4);
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:13:4: ( stat )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= INT && LA1_0 <= VAR)||LA1_0==21||LA1_0==23) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:13:4: stat
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
	// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:16:1: stat : comando ;
	public final void stat() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "stat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(16, 0);

		try {
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:16:5: ( comando )
			dbg.enterAlt(1);

			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:17:2: comando
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
	// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:20:1: comando : ( iteracao | teste | VAR | INT );
	public final void comando() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "comando");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(20, 0);

		try {
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:20:8: ( iteracao | teste | VAR | INT )
			int alt2=4;
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			switch ( input.LA(1) ) {
			case 23:
				{
				alt2=1;
				}
				break;
			case 21:
				{
				alt2=2;
				}
				break;
			case VAR:
				{
				alt2=3;
				}
				break;
			case INT:
				{
				alt2=4;
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

					// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:21:6: iteracao
					{
					dbg.location(21,6);
					pushFollow(FOLLOW_iteracao_in_comando57);
					iteracao();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:22:4: teste
					{
					dbg.location(22,4);
					pushFollow(FOLLOW_teste_in_comando62);
					teste();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:23:8: VAR
					{
					dbg.location(23,8);
					match(input,VAR,FOLLOW_VAR_in_comando71); 
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:24:4: INT
					{
					dbg.location(24,4);
					match(input,INT,FOLLOW_INT_in_comando76); 
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
		dbg.location(27, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "comando");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "comando"



	// $ANTLR start "iteracao"
	// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:29:1: iteracao : 'while' e= rel 'do' ( comando )+ ;
	public final void iteracao() throws RecognitionException {
		boolean e =false;

		try { dbg.enterRule(getGrammarFileName(), "iteracao");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(29, 0);

		try {
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:29:9: ( 'while' e= rel 'do' ( comando )+ )
			dbg.enterAlt(1);

			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:30:2: 'while' e= rel 'do' ( comando )+
			{
			dbg.location(30,2);
			match(input,23,FOLLOW_23_in_iteracao93); dbg.location(30,12);
			pushFollow(FOLLOW_rel_in_iteracao99);
			e=rel();
			state._fsp--;
<<<<<<< HEAD
			dbg.location(31,18);
			System.out.println("Resultado relacional: " + e);dbg.location(31,73);
			match(input,19,FOLLOW_19_in_iteracao106); dbg.location(31,78);
			// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:31:78: ( comando )+
=======
			dbg.location(30,18);
			System.out.println("Resultado: " + e);dbg.location(30,62);
			match(input,19,FOLLOW_19_in_iteracao103); dbg.location(30,67);
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:30:67: ( comando )+
>>>>>>> 309f8f37f577629b48c59d410af8510986d325eb
			int cnt3=0;
			try { dbg.enterSubRule(3);

			loop3:
			while (true) {
				int alt3=2;
				try { dbg.enterDecision(3, decisionCanBacktrack[3]);

				switch ( input.LA(1) ) {
				case 23:
					{
					alt3=1;
					}
					break;
				case 21:
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

<<<<<<< HEAD
					// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:31:78: comando
					{
					dbg.location(31,78);
					pushFollow(FOLLOW_comando_in_iteracao108);
=======
					// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:30:67: comando
					{
					dbg.location(30,67);
					pushFollow(FOLLOW_comando_in_iteracao105);
>>>>>>> 309f8f37f577629b48c59d410af8510986d325eb
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
		dbg.location(31, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "iteracao");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "iteracao"



	// $ANTLR start "teste"
	// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:33:1: teste : ( 'if' rel 'then' ( comando )+ ) teste2 ;
	public final void teste() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "teste");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(33, 0);

		try {
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:33:6: ( ( 'if' rel 'then' ( comando )+ ) teste2 )
			dbg.enterAlt(1);

			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:34:2: ( 'if' rel 'then' ( comando )+ ) teste2
			{
			dbg.location(34,2);
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:34:2: ( 'if' rel 'then' ( comando )+ )
			dbg.enterAlt(1);

			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:34:3: 'if' rel 'then' ( comando )+
			{
			dbg.location(34,3);
			match(input,21,FOLLOW_21_in_teste117); dbg.location(34,8);
			pushFollow(FOLLOW_rel_in_teste119);
			rel();
			state._fsp--;
			dbg.location(34,12);
			match(input,22,FOLLOW_22_in_teste121); dbg.location(34,19);
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:34:19: ( comando )+
			int cnt4=0;
			try { dbg.enterSubRule(4);

			loop4:
			while (true) {
				int alt4=2;
				try { dbg.enterDecision(4, decisionCanBacktrack[4]);

				switch ( input.LA(1) ) {
				case 23:
					{
					alt4=1;
					}
					break;
				case 21:
					{
					alt4=1;
					}
					break;
				case VAR:
					{
					alt4=1;
					}
					break;
				case INT:
					{
					alt4=1;
					}
					break;
				}
				} finally {dbg.exitDecision(4);}

				switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:34:19: comando
					{
					dbg.location(34,19);
					pushFollow(FOLLOW_comando_in_teste123);
					comando();
					state._fsp--;

					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt4++;
			}
			} finally {dbg.exitSubRule(4);}

			}
			dbg.location(34,29);
			pushFollow(FOLLOW_teste2_in_teste127);
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
		dbg.location(35, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "teste");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "teste"



	// $ANTLR start "teste2"
	// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:37:1: teste2 : ( ( 'else' ( comando )+ ) |);
	public final void teste2() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "teste2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(37, 0);

		try {
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:37:7: ( ( 'else' ( comando )+ ) |)
			int alt6=2;
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==20) ) {
				alt6=1;
			}
			else if ( (LA6_0==EOF||(LA6_0 >= INT && LA6_0 <= VAR)||LA6_0==21||LA6_0==23) ) {
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

					// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:38:2: ( 'else' ( comando )+ )
					{
					dbg.location(38,2);
					// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:38:2: ( 'else' ( comando )+ )
					dbg.enterAlt(1);

					// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:38:3: 'else' ( comando )+
					{
					dbg.location(38,3);
					match(input,20,FOLLOW_20_in_teste2141); dbg.location(38,10);
					// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:38:10: ( comando )+
					int cnt5=0;
					try { dbg.enterSubRule(5);

					loop5:
					while (true) {
						int alt5=2;
						try { dbg.enterDecision(5, decisionCanBacktrack[5]);

						switch ( input.LA(1) ) {
						case 23:
							{
							alt5=1;
							}
							break;
						case 21:
							{
							alt5=1;
							}
							break;
						case VAR:
							{
							alt5=1;
							}
							break;
						case INT:
							{
							alt5=1;
							}
							break;
						}
						} finally {dbg.exitDecision(5);}

						switch (alt5) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:38:10: comando
							{
							dbg.location(38,10);
							pushFollow(FOLLOW_comando_in_teste2143);
							comando();
							state._fsp--;

							}
							break;

						default :
							if ( cnt5 >= 1 ) break loop5;
							EarlyExitException eee = new EarlyExitException(5, input);
							dbg.recognitionException(eee);

							throw eee;
						}
						cnt5++;
					}
					} finally {dbg.exitSubRule(5);}

					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:40:2: 
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
		dbg.location(40, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "teste2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "teste2"



	// $ANTLR start "expr"
	// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:42:1: expr returns [ double v ] : ( INT ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr |) | '(' e= expr ')' );
	public final double expr() throws RecognitionException {
		double v = 0.0;


		Token INT1=null;
		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(42, 0);

		try {
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:42:26: ( INT ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr |) | '(' e= expr ')' )
			int alt8=2;
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			int LA8_0 = input.LA(1);
			if ( (LA8_0==INT) ) {
				alt8=1;
			}
			else if ( (LA8_0==7) ) {
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

					// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:43:5: INT ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr |)
					{
					dbg.location(43,5);
					INT1=(Token)match(input,INT,FOLLOW_INT_in_expr166); dbg.location(43,9);
					v = Double.parseDouble( (INT1!=null?INT1.getText():null));dbg.location(44,5);
					// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:44:5: ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr |)
					int alt7=5;
					try { dbg.enterSubRule(7);
					try { dbg.enterDecision(7, decisionCanBacktrack[7]);

					switch ( input.LA(1) ) {
					case 10:
						{
						alt7=1;
						}
						break;
					case 11:
						{
						alt7=2;
						}
						break;
					case 9:
						{
						alt7=3;
						}
						break;
					case 12:
						{
						alt7=4;
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
					case 22:
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

							// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:44:6: '+' e= expr
							{
							dbg.location(44,6);
							match(input,10,FOLLOW_10_in_expr176); dbg.location(44,12);
							pushFollow(FOLLOW_expr_in_expr182);
							e=expr();
							state._fsp--;
							dbg.location(44,19);
							v += e;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:45:7: '-' e= expr
							{
							dbg.location(45,7);
							match(input,11,FOLLOW_11_in_expr193); dbg.location(45,13);
							pushFollow(FOLLOW_expr_in_expr199);
							e=expr();
							state._fsp--;
							dbg.location(45,20);
							v -= e;
							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:46:7: '*' e= expr
							{
							dbg.location(46,7);
							match(input,9,FOLLOW_9_in_expr210); dbg.location(46,13);
							pushFollow(FOLLOW_expr_in_expr216);
							e=expr();
							state._fsp--;
							dbg.location(46,20);
							v *= e;
							}
							break;
						case 4 :
							dbg.enterAlt(4);

							// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:47:7: '/' e= expr
							{
							dbg.location(47,7);
							match(input,12,FOLLOW_12_in_expr227); dbg.location(47,13);
							pushFollow(FOLLOW_expr_in_expr233);
							e=expr();
							state._fsp--;
							dbg.location(47,20);
							v /= e;
							}
							break;
						case 5 :
							dbg.enterAlt(5);

							// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:49:5: 
							{
							}
							break;

					}
					} finally {dbg.exitSubRule(7);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:50:7: '(' e= expr ')'
					{
					dbg.location(50,7);
					match(input,7,FOLLOW_7_in_expr256); dbg.location(50,13);
					pushFollow(FOLLOW_expr_in_expr262);
					e=expr();
					state._fsp--;
					dbg.location(50,20);
					v = e;dbg.location(50,33);
					match(input,8,FOLLOW_8_in_expr266); 
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
		dbg.location(51, 4);

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
<<<<<<< HEAD
	// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:45:1: rel returns [ boolean t ] : (d= expr ) ( '=' e= expr | '<>' e= expr | '<' e= expr | '>' e= expr | '<=' e= expr | '>=' e= expr ) ;
=======
	// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:53:1: rel returns [ boolean v ] : ( VAR |e= expr ) ( '=' e= expr | '<>' e= expr | '<' e= expr | '>' e= expr | '<=' e= expr | '>=' e= expr ) ;
>>>>>>> 309f8f37f577629b48c59d410af8510986d325eb
	public final boolean rel() throws RecognitionException {
		boolean t = false;


		double d =0.0;
		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "rel");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(53, 0);

		try {
<<<<<<< HEAD
			// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:45:26: ( (d= expr ) ( '=' e= expr | '<>' e= expr | '<' e= expr | '>' e= expr | '<=' e= expr | '>=' e= expr ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:46:5: (d= expr ) ( '=' e= expr | '<>' e= expr | '<' e= expr | '>' e= expr | '<=' e= expr | '>=' e= expr )
			{
			dbg.location(46,5);
			// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:46:5: (d= expr )
			dbg.enterAlt(1);
=======
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:53:26: ( ( VAR |e= expr ) ( '=' e= expr | '<>' e= expr | '<' e= expr | '>' e= expr | '<=' e= expr | '>=' e= expr ) )
			dbg.enterAlt(1);

			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:54:5: ( VAR |e= expr ) ( '=' e= expr | '<>' e= expr | '<' e= expr | '>' e= expr | '<=' e= expr | '>=' e= expr )
			{
			dbg.location(54,5);
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:54:5: ( VAR |e= expr )
			int alt9=2;
			try { dbg.enterSubRule(9);
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			int LA9_0 = input.LA(1);
			if ( (LA9_0==VAR) ) {
				alt9=1;
			}
			else if ( (LA9_0==INT||LA9_0==7) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:54:6: VAR
					{
					dbg.location(54,6);
					match(input,VAR,FOLLOW_VAR_in_rel288); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:54:12: e= expr
					{
					dbg.location(54,14);
					pushFollow(FOLLOW_expr_in_rel296);
					e=expr();
					state._fsp--;
					dbg.location(54,21);
					System.out.println("Resultado: " + e);
					}
					break;
>>>>>>> 309f8f37f577629b48c59d410af8510986d325eb

			// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:46:7: d= expr
			{
			dbg.location(46,9);
			pushFollow(FOLLOW_expr_in_rel250);
			d=expr();
			state._fsp--;
			dbg.location(46,16);
			System.out.println("Resultado: " + d);
			}
<<<<<<< HEAD
			dbg.location(47,5);
			// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:47:5: ( '=' e= expr | '<>' e= expr | '<' e= expr | '>' e= expr | '<=' e= expr | '>=' e= expr )
			int alt6=6;
			try { dbg.enterSubRule(6);
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);
=======
			} finally {dbg.exitSubRule(9);}
			dbg.location(55,5);
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:55:5: ( '=' e= expr | '<>' e= expr | '<' e= expr | '>' e= expr | '<=' e= expr | '>=' e= expr )
			int alt10=6;
			try { dbg.enterSubRule(10);
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);
>>>>>>> 309f8f37f577629b48c59d410af8510986d325eb

			switch ( input.LA(1) ) {
			case 16:
				{
<<<<<<< HEAD
				alt6=1;
=======
				alt10=1;
>>>>>>> 309f8f37f577629b48c59d410af8510986d325eb
				}
				break;
			case 15:
				{
<<<<<<< HEAD
				alt6=2;
=======
				alt10=2;
>>>>>>> 309f8f37f577629b48c59d410af8510986d325eb
				}
				break;
			case 13:
				{
<<<<<<< HEAD
				alt6=3;
=======
				alt10=3;
>>>>>>> 309f8f37f577629b48c59d410af8510986d325eb
				}
				break;
			case 17:
				{
<<<<<<< HEAD
				alt6=4;
=======
				alt10=4;
>>>>>>> 309f8f37f577629b48c59d410af8510986d325eb
				}
				break;
			case 14:
				{
<<<<<<< HEAD
				alt6=5;
=======
				alt10=5;
>>>>>>> 309f8f37f577629b48c59d410af8510986d325eb
				}
				break;
			case 18:
				{
<<<<<<< HEAD
				alt6=6;
=======
				alt10=6;
>>>>>>> 309f8f37f577629b48c59d410af8510986d325eb
				}
				break;
			default:
				NoViableAltException nvae =
<<<<<<< HEAD
					new NoViableAltException("", 6, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
=======
					new NoViableAltException("", 10, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(10);}

			switch (alt10) {
>>>>>>> 309f8f37f577629b48c59d410af8510986d325eb
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:55:7: '=' e= expr
					{
<<<<<<< HEAD
					dbg.location(47,7);
					match(input,16,FOLLOW_16_in_rel262); dbg.location(47,14);
					pushFollow(FOLLOW_expr_in_rel269);
					e=expr();
					state._fsp--;
					dbg.location(47,21);
					System.out.println("Lido '='");dbg.location(47,56);
					System.out.println("Resultado: " + e);dbg.location(47,100);
					t = d == e;
=======
					dbg.location(55,7);
					match(input,16,FOLLOW_16_in_rel308); dbg.location(55,14);
					pushFollow(FOLLOW_expr_in_rel315);
					e=expr();
					state._fsp--;
					dbg.location(55,21);
					System.out.println("Lido '='");dbg.location(55,56);
					System.out.println("Resultado: " + e);
>>>>>>> 309f8f37f577629b48c59d410af8510986d325eb
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:56:7: '<>' e= expr
					{
<<<<<<< HEAD
					dbg.location(48,7);
					match(input,15,FOLLOW_15_in_rel284); dbg.location(48,14);
					pushFollow(FOLLOW_expr_in_rel290);
					e=expr();
					state._fsp--;
					dbg.location(48,21);
					System.out.println("Lido '<>'");dbg.location(48,56);
					System.out.println("Resultado: " + e);dbg.location(48,100);
					t = d != e;
=======
					dbg.location(56,7);
					match(input,15,FOLLOW_15_in_rel329); dbg.location(56,14);
					pushFollow(FOLLOW_expr_in_rel335);
					e=expr();
					state._fsp--;
					dbg.location(56,21);
					System.out.println("Lido '<>'");dbg.location(56,56);
					System.out.println("Resultado: " + e);dbg.location(56,100);

>>>>>>> 309f8f37f577629b48c59d410af8510986d325eb
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:57:7: '<' e= expr
					{
<<<<<<< HEAD
					dbg.location(49,7);
					match(input,13,FOLLOW_13_in_rel304); dbg.location(49,14);
					pushFollow(FOLLOW_expr_in_rel311);
					e=expr();
					state._fsp--;
					dbg.location(49,21);
					System.out.println("Lido '<'");dbg.location(49,56);
					System.out.println("Resultado: " + e);dbg.location(49,100);
					t = d <  e;
=======
					dbg.location(57,7);
					match(input,13,FOLLOW_13_in_rel349); dbg.location(57,14);
					pushFollow(FOLLOW_expr_in_rel356);
					e=expr();
					state._fsp--;
					dbg.location(57,21);
					System.out.println("Lido '<'");dbg.location(57,56);
					System.out.println("Resultado: " + e);
>>>>>>> 309f8f37f577629b48c59d410af8510986d325eb
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:58:7: '>' e= expr
					{
<<<<<<< HEAD
					dbg.location(50,7);
					match(input,17,FOLLOW_17_in_rel326); dbg.location(50,14);
					pushFollow(FOLLOW_expr_in_rel333);
					e=expr();
					state._fsp--;
					dbg.location(50,21);
					System.out.println("Lido '>'");dbg.location(50,56);
					System.out.println("Resultado: " + e);dbg.location(50,100);
					t = d >  e;
=======
					dbg.location(58,7);
					match(input,17,FOLLOW_17_in_rel369); dbg.location(58,14);
					pushFollow(FOLLOW_expr_in_rel376);
					e=expr();
					state._fsp--;
					dbg.location(58,21);
					System.out.println("Lido '>'");dbg.location(58,56);
					System.out.println("Resultado: " + e);
>>>>>>> 309f8f37f577629b48c59d410af8510986d325eb
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:59:7: '<=' e= expr
					{
<<<<<<< HEAD
					dbg.location(51,7);
					match(input,14,FOLLOW_14_in_rel348); dbg.location(51,14);
					pushFollow(FOLLOW_expr_in_rel354);
					e=expr();
					state._fsp--;
					dbg.location(51,21);
					System.out.println("Lido '<='");dbg.location(51,56);
					System.out.println("Resultado: " + e);dbg.location(51,100);
					t = d <= e;
=======
					dbg.location(59,7);
					match(input,14,FOLLOW_14_in_rel389); dbg.location(59,14);
					pushFollow(FOLLOW_expr_in_rel395);
					e=expr();
					state._fsp--;
					dbg.location(59,21);
					System.out.println("Lido '<='");dbg.location(59,56);
					System.out.println("Resultado: " + e);
>>>>>>> 309f8f37f577629b48c59d410af8510986d325eb
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:60:7: '>=' e= expr
					{
<<<<<<< HEAD
					dbg.location(52,7);
					match(input,18,FOLLOW_18_in_rel368); dbg.location(52,14);
					pushFollow(FOLLOW_expr_in_rel374);
					e=expr();
					state._fsp--;
					dbg.location(52,21);
					System.out.println("Lido '>='");dbg.location(52,56);
					System.out.println("Resultado: " + e);dbg.location(52,100);
					t = d >= e;
=======
					dbg.location(60,7);
					match(input,18,FOLLOW_18_in_rel407); dbg.location(60,14);
					pushFollow(FOLLOW_expr_in_rel413);
					e=expr();
					state._fsp--;
					dbg.location(60,21);
					System.out.println("Lido '>='");dbg.location(60,56);
					System.out.println("Resultado: " + e);
>>>>>>> 309f8f37f577629b48c59d410af8510986d325eb
					}
					break;

			}
<<<<<<< HEAD
			} finally {dbg.exitSubRule(6);}
=======
			} finally {dbg.exitSubRule(10);}
>>>>>>> 309f8f37f577629b48c59d410af8510986d325eb

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(62, 4);

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



	public static final BitSet FOLLOW_stat_in_prog26 = new BitSet(new long[]{0x0000000000A00030L});
	public static final BitSet FOLLOW_EOF_in_prog29 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comando_in_stat41 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iteracao_in_comando57 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_teste_in_comando62 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_comando71 = new BitSet(new long[]{0x0000000000000002L});
<<<<<<< HEAD
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
=======
	public static final BitSet FOLLOW_INT_in_comando76 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_iteracao93 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_rel_in_iteracao99 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_iteracao103 = new BitSet(new long[]{0x0000000000A00030L});
	public static final BitSet FOLLOW_comando_in_iteracao105 = new BitSet(new long[]{0x0000000000A00032L});
	public static final BitSet FOLLOW_21_in_teste117 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_rel_in_teste119 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_teste121 = new BitSet(new long[]{0x0000000000A00030L});
	public static final BitSet FOLLOW_comando_in_teste123 = new BitSet(new long[]{0x0000000000B00030L});
	public static final BitSet FOLLOW_teste2_in_teste127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_teste2141 = new BitSet(new long[]{0x0000000000A00030L});
	public static final BitSet FOLLOW_comando_in_teste2143 = new BitSet(new long[]{0x0000000000A00032L});
	public static final BitSet FOLLOW_INT_in_expr166 = new BitSet(new long[]{0x0000000000001E02L});
	public static final BitSet FOLLOW_10_in_expr176 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_expr182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_expr193 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_expr199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_expr210 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_expr216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_expr227 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_expr233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_7_in_expr256 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_expr262 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_expr266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_rel288 = new BitSet(new long[]{0x000000000007E000L});
	public static final BitSet FOLLOW_expr_in_rel296 = new BitSet(new long[]{0x000000000007E000L});
	public static final BitSet FOLLOW_16_in_rel308 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_rel315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_rel329 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_rel335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_rel349 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_rel356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_rel369 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_rel376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rel389 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_rel395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_rel407 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_rel413 = new BitSet(new long[]{0x0000000000000002L});
>>>>>>> 309f8f37f577629b48c59d410af8510986d325eb
}
