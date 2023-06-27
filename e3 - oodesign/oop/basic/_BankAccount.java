package com.nbicocchi.exercises.oop.basic;

public class _BankAccount {
    double balance;

    public _BankAccount() {
        balance = 0;
    }

    public _BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}
