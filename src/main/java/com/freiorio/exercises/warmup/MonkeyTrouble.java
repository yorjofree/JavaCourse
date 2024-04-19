package com.freiorio.exercises.warmup;

import java.util.Scanner;

public class MonkeyTrouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            System.out.println("Le due scimmie stanno ridendo?");
            System.out.print("a) ");
            while (!sc.hasNextBoolean()) {
                System.out.println("Non capisco... Mi devi dire true o false");
                System.out.print("a) ");
                sc.skip(".*\\n");
            }
            boolean aSmile = sc.nextBoolean();
            sc.skip(".*\\n");
            System.out.print("b) ");
            while (!sc.hasNextBoolean()) {
                System.out.println("Non capisco... Mi devi dire true o false");
                System.out.print("b) ");
                sc.skip(".*\\n");
            }
            boolean bSmile = sc.nextBoolean();
            sc.skip(".*\\n");
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
