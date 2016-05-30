package pp.s1594273.q1_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by Christiaan on 21-05-16.
 */
public class MySymbolTable<T> implements SymbolTable<T> {

    private Stack<Map<String, T>> scopes;


    public MySymbolTable() {
        this.scopes = new Stack<>();
        this.scopes.add(new HashMap<>());
    }

    public void openScope() {
        this.scopes.add(new HashMap<>(this.scopes.peek()));
    }

    public void closeScope() {
        if (this.scopes.size() == 1) {
            throw new RuntimeException();
        }
        this.scopes.pop();
    }

    public boolean add(String id, T attr) {
        if (this.scopes.peek().containsKey(id)) {
            return false;
        } else {
            this.scopes.peek().put(id, attr);
            return true;
        }
    }

    @Override
    public boolean contains(String id) {
        return this.scopes.peek().containsKey(id);
    }

    public T get(String id) {
        return this.scopes.peek().get(id);
    }

    public void setValue(String id, T emotion) {
        this.scopes.peek().put(id, emotion);
    }
}
