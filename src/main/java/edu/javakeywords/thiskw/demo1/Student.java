package edu.javakeywords.thiskw.demo1;

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
