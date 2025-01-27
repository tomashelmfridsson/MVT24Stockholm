package automation.names;
// Följande array finns i ditt program: String[] names = {"Ada", "Beda", "Cålle"};

import java.util.InputMismatchException;
import java.util.Scanner;

//1. Läs in ett tal som beskriver vilket namn man skall skriva ut i ordningen. Fånga eventuella exceptions
public class NamesArrayExceptions {
    public static void main(String[] args) {
        String[] names = {"Ada", "Beda", "Cålle"};
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Skriv en siffra för att få ett namn");
//        try {
//            int number = scanner.nextInt();
//            try {
//                System.out.println(names[number]);
//            } catch (Exception exception) {
//                System.out.println("Numret matchar inte arrayens storlek");
//            }
//        } catch (Exception exception) {
//            System.out.println("Du måste ange en siffra");
//        }

        System.out.print("Skriv en siffra för att få ett namn");
        try {
            int number = scanner.nextInt();
            System.out.println(names[number]);
        } catch( ArrayIndexOutOfBoundsException aiob){
            System.out.println("Numret matchar inte arrayens storlek");
        } catch (InputMismatchException ime){
            System.out.println("Du måste ange en siffra");
        } catch (Exception e){
            System.out.println("Något gick fel");
        }

    }
}
