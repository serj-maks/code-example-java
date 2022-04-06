package com.vault.comparator_interface;

class Car {

  private String model;
  private int speed;

  /*
  getter&setter for "speed" value
   */
  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  /*
  getter&setter for "model" value
   */
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  /*
  constructors
   */
  Car() {
  }

  Car(String model) {
    this.model = model;
  }

  Car(int speed) {
    this.speed = speed;
  }

  Car(String model, int speed) {
    this.model = model;
    this.speed = speed;
  }

  /*
  just method for tests
   */
  void honk() {
    System.out.println("beep!");
  }

  @Override
  public String toString() {
    return "Car{" +
            "model='" + model + '\'' +
            ", speed=" + speed +
            '}';
  }
}
