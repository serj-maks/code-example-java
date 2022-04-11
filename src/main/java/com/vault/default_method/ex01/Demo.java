package com.vault.default_method.ex01;

public class Demo {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        testClass.square(2);
        // чтобы выполнить `default` метод - его необязательно переопределять
        testClass.show();
    }
}
