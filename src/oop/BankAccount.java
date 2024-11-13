package oop;

public class BankAccount {
    private double saldo;
    private static String bankInformation = "Ebberuds bank";
    private static String ranta = "5%";

    public static String getBankInformation() {
        return bankInformation;
    }

    public static String getRanta() {
        return ranta;
    }

    public void setSaldo(int newSaldo){
        saldo = newSaldo;
    }

    public double getSaldo(){
        return saldo;
    }

    public void withdraw(int amount){
        saldo = saldo-amount;
    }

    public void deposit(double amount){
        saldo = saldo + amount;
    }

    public boolean withdrawOK(int amount){
        if (saldo > amount) return true;
        else return false;
    }
}
