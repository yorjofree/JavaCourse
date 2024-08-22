package com.freiorio.exercises.oop.reverse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverserTest {

    @Test
    void reverse() {
        Reverser reverserAnonymous = new Reverser() {
            @Override
            public String reverse(String string) {
                StringBuilder sb = new StringBuilder(string);
                return sb.reverse().toString();
            }
        };
        assertEquals("oaic", reverserAnonymous.reverse("ciao"));
    }
}