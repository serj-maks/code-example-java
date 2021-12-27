package edu.generics.withgenerics;

import static edu.generics.withgenerics.DisplayAll.displayAll;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] dobArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        String[] strArray = {"B", "Y", "E"};

        // one generic method for all
        displayAll(intArray);
        displayAll(dobArray);
        displayAll(charArray);
        displayAll(strArray);
    }
}
