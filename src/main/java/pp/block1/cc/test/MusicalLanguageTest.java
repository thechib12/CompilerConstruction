package pp.block1.cc.test;

import org.junit.Test;

import pp.block1.cc.antlr.Example;
import pp.block1.cc.antlr.MusicalLanguage;
import pp.block1.cc.antlr.SixDigits;

public class MusicalLanguageTest {
    private static LexerTester tester = new LexerTester(MusicalLanguage.class);

    @Test
    public void succeedingTest() {
        tester.wrong("LaLi");
        tester.correct("LaaaaaLaaaaaaLaaaaa Li");
        tester.yields("Laaaa LaLaa", MusicalLanguage.LA_LA, MusicalLanguage.LA);
        tester.yields("La La La Li La",  MusicalLanguage.LA_LA_LA_LI, MusicalLanguage.LA);
    }
}
