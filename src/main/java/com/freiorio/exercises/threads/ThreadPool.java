package com.freiorio.exercises.threads;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.random.RandomGenerator;

public class ThreadPool extends Thread {
    private final int task;

    public ThreadPool(int task) {
        this.task = task;
    }

    public int getTask() {
        return task;
    }

    @Override
    public void run() {
        long startTime = System.nanoTime();
        System.out.printf("START thread=%s task=%d\n", getName(), getTask());
        RandomGenerator randomGenerator = RandomGenerator.getDefault();
        try {
            Thread.sleep(randomGenerator.nextLong(1000L));
        } catch (InterruptedException ignored) {

        }
        System.out.printf("STOP thread=%s task=%d t=%d ms\n", getName(), getTask(), TimeUnit.MILLISECONDS.convert(Duration.ofNanos(System.nanoTime() - startTime)));
    }

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[]{
                new ThreadPool(0),
                new ThreadPool(1),
                new ThreadPool(2),
                new ThreadPool(3)
        };
        for (Thread t : threads) {
            t.start();
        }
        for (Thread t : threads) {
            t.join();
        }
    }
}
