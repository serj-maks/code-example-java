package edu.serjmaks.java_examples.java_collection_framework.list.array_list.ex02;

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

        System.out.println(cars);

        Car newBmw = new Car("X5", 150);

        // без переопределения метода equals() в класса Car объект newBmw удален НЕ БУДЕТ,
        // т.к. без переопределения я получаю дефолтный equals от класса Object,
        // который сравнивает ссылки оператором ==, а не объекты в памяти, 
        // которые нужно сравнивать методом equals
        cars.remove(newBmw);

        System.out.println(cars);
    }
}
