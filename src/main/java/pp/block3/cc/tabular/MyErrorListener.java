package pp.block3.cc.tabular;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Christiaan on 09-05-16.
 */
public class MyErrorListener extends BaseErrorListener {
    private List<String> errors;

    public MyErrorListener() {
        this.errors = new ArrayList<>();

    }


    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                            int line, int charPositionInLine, String msg, RecognitionException e) {
        errors.add("line " + line + ":" + charPositionInLine + " " + msg);
    }


    public List<String> getErrors() {
        return errors;
    }
}
