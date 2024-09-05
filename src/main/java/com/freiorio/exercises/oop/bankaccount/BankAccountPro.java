package com.freiorio.exercises.oop.bankaccount;

public class BankAccountPro extends AbstractBankAccount{
    public BankAccountPro(String IBAN, double balance) {
        super(IBAN, balance, 1.0, 2.0 / 100.0);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        applyFee();
    }

    @Override
    public double withdraw(double amount) {
        double resultAmount = super.withdraw(amount);
        applyFee();
        return resultAmount;
    }
}
