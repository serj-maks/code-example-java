package edu.javakeywords.thiskw.demo6;

public class B {
    A object;

    B(A object) {
        this.object = object;
    }

    void display() {
        // using data member of "A" class
        System.out.println(object.data);
    }
}
