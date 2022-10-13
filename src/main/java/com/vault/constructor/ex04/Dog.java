package com.vault.constructor.ex04;

public class Dog {

    private String name;

    Dog(final String name) {
        assert name != null;
        this.name = name;
    }
}
