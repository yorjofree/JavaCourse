package com.freiorio.exercises.strings;

public class Concatenate {
    public static String concatenate(String[] strings) {
        StringBuilder sb = new StringBuilder();
        for (String string : strings) {
            if (!string.isEmpty()) {
                sb.append(string);
            }
        }
        return sb.toString();
    }
}
