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

public class FibTest {

    private final static String BASE_DIR = "src/main/java/pp/block4/cc/iloc/";
    private final static boolean SHOW = true;

    public static void main(String[] args) {
        FibTest fibtest = new FibTest();
        fibtest.test();

    }

    public void test() {
        Program p = parse("fib");
        System.out.println(p.prettyPrint());
        Machine c = new Machine();
        c.setNum("n", 45);
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
