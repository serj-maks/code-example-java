package com.vault.comparator.ex01;

import java.util.Comparator;

// имплементируем интерфейс "Comparator"
class CarSpeedComparator implements Comparator<Car> {

    @Override
    // сравнение происходит между двумя объектами "o1" и "o2"
    public int compare(Car c1, Car c2) {
        return c1.getSpeed() - c2.getSpeed(); // сравниваем
    }
}
