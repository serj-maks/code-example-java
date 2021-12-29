package edu.exception.ownexceptionclass;

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
        }
        catch (ExceptionClass exception) {
            System.err.println(exception.getMessage());
        }

    }
}
