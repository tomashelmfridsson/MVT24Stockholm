package array;

public class Calculator2 {

    char[] operators = {'+', '-', '*', '/'};
    int[] inputArray;

    public Calculator2(int[] inputArray) {
        this.inputArray = inputArray;
    }

    public String operator(char operator) {
        boolean validOperator = false;
        for (char op : operators) {
            if (operator == op) {
                validOperator = true;
                break;
            }
        }
        if (!validOperator) {
            return "Ogiltigt räknesätt";
        }
        if (operator == '+') return Integer.toString(inputArray[0]+inputArray[1]);
        else return "Räknesättet ännu ej färdigkodat";
    }
}
