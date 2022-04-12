package com.vault.abstract_class.ex01;

class Rectangle extends AFigure {
    private int width;
    private int height;

    // конструктор с обращением к конструктору абстрактного класса Figure
    Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public int getPerimeter() {
        return width * 2 + height * 2;
    }

    public int getArea() {
        return width * height;
    }
}