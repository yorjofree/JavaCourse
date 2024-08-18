package com.freiorio.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveFirstTwoCharsTest {

    @Test
    void removeFirstTwoCharsCharAt() {
        assertEquals("llo World!", RemoveFirstTwoChars.removeFirstTwoCharsCharAt("Hello World!"));
        assertEquals("", RemoveFirstTwoChars.removeFirstTwoCharsCharAt("No"));
        assertEquals("", RemoveFirstTwoChars.removeFirstTwoCharsCharAt("Y"));
    }

    @Test
    void removeFirstTwoCharsStringBuilder() {
        assertEquals("llo World!", RemoveFirstTwoChars.removeFirstTwoCharsStringBuilder("Hello World!"));
        assertEquals("", RemoveFirstTwoChars.removeFirstTwoCharsStringBuilder("No"));
        assertEquals("", RemoveFirstTwoChars.removeFirstTwoCharsStringBuilder("Y"));
    }
}