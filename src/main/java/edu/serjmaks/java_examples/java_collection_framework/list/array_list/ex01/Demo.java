package edu.serjmaks.java_examples.java_collection_framework.list.array_list.ex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Car volvo = new Car("XS90",130);
        Car lada = new Car("priora",90);
        Car bmw = new Car("X5",150);

        Collections.addAll(cars, volvo, lada, bmw);

        Car mazda = new Car("3", 120);

        boolean isCreated = cars.add(mazda);

        System.out.println("Car is created? : " + isCreated);
        System.out.println(cars);
    }
}
