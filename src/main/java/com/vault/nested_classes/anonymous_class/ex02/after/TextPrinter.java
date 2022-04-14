package com.vault.nested_classes.anonymous_class.ex02.after;

public class TextPrinter implements IPrinter {
    final String text;

    public TextPrinter(final String text) {
        this.text = text;
    }

    @Override
    public void printText() {
        System.out.println("hello from TextPrinter");
    }
}
