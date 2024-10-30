package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Calculator2Test {
    @Test
    public void add() {
        char[] operators = {'+', '-', '*', '/'};
        int[] termer = {12, 56};
        Calculator2 calculator2 = new Calculator2(termer);
        assertEquals(68, calculator2.operator(operators[0]));
    }

    @Test
    public void add() {
        int[] termer = {12, 56};
        Calculator2 calculator2 = new Calculator2(termer);
        assertEquals("Ogiltigt räkneset", calculator2.operator('%') );
    }

}
