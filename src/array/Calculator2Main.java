package array;

import java.util.Scanner;

public class Calculator2Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Skriv in 2 tal med blanksteg mellan ");
        int tal1 = scanner.nextInt();
        int tal2 = scanner.nextInt();
        System.out.print("Välj räkneset +,-,*,/ ");
        char rakneset = scanner.next().charAt(0);
        Calculator2 calculator2 = new Calculator2(new int[]{tal1, tal2});
        System.out.println(calculator2.operator(rakneset));
    }
}
