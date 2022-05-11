package com.vault.comparator.ex02;

public class PersonNameComparator {
    public int compare(Person a, Person b) {
        return a.getName().compareTo(b.getName());
    }
}
