package com.vault.stream_api.objects;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Collection<Student> students = Arrays.asList(
                new Student("Elena", 20, Gender.FEMALE),
                new Student("Dmitry", 30, Gender.MALE),
                new Student("Svetlana", 28, Gender.FEMALE),
                new Student("Pavel", 24, Gender.MALE)
        );

        students.stream()
                .filter(x -> x.getGender() == Gender.MALE)
                .mapToInt(x -> x.getAge()).average().getAsDouble();

        students.stream()
                .filter(x -> x.getAge() >= 18 && x.getAge() <= 27 && x.getGender() == Gender.MALE)
                .collect(Collectors.toList());
    }
}
