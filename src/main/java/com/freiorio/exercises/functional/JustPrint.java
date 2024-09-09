package com.freiorio.exercises.functional;

import java.util.List;
import java.util.Map;

public class JustPrint {
    public static <T> void justPrintList(List<T> list) {list.forEach(e -> System.out.println("Hello " + e + "!"));}

    public static <K,V> void justPrintMap(Map<K, V> map) {map.forEach((key, value) -> System.out.println("k:" + key + ", v:" + value));}
}
