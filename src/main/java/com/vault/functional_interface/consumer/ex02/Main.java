package com.vault.functional_interface.consumer.ex02;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> consumer = new HashCodePrinter<>();
        consumer.accept("Hello World!");
    }
}
