package com.vault.generics.g_method;

public class Printer {

    // method with generics
    public <T> void print (T[] item) {
        for (T elem : item) {
            System.out.println(item);
        }
    }
}
