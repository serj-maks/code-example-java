package com.vault.keywords.this_kw.ex06;

public class B {
    A object;

    B(A object) {
        this.object = object;
    }

    void display() {
        // using data member of "A" class
        System.out.println(object.data);
    }
}
