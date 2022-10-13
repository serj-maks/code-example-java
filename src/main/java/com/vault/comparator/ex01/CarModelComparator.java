package com.vault.comparator.ex01;

import java.util.Comparator;

class CarModelComparator implements Comparator<Car> {

  @Override
  public int compare(Car o1, Car o2) {
    return o1.getModel().compareTo(o2.getModel());
  }
}
