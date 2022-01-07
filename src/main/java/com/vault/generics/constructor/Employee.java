package com.vault.generics.constructor;

public class Employee {
    String data;

    // generics constructor
    <T> Employee(T data){
        this.data = data.toString();
    }

    public void display() {
        System.out.println("value: "+this.data);
    }
}
