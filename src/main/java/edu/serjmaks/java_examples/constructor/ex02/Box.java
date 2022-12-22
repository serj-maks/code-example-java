package com.vault.constructor.ex02;

public class Box {

    private int number;

    // вызови конструктор, который на вход принимает int
    // и передает туда 1
    Box() {
        this(1);
    }

    // и теперь, если кто будет использовать конструктор без входных аргументов,
    // автоматически перенаправялется в конструктор
    // с входными аргументами и сюда передается 1
    Box(final int number) {
        assert number != 0;
        this.number = number;
    }
}
