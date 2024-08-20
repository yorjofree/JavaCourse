package com.freiorio.exercises.oop.basic;

public class BankAccount {
    private double balance;

    public BankAccount() {}

    public BankAccount(double balance) {
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
