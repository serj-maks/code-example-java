package com.vault.random_class.ex02;

public class Main {
    public static void main(String[] args) {
        // способ №2 - обращение к классу "Math"

        /**
         * round() округляет "классически",
         * 10.4 округлит до 10, 10.6 округлит до 11
         */
        System.out.println(Math.round(Math.random()));

        /**
         * floor() округляет в большую сторону,
         * 10.1 огруглит до 11
         */
        System.out.println(Math.floor(Math.random()));

        /**
         * ceil() округляет в меньшую сторону
         * 10.9 округлит до 10
         */
        System.out.println(Math.ceil(Math.random()));

        /**
         * Random() выводит числа от 0 до 1
         * и чтобы задать диапазон - нужно домножить
         */

        // числа от 0 до 10
        System.out.println(Math.random()*10);

        // числа от 0 до 100
        System.out.println(Math.random()*100);

    }
}
