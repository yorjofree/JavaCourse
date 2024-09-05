package com.freiorio.exercises.oop.bankaccount;

public interface BankAccount {
    String getIBAN();
    void setIBAN(String IBAN);
    double getBalance();
    void setBalance(double balance);
    double getOperationFee();
    void setOperationFee(double operationFee);
    double getInterestRate();
    void setInterestRate(double interestRate);
    void deposit(double amount);
    double withdraw(double amount);
    double transfer(BankAccount other, double amount);
    void addInterest();
    void applyFee();
    static void checkIBAN(String IBAN) {
        if (IBAN.length() < 8 || IBAN.length() > 34 || !IBAN.matches("[A-Z][A-Z][0-9]*")) {
            throw new IllegalArgumentException("Invalid IBAN");
        }
    }
}
