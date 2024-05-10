package com.freiorio.exercises.exceptions;

public class Division {
    public static double division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Error: division by 0");
        }
        return a / b;
    }
}