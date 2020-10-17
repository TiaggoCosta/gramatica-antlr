// $ANTLR 3.5.1 C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\T.g 2020-10-17 20:18:31

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class TParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "WS", "'#'"
	};
	public static final int EOF=-1;
	public static final int T__6=6;
	public static final int ID=4;
	public static final int WS=5;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "r"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public TParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public TParser(TokenStream input, int port, RecognizerSharedState state) {
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

	public TParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return TParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\T.g"; }


	String s;



	// $ANTLR start "r"
	// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\T.g:8:1: r : ID '#' ;
	public final void r() throws RecognitionException {
		Token ID1=null;

		try { dbg.enterRule(getGrammarFileName(), "r");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(8, 0);

		try {
			// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\T.g:8:3: ( ID '#' )
			dbg.enterAlt(1);

			// C:\\Users\\Tiago\\OneDrive\\Documents\\vscode\\java\\gramatica-antlr\\T.g:8:5: ID '#'
			{
			dbg.location(8,5);
			ID1=(Token)match(input,ID,FOLLOW_ID_in_r27); dbg.location(8,8);
			match(input,6,FOLLOW_6_in_r29); dbg.location(8,12);
			s = (ID1!=null?ID1.getText():null); System.out.println("found "+s);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(8, 59);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "r");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "r"

	// Delegated rules



	public static final BitSet FOLLOW_ID_in_r27 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_6_in_r29 = new BitSet(new long[]{0x0000000000000002L});
}
