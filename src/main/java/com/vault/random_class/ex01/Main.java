package com.vault.random_class.ex01;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // способ №1 - через класс "Random"
        Random rand = new Random();

        // имитация броска кубика
        System.out.println(rand.nextInt(5) + 1);
    }
}
