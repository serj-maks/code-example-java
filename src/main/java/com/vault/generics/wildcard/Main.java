package com.vault.generics.wildcard;

import java.util.ArrayList;
import java.util.List;

import static com.vault.generics.wildcard.Printer.printList;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        printList(intList);

    }
}
