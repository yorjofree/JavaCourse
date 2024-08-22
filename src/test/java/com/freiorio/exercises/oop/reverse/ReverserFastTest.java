package com.freiorio.exercises.oop.reverse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverserFastTest {

    @Test
    void reverse() {
        ReverserFast rf = new ReverserFast();
        assertEquals("oaic", rf.reverse("ciao"));
        assertNotEquals("abu", rf.reverse("bubba"));
    }
}