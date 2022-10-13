package com.vault.keywords.private_kw.ex01;

public class B extends A {

    public static void main(String[] args) {

        A obj1 = new A();
        // obj1.publicName();  // Error!
        obj1.privateSurname();

        B obj2 = new B();
        // obj2.publicName();  // Error!
        obj2.privateSurname();
    }
}
