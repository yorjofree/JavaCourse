package com.freiorio.exercises.generics;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class IterableToStringTest {

    @Test
    void iterableToString() {
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(3,2,1));
        TreeSet<String> treeSet = new TreeSet<>(Set.of("h","a","w","A"));
        Set<String> hashSet = new HashSet<>(Set.of("bubba", "gump", "gamberi"));
        SequencedMap<String, Number> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("papi", 1);
        linkedHashMap.put("mamma", 2.3);
        linkedHashMap.put("frenci", 4);
        linkedHashMap.put("chiara", 1L);
        assertEquals("3, 2, 1, ", IterableToString.iterableToString(arrayList));
        assertEquals("A, a, h, w, ", IterableToString.iterableToString(treeSet));
        assertNotEquals("bubba, gump, gamberi, ", IterableToString.iterableToString(hashSet));
        assertEquals("1, 2.3, 4, 1, ", IterableToString.iterableToString(linkedHashMap.sequencedValues()));
    }
}