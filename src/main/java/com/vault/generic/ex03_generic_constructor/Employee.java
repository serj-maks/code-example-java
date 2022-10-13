package com.vault.generic.ex03_generic_constructor;

public class Employee {

    private String data;

    // constructor with generics
    <T> Employee(T data){
        this.data = data.toString();
    }

    public void display() {
        System.out.println("value: "+this.data);
    }
}
