package com.freiorio.exercises.collections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollatzSequenceTest {

    @Test
    void collatzSequence() {
        assertArrayEquals(new Long[]{1L}, CollatzSequence.collatzSequence(1).toArray(new Long[]{}));
        assertArrayEquals(new Long[]{2L,1L}, CollatzSequence.collatzSequence(2).toArray(new Long[]{}));
        assertArrayEquals(new Long[]{3L,10L,5L,16L,8L,4L,2L,1L}, CollatzSequence.collatzSequence(3).toArray(new Long[]{}));
        assertArrayEquals(new Long[]{4L,2L,1L}, CollatzSequence.collatzSequence(4).toArray(new Long[]{}));
    }
}