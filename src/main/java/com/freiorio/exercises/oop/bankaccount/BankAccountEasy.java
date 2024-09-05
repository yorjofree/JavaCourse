package com.freiorio.exercises.oop.bankaccount;

public class BankAccountEasy extends AbstractBankAccount {
    public BankAccountEasy(String IBAN, double balance) {
        super(IBAN, balance, 0.0, 0.0);
        try {
            checkPositiveValue(balance);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Balance must be not negative");
        }
    }

    @Override
    public double withdraw(double amount) {
        double validAmount = Math.min(getBalance(), amount);
        return super.withdraw(validAmount);
    }

    @Override
    public double transfer(BankAccount other, double amount) {
        String countryCode = getIBAN().substring(0, 2);
        if (!countryCode.equals(other.getIBAN().substring(0, 2))) {
            throw new IllegalArgumentException("International transfers are not allowed");
        }
        double validAmount = Math.min(getBalance(), amount);
        return super.transfer(other, validAmount);
    }
}
