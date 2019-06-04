import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TypeTest {
    @Test
    public void simpleTest() {
        assert(Type.Bool.equals(Type.Bool));
        assert(!Type.Bool.equals(Type.Int));
    }

    @Test
    public void nestedTest() {
        assert(Type.Array(Type.Bool).equals(Type.Array(Type.Bool)));
        assert(!Type.Array(Type.Int).equals(Type.Array(Type.Float)));
        assert(!Type.Array(Type.Bool).equals(Type.Bool));
    }

    @Test
    public void doubleNested() {
        assert(Type.Array(Type.Array(Type.Bool)).equals(Type.Array(Type.Array(Type.Bool))));
        assert(!Type.Array(Type.Array(Type.Bool)).equals(Type.Array((Type.Bool))));
    }

    @Test
    void function() {
        var type1 = Type.Function(Arrays.asList(Type.Int), Type.Int);
        var type2 = Type.Function(Arrays.asList(Type.Int), Type.Int);
        assert type1.equals(type2);


        type1 = Type.Function(Arrays.asList(Type.Int, Type.Int), Type.Int);
        assert !type1.equals(type2);


        type2 = Type.Function(Arrays.asList(), Type.Int);
        assert !type1.equals(type2);
    }

}
