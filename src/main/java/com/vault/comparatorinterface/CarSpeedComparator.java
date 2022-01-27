package com.vault.comparatorinterface;

import java.util.Comparator;

class CarSpeedComparator implements Comparator<Car> { // имплементируем интерфейс "Comparator"

  @Override
  public int compare(Car c1, Car c2) { // сравнение происходит между двумя объектами "o1" и "o2"
    return c1.getSpeed() - c2.getSpeed(); // сравниваем
  }
}
