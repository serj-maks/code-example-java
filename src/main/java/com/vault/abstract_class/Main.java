package com.vault.abstract_class;

public class Main {
  public static void main(String[] args) {
    Rectangle rec1 = new Rectangle(5, 6,7,9);
    int perimetr = rec1.getPerimeter();
    int area = rec1.getArea();
    System.out.printf("perimetr: " + perimetr + " area: " + area);

  }
}
