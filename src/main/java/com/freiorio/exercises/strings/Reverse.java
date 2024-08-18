package com.freiorio.exercises.strings;

public class Reverse {
    public static String reverseCharAt(String string) {
        String dst = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            dst = dst.concat(String.valueOf(string.charAt(i)));
        }
        return dst;
    }

    public static String reverseStringBuilder(String string) {
        StringBuilder sb = new StringBuilder();
        return sb.append(string).reverse().toString();
    }
}
