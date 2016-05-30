package pp.s1594273.q1_2;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by Christiaan on 18-05-16.
 */
public class DecimalTest {


    public static List<Token> scan(String text) {
        CharStream stream = new ANTLRInputStream(text);
        Lexer lexer = new Decimal(stream);
        return new ArrayList<>(lexer.getAllTokens());
    }

    @Test
    public void testFloat() {
        List<Token> test = scan("23f 123_223123.02_1f 1_3__5f .5e3__3f 5.0");
        assertEquals(test.get(0).getType(), Decimal.FLOAT);
        assertEquals(test.get(1).getType(), Decimal.FLOAT);
        assertEquals(test.get(2).getType(), Decimal.FLOAT);
        assertEquals(test.get(3).getType(), Decimal.FLOAT);
        assertNotEquals(test.get(4).getType(), Decimal.FLOAT);
    }

    @Test
    public void testDouble() {
        List<Token> test = scan("3 .1231_2312d 0.12__3e1_2d  .00012 .02f ");
        assertEquals(test.get(0).getType(), Decimal.DOUBLE);
        assertEquals(test.get(1).getType(), Decimal.DOUBLE);
        assertEquals(test.get(2).getType(), Decimal.DOUBLE);
        assertEquals(test.get(3).getType(), Decimal.DOUBLE);
        assertNotEquals(test.get(4).getType(), Decimal.DOUBLE);
    }
}