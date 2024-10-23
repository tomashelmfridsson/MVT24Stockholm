package oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

    @Test
    void testOfArea() {
        Circle circle = new Circle(10);
        assertEquals(314, circle.calculateArea());
    }

    @Test
    void testOfArea2() {
        Circle circle = new Circle(5);
        assertEquals(78.5, circle.calculateArea());
    }

    @Test
    void testOfBiggerThan(){
        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(5);
        assertTrue(circle1.isBiggerThan(circle2));
    }
}
