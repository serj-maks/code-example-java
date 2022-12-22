package com.vault.keywords.this_kw.ex01;

public class Student {

    int course;
    String name;

    public Student(int course, String name) {
        this.course = course;
        this.name = name;
    }

    void displayInfo() {
        System.out.println(course + ", " + name);
    }
}
