package switchcalculator;

public class Calculator {
    private int x, y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int add() {
        return x + y;

    }

    public int sub() {
        return x - y;
    }

    public double div() {
        return (double) x / y;
    }

    public int mult() {
        return x * y;
    }

    public int power() {
        int result = (int) Math.pow(x, y);
        return result;
    }

    public int max() {
        return Math.max(x, y);
    }

    public int rest() {
        return x % y;
    }

    public double eulersExp() {
        return Math.exp(x);
    }
}
