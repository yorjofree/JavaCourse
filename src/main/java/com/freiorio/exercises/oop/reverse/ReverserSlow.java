package com.freiorio.exercises.oop.reverse;

public class ReverserSlow implements Reverser{
    @Override
    public String reverse(String string) {
        char[] reversedString = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            reversedString[i] = string.toCharArray()[string.length()-1-i];
        }
        return String.valueOf(reversedString);
    }
}
