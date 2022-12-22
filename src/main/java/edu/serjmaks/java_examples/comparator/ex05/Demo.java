package com.vault.comparator.ex05;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Demo {

    public static void main(String[] args) {
        // создание компаратора в конструкторе
        Map<User, Integer> map = new TreeMap<>(Comparator.comparing(o -> o.getAge()));
        map.put(new User("serj", 28), 0);
        map.put(new User("nat", 29), 0);
        map.put(new User("yaro", 1), 0);

        System.out.println(map);
    }
}
