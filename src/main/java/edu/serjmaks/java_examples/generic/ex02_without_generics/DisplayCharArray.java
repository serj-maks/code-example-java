package com.vault.generic.ex02_without_generics;

public class DisplayCharArray {

    public static void displayCharArray(Character[] array) {
        for (Character x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

}
