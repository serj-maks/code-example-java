package com.vault.java_collection_framework.list.array_list.code_for_testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Car volvo = new Car("XS90",130);
        Car lada = new Car("priora",90);
        Car bmw = new Car("X5",150);
        List<Car> cars = new ArrayList<>();
        Collections.addAll(cars, volvo, lada, bmw);
        Car mazda = new Car("3", 120);

        boolean isCreated = cars.add(mazda);
        System.out.println("Car is created? : " + isCreated);
        System.out.println(cars);
    }
}
