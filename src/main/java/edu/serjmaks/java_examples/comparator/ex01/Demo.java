package com.vault.comparator.ex01;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Demo {

    public static void main(String[] args) {
        Car volvo = new Car("S60", 150);
        Car lada = new Car("priora", 90);
        Car mazda = new Car("BT-50", 100);

        // вариант №1 - передавать компаратор напрямую в конструктор (работает не со всеми коллекциями)
        PriorityQueue<Car> cars1 = new PriorityQueue<>(new CarSpeedComparator()); // в костуктор передан компаратор, т.к. очередь не знает, по какому принципу разложить элементы в коллекции
        cars1.add(volvo);
        cars1.add(lada);
        cars1.add(mazda);
        System.out.println(cars1);
        System.out.println("---");

        // вариант №2 - создавать объект нужного компаратора
        ArrayList<Car> cars = new ArrayList<Car>(); // в костуктор передан компаратор, т.к. очередь не знает, по какому принципу разложить элементы в коллекции
        cars.add(volvo);
        cars.add(lada);
        cars.add(mazda);
        System.out.println(cars);
        System.out.println("---");

        CarModelComparator modelSort = new CarModelComparator();
        cars.sort(modelSort);
        System.out.println(cars);
        System.out.println("---");

        InvertCarModelComparator invertModelSort = new InvertCarModelComparator();
        cars.sort(invertModelSort);
        System.out.println(cars);
        System.out.println("---");

        CarSpeedComparator speedSort = new CarSpeedComparator();
        cars.sort(speedSort);
        System.out.println(cars);
    }
}
