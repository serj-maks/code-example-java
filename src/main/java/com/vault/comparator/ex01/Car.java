package com.vault.comparator.ex01;

class Car {

    private String model;
    private int speed;

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

    public int getSpeed() {
        return speed;
    }

    public String getModel() {
        return model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setModel(String model) {
        this.model = model;
    }

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
