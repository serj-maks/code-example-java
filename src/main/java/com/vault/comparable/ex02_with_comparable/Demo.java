package com.vault.comparable.ex02_with_comparable;

import java.util.TreeSet;

public class Demo {

    public static void main(String[] args) {
        TreeSet<Person> people = new TreeSet<Person>();
        people.add(new Person("Tom"));
        // no errors
    }
}
