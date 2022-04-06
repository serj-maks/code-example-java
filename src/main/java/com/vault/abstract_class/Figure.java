package com.vault.abstract_class;

// абстрактный класс фигуры
abstract class Figure{

  int x; // x-координата точки
  int y; // y-координата точки

  Figure(int x, int y){

    this.x=x;
    this.y=y;
  }
  // абстрактный метод для получения периметра
  public abstract int getPerimeter();

  // абстрактный метод для получения площади
  public abstract int getArea();
}