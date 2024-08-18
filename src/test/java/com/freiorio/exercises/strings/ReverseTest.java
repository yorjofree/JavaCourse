package com.freiorio.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

    @Test
    void reverseCharAt() {
        assertEquals("tset gnirtS", Reverse.reverseCharAt("String test"));
        assertEquals("eoD nhoJ", Reverse.reverseCharAt("John Doe"));
        assertEquals("Hello World!", Reverse.reverseCharAt("!dlroW olleH"));
    }

    @Test
    void reverseStringBuilder() {
        assertEquals("tset gnirtS", Reverse.reverseStringBuilder("String test"));
        assertEquals("eoD nhoJ", Reverse.reverseStringBuilder("John Doe"));
        assertEquals("Hello World!", Reverse.reverseStringBuilder("!dlroW olleH"));
    }
}