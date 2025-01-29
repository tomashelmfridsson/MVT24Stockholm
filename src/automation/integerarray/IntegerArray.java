package automation.integerarray;

import java.util.Arrays;
import java.util.Scanner;

public class IntegerArray {
    // 2. Läs in fem heltal och lägg dem i en array.
    // Se till att inläsningen pågår tills det att
    // användaren har fyllt i fem heltal.
    // Användaren ska få ett tydligt felmeddelande om den skriver fel.
    private static int[] integerArray = new int[5];
    private static int index = 0;

    public static void main(String[] args) {
        while (index < 5) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Skriv in ett heltal: ");
            String heltalString = scanner.nextLine();
            System.out.println(addArray(heltalString));
        }
        System.out.println(Arrays.toString(integerArray));
    }

    public static String addArray(String input) {
        try {
            integerArray[index] = Integer.parseInt(input);
            index++;
            return "Heltal "+input+" tillagt i cell "+(index-1);
        } catch (NumberFormatException e) {
            return "Det gick inte bra att lägga till "+input+" då det inte är ett heltal, försök igen";
        } catch (ArrayIndexOutOfBoundsException e){
            return "Arrayen är full";
        }catch (Exception e){
            return "Något annat gick fel";
        }
    }
}
