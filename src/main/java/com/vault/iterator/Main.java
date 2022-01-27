package com.vault.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();

        Person person1 = new Person("serj");
        Person person2 = new Person("nat");

        list.add(person1);
        list.add(person2);

        /*
        методы hasNext() и next()
         */
        // создаем объект "iterator", который релаизует интерфейс "Iterator"
        // метод "Iterator" входит в состав класса "Collection"
        Iterator<Person> iterator = list.iterator();

        // проверяем, есть ли следующий элемент
        while (iterator.hasNext()){
            // если есть - выводим его
            Person nextIteratorPerson = iterator.next();
            System.out.println(nextIteratorPerson);
        }

        /*
        метод remove()
         */
        Iterator<Person> iterator2 = list.iterator();

        while (iterator2.hasNext()){
            // делаем шаг
            iterator2.next();
            // удаляем
            iterator2.remove();
        }

        System.out.println(list);
    }
}
