package com.vault.reflection.ex02;

public class Demo {
    public static void main(String[] args) {
        RefChecker checker = new RefChecker();
        Rabbit rabbit = new Rabbit();

        checker.showClassName(rabbit);
    }
}
