package pp.block1.cc.dfa;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Christiaan on 20-04-16.
 */
public class MyScanner implements Scanner {
    @Override
    public List<String> scan(State dfa, String text) {
        State start = dfa;
        ArrayList<String> words = new ArrayList<>();
        while (!text.equals("") && start.hasNext(text.charAt(0))){
            String result = "";
            ArrayList<State> stack = new ArrayList<>();
            char[] chars = text.toCharArray();

            State current = start;
            stack.add(current);
            int i = 0;
            while(i<chars.length && current.hasNext(chars[i])){
                result = result+ chars[i];
                current = current.getNext(chars[i]);
                if(current.isAccepting()){
                    stack = new ArrayList<>();
                }
                stack.add(current);
                i++;
            }

            while(stack.size() > 1){
                result = result.substring(0, result.length()-1);
                stack.remove(stack.size() -1);

            }
            words.add(result);
            text = text.substring(result.length());
        }
        return words;
    }
}
