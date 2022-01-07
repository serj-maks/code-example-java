package com.vault.generics.method;

public class Printer {

    public <T> void print (T[] item) {
        for (T elem : item) {
            System.out.println(item);
        }
    }
}
