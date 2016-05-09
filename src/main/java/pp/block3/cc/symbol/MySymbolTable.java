package pp.block3.cc.symbol;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Christiaan on 09-05-16.
 */
public class MySymbolTable implements SymbolTable {

    List<List<String>> scopes;
    private int scopeDepth;

    public MySymbolTable() {
        this.scopes = new ArrayList<>();
        scopes.add(new ArrayList<>());
        scopeDepth = 0;

    }
    @Override
    public void openScope() {
        scopes.add(new ArrayList<>());
        scopeDepth++;
    }

    @Override
    public void closeScope() {
        if (scopeDepth == 0) {
            throw new RuntimeException();
        } else {
            scopes.remove(scopeDepth);
            scopeDepth = scopeDepth - 1;
        }

    }

    @Override
    public boolean add(String id) {
        if (scopes.get(scopeDepth).contains(id)) {
            return false;
        } else {
            scopes.get(scopeDepth).add(id);
        }
        return true;
    }

    @Override
    public boolean contains(String id) {
        for (int i = 0; i <= scopeDepth; i++) {
            if (scopes.get(i).contains(id)) {
                return true;
            }
        }
        return false;
    }
}
