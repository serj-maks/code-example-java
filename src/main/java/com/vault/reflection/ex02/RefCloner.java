package com.vault.reflection.ex02;

/**
 * clone any class objects
 */
public class RefCloner {

    public Object clone(Object object) throws InstantiationException, IllegalAccessException {
        Class anyClass = object.getClass();
        return anyClass.newInstance();
    }
}
