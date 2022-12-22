package com.vault.stream_api.ex04_primitives;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args) {
        Stream.of(1,2,3,4,5)
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
    }
}
