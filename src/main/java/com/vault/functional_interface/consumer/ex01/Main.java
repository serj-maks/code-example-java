package com.vault.functional_interface.consumer.ex01;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        // lambda-expression
        Consumer<String> consumer = str -> System.out.println(str.hashCode());
        consumer.accept("Hello, World!");
    }
}
