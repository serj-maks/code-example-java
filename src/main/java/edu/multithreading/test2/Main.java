package edu.multithreading.test2;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new LiftOff());
        thread.start();
        System.out.println("Waiting for LiftOff...");
    }
}
