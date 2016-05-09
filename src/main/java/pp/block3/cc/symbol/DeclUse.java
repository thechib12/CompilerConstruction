package pp.block3.cc.symbol;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Christiaan on 09-05-16.
 */
public class DeclUse extends DeclUseBaseListener {

    MySymbolTable symbolTable;
    List<String> errors;

    public void init() {
        errors = new ArrayList<>();
        symbolTable = new MySymbolTable();
    }

    @Override
    public void enterSeries(DeclUseParser.SeriesContext ctx) {
        symbolTable.openScope();

    }

    @Override
    public void exitSeries(DeclUseParser.SeriesContext ctx) {
        symbolTable.closeScope();
    }

    public void enterDecl(DeclUseParser.DeclContext ctx) {
        super.enterDecl(ctx);
    }

    @Override
    public void exitDecl(DeclUseParser.DeclContext ctx) {

        if (!symbolTable.add(ctx.ID().getText())) {
            errors.add(ctx.ID().getText() + "already declared in scope " + "at line " + ctx.ID().getSymbol().getLine() + "at "
                    + ctx.ID().getSymbol().getCharPositionInLine());

        }
    }

    @Override
    public void enterUse(DeclUseParser.UseContext ctx) {
        super.enterUse(ctx);
    }

    @Override
    public void exitUse(DeclUseParser.UseContext ctx) {
        if (!symbolTable.contains(ctx.ID().getText())) {
            errors.add(ctx.ID().getText() + "not declared " + "at line " + ctx.ID().getSymbol().getLine() + "at "
                    + ctx.ID().getSymbol().getCharPositionInLine());

        }
    }

    @Override
    public void enterProgram(DeclUseParser.ProgramContext ctx) {
        super.enterProgram(ctx);
    }

    @Override
    public void exitProgram(DeclUseParser.ProgramContext ctx) {
        super.exitProgram(ctx);
    }

    public List<String> getErrors() {
        return errors;
    }
}
