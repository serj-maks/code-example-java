package com.vault.generic.ex02_without_generics;

import static com.vault.generic.ex02_without_generics.DisplayCharArray.displayCharArray;
import static com.vault.generic.ex02_without_generics.DisplayDobArray.displayDobArray;
import static com.vault.generic.ex02_without_generics.DisplayIntArray.displayIntArray;
import static com.vault.generic.ex02_without_generics.DisplayStrArray.displayStrArray;

public class Main {

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] dobArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        String[] strArray = {"B", "Y", "E"};

        // personal method for each array
        displayIntArray(intArray);
        displayDobArray(dobArray);
        displayCharArray(charArray);
        displayStrArray(strArray);
    }
}
