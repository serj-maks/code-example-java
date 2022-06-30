package com.vault.generics.g_interface;

public class Main {
    public static void main (String[] args){
        Integer nums[] = {3, 4, 5, 6};
        Character chars[] = {'a', 'b', 'c', 'd'};
        MinMaxClass<Integer> integers = new MinMaxClass<>(nums);
        MinMaxClass<Character> characters = new MinMaxClass<>(chars);
        System.out.println("max: " + integers.max());
        System.out.println("min: " + integers.min());
        System.out.println("max: " + characters.max());
        System.out.println("min: " + characters.min());
    }
}
