package com.vault.nested_class;

public class Main {
  public static void main(String[] args) {
    Cat c = new Cat("Муся");
    Cat c2 = new Cat("Маша");
    System.out.println("Создано кошек в количестве: [" + Cat.Statistic.counter+"]");
  }
}
