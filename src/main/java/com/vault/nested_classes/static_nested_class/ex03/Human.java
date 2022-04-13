package com.vault.nested_classes.static_nested_class.ex03;

public class Human {
    Relations relations;
    private String name;
    private int age;

    // each enum - static
    static public enum Relations {
        DIVORCED,
        ACTIVE_SEARCH,
        SINGLE,
        COMPLEX,
        MARRIED,
        IN_LOVE
    }
}
