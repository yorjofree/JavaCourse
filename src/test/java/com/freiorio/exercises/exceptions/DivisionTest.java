package com.freiorio.exercises.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    @Test
    void division() {
        Exception e = assertThrowsExactly(IllegalArgumentException.class, () -> Division.division(3.0, 0.0));
        assertEquals("Error: division by 0", e.getMessage());
        assertEquals(3.0 / 4.0, Division.division(3.0,4.0));
    }
}