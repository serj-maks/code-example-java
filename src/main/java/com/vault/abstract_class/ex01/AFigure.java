package com.vault.abstract_class.ex01;

// абстрактный класс фигуры
abstract class AFigure {
    int x;
    int y;

    AFigure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // абстрактный метод
    public abstract int getPerimeter();

    // абстрактный метод
    public abstract int getArea();
}