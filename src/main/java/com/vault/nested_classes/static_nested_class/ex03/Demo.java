package com.vault.nested_classes.static_nested_class.ex03;

public class Demo {

    public static void main(String[] args) {
        Human sergey = new Human();
        sergey.relations = Human.Relations.MARRIED;
    }
}
