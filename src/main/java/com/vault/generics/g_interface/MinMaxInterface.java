package com.vault.generics.g_interface;

// interface with generics
// параметр типа обозначает тип сравниваемых объектов
public interface MinMaxInterface<T extends Comparable<T>> {
    T min();
    T max();
}
