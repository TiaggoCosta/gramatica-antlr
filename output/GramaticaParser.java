// $ANTLR 3.5.1 C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g 2020-10-17 20:36:25

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class GramaticaParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT", "ESC_SEQ", 
		"EXPONENT", "FLOAT", "HEX_DIGIT", "ID", "INT", "NEWLINE", "OCTAL_ESC", 
		"STRING", "UNICODE_ESC", "VAR", "WS", "'('", "')'", "'*'", "'+'", "'-'", 
		"'/'"
	};
	public static final int EOF=-1;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int CHAR=4;
	public static final int COMMENT=5;
	public static final int ESC_SEQ=6;
	public static final int EXPONENT=7;
	public static final int FLOAT=8;
	public static final int HEX_DIGIT=9;
	public static final int ID=10;
	public static final int INT=11;
	public static final int NEWLINE=12;
	public static final int OCTAL_ESC=13;
	public static final int STRING=14;
	public static final int UNICODE_ESC=15;
	public static final int VAR=16;
	public static final int WS=17;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "expr", "prog"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false
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
	// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:7:1: prog returns [ double v ] : (e= expr ( NEWLINE )* )+ ;
	public final double prog() throws RecognitionException {
		double v = 0.0;


		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "prog");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(7, 0);

		try {
			// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:7:29: ( (e= expr ( NEWLINE )* )+ )
			dbg.enterAlt(1);

			// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:9:2: (e= expr ( NEWLINE )* )+
			{
			dbg.location(9,2);
			// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:9:2: (e= expr ( NEWLINE )* )+
			int cnt2=0;
			try { dbg.enterSubRule(2);

			loop2:
			while (true) {
				int alt2=2;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( (LA2_0==INT||LA2_0==18) ) {
					alt2=1;
				}

				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:9:3: e= expr ( NEWLINE )*
					{
					dbg.location(9,5);
					pushFollow(FOLLOW_expr_in_prog34);
					e=expr();
					state._fsp--;
					dbg.location(9,12);
					v = e;dbg.location(9,25);
					System.out.println("Resultado: " + v);dbg.location(9,68);
					// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:9:68: ( NEWLINE )*
					try { dbg.enterSubRule(1);

					loop1:
					while (true) {
						int alt1=2;
						try { dbg.enterDecision(1, decisionCanBacktrack[1]);

						int LA1_0 = input.LA(1);
						if ( (LA1_0==NEWLINE) ) {
							alt1=1;
						}

						} finally {dbg.exitDecision(1);}

						switch (alt1) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:9:68: NEWLINE
							{
							dbg.location(9,68);
							match(input,NEWLINE,FOLLOW_NEWLINE_in_prog41); 
							}
							break;

						default :
							break loop1;
						}
					}
					} finally {dbg.exitSubRule(1);}

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
		dbg.location(10, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "prog");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return v;
	}
	// $ANTLR end "prog"



	// $ANTLR start "expr"
	// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:12:1: expr returns [ double v ] : ( INT ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr ) | INT | '(' e= expr ')' );
	public final double expr() throws RecognitionException {
		double v = 0.0;


		Token INT1=null;
		Token INT2=null;
		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(12, 0);

		try {
			// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:12:26: ( INT ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr ) | INT | '(' e= expr ')' )
			int alt4=3;
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==INT) ) {
				int LA4_1 = input.LA(2);
				if ( ((LA4_1 >= 20 && LA4_1 <= 23)) ) {
					alt4=1;
				}
				else if ( (LA4_1==EOF||(LA4_1 >= INT && LA4_1 <= NEWLINE)||(LA4_1 >= 18 && LA4_1 <= 19)) ) {
					alt4=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA4_0==18) ) {
				alt4=3;
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

					// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:13:2: INT ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr )
					{
					dbg.location(13,2);
					INT1=(Token)match(input,INT,FOLLOW_INT_in_expr59); dbg.location(13,6);
					v = Double.parseDouble( (INT1!=null?INT1.getText():null));dbg.location(14,5);
					// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:14:5: ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr )
					int alt3=4;
					try { dbg.enterSubRule(3);
					try { dbg.enterDecision(3, decisionCanBacktrack[3]);

					switch ( input.LA(1) ) {
					case 21:
						{
						alt3=1;
						}
						break;
					case 22:
						{
						alt3=2;
						}
						break;
					case 20:
						{
						alt3=3;
						}
						break;
					case 23:
						{
						alt3=4;
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

							// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:14:6: '+' e= expr
							{
							dbg.location(14,6);
							match(input,21,FOLLOW_21_in_expr69); dbg.location(14,12);
							pushFollow(FOLLOW_expr_in_expr75);
							e=expr();
							state._fsp--;
							dbg.location(14,19);
							v += e;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:15:7: '-' e= expr
							{
							dbg.location(15,7);
							match(input,22,FOLLOW_22_in_expr86); dbg.location(15,13);
							pushFollow(FOLLOW_expr_in_expr92);
							e=expr();
							state._fsp--;
							dbg.location(15,20);
							v -= e;
							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:16:7: '*' e= expr
							{
							dbg.location(16,7);
							match(input,20,FOLLOW_20_in_expr103); dbg.location(16,13);
							pushFollow(FOLLOW_expr_in_expr109);
							e=expr();
							state._fsp--;
							dbg.location(16,20);
							v *= e;
							}
							break;
						case 4 :
							dbg.enterAlt(4);

							// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:17:7: '/' e= expr
							{
							dbg.location(17,7);
							match(input,23,FOLLOW_23_in_expr120); dbg.location(17,13);
							pushFollow(FOLLOW_expr_in_expr126);
							e=expr();
							state._fsp--;
							dbg.location(17,20);
							v /= e;
							}
							break;

					}
					} finally {dbg.exitSubRule(3);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:19:7: INT
					{
					dbg.location(19,7);
					INT2=(Token)match(input,INT,FOLLOW_INT_in_expr138); dbg.location(19,11);
					v = Double.parseDouble( (INT2!=null?INT2.getText():null));
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\Gramatica.g:21:7: '(' e= expr ')'
					{
					dbg.location(21,7);
					match(input,18,FOLLOW_18_in_expr149); dbg.location(21,13);
					pushFollow(FOLLOW_expr_in_expr155);
					e=expr();
					state._fsp--;
					dbg.location(21,20);
					v = e;dbg.location(21,33);
					match(input,19,FOLLOW_19_in_expr159); 
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
		dbg.location(22, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return v;
	}
	// $ANTLR end "expr"

	// Delegated rules



	public static final BitSet FOLLOW_expr_in_prog34 = new BitSet(new long[]{0x0000000000041802L});
	public static final BitSet FOLLOW_NEWLINE_in_prog41 = new BitSet(new long[]{0x0000000000041802L});
	public static final BitSet FOLLOW_INT_in_expr59 = new BitSet(new long[]{0x0000000000F00000L});
	public static final BitSet FOLLOW_21_in_expr69 = new BitSet(new long[]{0x0000000000040800L});
	public static final BitSet FOLLOW_expr_in_expr75 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_expr86 = new BitSet(new long[]{0x0000000000040800L});
	public static final BitSet FOLLOW_expr_in_expr92 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_expr103 = new BitSet(new long[]{0x0000000000040800L});
	public static final BitSet FOLLOW_expr_in_expr109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_expr120 = new BitSet(new long[]{0x0000000000040800L});
	public static final BitSet FOLLOW_expr_in_expr126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_expr138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_expr149 = new BitSet(new long[]{0x0000000000040800L});
	public static final BitSet FOLLOW_expr_in_expr155 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_expr159 = new BitSet(new long[]{0x0000000000000002L});
}
