package com.vault.abstract_class.ex02;

public class Replacer extends AReplacer {

    // в классе-наследнике абстрактного класса из двух методов переопределен
    // только один метод, т.к. он(метод) является абстрактным(нереализованным).
    @Override
    protected String readString() {
        return "hey:) your cool:)";
    }
}
