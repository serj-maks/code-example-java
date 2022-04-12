package com.vault.abstract_class.ex01;

public class Demo {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(5, 6,7,9);
    int perimeter = rectangle.getPerimeter();
    int area = rectangle.getArea();
    System.out.printf("perimetr: " + perimeter + " area: " + area);

  }
}
