package com.vault.stream_api.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("serj");
        list.add("nat");
        list.add("yaro");

        String findFirstElement = list.stream()
                .findFirst()
                .orElse(null);
        System.out.println(findFirstElement);

        List<String> stringList = Arrays.asList("serj", "nat", "yaro");
        stringList.stream()
                .filter("serj"::equals)
                .count();

        Stream.of("serj", "nat", "yaro")
                .skip(stringList.size() - 1)
                .findFirst()
                .orElse(null);

    }
}
