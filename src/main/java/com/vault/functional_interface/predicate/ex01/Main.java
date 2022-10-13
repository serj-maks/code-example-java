package com.vault.functional_interface.predicate.ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>(List.of(
                new Cat("Lena", 4),
                new Cat("Masha", 2),
                new Cat("Natasha", 3)
        ));

        Predicate<Cat> predicate1 = cat -> cat.getAge() < 5;
        Predicate<Cat> predicate2 = cat -> cat.getName().startsWith("L");

        // метод removeIf() + and над объектом коллекции ArrayList будет выполнен,
        // когда будет иметь значение true для обоих предикатов одновременно
        cats.removeIf(predicate1.and(predicate2));
        System.out.println(cats);
    }
}