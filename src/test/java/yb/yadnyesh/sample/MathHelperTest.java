package yb.yadnyesh.sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathHelperTest {

    @Test
    public void factorialTest() {
        assertEquals(1, MathHelper.factorial(0));
        assertEquals(1, MathHelper.factorial(1));
        assertEquals(120, MathHelper.factorial(5));
        assertEquals(720, MathHelper.factorial(6));
    }

//    private static Stream<Arguments> factorialTestSource() {
//        Stream.of(
//
//        );
//    }

    @Test
    public void factorialIllegalArgument() {
        assertThrows(IllegalArgumentException.class, () -> MathHelper.factorial(-1));
    }

}