package fuzzer;
import fuzzer.gen.*;
import fuzzer.gen.mysql_expressionsParser.*;

import javax.management.Query;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Random;

public class Visitor extends mysql_expressionsBaseVisitor<Integer> {
    private static final String[] types = {"int", "varchar"};
    private static final String[] is_key = {"key", "nokey"};
    private static final String[] and_or = {"AND", "OR"};
    private static final String[] compare =
            {"=", "<", ">", "!=", "<>", "<=", ">="};
    private static final Random rng = new Random();

    public static HashMap<String, Integer> index =
            new HashMap<String, Integer>();

    @Override
    public Integer visitQuery(QueryContext ctx) {
        super.visitQuery(ctx);

        String query = ctx.getText();
        String select_more = " ";

        if(!index.containsKey("AGG")) {
            for (int i = 1; i <= ctx.tables.size(); i++) {
                Boolean duplicate_field = true;
                String new_field = "";
                //make sure we do not select same field twice
                while (duplicate_field) {
                    String type = random(types);
                    String key = random(is_key);
                    new_field = "";
                    new_field += "alias" + i + ".";
                    if (rng.nextInt(100) < 90)
                        new_field +=
                                "`col_" + type + "_" + key + "`";
                    else
                        new_field += "`pk`";
                    duplicate_field = false;
                    for (String f : ctx.select_fields) {
                        if (f.equals(new_field))
                            duplicate_field = true;
                    }//for
                }//while
                select_more += new_field;
                select_more += " AS ";
                select_more +=
                        "field" + (ctx.select_fields.size() + i);
                select_more += ", ";
            }//for
        }//if
        select_more += ' ';
        query = query.replaceFirst(
                "SELECT", "SELECT" + select_more);

        //fuzz where clause
        String where_more = "\n";
        for(int i=0; i<rng.nextInt(15); i++){
            String alias =
                    "alias" + (rng.nextInt(ctx.tables.size())+1);
            String type = random(types);
            String key = random(is_key);
            String conj = random(and_or);
            String op = random(compare);
            String chars = "abcdefghijklmnopqrstuvwxyz";
            String value = "";
            if(type.equals("int"))
                value = Integer.toString(rng.nextInt() % 100);
            else if(type.equals("varchar")){
                value = "'";
                for(int j=0; j<5; j++) {
                    int nextChar = rng.nextInt(chars.length());
                    value += chars.charAt(nextChar);
                }
                value += "'";
            }
            where_more += alias + ".";
            where_more += "`col_" + type + "_" + key + "`";
            where_more +=
                    " " + op + " " + value + " " + conj + " ";
        }
        where_more += '\n';
        int where_index = index.get("WHERE");
        where_index +=
                select_more.length() + "WHERE ".length();
        query = insert(query, where_more, where_index);

        printToFile("out.txt", query);

        return 0;
    }

    @Override
    public Integer visitAggregate_select_item
            (Aggregate_select_itemContext ctx) {
        super.visitAggregate_select_item(ctx);

        return 0;
    }

    private static <T> T random(T[] array){
        return array[rng.nextInt(array.length)];
    }

    public String insert(String base, String ins, int index){
        return base.substring(0, index-1) +
                ins +
                base.substring(index);
    }

    public void printToFile(String filename, String text){
        PrintWriter outfile = null;
        try{
            outfile = new PrintWriter(filename);
            outfile.print(text);
        } catch (FileNotFoundException e){
            System.err.println("Cannot open: " + filename);
        } finally {
            if(outfile != null) outfile.close();
        }
    }
}