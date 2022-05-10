package com.vault.comparable.with_comparable;

public class Person implements Comparable<Person> {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.getName());
        // так тоже можно
//        return name.compareTo(o.name);
    }
}
