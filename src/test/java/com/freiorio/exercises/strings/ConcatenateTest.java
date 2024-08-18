package com.freiorio.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ConcatenateTest {

    @Test
    void concatenate() {
        assertEquals("Hello World!", Concatenate.concatenate(new String[]{"Hello"," ","World!"}));
        assertEquals("Hello World!", Concatenate.concatenate(new String[]{"H","el","lo"," ","World!"}));
        assertEquals("Hello World!", Concatenate.concatenate(new String[]{"Hello World","!"}));
    }
}