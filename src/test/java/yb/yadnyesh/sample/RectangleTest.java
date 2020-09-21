package yb.yadnyesh.sample;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class RectangleTest {

    @Test
    public void testAreaOfRectangle(){
        Rectangle rectangle = new Rectangle(2.1,2.1);
        assertEquals(4.35,rectangle.getAreaOfThisRectangle(),0.1);
        log.info("Area of rectangle: <TBD> ");

    }

}