package com.freiorio.exercises.arrays;

public class CopyArray {
    public static double[] copyArray(double[] v) {
        double[] a = new double[v.length];
        System.arraycopy(v, 0, a, 0, v.length);
        return a;
    }
}
