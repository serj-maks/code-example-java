package com.vault.comparator.ex02_with_comparator;

import java.util.TreeSet;

public class Demo {

    public static void main(String[] args) {
        PersonComparator personComparator = new PersonComparator();
        TreeSet<Person> people = new TreeSet<Person>(personComparator);
        people.add(new Person("Tom"));
        people.add(new Person("Mike"));
        people.add(new Person("Kenny"));
        people.add(new Person("Bill"));
        for (Person p : people) {
            System.out.println(p.getName());
        }
    }
}
