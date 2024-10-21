package oop;

import java.util.Scanner;

public class CalculatorRun {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("skriv in tal 1: ");
        int tal1 = scanner.nextInt();

        System.out.print("skriv in tal 2: ");
        int tal2 = scanner.nextInt();

        Calculator calc = new Calculator(tal1,tal2);
        Calculator calc2 = new Calculator(3,5);
        System.out.println(calc2.add());

        System.out.println("Vad vill du göra?");
        System.out.println("1 Addera");
        System.out.println("2 Subtrahera");
        System.out.println("3 Multiplicera");
        System.out.println("4 Dividera");
        System.out.println("17 Byt tal");
        int mittVal = scanner.nextInt();
        if (mittVal == 1) System.out.println(calc.add());
        if (mittVal == 2) System.out.println(calc.sub());
        if (mittVal == 3) System.out.println(calc.mult());
        if (mittVal == 4) System.out.println(calc.div());
        if (mittVal == 17){
            calc = new Calculator(calc.mult(),calc.add());
            System.out.println(calc.add());
        }
    }

    // 17.	I din main-metod för Calculator skapa ett nytt 	objekt som istället för att läsa in två nya tal i
    // konstruktorn läser in två tal som är hämtade 	ifrån det första objektet. T.ex. att man 	a
    // nvänder produkten som tal 1 och summan 	som tal 2
}
