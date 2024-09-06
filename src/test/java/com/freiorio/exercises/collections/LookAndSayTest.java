package com.freiorio.exercises.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LookAndSayTest {

    @Test
    void lookAndSay() {
        assertIterableEquals(new ArrayList<>(), LookAndSay.lookAndSay(-1));
        assertIterableEquals(new ArrayList<>(), LookAndSay.lookAndSay(0));
        assertIterableEquals(new ArrayList<>(List.of(1L)), LookAndSay.lookAndSay(1));
        assertIterableEquals(new ArrayList<>(List.of(1L,11L,21L)), LookAndSay.lookAndSay(3));
        assertIterableEquals(new ArrayList<>(List.of(1L,11L,21L,1211L,111221L,312211L,13112221L,1113213211L)), LookAndSay.lookAndSay(8));
    }
}