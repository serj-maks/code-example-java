package com.vault.comparator_interface;

import java.util.Comparator;

class CarModelComparator implements Comparator<Car> {

  @Override
  public int compare(Car o1, Car o2) {
    return o1.getModel().compareTo(o2.getModel());
  }
}
