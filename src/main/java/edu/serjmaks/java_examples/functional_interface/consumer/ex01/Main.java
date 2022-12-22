package com.vault.functional_interface.consumer.ex01;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        // lambda-expression
        Consumer<String> consumer = new HashCodePrinter<>();
        consumer.accept("Hello, World!");
    }
}
