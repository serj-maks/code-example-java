package com.vault.generics.g_interface;

// тип класса повторяет тип интерфейса,
// но тип интерфейса не нужно указывать полностью - достаточно
// указать тип `<T>`, который подразумевает `<T extends Comparable<T>>`
public class MinMaxClass<T extends Comparable<T>> implements MinMaxInterface<T> {

    T[] array;

    MinMaxClass(T[] array) {
        this.array = array;
    }

    @Override
    public T min() {
        T elem = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(elem) < 0) {
                elem = array[i];
            }
        }
        return elem;
    }

    @Override
    public T max() {
        T elem = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(elem) > 0) {
                elem = array[i];
            }
        }
        return elem;
    }

}
