package com.vault.nested_classes.anonymous_class.ex02.before;

// лишний класс, потому что:
// - переопределен один метод
// - т.к. уже создан класс, то его нужно поддерживать - тестировать
// - нужно таскать этот класс с собой, т.к. теперь он - часть логики пакета
public class AdvancedTextPrinter extends TextPrinter {

    public AdvancedTextPrinter(final String text) {
        super(text);
    }

    @Override
    public void printText() {
        System.out.println("hello from AdvancedTextPrinter");
        super.printText();
    }
}
