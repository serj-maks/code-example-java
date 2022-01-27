package com.vault.javainterface.ex01;

class DemoClass implements FirstInterface, SecondInterface { // можно имплементить сколько угодно интерфейсов

    public void myMethod() { // FirstInterface method
        System.out.println("Some text..");
    }

    public void myOtherMethod() { // SecondInterface method
        System.out.println("Some other text...");
    }

    public void myOtherOtherMethod() { // SecondInterface method
        System.out.println("Some other other text...");
    }
}
