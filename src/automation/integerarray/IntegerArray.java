package automation.integerarray;

import java.util.Arrays;
import java.util.Scanner;

public class IntegerArray {
    // 2. Läs in fem heltal och lägg dem i en array.
    // Se till att inläsningen pågår tills det att
    // användaren har fyllt i fem heltal.
    // Användaren ska få ett tydligt felmeddelande om den skriver fel.

    // Låt användaren välja vilket index de vill se av heltalen.
    // Hantera ArrayIndexOutOfBoundsException.
    // Användaren ska kunna använda denna funktionalitet i all oändlighet.
    private static int[] integerArray = new int[5];
    private static int index = 0;
    private static Scanner scanner = new Scanner(System.in);
    private static int nfeFails=0;
    private static int aiobFails =0;
    public static void main(String[] args) {
        while (index < 5) {
            System.out.print("Skriv in ett heltal: ");
            String heltalString = scanner.nextLine();
            System.out.println(addArray(heltalString));
        }
        System.out.println(Arrays.toString(integerArray));
        System.out.println(nfeFails);
        System.out.println(aiobFails);
        while (true) {
            System.out.println("Vilket cell i arrayn vill du se på");
            String cellString = scanner.nextLine();
            System.out.println(viewArrayCell(cellString));
        }
    }

    public static String viewArrayCell(String cellString) {
        try {
            return Integer.toString(integerArray[Integer.parseInt(cellString)]);
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Du måste ange ett värde mellan 0 och 4";
        }
    }


    public static String addArray(String input) {
        try {
            integerArray[index] = Integer.parseInt(input);
            index++;
            return "Heltal " + input + " tillagt i cell " + (index - 1);
        } catch (NumberFormatException e) {
            nfeFails++;
            return "Det gick inte bra att lägga till " + input + " då det inte är ett heltal, försök igen";
        } catch (ArrayIndexOutOfBoundsException e) {
            aiobFails++;
            return "Arrayen är full";
        } catch (Exception e) {
            return "Något annat gick fel";
        }
    }

    public static void reset() {
        integerArray = new int[5];
        index = 0;
    }
}
