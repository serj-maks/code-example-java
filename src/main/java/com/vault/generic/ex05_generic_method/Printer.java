package com.vault.generic.ex05_generic_method;

public class Printer {

    // method with generics
    public <T> void print (T[] item) {
        for (T elem : item) {
            System.out.println(item);
        }
    }
}
