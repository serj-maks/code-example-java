package com.vault.constructor.ex04;

public class Puppy extends Dog {

    // вызываю конструктор верхнего уровня и когда я создаю
    // объект класса Puppy, то я иду в конструктор верхнего
    // уровня и вызываю тот конструктор, который на вход ожидает name

    // создание конструктора обязательно
    Puppy(String name) {
        super(name);
    }
}
