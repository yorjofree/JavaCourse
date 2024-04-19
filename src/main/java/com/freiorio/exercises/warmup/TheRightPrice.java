package com.freiorio.exercises.warmup;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class TheRightPrice {
    public static void main(String[] args) {
        RandomGenerator rg = RandomGenerator.getDefault();
        int price = rg.nextInt(0,101);
        Scanner s = new Scanner(System.in);
        System.out.println("What's the right price?");
        System.out.print("A) ");
        double answerA = s.nextDouble();
        System.out.print("B) ");
        double answerB = s.nextDouble();
        if (Math.abs((double) price - answerA) <= Math.abs((double) price - answerB)) {
            System.out.println("And the winner is... A! The right price was " + price);
        }
        else {
            System.out.println("And the winner is... B! The right price was " + price);
        }
    }
}
