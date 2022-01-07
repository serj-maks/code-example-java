package com.vault.generics.withgenerics;

public class DisplayAll {
    // one class for all var types
    public static <Thing> void displayAll(Thing[] array) {
        for (Thing x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

}
