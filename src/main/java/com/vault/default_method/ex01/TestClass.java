package com.vault.default_method.ex01;

public class TestClass implements ITestInterface {

    @Override
    public void square(int a) {
        int sum = a*a;
        System.out.println(sum);
    }
}
