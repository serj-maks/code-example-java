package com.vault.javakeywords.thiskw.demo3_1;

public class SimpleClass {

    SimpleClass() {
        System.out.println("hello");
    }

    SimpleClass(int x) {
        // calling default constructor from parameterized constructor
        this();
        System.out.println(x);
    }
}