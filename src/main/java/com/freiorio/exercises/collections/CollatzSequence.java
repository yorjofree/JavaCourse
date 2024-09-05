package com.freiorio.exercises.collections;

import java.util.ArrayList;
import java.util.List;

public class CollatzSequence {
    public static List<Long> collatzSequence(long n) {
        if (n < 1) {
            return new ArrayList<>();
        }
        ArrayList<Long> sequence = new ArrayList<>(List.of(n));
        while (!sequence.getLast().equals(1L)) {
            if (sequence.getLast() % 2 == 0) {
                sequence.add(sequence.getLast() / 2);
            }
            else {
                sequence.add(sequence.getLast() * 3 + 1);
            }
        }
        return sequence;
    }
}
