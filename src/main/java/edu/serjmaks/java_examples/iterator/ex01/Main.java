package com.vault.iterator.ex01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>(List.of("serj", "nat", "yaro"));
        /*
        методы hasNext() и next()
         */

        Iterator<String> iterator1 = set.iterator();
        // проверяем, есть ли следующий элемент
        while (iterator1.hasNext()) {
            // если есть - выводим его
            String nextIteratorPerson = iterator1.next();
            System.out.println(nextIteratorPerson);
        }

        /*
        метод remove()
         */

        Iterator<String> iterator2 = set.iterator();
        while (iterator2.hasNext()) {
            String elem = iterator2.next();
            if (elem.startsWith("n")) {
                // удаляем
                iterator2.remove();
            }
        }
        System.out.println(set);
    }
}
