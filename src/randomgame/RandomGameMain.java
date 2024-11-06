package randomgame;

import java.util.Scanner;

public class RandomGameMain {
    public static void main(String[] args) {
        RandomNumber randomNumber = new RandomNumber();
        Scanner scanner = new Scanner(System.in);
        int number;
        do{
            System.out.print("Gissa ett nummer mellan 0-99: ");
            number = scanner.nextInt();
            System.out.println(randomNumber.inputNumber(number));
        } while(number != randomNumber.getCorrectNumber());
    }
}
