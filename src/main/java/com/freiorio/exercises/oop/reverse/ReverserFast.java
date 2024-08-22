package com.freiorio.exercises.oop.reverse;

public class ReverserFast implements Reverser {
    @Override
    public String reverse(String string) {
        StringBuilder sb = new StringBuilder(string);
        return sb.reverse().toString();
    }
}
