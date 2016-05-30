package pp.block4.cc.iloc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import org.junit.Test;

import pp.iloc.Assembler;
import pp.iloc.Simulator;
import pp.iloc.eval.Machine;
import pp.iloc.model.Program;
import pp.iloc.parse.FormatException;

public class MaxTest {

    private final static String BASE_DIR = "src/main/java/pp/block4/cc/iloc/";
    private final static boolean SHOW = true;

    public static void main(String[] args) {
        MaxTest maxtest = new MaxTest();
        maxtest.testFig13();

    }

    public void testFig13() {
        Program p = parse("max");
        System.out.println(p.prettyPrint());
        Machine c = new Machine();
        int a = c.init("a", 2, 3, 5, 6, 10);
        int alength = c.init("alength", 5);
        new Simulator(p, c).run();
        System.out.println(c);
    }

    Program parse(String filename) {
        File file = new File(filename + ".iloc");
        if (!file.exists()) {
            file = new File(BASE_DIR + filename + ".iloc");
        }
        try {
            return Assembler.instance().assemble(file);
        } catch (FormatException | IOException e) {
            fail(e.getMessage());
            return null;
        }
    }
}
