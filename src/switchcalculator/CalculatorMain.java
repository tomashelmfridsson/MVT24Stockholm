package switchcalculator;

import java.util.Scanner;

public class CalculatorMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean again = true;
        do {
            System.out.println("Vad vill du göra?");
            System.out.println("1 Addera");
            System.out.println("2 Subtrahera");
            System.out.println("3 Multiplicera");
            System.out.println("4 Dividera");
            System.out.println("5 Exponent"); // tal1^tal2 10^2=100 // Math.pow
            System.out.println("6 Högsta talet"); // Math.max(tal1,tal2)
            System.out.println("7 Resten vid division");  // %
            System.out.println("8 Eulers Exponent");
            System.out.println("9 Avsluta");
            int mittVal = scanner.nextInt();
            int tal1, tal2;
            Calculator calc;
            switch (mittVal) {
                case 1:
                    calc = new Calculator();
                    calc.setX(readNumber("term"));
                    calc.setY(readNumber("term"));
                    System.out.println("Summan är :" + calc.add());
                    break;
                case 2:
                    calc = new Calculator();
                    calc.setX(readNumber("term"));
                    calc.setY(readNumber("term"));
                    System.out.println("Differensen är :" + calc.sub());
                    break;
                case 3:
                    calc = new Calculator();
                    calc.setX(readNumber("faktor"));
                    calc.setY(readNumber("faktor"));
                    System.out.println("Produkten är :" + calc.mult());
                    break;
                case 4:
                    calc = new Calculator();
                    calc.setX(readNumber("täljare"));
                    calc.setY(readNumber("nämnare"));
                    System.out.println("Kvoten är :" + calc.div());
                    break;
                case 5:
                    calc = new Calculator();
                    calc.setX(readNumber("basen")); // bas
                    calc.setY(readNumber("exponenten")); // exponent
                    System.out.println("Potensen är :" + calc.power());
                    break;
                case 6:
                    calc = new Calculator();
                    calc.setX(readNumber("ett tal"));
                    calc.setY(readNumber("ett tal"));
                    System.out.println("Högsta talet är är :" + calc.max());
                    break;
                case 7:
                    calc = new Calculator();
                    calc.setX(readNumber("täljaren"));
                    calc.setY(readNumber("nämnaren"));
                    System.out.println("Resten är: " + calc.rest());
                    break;
                case 8:
                    calc = new Calculator();
                    calc.setX(readNumber("exponenten"));
                    System.out.println("Eulers potens är: " + calc.eulersExp());
                    break;
                case 9:
                    again = false;
                    break;
            }
        } while (again);
    }

    private static int readNumber(String name) {
        System.out.print("skriv in "+name+": ");
        return scanner.nextInt();
    }

}


