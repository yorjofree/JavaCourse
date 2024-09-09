package com.freiorio.exercises.exceptions;

import java.time.LocalDate;

public class CheckIntervalBetweenDates {
    public static boolean checkIntervalBetweenDates(String begin, String end) {
        return LocalDate.parse(begin).isBefore(LocalDate.parse(end));
    }
}
