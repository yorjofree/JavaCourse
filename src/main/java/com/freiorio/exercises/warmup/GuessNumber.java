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
            int answer = scanner.nextInt();
            if (value == 0 && answer == 0) {
                System.out.println("Troppo bravo! Alla prossima!");
                check = true;
            }
            else if (value == answer) {
                System.out.println("Bravo! Stavo proprio pensando a " + value);
            }
            else {
                System.out.println("Sbagliato! Stavo pensando a " + value);
            }
        }
    }
}
