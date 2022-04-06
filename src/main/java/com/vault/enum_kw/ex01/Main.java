package com.vault.enum_kw.ex01;

// объявление перечислений внутри класса
public class Main {

    enum Directions {
        NORTH,
        SOUTH,
        EAST,
        WEST;
    }

    public static void main(String[] args) {
        // new keyword is not required to create a new object reference
        Directions d1 = Directions.EAST;
        System.out.println(d1);
    }
} // Outputs: EAST
