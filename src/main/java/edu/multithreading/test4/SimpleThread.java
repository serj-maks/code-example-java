package edu.multithreading.test4;

public class SimpleThread extends Thread {
    private int countDown = 5;
    private static int threadCount = 0;

    SimpleThread() {
        super(Integer.toString(++threadCount));
        start();
    }

    public String toString() {
        return "#" + getName() +"(" + countDown + "), ";
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this);
            if (--countDown == 0) {
                return;
            }
        }
    }
}
