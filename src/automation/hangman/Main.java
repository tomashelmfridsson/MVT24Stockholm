package automation.hangman;

import java.util.Scanner;

public class Main {
    static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
        while(true){
            System.out.print("Gissa en bokstav? ");
            String input = scanner.nextLine();
            char c = input.toUpperCase().charAt(0);
            if (Guess.letterInput(c)) {
                System.out.println("Index för bokstaven "+c+" är:");
                System.out.println(Guess.indexOfLetter(c));
                System.out.println(Guess.myResult);
                if (Guess.endOfGame()) {
                    System.out.println("Du vann");
                    System.exit('0');
                }
            } else {
                int failedGuessLeft = Guess.getFailedGuessLeft();
                System.out.println("Du har "+failedGuessLeft+" Gissningar kvar");
                if (failedGuessLeft == 0) {
                    System.out.println("Du blev hängd");
                    System.exit(0);
                }
            }

        }
    }
}
