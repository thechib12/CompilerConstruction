package pp.s1594273.q2_5;

import pp.iloc.Assembler;
import pp.iloc.Simulator;
import pp.iloc.model.Program;
import pp.iloc.parse.FormatException;

import java.io.File;
import java.io.IOException;

/**
 * Created by Christiaan on 13-06-16.
 */
public class RunGCD {
    public static final String FILE_DIR = "src/main/java/pp/s1594273/q2_5/";
    public static final String FILE_NAME = "gcd.iloc";

    static public void main(String[] args) {
        try {
            Program prog = Assembler.instance().assemble(new File(FILE_DIR + FILE_NAME));
            new Simulator(prog).run();
        } catch (FormatException | IOException exc) {
            exc.printStackTrace();
        }
    }
}
