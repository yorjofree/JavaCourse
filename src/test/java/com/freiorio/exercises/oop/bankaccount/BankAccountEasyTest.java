package com.freiorio.exercises.oop.bankaccount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountEasyTest {
    private BankAccountEasy bankAccountEasy;

    @BeforeEach
    void setUp() {
        bankAccountEasy = new BankAccountEasy("IT123456", 10.0);
    }

    @Test
    void checkPositiveValue() {
        assertThrowsExactly(IllegalArgumentException.class, () -> bankAccountEasy.checkPositiveValue(-10.0));
        assertDoesNotThrow(() -> bankAccountEasy.checkPositiveValue(10.0));
    }

    @Test
    void getIBAN() {
        assertEquals("IT123456", bankAccountEasy.getIBAN());
    }

    @Test
    void setIBAN() {
        bankAccountEasy.setIBAN("AZ000000");
        assertEquals("AZ000000", bankAccountEasy.getIBAN());
    }

    @Test
    void getBalance() {
        assertEquals(10.0, bankAccountEasy.getBalance());
    }

    @Test
    void setBalance() {
        bankAccountEasy.setBalance(0.0);
        assertEquals(0.0, bankAccountEasy.getBalance());
    }

    @Test
    void getOperationFee() {
        assertEquals(0.0, bankAccountEasy.getOperationFee());
    }

    @Test
    void setOperationFee() {
        bankAccountEasy.setOperationFee(1.0);
        assertEquals(1.0, bankAccountEasy.getOperationFee());
    }

    @Test
    void getInterestRate() {
        assertEquals(0.0, bankAccountEasy.getInterestRate());
    }

    @Test
    void setInterestRate() {
        bankAccountEasy.setInterestRate(0.02);
        assertEquals(0.02, bankAccountEasy.getInterestRate());
    }

    @Test
    void deposit() {
        bankAccountEasy.deposit(5.0);
        assertEquals(15.0, bankAccountEasy.getBalance());
    }

    @Test
    void withdraw() {
        assertEquals(6.0, bankAccountEasy.withdraw(6.0));
        assertEquals(4.0, bankAccountEasy.withdraw(7.0));
    }

    @Test
    void transfer() {
        BankAccountEasy other = new BankAccountEasy("IT111111", 20.0);
        assertThrows(IllegalArgumentException.class, () -> new BankAccountEasy("AZ111111", 20.0).transfer(bankAccountEasy, 10.0));
        assertEquals(3.0, bankAccountEasy.transfer(other, 3.0));
        assertEquals(7.0, bankAccountEasy.transfer(other, 10.0));
        assertEquals(30.0, other.getBalance());
    }

    @Test
    void addInterest() {
        bankAccountEasy.addInterest();
        assertEquals(10.0, bankAccountEasy.getBalance());
    }

    @Test
    void applyFee() {
        bankAccountEasy.applyFee();
        assertEquals(10.0, bankAccountEasy.getBalance());
    }

    @Test
    void checkIBAN() {
        assertThrowsExactly(IllegalArgumentException.class, () -> BankAccount.checkIBAN("sdkhj4579359834"));
    }
}