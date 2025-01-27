package automation.qoutient;

import java.util.Scanner;

public class Qoutient {
    public static void main(String[] args) {
        boolean validNumerator = false;
        boolean validDenominator = false;
        double numerator =1;
        double denominator =1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv två tal för att räkna ut kvoten mellan dem");
        while( !validDenominator || !validNumerator) {
            try {
                if (!validNumerator) {
                    System.out.print("Skriv in täljaren");
                    numerator = Double.parseDouble(scanner.next());
                    validNumerator = true;
                }
                if (!validDenominator) {
                    System.out.print("Skriv in nämnaren");
                    denominator = Double.parseDouble(scanner.next());
                    if (denominator != 0) validDenominator = true;
                }
            } catch (NumberFormatException e) {
                System.out.println(e);
                System.out.println("Du kan endast skriva in ett tal");
            }catch (Exception e) {
                System.out.println(e);
                System.out.println("Något gick fel, försök igen");
            }
        }
        double quotient = numerator / denominator;
        System.out.println("Kvoten är :"+quotient);
    }
}
