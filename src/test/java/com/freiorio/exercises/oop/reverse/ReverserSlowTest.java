package com.freiorio.exercises.oop.reverse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverserSlowTest {

    @Test
    void reverse() {
        ReverserSlow rs = new ReverserSlow();
        assertEquals("oaic", rs.reverse("ciao"));
        assertNotEquals("abu", rs.reverse("bubba"));
    }
}