package oop;

import java.util.Scanner;

public class RectangleMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mata in höjden: ");
        int hojden  = scanner.nextInt();
        System.out.print("Mata in bredden: ");
        int bredden = scanner.nextInt();
        Rectangle rectangle = new Rectangle(hojden,bredden);
        System.out.println("Arean är "+rectangle.calculateArea());
        System.out.println("Omkretsen är "+rectangle.calculatePerimeter());
    }
}
