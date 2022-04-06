package com.vault.comparable_interface;

import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {

    TreeSet<Dog> setDogs = new TreeSet<>();
    Dog dog1 = new Dog(4, "bobik", "noname_breed", false);
    Dog dog2 = new Dog(10, "arnold", "some_cool_breed", true);
    Dog dog3 = new Dog(6, "tuzik", "noname_breed", false);

    setDogs.add(dog1);
    setDogs.add(dog2);
    setDogs.add(dog3);

    /*
    сортировка происходит по значению в поле "age"
     */
    for (Dog s : setDogs) {
      System.out.println(s);
    }
  }
}
