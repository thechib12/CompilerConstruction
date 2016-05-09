package pp.block1.cc.test;

import org.junit.Test;

import pp.block1.cc.antlr.Example;
import pp.block1.cc.antlr.SixDigits;

public class SixDigitsTest {
    private static LexerTester tester = new LexerTester(SixDigits.class);

    @Test
    public void succeedingTest() {
        tester.correct("N11111");
        tester.wrong("1111111");
        tester.wrong("A123456");
        tester.correct("ROGIER");
//        tester.correct("while while do");
//        tester.yields("while while do", Example.WHILE, Example.WHILE,
//                Example.DO);
//        tester.wrong("whiledo done");
    }



    @Test
    public void noSpacesBetweenKeywordsTest() {
        // the following is perfectly fine, so claiming it's wrong will fail
        tester.yields("ROGIERROGIER",SixDigits.WORD, SixDigits.WORD );
    }
}
