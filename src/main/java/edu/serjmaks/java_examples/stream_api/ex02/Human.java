package com.vault.stream_api.ex02;

import java.util.List;

public class Human {

    private String name;
    private List<String> pets;

    public Human(String name, List<String> pets) {
        this.name = name;
        this.pets = pets;
    }

    public String getName() {
        return name;
    }

    public List<String> getPets() {
        return pets;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", pets=" + pets +
                '}';
    }
}
