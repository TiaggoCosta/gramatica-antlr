import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        GramaticaLexer lex = new GramaticaLexer(new ANTLRFileStream("C:\\Source\\Tradutores\\TGB\\gramatica-antlr\\test\\teste1.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        GramaticaParser g = new GramaticaParser(tokens, 49100, null);
        try {
            g.prog();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}