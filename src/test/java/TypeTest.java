import org.junit.jupiter.api.Test;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class TypeTest {
    @Test
    public void simpleTest() {
        assertEquals(Type.Bool, (Type.Bool));

        assertNotEquals(Type.Bool, (Type.Int));
    }

    @Test
    public void nestedTest() {
        assertEquals(Type.Array(Type.Bool), (Type.Array(Type.Bool)));
        assertNotEquals(Type.Array(Type.Int), (Type.Array(Type.Float)));
        assertNotEquals(Type.Array(Type.Bool), (Type.Bool));
    }

    @Test
    public void doubleNested() {
        assertEquals(Type.Array(Type.Array(Type.Bool)), (Type.Array(Type.Array(Type.Bool))));
        assertNotEquals(Type.Array(Type.Array(Type.Bool)), (Type.Array((Type.Bool))));
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
