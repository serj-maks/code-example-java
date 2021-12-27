package edu.streamapi;

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

        /**
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
        int[] outputArray = Arrays.stream(inputArray).map(element -> {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();

        /**
         * методы Stream API
         * i - промежуточная операция, t - терминальная операция
         */

        // map() - изменяет внешний вид элементов
        // i
        List<Integer> mapList = inputList.stream().map(element -> element.length()).collect(Collectors.toList());
        // преобразуем каждый элемент коллекции из типа `String` в тип `Integer`, выводим количество букв каждого элемента


        // filter() - выбирает нужные элементы
        // i
        List<String> filterList = inputList.stream().filter(element -> element.startsWith("t")).collect(Collectors.toList());


        // forEach() - возвращает `void`
        // t
        Arrays.stream(inputArray).forEach(element -> {
            element*=2;
            System.out.println(element);
        });


        // reduce() - преобразовывает все элементы в один объект
        // t
        int reduceArray = Arrays.stream(inputArray).reduce(1, (accum, element) -> accum+element);
        System.out.println(reduceArray);


        // collect - собирает элементы в заданную коллекцию
        // t
        List<String> collectList = inputList.stream().filter(x -> x.length() <= 3).collect(Collectors.toList());


        // collect(Collectors.toList()) - собирает элементы в коллекцию 'List'
        // t
        //TODO: привести массив в коллекцию List. В последних уроках на ютуб это есть (превью с Чаком Нориссом)
        List<Integer> collectList1 = Arrays.stream(inputArray).filter(x -> x <= 3).collect(Collectors.toList());
    }
}
