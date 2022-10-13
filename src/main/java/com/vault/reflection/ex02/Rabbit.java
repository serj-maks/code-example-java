package com.vault.reflection.ex02;

public class Rabbit {

    @Deprecated
    private String breed;

    @AnnotationForRef
    private String name;

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }
}
