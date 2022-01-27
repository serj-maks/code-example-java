package com.vault.constructor;

public class Main {
  public static void main(String[] args) {
    Box box1 = new Box();
    Box box2 = new Box(2,3,5);
    Box box3 = new Box(10);

    // option 1
    double a = box1.volume();
    System.out.println(a);

    // option 2
    System.out.println(box1.volume());

  }
}
