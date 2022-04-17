package com.vault.generics.ex_without_generics;

public class DisplayDobArray {
    public static void displayDobArray(Double[] array) {
        for (Double x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

}
