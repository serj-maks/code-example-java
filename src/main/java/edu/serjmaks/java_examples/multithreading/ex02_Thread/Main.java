package com.vault.multithreading.ex02_Thread;

public class Main {

    /**
     * пример использования класса Thread
     */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new SimpleThread();
        }
    }
}
