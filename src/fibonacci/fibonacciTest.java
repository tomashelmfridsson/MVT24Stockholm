package fibonacci;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class fibonacciTest {
    // Talserie: 1 1 2 3 5 8 13 21 34 55 89

    // Räkna ut talserie med 2 loopar (nested loops)

    @Test
    void fibonacci1(){
        assertEquals(1, Fabonacci.fibonacci(1));
    }

    @Test
    void fibonacci2(){
        assertEquals(1, Fabonacci.fibonacci(2));
    }

    @Test
    void fibonacci3(){
        assertEquals(2, Fabonacci.fibonacci(3));
    }

    @Test
    void fibonacci4(){
        assertEquals(3, Fabonacci.fibonacci(4));
    }

    @Test
    void fibonacci5(){
        assertEquals(5, Fabonacci.fibonacci(5));
    }

    @Test
    void fibonacci6(){
        assertEquals(8, Fabonacci.fibonacci(6));
    }

    @Test
    void fibonacci7(){
        assertEquals(13, Fabonacci.fibonacci(7));
    }

    @Test
    void fibonacci11(){
        assertEquals(89, Fabonacci.fibonacci(11));
    }

    @Test
    void fibonacci20(){
        assertEquals(6765, Fabonacci.fibonacci(20));
    }

    @Test
    void fibonacci40(){
        assertEquals(102334155, Fabonacci.fibonacci(40));
    }

    @Test
    void fibonacci48(){
        assertEquals(512559680, Fabonacci.fibonacci(48));
    }

    // Räkna ut talserien mha Array
    @Test
    void fibonacciWithArray3(){
        assertEquals(2, Fabonacci.fibonacciWithArray(3));
    }

    @Test
    void fibonacciWithArray4(){
        assertEquals(3, Fabonacci.fibonacciWithArray(4));
    }

    @Test
    void fibonacciWithArray5(){
        assertEquals(5, Fabonacci.fibonacciWithArray(5));
    }

    @Test
    void fibonacciWithArray11(){
        assertEquals(89, Fabonacci.fibonacciWithArray(11));
    }

    @Test
    void fibonacciWithArray20(){
        assertEquals(6765, Fabonacci.fibonacciWithArray(20));
    }

    @Test
    void fibonacciWithArray40(){
        assertEquals(102334155, Fabonacci.fibonacciWithArray(40));
    }

    @Test
    void fibonacciWithArray48(){
        assertEquals(512559680, Fabonacci.fibonacciWithArray(48));
    }


}
