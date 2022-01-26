package com.vault.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("e");
        Matcher m = p.matcher("Sergey");
        while (m.find()) {
            System.out.println(m.start() + " " + m.group() + " ");
        }
        System.out.println("");

        Pattern p2 = Pattern.compile("\\d+");
        Matcher m2 = p2.matcher("Sergey01");
        while (m2.find()) {
            System.out.println(m2.start() + " " + m2.group() + " ");
        }
        System.out.println("");

    }
}
