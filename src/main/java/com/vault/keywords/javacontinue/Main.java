package com.vault.keywords.javacontinue;

public class Main {

    public static void main(String[] args) {

        // вывод 2х чисел на одной строке. Если число четное - цикл продолжается без перехода на новую строку,
        // нет - выполняется тело условия - отступ
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) continue;
            {
                System.out.println();
            }
        }
    }
}