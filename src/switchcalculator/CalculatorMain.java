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
            switch (mittVal) {
                case 1:
                    Calculator.setX(readNumber("term"));
                    Calculator.setY(readNumber("term"));
                    System.out.println("Summan är :" + Calculator.add());
                    break;
                case 2:
                    Calculator.setX(readNumber("term"));
                    Calculator.setY(readNumber("term"));
                    System.out.println("Differensen är :" + Calculator.sub());
                    break;
                case 3:
                    Calculator.setX(readNumber("faktor"));
                    Calculator.setY(readNumber("faktor"));
                    System.out.println("Produkten är :" + Calculator.mult());
                    break;
                case 4:
                    Calculator.setX(readNumber("täljare"));
                    Calculator.setY(readNumber("nämnare"));
                    System.out.println("Kvoten är :" + Calculator.div());
                    break;
                case 5:
                    Calculator.setX(readNumber("basen")); // bas
                    Calculator.setY(readNumber("exponenten")); // exponent
                    System.out.println("Potensen är :" + Calculator.power());
                    break;
                case 6:
                    Calculator.setX(readNumber("ett tal"));
                    Calculator.setY(readNumber("ett tal"));
                    System.out.println("Högsta talet är är :" + Calculator.max());
                    break;
                case 7:
                    Calculator.setX(readNumber("täljaren"));
                    Calculator.setY(readNumber("nämnaren"));
                    System.out.println("Resten är: " + Calculator.rest());
                    break;
                case 8:
                    Calculator.setX(readNumber("exponenten"));
                    System.out.println("Eulers potens är: " + Calculator.eulersExp());
                    break;
                case 9:
                    again = false;
                    break;
            }
            System.out.println();
        } while (again);
    }

    private static int readNumber(String name) {
        System.out.print("skriv in "+name+": ");
        return scanner.nextInt();
    }

}


