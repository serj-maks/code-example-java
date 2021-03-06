package com.vault.multithreading.Runnable;

public class SimpleThread implements Runnable {
    private int countDown = 5;

    SimpleThread() {
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public String toString() {
        return Thread.currentThread().getName() + "(" + countDown + "), ";
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(this);
            if (--countDown == 0) {
                return;
            }
        }
    }

}
