package oop;

import java.util.Scanner;

public class MyBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Välkommen till din bank, vad vill du göra");
        System.out.println("1 Bestämma mitt saldo");
        System.out.println("2 Se saldo");
        System.out.println("3 Uttag");
        System.out.println("4 Insättning");
        System.out.println("5 Visa Bankinformation");
        System.out.println("6 Visa ränta");
        System.out.println("7 Lägga till ränta vid årsslut");
        System.out.println("8 Byt konto");
        System.out.println("99 Avsluta");

        // BankAccount myAccount = new BankAccount();
        BankAccount[] myAccounts = new BankAccount[3];
        // [myAccount, myAccount, myAccount]
       BankAccount myAccount = myAccounts[0] = new BankAccount();
        int val;
        do {
            val = scanner.nextInt();
            switch (val) {
                case 1:
                    System.out.print("Vilket saldo har du på kontot: ");
                    int saldo = scanner.nextInt();
                    myAccount.setSaldo(saldo);
                    break;
                case 5:
                    System.out.println("Din Bankinformation är: " + BankAccount.getBankInformation());
                    break;
                case 6:
                    System.out.println("Kontots ränta är: " + BankAccount.getRanta());
                    break;
                case 7:
                    int rantaInt = Integer.parseInt(BankAccount.getRanta().substring(0, BankAccount.getRanta().length() - 1));
                    myAccount.deposit((myAccount.getSaldo() * ((double) rantaInt / 100)));
                    System.out.println("Ditt nya Saldo är nu: " + myAccount.getSaldo());
                    break;
                case 8:
                    System.out.println("Vill skapa eller byta konto 1, 2 eller 3");
                    int konto=scanner.nextInt();
                    if (myAccounts[konto-1] == null)  {
                        myAccounts[konto-1] = new BankAccount();
                    }
                    myAccount = myAccounts[konto-1];
                    System.out.println("Saldot på detta konto är: "+myAccount.getSaldo());
                    break;
            }
            if (val == 2) {
                System.out.println("Ditt Saldo är: " + myAccount.getSaldo());
            }
            if (val == 3) {
                System.out.print("Hur mycket vill du ta ut? ");
                int belopp = scanner.nextInt();
                if (myAccount.withdrawOK(belopp)) myAccount.withdraw(belopp);
                else System.out.println("Tyvärr kan inte ha mindre än 0 på kontot");
            }
            if (val == 4) {
                System.out.print("Hur mycket vill du sätta in? ");
                int belopp = scanner.nextInt();
                myAccount.deposit(belopp);
            }

        } while (val != 99);
    }
}
