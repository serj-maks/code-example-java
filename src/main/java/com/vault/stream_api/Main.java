package com.vault.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // test code
        List<String> inputList = new ArrayList<>();
        inputList.add("one");
        inputList.add("two");
        inputList.add("three");

        int[] inputArray = {3, 1, 9, 11, 8};

        /*
         * создание стримов
         */

        // создание из коллекции
        inputList.stream().forEach(x -> System.out.println(x));


        // создание из коллекции №2 (запись в переменную)
        List<String> outputList = inputList.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());


        // создание из значений
        Stream.of("one", "two", "three").forEach(x -> System.out.println(x));


        // создание из значений №2
        Stream.of(1, 2, 3, 4, 5).forEach(x -> System.out.println(x));


        // создание из массива
        Arrays.stream(inputArray).forEach(x -> System.out.println(x));


        // создание из массива №2 (запись в переменную)
        int[] outputArray = Arrays.stream(inputArray).map(x -> {
            if (x % 3 == 0) {
                x = x / 3;
            }
            return x;
        }).toArray();

        /*
         * методы Stream API
         *     i - промежуточная операция,
         *     t - терминальная операция
         */

        // map() - изменяет внешний вид элементов
        // i
        List<Integer> mapList = inputList.stream().map(x -> x.length()).collect(Collectors.toList());
        // преобразуем каждый элемент коллекции из типа `String` в тип `Integer`, выводим количество букв каждого элемента


        // filter() - выбирает нужные элементы
        // i
        List<String> filterList = inputList.stream().filter(x -> x.startsWith("t")).collect(Collectors.toList());


        // forEach() - возвращает `void`
        // t
        Arrays.stream(inputArray).forEach(x -> {
            x*=2;
            System.out.println(x);
        });


        // reduce() - преобразовывает все элементы в один объект
        // t
        int reduceArray = Arrays.stream(inputArray).reduce(1, (accum, x) -> accum+x);
        System.out.println(reduceArray);


        // collect - собирает элементы в заданную коллекцию
        // t
        List<String> collectList = inputList.stream().filter(x -> x.length() <= 3).collect(Collectors.toList());
    }
}
