import org.junit.jupiter.api.Test;

import java.io.IOException;

public class FunctionTest {


    @Test
    public void functionparse() throws IOException {
        Utils.SyntaxChecker checker = new Utils.SyntaxChecker();
        assert(checker.testFile("src/test/resources/functions.koord"));
    }

} 
