package fibonacci;

import java.lang.reflect.Array;

public class Fabonacci {

    public static int fibonacci(int n) {
        int number = 0;
        if (n <= 2) number = number + 1;
        else number = fibonacci(n - 2) + fibonacci(n - 1);
        return number;
    }


    public static int fibonacciWithArray(int n) {
        int[] fibonacciArray = new int[n];
        int number = 0;
        fibonacciArray[0] = 1;
        fibonacciArray[1] = 1;
        if (n >= 2) {
            for (int i = 2; i < n; i++) {
                fibonacciArray[i] = fibonacciArray[i - 2] + fibonacciArray[i - 1];
            }
            return fibonacciArray[n - 1];
        } else return 1;

    }
}
