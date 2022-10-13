package com.vault.nested_classes.static_nested_class.ex01;

public class Cat {

    private String name;

    {
        String name = "";
        Statistic.counter++;
    }

    Cat() {
    }

    Cat(String name) {
        this.name = name;
    }

    // static_nested_class(static_nested_class)
    static class Statistic {
        public static int counter = 0;
    }
}
