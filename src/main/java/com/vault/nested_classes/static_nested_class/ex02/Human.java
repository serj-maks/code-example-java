package com.vault.nested_classes.static_nested_class.ex02;

public class Human {

    Relations relations;
    private String name;
    private int age;

    static class Relations {
        private final String name;

        Relations(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
