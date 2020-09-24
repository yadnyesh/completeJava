package yb.yadnyesh.udemy.in28minutes.junittesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiscTest {

    @Test
    void testStringToUpperCase() {
        String inputString = "abcd".toUpperCase();
        String expectedString = "ABCD";
        assertNotNull(inputString);
        assertEquals(inputString, expectedString);
    }

    @Test
    void testStringContains() {
        String inputString = "abcdefghi";
        boolean result = inputString.contains("def");
        assertTrue(result);
    }

}