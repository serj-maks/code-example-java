package com.vault.stream_api.stream_methods.collect.Collectors.groupingBy.ex02_primitives;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);

        Map<String, List<Integer>> result = list.stream()
                .collect(Collectors.groupingBy(x -> (x % 2 == 0) ? "even" : "odd"));

        System.out.println(result);
    }
}
