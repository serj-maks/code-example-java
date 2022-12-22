package com.vault.stream_api.ex03_custom_objects;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {
        Collection<Student> students = Arrays.asList(
                new Student("Elena", 20, Gender.FEMALE),
                new Student("Dmitry", 30, Gender.MALE),
                new Student("Svetlana", 28, Gender.FEMALE),
                new Student("Pavel", 24, Gender.MALE)
        );

        // all male names
        students.stream()
                .filter(x -> x.getGender() == Gender.MALE)
                .map(Student::getName)
                .collect(Collectors.toList());

        // army(18-27) age
        students.stream()
                .filter(x -> x.getAge() >= 18 && x.getAge() <= 27 && x.getGender() == Gender.MALE)
                .collect(Collectors.toList());

        // average age
        students.stream()
                .filter(x -> x.getGender() == Gender.MALE)
                .mapToInt(x -> x.getAge()).average().getAsDouble();
    }
}
