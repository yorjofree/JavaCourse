package com.freiorio.exercises.oop.basic;

import java.util.Objects;

public class RationalNumber {
    private final int numerator;
    private final int denominator;

    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public RationalNumber add(RationalNumber o) {
        int newDenominator = leastCommonMultiple(this.denominator, o.getDenominator());
        int newNumerator = this.numerator * newDenominator / this.denominator
                            + o.getNumerator() * newDenominator / o.getDenominator();
        return new RationalNumber(newNumerator / greatestCommonDivisor(newNumerator, newDenominator),
                        newDenominator / greatestCommonDivisor(newNumerator, newDenominator));
    }

    public RationalNumber multiply(RationalNumber o) {
        int newNumerator = this.numerator * o.getNumerator();
        int newDenominator = this.denominator * o.getDenominator();
        return new RationalNumber(newNumerator / greatestCommonDivisor(newNumerator, newDenominator),
                newDenominator / greatestCommonDivisor(newNumerator, newDenominator));
    }

    public static int greatestCommonDivisor(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        int rest = max % min;
        if (max % min == 0) {
            return min;
        } else {
            return greatestCommonDivisor(min, rest);
        }
    }

    public static int leastCommonMultiple(int a, int b) {
        return Math.abs(a * b) / greatestCommonDivisor(a, b);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RationalNumber that)) return false;
        return numerator == that.numerator && denominator == that.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public String toString() {
        return "RationalNumber{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
