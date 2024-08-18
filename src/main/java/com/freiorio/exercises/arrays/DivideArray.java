package com.freiorio.exercises.arrays;

public class DivideArray {
    public static double[] divideArray(double[] v, double factor) {
        double[] dst = new double[v.length];
        for (int i = 0; i < dst.length; i++) {
            dst[i] = v[i] / factor;
        }
        return dst;
    }
}
