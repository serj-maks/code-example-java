package com.vault.generic.ex02_without_generics;

public class DisplayIntArray {

    public static void displayIntArray(Integer[] array) {
        for (Integer x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

}
