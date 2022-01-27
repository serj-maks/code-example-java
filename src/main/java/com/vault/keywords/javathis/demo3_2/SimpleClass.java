package com.vault.keywords.javathis.demo3_2;

public class SimpleClass {

    SimpleClass() {
        // calling parameterized constructor from default constructor
        this(10);
        System.out.println("hello");
    }

    SimpleClass(int x) {
        System.out.println(x);
    }
}
