package com.freiorio.exercises.oop.basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    private BankAccount bankAccount;

    @BeforeEach
    void setUp() {
        bankAccount = new BankAccount(1000.0);
    }

    @Test
    void getBalance() {
        assertEquals(1000.0, bankAccount.getBalance());
        BankAccount empty = new BankAccount();
        assertEquals(0.0, empty.getBalance());
    }

    @Test
    void deposit() {
        bankAccount.deposit(500.0);
        assertEquals(1500.0, bankAccount.getBalance());
    }

    @Test
    void withdraw() {
        bankAccount.withdraw(500.0);
        assertEquals(500.0, bankAccount.getBalance());
    }
}