package com.vault.comparable.without_comparable;

import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        TreeSet<Person> people = new TreeSet<Person>();
        people.add(new Person("Tom"));
        // Exception in thread "main" java.lang.ClassCastException:
        // class com.vault.comparable.without_comparable.Person cannot be cast to class java.lang.Comparable
    }
}
