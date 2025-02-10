package automation.arraylist;

import java.util.Scanner;

public class NameMain {
    public static void main(String[] args) {
        NamesArrayList names = new NamesArrayList();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Vad vill du göra:");
            System.out.println("A Fylla på men namn.");
            System.out.println("B Byta plats på två namn");
            System.out.println("C Skriv ut namnen");
            System.out.println("D Radera alla namnen");
            System.out.println("E Skriv ut ett specifikt namn på en position ");
            System.out.println("F Kontrollera om ett namn finns");
            System.out.println("G kontrollera om ett nman finns med dubletter");
            System.out.println("Z Avsluta");
            String option = scanner.nextLine();
            switch (option) {
                case "A":
                    System.out.println("Skriv namn avsluta med stop");
                    while (true) {
                        if (!names.addName(scanner.nextLine())) break;
                    }
                    break;
                case "B":
                    System.out.println("Vilka platser vill du byta");
                    System.out.print("Första positionen");
                    int position1 = Integer.parseInt(scanner.nextLine());
                    System.out.print("Andra positionen");
                    int position2 = Integer.parseInt(scanner.nextLine());
                    names.replace(position1, position2);
                    break;
                case "C":
                    String text= names.writeNames();
                    for (int i=0;i<text.length();i++) System.out.print("*");
                    System.out.println();
                    System.out.println(text);
                    for (int i=0;i<text.length();i++) System.out.print("*");
                    System.out.println();
                    break;
                case "Z": System.exit(0);
            }
        }
    }
}
