package com.vault.nested_classes.anonymous_class.ex02.before;

public class Starter {
    public static void main(String[] args) {
//        final IPrinter textPrinter = new TextPrinter("text to print");
//        textPrinter.printText();
        final IPrinter advTextPrinter = new AdvancedTextPrinter("text to print");
        advTextPrinter.printText();
    }
}
