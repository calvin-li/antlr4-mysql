package fuzzer;

import fuzzer.gen.*;
import org.antlr.v4.runtime.*;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception {

        //take input from file in command line, else use stdin
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) {
            is = new FileInputStream(inputFile);
        }

        ANTLRInputStream input = new ANTLRInputStream(is);
        mysql_expressionsLexer lexer =
                new mysql_expressionsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        mysql_expressionsParser parser =
                new mysql_expressionsParser(tokens);
        ParserRuleContext tree = parser.query(); // parse
        Visitor visitor = new Visitor();
        visitor.visit(tree);
    }
}
