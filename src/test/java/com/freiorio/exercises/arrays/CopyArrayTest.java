package com.freiorio.exercises.arrays;

import org.junit.jupiter.api.Test;

import java.util.random.RandomGenerator;

import static org.junit.jupiter.api.Assertions.*;

class CopyArrayTest {
    private final RandomGenerator randomGenerator = RandomGenerator.getDefault();
    private final int length = randomGenerator.nextInt(1, 20);
    private final double[] src = new double[length];

    @Test
    void copyArray() {
        // Initialize src array
        for (int i = 0; i < length; i++) {
            src[i] = randomGenerator.nextDouble();
        }

        // Test
        assertArrayEquals(src, CopyArray.copyArray(src));
    }
}