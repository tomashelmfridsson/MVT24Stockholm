package switchcalculator;

public class Calculator {
    private static int x;
    private static int y;

    public static void setX(int xInput) {
        x = xInput;
    }

    public static void setY(int yInput) {
        y = yInput;
    }

    public static int add() {
        return x + y;

    }

    public static int sub() {
        return x - y;
    }

    public static double div() {
        return (double) x / y;
    }

    public static int mult() {
        return x * y;
    }

    public static int power() {
        int result = (int) Math.pow(x, y);
        return result;
    }

    public static int max() {
        return Math.max(x, y);
    }

    public static  int rest() {
        return x % y;
    }

    public static double eulersExp() {
        return Math.exp(x);
    }
}
