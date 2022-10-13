package com.vault.stream_api.ex02;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Demo {

    public static void main(String[] args) {
        List<Human> humans = asList(
                new Human("Sam", asList("Buddy", "Lucy")),
                new Human("Bob", asList("Frankie", "Rosie")),
                new Human("Marta", asList("Simba", "Tilly")));

        List<String> petNames = humans.stream()
                .map(human -> human.getPets())  // преобразовываем Stream<Human> в Stream<List<Pet>>
                .flatMap(pets -> pets.stream()) // "разворачиваем" Stream<List<Pet>> в Stream<Pet>
                .collect(Collectors.toList());
        System.out.println(petNames);
    }
}
