package com.vault.list_iterator;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<String> arrayList = Arrays.asList("A", "B", "C", "D");
        System.out.println("Неизмененный arrayList: " + arrayList);

        ListIterator<String> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            listIterator.set(element + "+"); // < set() присваивает элементу "element" символ "+"
        }

        System.out.print("Измененный arrayList + в обратном порядке: ");
        while (listIterator.hasPrevious()) { // < hasPrevious() возвращает "true", если есть предыдущий элемент, "false" - есть нет
            String element = listIterator.previous(); // previous() - возвращает предыдущий элемент. Если предыдущего нет - выбрасывает "NoSuchElementException"
            System.out.print(element + " ");
        }
    }
}
