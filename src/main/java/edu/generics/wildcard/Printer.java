package edu.generics.wildcard;

import java.util.List;

public class Printer {
    public static void printList(List<?> list) {
        System.out.println(list);
    }
}
