package com.vault.nested_classes.static_nested_class.ex01;

public class Main {
  public static void main(String[] args) {
    Cat cat1 = new Cat("Муся");
    Cat cat2 = new Cat("Маша");
    System.out.println("Создано кошек в количестве: "+ Cat.Statistic.counter);
  }
}
