package array;

// 80.Skapa ett program som läser in siffrorna i ett bråk till en array med två platser. Algoritmen
//ska se till att bråket förkortas så långt som möjligt.
//Ex: Om siffrorna i bråket är 6 och 12 ska det lagras i arrayn som 1 och 2.
//Tips: Ta reda på SGD (största gemensamma divisor). I exemplet är SGD 6.

import java.util.Scanner;

public class Sgd {
    public static void main(String[] args) {

        //int numerator = 7*8*3*2*2; // Täljare
        //int denominator = 7*3*5*2; // Nämnare
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv täljaren ");
        int numerator = scanner.nextInt();
        System.out.print("Skriv nämnaren ");
        int denominator = scanner.nextInt();

        // Loop variant
        int sgd = Math.min(numerator, denominator); // Största Gemensamma Delare
        for (; sgd > 1; sgd--) {
            if (numerator % sgd == 0 && denominator % sgd == 0) break;
        }
        System.out.println("SGD är " + sgd);

        // Euclidean algorithm
        // Math.max(numerator, denominator) = int n0 * Math.min(numerator, denominator) + rest0
        // Math.min(numerator, denominator) = int n1 * rest0 + rest1
        // rest0 = int n2 * rest1 + rest2
        // osv till rest = 0, då är SGD senaste rest med värde
        int max = Math.max(numerator, denominator);
        int min = Math.min(numerator, denominator);
        while (max % min != 0) {
            int newMax = min;
            min = max % min;
            max = newMax;
        }
        System.out.println("SGD är " + min);

        System.out.println("Täljaren efter förkortning är: "+(numerator /sgd));
        System.out.println("Nämnaren efter förkortning är "+(denominator/sgd));
    }
}
