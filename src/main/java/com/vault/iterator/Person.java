package com.vault.iterator;

public class Person {
    private String name;

    // конструктор "Person"
    public Person(String name) {
        this.name = name;
    }

    // метод "get()""
    public String getName() {
        return name;
    }

    // метод "set()""
    public void setName(String name) {
        this.name = name;
    }

    // переопределение метода "toString()"
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}