package yb.yadnyesh.youtube.venkat;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class SampleTest {

    @Test
    void testAdd() {
        Sample sample = new Sample();
        assertEquals(4, sample.add(2,2));
    }

    @Test
    void testCheck() {
        Sample sample = new Sample();
        assertTrue(sample.check(1));
    }

    @Test
    void testTransform() {
        Sample sample = new Sample();
        assertEquals(4, sample.transform(2));
    }

}