package com.freiorio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClickCounterTest {

    ClickCounter test = new ClickCounter();

    @Test
    void getValue() {
        assertEquals(0, test.getValue());
    }

    @Test
    void click() {
    }

    @Test
    void undo() {
    }

    @Test
    void reset() {
    }
}