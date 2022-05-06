package com.vault.stream_api.stream_methods.collect.Collectors.groupingBy.ex_custom_objects;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<Worker> workers = List.of(
                new Worker("dmitry", 28, 100, "director"),
                new Worker("natali", 29, 80, "manager"),
                new Worker("vladimir", 30, 50, "courier")
        );

        // группировка по должности
        Map<String, List<Worker>> groupByPosition = workers.stream()
                .collect(Collectors.groupingBy(Worker::getPosition));
        System.out.println(groupByPosition);

        // подсчет кол-ва рабочих, занимаемых конкретную должность
        Map<String, Long> countByPosition = workers.stream()
                .collect(Collectors.groupingBy(Worker::getPosition, Collectors.counting()));
        System.out.println(countByPosition);

        // группировка по должности, при этом интересуют только имена
        Map<String, Set<String>> groupByName = workers.stream()
                .collect(Collectors.groupingBy(Worker::getPosition,
                        Collectors.mapping(Worker::getName, Collectors.toSet())));
        System.out.println(groupByName);

        // группировка по должности, при этом возвращается список имен единой строкой
        Map<String, String> groupByNameWithJoining = workers.stream()
                .collect(Collectors.groupingBy(Worker::getPosition,
                        Collectors.mapping(Worker::getName, Collectors.joining(", ", "{","}"))));
        System.out.println(groupByNameWithJoining);

        // группировка по должности и по возрасту
        Map<String, Map<Integer, List<Worker>>> groupByPositionOfAge = workers.stream()
                .collect(Collectors.groupingBy(Worker::getPosition,
                        Collectors.groupingBy(Worker::getAge)));
        System.out.println(groupByPositionOfAge);
    }
}
