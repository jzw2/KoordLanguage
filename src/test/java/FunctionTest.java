import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;

public class FunctionTest {


    @Test
    public void functionparse() throws IOException {
        Utils.SyntaxChecker checker = new Utils.SyntaxChecker();
        assert(checker.testFile("src/test/resources/functions.koord"));
    }

    @Test
    public void checkTypes() {
        ParseTree tree = Utils.treeFromFile("src/test/resources/functions.koord");

        var symbolTable = new SymbolTable(tree);
        var table = symbolTable.getTable();
        var func = table.get("myfunc");
        var expectedType = Type.Function(Arrays.asList(Type.Int, Type.Int), Type.Int);

        assert func != null;
        assert func.type.equals(expectedType);
        assert(symbolTable.isValid());



    }

} 
