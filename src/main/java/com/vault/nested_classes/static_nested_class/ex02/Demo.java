package com.vault.nested_classes.static_nested_class.ex02;

public class Demo {

    public static void main(String[] args) {
        Human sergey = new Human();
        sergey.relations = new Human.Relations("married");
    }
}
