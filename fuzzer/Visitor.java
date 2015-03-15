package fuzzer;
import fuzzer.gen.*;
import fuzzer.gen.mysql_expressionsParser.*;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Visitor extends mysql_expressionsBaseVisitor<Integer> {

    @Override
    public Integer visitQuery(QueryContext ctx) {

        String query = ctx.getText();

        PrintWriter outfile = null;
        try{
            outfile = new PrintWriter("out.txt");
            outfile.print(query);
        } catch (FileNotFoundException e){
            System.err.println("Cannot open output file");
        } finally {
            if(outfile != null) outfile.close();
        }

        return super.visitQuery(ctx);
    }

    /*
    @Override
    public Integer visitOpExpr(OpExprContext ctx) {
        int left = visit(ctx.left);
        int right = visit(ctx.right);
        String op = ctx.op.getText();
        final int result;
        switch (op.charAt(0)) {
            case '*' : result = left * right; break;
            case '/' : result = left / right; break;
            case '+' : result = left + right; break;
            case '-' : result = left - right; break;
            default: throw new IllegalArgumentException("Unkown opeator " + op);
        }
        return result;
    }

    @Override
    public Integer visitAtomExpr(AtomExprContext ctx) {
        Integer atom = new Integer(ctx.atom.getText());
        return atom;
    }
    */
}