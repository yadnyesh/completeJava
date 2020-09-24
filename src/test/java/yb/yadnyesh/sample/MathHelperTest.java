package yb.yadnyesh.sample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MathHelperTest {

    @ParameterizedTest(name = "{index} -> {0} should return {1}")
//    @MethodSource("factorialTestSource")
    @CsvSource(value = {"0,1","1,1","5,120","6,720"})
    public void factorialTest(int number, int expectedValue) {
        assertEquals(expectedValue, MathHelper.factorial(number));
    }

    private static Stream<Arguments> factorialTestSource() {
        return Stream.of(
            Arguments.of(0,1),
            Arguments.of(1,1),
            Arguments.of(5, 120),
            Arguments.of(6,720)
        );
    }

    @Test
    public void factorialIllegalArgument() {
        assertThrows(IllegalArgumentException.class, () -> MathHelper.factorial(-1));
    }

    @ParameterizedTest
    @ValueSource(ints = {3,5,7,11,17,23})
    public void isPrimeReturnsTrueForPrimesTest(int number) {
        assertTrue(MathHelper.isPrime(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {4,6,8,9,10,12,15,18,20})
    public void isPrimeReturnsFalseForNonPrimesTest(int number) {
        assertFalse(MathHelper.isPrime(number));
    }

}