package yb.yadnyesh.sample;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void testAreaOfRectangle(){
        Rectangle rectangle = new Rectangle(2.1,2.1);
        assertEquals(4.35,rectangle.getAreaOfThisRectangle(),0.1);
        System.out.println("Area of rectangle: <TBD> ");

    }

}