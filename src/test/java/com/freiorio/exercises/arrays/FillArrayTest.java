package com.freiorio.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FillArrayTest {

    @Test
    void fillArray() {
        assertArrayEquals(new double[]{0.0,0.0,0.0}, FillArray.fillArray(3, 0, false));
        assertArrayEquals(new double[]{1.0,1.0,1.0,1.0,1.0}, FillArray.fillArray(5, 1, false));
        assertArrayEquals(new double[]{1.0,1.0,1.0,1.0,1.0}, FillArray.fillArray(5, 1, true), (double)5/100*1);
        assertArrayEquals(new double[]{100.0,100.0,100.0}, FillArray.fillArray(3, 100, true), (double)5/100*100);
    }
}