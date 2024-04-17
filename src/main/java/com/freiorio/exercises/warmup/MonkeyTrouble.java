package com.freiorio.exercises.warmup;

import java.util.Scanner;

public class MonkeyTrouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            System.out.println("Le due scimmie stanno ridendo?");
            System.out.printf("a) ");
            boolean aSmile = sc.nextBoolean();
            System.out.printf("b) ");
            boolean bSmile = sc.nextBoolean();;
            if (aSmile && bSmile) {
                System.out.print("""
                        Pericolo! Entrambe stanno ridendo!
                        Chiudo tutto?
                        """);
                String answer = sc.next();
                if (answer.startsWith("y") || answer.startsWith("Y")) {
                    break;
                }
            }
            if (!(aSmile || bSmile)) {
                System.out.print("""
                        Pericolo! Nessuna delle due sta ridendo!
                        Chiudo tutto?
                        """);
                String answer = sc.next();
                if (answer.startsWith("y") || answer.startsWith("Y")) {
                    break;
                }
            }
        }
    }
}
