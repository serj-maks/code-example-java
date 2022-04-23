package com.vault.stream_api.ex01;

import java.util.ArrayList;
import java.util.Scanner;

public class UsernameFilter {

    public static void usernameFilter() {
        Scanner scanner = new Scanner(System.in);
        String str;
        ArrayList<String> names = new ArrayList<>();
        System.out.println("enter a name: ");
        while (true) {
            System.out.println("name: ");
            str = scanner.nextLine();
            if (str.equals("") == true) {
                break;
            }
            names.add(str);
        }
        System.out.println();

        System.out.println("all names list: " + names);

        long startsWitnA = names.stream()
                .filter(x -> {
                    if (x.charAt(0) == 'a') {
                        return true;
                    }
                    return false;
                })
                .count();

        System.out.printf("you enter a %s name(s), who start on 'a'", startsWitnA);
    }
}
