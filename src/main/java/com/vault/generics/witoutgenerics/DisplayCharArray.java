package com.vault.generics.witoutgenerics;

public class DisplayCharArray {
    public static void displayCharArray(Character[] array) {
        for (Character x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

}
