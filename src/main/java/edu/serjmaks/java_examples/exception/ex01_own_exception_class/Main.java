package com.vault.exception.ex01_own_exception_class;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите свой возраст:");
        int x = in.nextInt();

        try {
            if (x >= 18) {
                System.out.println("Хорошо, проходите");
            }
            else {
                throw new ExceptionClass("Вам нет 18 лет");
            }
        // для создания объекта исключения используется конструктор, в который передается объект класса 'Exception'
        } catch (Exception exception) {
            // err - подсвечивает цвет текста красным
            System.err.println(exception.getMessage());
        }
    }
}
