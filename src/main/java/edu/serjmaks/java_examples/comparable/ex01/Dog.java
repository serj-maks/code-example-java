package com.vault.comparable.ex01;

// класс обязательно подключает интерфейс "Comparable<>" чтобы воспользоваться его методом "compareTo()"
public class Dog implements Comparable<Dog> {

    private int age;
    private String name;
    private String breed;
    private boolean isRoyal;

    public Dog(int age, String name, String breed, boolean isRoyal) {
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.isRoyal = isRoyal;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", isRoyal=" + isRoyal +
                '}';
    }

    /*
    сортируем по полю "age"
     */
    public int compareTo(Dog anotherDog) {
        if (this.age == anotherDog.age) {
            return 0;
        } else if (this.age < anotherDog.age) {
            return -1;
        } else {
            return 1;
        }
    }
}
