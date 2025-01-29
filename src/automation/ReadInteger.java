package automation;

import java.util.InputMismatchException;
import java.util.Scanner;

// 1. Skriv ett program som läser in heltal med Scanner-metoden nextInt().
// Fånga InputMismatchException om användaren skriver något som inte är ett heltal.
public class ReadInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validHeltal= false;
        int heltal=0;
        while(!validHeltal) {
            try {
                System.out.print("Skriv in ett heltal: ");
                heltal = scanner.nextInt();  // sdgfsdf(enter)
                // heltal = Integer.parseInt(scanner.nextLine());
                validHeltal =true;
            } catch (InputMismatchException exception) {
                System.out.println("Det var inget heltal");
                scanner.nextLine();
            } catch (Exception exception) {
                System.out.println(exception);
                scanner.nextLine();
            }
        }
        System.out.println("Det angivna heltal är: "+heltal);
    }
}

