package com.vault.keywords.this_kw.demo1;

public class Main {
    /**
     * refer current class instance variable
     */
    public static void main(String[] args) {
        Student student1 = new Student(1,"Sergey");
        Student student2 = new Student(2,"Natasha");
        student1.displayInfo();
        student2.displayInfo();
    }
}
