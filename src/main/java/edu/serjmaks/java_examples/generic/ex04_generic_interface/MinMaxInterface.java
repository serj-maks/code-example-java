package com.vault.generic.ex04_generic_interface;

// interface with generics
// параметр типа обозначает тип сравниваемых объектов
public interface MinMaxInterface<T extends Comparable<T>> {

    T min();
    T max();
}
