package com.vault.functional_interface.binary_operator.reduce;

import java.util.List;
import java.util.function.BinaryOperator;

public class Demo {
    public static void main(String[] args) {
        // addition multiply
        List<Integer> integersListForAddition = List.of(2,3,4);
        BinaryOperator<Integer> addition = (a, b) -> a + b;
        Integer additionOperation = reduce(integersListForAddition, addition, 0);
        System.out.println(additionOperation);

        // integers multiply
        List<Integer> integersListForMultiply = List.of(2,3,4);
        BinaryOperator<Integer> multiply = (a, b) -> a * b;
        Integer multiplyOperation = reduce(integersListForMultiply, multiply, 1);
        System.out.println(multiplyOperation);

        // strings concatenation
        List<String> stringsListForConcatenation = List.of("Hello, ", "World!");
        BinaryOperator<String> concatenation = (a, b) -> a + "" + b;
        String concatenationOperation = reduce(stringsListForConcatenation, concatenation, "");
        System.out.println(concatenationOperation);
    }

    public static <T> T reduce(List<T> list, BinaryOperator<T> binaryOperator, T identity) {
        T result = identity;
        for (T element : list) {
            result = binaryOperator.apply(result, element);
        }
        return result;
    }
}
