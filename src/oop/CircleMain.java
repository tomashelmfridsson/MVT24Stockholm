package oop;

import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vilken radie skall din cirkel ha? ");
        int radieInput = scanner.nextInt();
        Circle circle = new Circle(radieInput);




        System.out.println("Cirkelns area är "+circle.calculateArea());
    }
}
