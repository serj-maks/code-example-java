package com.vault.nestedclass;

public class Cat {

  private String name;

  /*
  инициализатор
   */
  {
    String name = "";
    Statistic.counter++;
  }

  Cat() {

  }

  Cat(String name) {
    this.name = name;
  }

  /*
  nested_class(static_nested_class)
   */
  static class Statistic {
    public static int counter = 0;
  }
}
