package com.freiorio.exercises.oop.bankaccount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountProTest {
    BankAccountPro bankAccountPro;

    @BeforeEach
    void setUp() {
         bankAccountPro = new BankAccountPro("IT000000", 10.0);
    }

    @Test
    void setOperationFee() {
        assertThrows(IllegalArgumentException.class, () -> bankAccountPro.setOperationFee(-1.0));
        assertDoesNotThrow(() -> bankAccountPro.setOperationFee(2.0));
    }

    @Test
    void transfer() {
        BankAccountPro other = new BankAccountPro("AZ111111", 20.0);
        assertThrows(IllegalArgumentException.class, () -> bankAccountPro.transfer(other, -5.0));
        assertDoesNotThrow(() -> bankAccountPro.transfer(other, 15.0));
        assertEquals(-6.0, bankAccountPro.getBalance());
        assertEquals(34.0, other.getBalance());
    }

    @Test
    void addInterest() {
        bankAccountPro.addInterest();
        assertEquals(10.2, bankAccountPro.getBalance());
    }

    @Test
    void applyFee() {
        bankAccountPro.applyFee();
        assertEquals(9.0, bankAccountPro.getBalance());
    }

    @Test
    void deposit() {
        bankAccountPro.deposit(5.0);
        assertThrows(IllegalArgumentException.class, () -> bankAccountPro.deposit(-5.0));
        assertEquals(14.0, bankAccountPro.getBalance());
    }

    @Test
    void withdraw() {
        bankAccountPro.withdraw(5.0);
        assertThrows(IllegalArgumentException.class, () -> bankAccountPro.withdraw(-5.0));
        assertEquals(4.0, bankAccountPro.getBalance());
    }
}