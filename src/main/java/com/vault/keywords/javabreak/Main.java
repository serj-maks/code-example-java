package com.vault.keywords.javabreak;

public class Main {

    public static void main(String[] args) {

        // "one:" - метка для оператора break
        one:
        for (int i = 1; i <= 3; i++) {
            System.out.println("iteration " + i + " :");

            for (int j = 1; j < 10; j++) {

                // при помощи ранее поставленной метки "one:" завершаем все циклы
                if (j > 5) break one;
                System.out.print(j + " ");
            }
            System.out.println("done");
        }
    }
}
