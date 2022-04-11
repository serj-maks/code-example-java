package com.vault.default_method.ex01;

public interface ITestInterface {
    // abstract method
    void square(int a);

    // default method
    default void show() {
        System.out.println("Default Method Executed");
    }
}
