package com.vault.keywords.this_kw.ex05;

public class SimpleClass {

    void print(SimpleClass simpleClass) {
        System.out.println("hello, java");
    }

    void methodWithThis() {
        print(this);
    }
}
