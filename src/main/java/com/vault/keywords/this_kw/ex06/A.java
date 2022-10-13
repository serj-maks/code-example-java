package com.vault.keywords.this_kw.ex06;

public class A {

    int data = 10;

    A() {
        B b = new B(this);
        b.display();
    }
}
