package com.vault.generics.g_constructor;

public class Employee {
    String data;

    // constructor with generics
    <T> Employee(T data){
        this.data = data.toString();
    }

    public void display() {
        System.out.println("value: "+this.data);
    }
}
