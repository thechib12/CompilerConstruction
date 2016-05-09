package pp.block1.cc.test;

import org.junit.Test;

import pp.block1.cc.antlr.Example;
import pp.block1.cc.antlr.PL1String;
import pp.block1.cc.antlr.SixDigits;

public class PL1Tester {
    private static LexerTester tester = new LexerTester(PL1String.class);

    @Test
    public void succeedingTest() {
        tester.correct("\"\"");
        tester.correct("\"lololol\"");
        tester.wrong("\"");

    }




}
