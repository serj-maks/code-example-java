package com.vault.javaenum.ex02;

// объявление перечислений вне класса
enum Directions{
    NORTH,
    SOUTH,
    EAST,
    WEST;
    }

public class Main {
    public static void main(String[] args) {
    // new keyword is not required to create a new object reference
    Directions d1 = Directions.EAST;
    System.out.println(d1);
    }
} // Outputs: EAST
