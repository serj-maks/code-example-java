package edu.javakeywords.thiskw.demo3_3;

public class Main {
    /**
     * invoke current class constructor
     * reuse the constructor from the constructor
     */
    public static void main(String[] args) {
        SimpleClass simpleClass1 = new SimpleClass(1);
        SimpleClass simpleClass2 = new SimpleClass(2,"Sergey");
        System.out.println(simpleClass1);
        System.out.println(simpleClass2);
    }
}
