package edu.generics.constructor;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Sergey");
        emp1.display();
        Employee emp2 = new Employee(123);
        emp2.display();
    }
}
