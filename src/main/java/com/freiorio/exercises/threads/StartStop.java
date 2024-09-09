package com.freiorio.exercises.threads;

public class StartStop {
    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            long startTime = System.currentTimeMillis();
            System.out.println(Thread.currentThread().getName() + " started");
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println(Thread.currentThread().getName() + " running since " + (System.currentTimeMillis() - startTime) + " ms");
            }
            System.out.println(Thread.currentThread().getName() + " terminated");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyRunnable(), "T1");
        Thread t2 = new Thread(new MyRunnable(), "T2");

        t1.start();
        t2.start();

        Thread.sleep(100);

        t1.interrupt();
        t2.interrupt();

        t1.join();
        t2.join();
    }
}
