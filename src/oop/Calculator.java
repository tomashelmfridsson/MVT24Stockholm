package oop;

public class Calculator {
    private int x, y;  // attribut
    private String text;

    public Calculator(int inputA, int inputB) {
        x = inputA;
        y = inputB;
    }

    public void setX(int newX){
        if (newX <10000 ) x = newX;
    }

    public void setName(String newText){
        if (text.length() > 4)  text = newText;
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
        int result = 1;
        for (int i = 0; i < y; i++) {
            result = result * x;
        }
        return result;
    }
}
