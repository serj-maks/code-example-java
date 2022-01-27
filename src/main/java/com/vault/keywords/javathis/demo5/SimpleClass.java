package com.vault.keywords.javathis.demo5;

public class SimpleClass {

    void print(SimpleClass simpleClass) {
        System.out.println("hello, java");
    }

    void methodWithThis() {
        print(this);
    }
}
