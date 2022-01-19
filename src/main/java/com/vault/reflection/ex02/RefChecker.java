package com.vault.reflection.ex02;

public class RefChecker {
    public void showClassName(Object object) {
        Class clazz = object.getClass();
        System.out.println(clazz.getName());
    }
}
