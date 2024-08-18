package com.freiorio.exercises.arrays;

import java.util.Arrays;
import java.util.random.RandomGenerator;

public class FillArray {
    public static double[] fillArray(int size, double value, boolean addNoise) {
        double[] dest = new double[size];
        if (addNoise) {
            RandomGenerator randomGenerator = RandomGenerator.getDefault();
            for (int i = 0; i < dest.length; i++) {
                dest[i] = randomGenerator.nextDouble((double)95 / 100 * value, (double)105 / 100 * value);
            }
        }
        else {
            Arrays.fill(dest, value);
        }
        return dest;
    }
}
