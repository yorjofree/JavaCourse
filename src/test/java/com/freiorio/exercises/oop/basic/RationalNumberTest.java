package com.freiorio.exercises.oop.basic;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class RationalNumberTest {

    @Test
    void getNumerator() {
        assertEquals(7, new RationalNumber(7, 4).getNumerator());
    }

    @Test
    void getDenominator() {
        assertEquals(4, new RationalNumber(3, 4).getDenominator());
    }

    @Test
    void add() {
        assertEquals(new RationalNumber(7, 4), new RationalNumber(7, 12).add(new RationalNumber(7, 6)));
    }

    @Test
    void multiply() {
        assertEquals(new RationalNumber(7, 4), new RationalNumber(4, 5).multiply(new RationalNumber(35, 16)));
    }

    @Test
    void greatestCommonDivisor() {
        assertEquals(3, RationalNumber.greatestCommonDivisor(210, 9));
    }

    @Test
    void leastCommonMultiple() {
        assertEquals(20, RationalNumber.leastCommonMultiple(10, 4));
    }

    @Test
    void testEquals() {
        assertTrue(new RationalNumber(7, 4).equals(new RationalNumber(7, 4)));
        assertFalse(new RationalNumber(7, 4).equals(new RationalNumber(3, 7)));
    }

    @Test
    void testHashCode() {
        assertEquals(Objects.hash(7, 4), new RationalNumber(7,4).hashCode());
    }

    @Test
    void testToString() {
        assertEquals("RationalNumber{numerator=7, denominator=4}", new RationalNumber(7, 4).toString());
    }
}