package com.vault.keywords.javathis.demo6;

public class A {

    int data = 10;

    A() {
        B b = new B(this);
        b.display();
    }
}
