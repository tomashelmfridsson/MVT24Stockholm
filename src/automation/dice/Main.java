package automation.dice;

import java.util.Scanner;

// Slå tärningen så många gånger du vill. Addera alla slagen.
// Slår du en 1:a är din omgång slut och du får totalt 0 poäng.
// Väljer du att sluta slå får du totalpoängen som du samlat ihop under tidigare kast
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        boolean again = true;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vad heter spelare 1: ");
        String name1 = scanner.nextLine();
        Player playerA = new Player(name1);
        System.out.print("Vad heter spelare 2: ");
        String name2 = scanner.nextLine();
        Player playerB = new Player(name2);
        String play = name1;
        boolean end = true;
        while (end) {
            if (play.equals(name1)) {
                System.out.println("Att kasta är " + playerA.getName());
                System.out.println("Du har " + playerA.getSumTotal() + "poäng");
            } else {
                System.out.println("Att kasta är " + playerB.getName());
                System.out.println("Du har " + playerB.getSumTotal() + "poäng");
            }
            while (again) {
                int dice = (int) (Math.random() * 6) + 1;
                System.out.println("Ditt kast blev: " + dice);
                if (dice != 1) {
                    sum += dice;  // sum = sum + dice
                    System.out.println("Din summa i omgången är " + sum);
                    System.out.print("Vill du slå igen (J/N) ");
                    String input = scanner.nextLine();
                    if (input.equals("N")) again = false;
                } else {
                    sum = 0;
                    again = false;
                }
                System.out.println();
            }
            System.out.println("Din summa i omgången blev: " + sum);
            if (play.equals(name1)) {
                playerA.addSumTotal(sum);
                System.out.println("Din totala summa är: " + playerA.getSumTotal());
                play = name2;
                again = true;
                sum = 0;
                if (playerA.getSumTotal() >= 50) {
                    System.out.println(playerA.getName() + " You are the winner");
                    end = false;
                }
            } else {
                playerB.addSumTotal(sum);
                System.out.println("Din totala summa är: " + playerB.getSumTotal());
                play = name1;
                again = true;
                sum = 0;
                if (playerB.getSumTotal() >= 50) {
                    System.out.println(playerB.getName() + " You are the winner");
                    end = false;
                }
            }
            System.out.println();
        }
    }
}
