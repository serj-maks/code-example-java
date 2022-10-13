package com.vault.generic.ex02_without_generics;

public class DisplayStrArray {

    public static void displayStrArray(String[] array) {
        for (String x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

}
