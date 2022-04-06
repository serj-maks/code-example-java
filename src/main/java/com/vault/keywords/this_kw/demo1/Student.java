package com.vault.keywords.this_kw.demo1;

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
