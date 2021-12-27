package edu.generics.witoutgenerics;

public class DisplayIntArray {
    public static void displayIntArray(Integer[] array) {
        for (Integer x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

}
