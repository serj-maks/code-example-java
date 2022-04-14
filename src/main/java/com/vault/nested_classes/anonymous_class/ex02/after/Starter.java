package com.vault.nested_classes.anonymous_class.ex02.after;

public class Starter {
    public static void main(String[] args) {
        // после фигурных скобок создается анонимный класс. Это работает как
        // TextPrinter extends anonymous_class и теперь можно переопределять
        // все методы класса-предка
                                                                      // anonymous class - start
        final IPrinter textPrinter = new TextPrinter("text to print") {
            @Override
            public void printText() {
                System.out.println("hello from anonymous class");
                super.printText();
            }
        // anonymous class - end
        };
        textPrinter.printText();
    }
}
