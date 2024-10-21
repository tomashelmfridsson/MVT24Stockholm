package oop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    void area(){
        Rectangle rectangle = new Rectangle(10,20);
        assertEquals(200,rectangle.calculateArea());
    }

    @Test
    void omkrets(){
        Rectangle rectangle = new Rectangle(10,20);
        assertEquals(60,rectangle.calculatePerimeter());
    }
}
