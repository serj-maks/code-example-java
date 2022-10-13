package com.vault.multithreading.ex01_Runnable;

public class Main {

    /**
     * пример использования интерфейса Runnable
     */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new SimpleThread();
        }
    }
}
