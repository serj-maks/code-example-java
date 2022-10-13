package com.vault.constructor.ex03;

public class Box {

    private double wight;
    private double height;
    private double depth;

    // constructor without parameters - empty constructor
    Box() {

    }

    // constructor with all parameters
    Box(double wight, double height, double depth) {
        this.wight = wight;
        this.height = height;
        this.depth = depth;
    }

    // constructor with one parameter
    Box(double len) {
        wight = height = depth = len;
    }

    double volume() {
        return wight * height * depth;
    }
}
