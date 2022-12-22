package com.vault.stream_api.stream_methods.collect.Collectors.toMap.ex01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        Function<Integer, String> keyMapper = a -> (a % 2 == 0) ? "even" : "odd";
        Function<Integer, List<Integer>> valueMapper = a -> List.of(a);
        BinaryOperator<List<Integer>> mergeFunction = (a, b) -> {
            List<Integer> result = new ArrayList<>(a);
            result.addAll(b);
            return result;
        };
        Supplier<Map<String, List<Integer>>> supplier = () -> new HashMap<String, List<Integer>>();

        Map<String, List<Integer>> result = list.stream()
                .collect(Collectors.toMap(keyMapper, valueMapper, mergeFunction, supplier));

        System.out.println(result);
    }
}
