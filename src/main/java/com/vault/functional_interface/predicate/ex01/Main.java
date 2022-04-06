package com.vault.functional_interface.predicate.ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Lena", 4);
        Cat cat2 = new Cat("Masha", 2);
        Cat cat3 = new Cat("Natasha", 3);

        List<Cat> cats = new ArrayList<>(List.of(cat1, cat2, cat3));

        // lambda-expression
        Predicate<Cat> predicate1 = cat -> cat.getAge() < 5;
        Predicate<Cat> predicate2 = cat -> cat.getName().startsWith("L");

        // метод `removeIf()` над объектом коллекции `ArrayList` будет выполнен,
        // когда будет иметь значение `true` для обоих предикатов одновременно
        cats.removeIf(predicate1.and(predicate2));
        System.out.println(cats);
    }
}