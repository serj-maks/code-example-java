package edu.serjmaks.java_examples.java_collection_framework.list.array_list.ex02;

public class Car {

    private String model;
    private int speed;

    Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }

    // @Override
    // public int hashCode() {
    //     final int prime = 31;
    //     int result = 1;
    //     result = prime * result + ((model == null) ? 0 : model.hashCode());
    //     result = prime * result + speed;
    //     return result;
    // }

    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj)
    //         return true;
    //     if (obj == null)
    //         return false;
    //     if (getClass() != obj.getClass())
    //         return false;
    //     Car other = (Car) obj;
    //     if (model == null) {
    //         if (other.model != null)
    //             return false;
    //     } else if (!model.equals(other.model))
    //         return false;
    //     if (speed != other.speed)
    //         return false;
    //     return true;
    // }

}
