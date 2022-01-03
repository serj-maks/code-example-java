package edu.multithreading.test;

public class LiftOff implements Runnable {
    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;

    LiftOff() {}

    LiftOff(int countDown) {
        this.countDown = countDown;

    }

    public String status() {
        return "#" + id + "(" + (countDown > 0 ? countDown : "liftOff!") + ")";
    }

    @Override
    public void run() {
        while (countDown-- > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(status());
        }
    }
}
