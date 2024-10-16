package oop;

public class BankAccount {
    int saldo;

    public void setSaldo(int newSaldo){
        saldo = newSaldo;
    }

    public int getSaldo(){
        return saldo;
    }

    public void withdraw(int amount){
        saldo = saldo-amount;
    }

    public void deposit(int amount){
        saldo = saldo + amount;
    }

    public boolean withdrawOK(int amount){
        if (saldo > amount) return true;
        else return false;
    }
}
