package pp.s1594273.q1_5;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Created by Christiaan on 21-05-16.
 */
public class EmoteTest {
    private final String BASEDIR = "src/main/java/pp/s1594273/q1_5/";
    private EmoteChecker emoteChecker = new EmoteChecker();

    /*
     This method tests the two given files for correctness using the EmoteChecker.
     */
    @Test
    public void test() {
        try {
            test(0, new FileReader(BASEDIR + "ok1.txt"));
            test(1, new FileReader(BASEDIR + "err1.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void test(int errors, FileReader file) {
        ParseTree tree = parse(file);
        this.emoteChecker.init();
        new ParseTreeWalker().walk(emoteChecker, tree);
        System.out.println(emoteChecker.getErrors());
        assertEquals(errors, emoteChecker.getErrors().size());
    }


    private ParseTree parse(FileReader file) {
        CharStream chars = null;
        try {
            chars = new ANTLRInputStream(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Lexer lexer = new EmoteLexer(chars);
        TokenStream tokens = new CommonTokenStream(lexer);
        EmoteParser parser = new EmoteParser(tokens);
        return parser.text();
    }
}
