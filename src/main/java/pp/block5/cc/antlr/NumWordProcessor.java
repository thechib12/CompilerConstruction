package pp.block5.cc.antlr;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import pp.block5.cc.ErrorListener;
import pp.block5.cc.ParseException;
import pp.iloc.model.Str;

/** Prettyprints a (number, word)-sentence and sums up the numbers. */
public class NumWordProcessor extends NumWordBaseVisitor<Integer> {
    int count;

	public static void main(String[] args) {
		NumWordProcessor grouper = new NumWordProcessor();
		if (args.length == 0) {
			process(grouper, "1sock2shoes 3 holes");
			process(grouper, "3 strands 10 blocks 11 weeks 15 credits 3 strands");


            process(grouper, "1 2 3");
		} else {
			for (String text : args) {
				process(grouper, text);
			}
		}
	}

    public NumWordProcessor(){
        this.count = 0;
    }

	private static void process(NumWordProcessor grouper, String text) {
		try {
			System.out.printf("Processing '%s':%n", text);
			int result = grouper.group(text);
			System.out.println("Total: " + result);
		} catch (ParseException exc) {
			exc.print();
		}
	}

	/** Groups a given sentence and prints it to stdout.
	 * Returns the sum of the numbers in the sentence.
	 */
	public int group(String text) throws ParseException {
		CharStream chars = new ANTLRInputStream(text);
		ErrorListener listener = new ErrorListener();
		Lexer lexer = new NumWordLexer(chars);
		lexer.removeErrorListeners();
		lexer.addErrorListener(listener);
		TokenStream tokens = new CommonTokenStream(lexer);
		NumWordParser parser = new NumWordParser(tokens);
		parser.removeErrorListeners();
		parser.addErrorListener(listener);
		ParseTree tree = parser.sentence();
		listener.throwException();
		return visit(tree);
	}

	// Override the visitor methods.
	// Each visitor method should call visit(child)
	// if and when it wants to visit that child node.


    @Override
    public Integer visitSentence(NumWordParser.SentenceContext ctx) {
        int size = ctx.number().size();
        int sum = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <size ; i++) {
            int count = visitNumber(ctx.number(i));
            sum += count;
            String word = ctx.word(i).getText();
            if(i == size-2){
                builder.append(count + " "+ word+ " and " );
            } else if( i == size-1){
                builder.append(count + " "+ word);
            } else {
                builder.append(count + " "+ word + ", ");
            }




        }
        System.out.println(builder.toString());
        return sum;
    }

    @Override
    public Integer visitNumber(NumWordParser.NumberContext ctx) {
        return  Integer.parseInt(ctx.getText());

    }

    @Override
    public Integer visitWord(NumWordParser.WordContext ctx) {
        System.out.println(ctx.getText());
        return super.visitWord(ctx);
    }
}
