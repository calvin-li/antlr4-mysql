package fuzzer;

import java.util.Random;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.Charset;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class pA {
    public static final Random rng = new Random(0);

	public static void test(String text, ArrayList<Integer> tables, ArrayList<String> select_fields, int where_index){

        String[] types = {"int", "varchar"};
        String[] is_key = {"key", "nokey"};
        String[] and_or = {"AND", "OR"};
        String[] compare = {"=", "<", ">", "!=", "<>", "<=", ">="};

        String select_more = " " ;

        for(int i = 1; i <= tables.size(); i++){
            Boolean duplicate_field = true;
            String new_field = "";

            //make sure we do not select same field twice
            while(duplicate_field){
                String type = random(types);
                String key = random(is_key);
                new_field = "";

                new_field += "alias" + i + ".";
                if(rng.nextInt(100) < 90)
                    new_field += "`col_" + type + "_" + key + "`";
                else
                    new_field += "`pk`";

                duplicate_field = false;
                for(String f : select_fields){
                    if(f.equals(new_field))
                        duplicate_field = true;
                }//for
            }//while

            select_more += new_field;
            select_more += " AS ";
            select_more += "field" + (select_fields.size() + i);
            select_more += ", ";
        }//for

        select_more += ' ';

        text = text.replaceFirst("SELECT", "SELECT" + select_more);

        String where_more = "\n";
        int where_num = 50;

        for(int i=0; i<rng.nextInt(where_num); i++){
            String alias = "alias" + (rng.nextInt(tables.size())+1);

            String type = random(types);
            String key = random(is_key);
            String conj = random(and_or);
            String op = random(compare);

            String characters = "abcdefghijklmnopqrstuvwxyz";
            String value = "";
            if(type.equals("int"))
                value = Integer.toString(rng.nextInt() % 100);
            else if(type.equals("varchar")){
                for(int j=0; j<5; j++)
                    value += characters.charAt(rng.nextInt(characters.length()));
            }

            where_more += alias + ".";
            where_more += "`col_" + type + "_" + key + "`";
            where_more += " " + op + " " + value + " " + conj + " ";
        }
        where_more += "\n";
        where_index += select_more.length() + "WHERE ".length();
        text = text.substring(0, where_index-1) + where_more + text.substring(where_index);

        try{
            PrintWriter outfile = new PrintWriter("out.txt");
            outfile.print(text);
            outfile.close();
        } catch (FileNotFoundException e){
            System.err.println("Cannot open output file");
        }
	}

    private static <T> T random(T[] array){
        return array[rng.nextInt(array.length)];
    }
}
