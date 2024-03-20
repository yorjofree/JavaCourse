package com.freiorio.exercises.oop.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClickCounterTest {

    ClickCounter test = new ClickCounter();

    @Test
    void getValue() {
        test.reset();
        test.click();
        test.click();
        test.click();
        assertEquals(3, test.getValue());
    }

    @Test
    void click() {
        int value = test.getValue();
        test.click();
        assertEquals(value + 1, test.getValue());
    }

    @Test
    void undo() {
        int value = test.getValue();
        test.undo();
        if (value == 0) {
            assertEquals(0, test.getValue());
        }
        else {
            assertEquals(value - 1, test.getValue());
        }
    }

    @Test
    void reset() {
        test.reset();
        assertEquals(0, test.getValue());
    }
}