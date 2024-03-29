package com.vault.keywords.this_kw.ex03_3;

public class SimpleClass {

    int course;
    String name;

    SimpleClass(int course) {
        this.course = course;
    }

    SimpleClass(int course, String name) {
        // reusing constructor
        this(course);
        this.name = name;
    }

    @Override
    public String toString() {
        return "SimpleClass{" +
                "course=" + course +
                ", name='" + name + '\'' +
                '}';
    }
}
