package yb.yadnyesh.youtube.venkat;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SampleTest {

    @Test
    public void testAdd() {
        Sample sample = new Sample();
        assertEquals(4, sample.add(2,2));
    }

    @Test
    public void testCheck() {
        Sample sample = new Sample();
        assertTrue(sample.check(1));
    }

    @Test
    public void testTransform() {
        Sample sample = new Sample();
        assertEquals(4, sample.transform(2));
    }

}