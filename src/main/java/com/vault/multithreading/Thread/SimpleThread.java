package com.vault.multithreading.Thread;

public class SimpleThread extends Thread {

    private int countDown = 5;
    private static int threadCount = 0;

    SimpleThread() {
        // сохранение имени потока
        super(Integer.toString(++threadCount));
        start();
    }

    @Override
    public String toString() {
        return "Thread-" + getName() + "(" + countDown + "), ";
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
