package com.vault.keywords.interface_kw.ex01;

// можно имплементировать сколько угодно интерфейсов
class DemoClass implements FirstInterface, SecondInterface {

    // FirstInterface method
    @Override
    public void myMethod() {
        System.out.println("Some text..");
    }

    // SecondInterface method
    @Override
    public void myOtherMethod() {
        System.out.println("Some other text...");
    }

    // DemoClass method
    public void myOtherOtherMethod() {
        System.out.println("Some other other text...");
    }
}
