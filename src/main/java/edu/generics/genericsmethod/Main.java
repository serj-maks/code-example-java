package edu.generics.genericsmethod;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        String[] people = {"don", "elza", "banny"};
        Integer[] number = {1,2,3};

        // перед вызовом обобщенного метода указывается его тип
        printer.<String>print(people);
        printer.<Integer>print(number);
    }
}
