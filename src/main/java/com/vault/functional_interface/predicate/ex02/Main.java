package com.vault.functional_interface.predicate.ex02;

import com.vault.functional_interface.predicate.ex01.Cat;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    // for method reference using you must create special method
    public static boolean getAgeBeforeFive(Cat cat) {
        return cat.getAge() < 5;
    }

    public static void main(String[] args) {

        Cat cat1 = new com.vault.functional_interface.predicate.ex01.Cat("Lena", 4);
        Cat cat2 = new com.vault.functional_interface.predicate.ex01.Cat("Masha", 2);
        Cat cat3 = new com.vault.functional_interface.predicate.ex01.Cat("Natasha", 3);

        List<Cat> cats = new ArrayList<>(List.of(cat1, cat2, cat3));

        // method reference
        Predicate<Cat> predicate = Main::getAgeBeforeFive;
        System.out.println(predicate.test(cat1));
    }
}