package com.vault.comparator.ex04;

public class PersonAgeComparator {

    public int compare(Person a, Person b) {
        if(a.getAge()> b.getAge())
            return 1;
        else if(a.getAge()< b.getAge())
            return -1;
        else
            return 0;
    }
}
