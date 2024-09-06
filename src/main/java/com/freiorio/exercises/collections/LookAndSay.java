package com.freiorio.exercises.collections;

import java.util.ArrayList;
import java.util.List;

public class LookAndSay {
    public static List<Long> lookAndSay(long n) {
        if (n < 1) {
            return new ArrayList<>();
        }
        List<Long> sequence = new ArrayList<>(List.of(1L));
        for (long i = 1; i < n; i++) {
            sequence.add(createNext(sequence.getLast()));
        }
        return sequence;
    }

    private static Long createNext(Long last) {
        String s = last.toString();
        StringBuilder sb = new StringBuilder();
        String subs;
        int i = 1;
        while (i < s.length()) {
            if (s.charAt(i) != s.charAt(i-1)) {
                subs = s.substring(0, i);
                s = s.substring(i);
                sb.append(subs.length()).append(subs.charAt(0));
                i = 1;
            }
            else {
                i++;
            }
        }
        sb.append(s.length()).append(s.charAt(0));
        return Long.valueOf(sb.toString());
    }
}
