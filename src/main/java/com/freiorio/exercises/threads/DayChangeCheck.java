package com.freiorio.exercises.threads;

import java.time.Duration;
import java.time.LocalDate;

public class DayChangeCheck extends Thread {
    @Override
    public void run() {
        System.out.println(getName() + " started");
        LocalDate startDate = LocalDate.now();
        while (!interrupted()) {
            try {
                Thread.sleep(Duration.ofMinutes(15L));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (LocalDate.now().getDayOfMonth() != startDate.getDayOfMonth()) {
                System.out.println("Day of month has changed!");
            }
        }
    }

    public static void main(String[] args) {
        Thread t = new DayChangeCheck();
        t.start();
        System.out.println("main thread terminated");
    }
}
