package com.vault.access_modifier.ex01;

public class Demo {

    private int x = 2;
    protected int y = 3;
    private static int x1 = 4;
    protected static int y1 = 5;

    public static void main(String[] args) {
        Demo printer = new Demo();
        printer.show();

        x1 = 8; // вот только теперь мы трогаем статическую переменную
        y1 = 9;
        printer.show();

        int x1 = 12; // А тут мы создали локальные переменные матода main!
        int y1 = 15;
        printer.show();
    }

    /**
     * метод show() видит только переменные класса, но он не видит локальных переменных
     * остальных методов в классе
     */
    void show() {
        System.out.println(x + " " + y + " " + x1 + " " + y1);
    }
}
