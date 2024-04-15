package com.freiorio.exercises.warmup;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class GuessNumber {
    public static void main(String[] args) {
        RandomGenerator randomGen = RandomGenerator.getDefault();

        Scanner scanner = new Scanner(System.in);
        System.out.println("A che numero sto pensando (da 0 a 3)?");
        boolean check = false;
        while (!check) {
            int value = randomGen.nextInt(0,4);
            System.out.println("Sto pensando a " + value);
            int answer = scanner.nextInt();
            if (value == 0 && answer == 0) {
                System.out.println("Trovato! Stavo pensando proprio a 0!");
                check = true;
            }
            else {
                System.out.println("Ritenta: stavo pensando a " + value);
            }
        }
    }
}
