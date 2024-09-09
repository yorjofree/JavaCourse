package com.freiorio.exercises.functional;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class JustPrintTest {

    @Test
    void justPrintList() {
        List<String> list = new ArrayList<>(List.of("Matteo", "Marco", "Luca", "Giovanni"));
        assertDoesNotThrow(()-> JustPrint.justPrintList(list));
    }

    @Test
    void justPrintMap() {
        Map<Integer, String> map = new LinkedHashMap<>(Map.of(1,"papi",
                                                            2,"mamma",
                                                            3,"chiara",
                                                            4,"frenci"));
        assertDoesNotThrow(()->JustPrint.justPrintMap(map));
    }
}