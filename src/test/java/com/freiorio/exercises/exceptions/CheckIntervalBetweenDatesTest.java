package com.freiorio.exercises.exceptions;

import org.junit.jupiter.api.Test;

import java.time.format.DateTimeParseException;

import static org.junit.jupiter.api.Assertions.*;

class CheckIntervalBetweenDatesTest {

    @Test
    void checkIntervalBetweenDates() {
        assertTrue(CheckIntervalBetweenDates.checkIntervalBetweenDates("2024-09-09", "2024-10-09"));
        assertFalse(CheckIntervalBetweenDates.checkIntervalBetweenDates("2024-09-09", "2023-09-10"));
        assertThrows(DateTimeParseException.class, ()->CheckIntervalBetweenDates.checkIntervalBetweenDates("dfgdghfd", "2024-09-09"));
        assertThrows(DateTimeParseException.class, ()->CheckIntervalBetweenDates.checkIntervalBetweenDates("2024-09-09", "dfgdghfd"));
    }
}