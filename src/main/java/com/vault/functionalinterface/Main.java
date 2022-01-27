package com.vault.functionalinterface;

import java.util.Scanner;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
    /*
    встроенные функц. интерфейсы
     */

    /*
    Predicate<T> проверяет соблюдение какого-то условия и возвращает "true" или "false"
     */
        Predicate<Integer> isPositive = x -> x > 0;
        System.out.println(isPositive.test(5)); // < test() - единсвенный метод Predicate<T>
        System.out.println(isPositive.test(-7));

    /*
    UnaryOperator<T> принимает в качестве параметра один объект типа T,
    выполняет над ними операции и возвращает результат операций в виде объекта типа T
     */
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(3)); // < apply() - единственный метод UnaryOperator<T>

    /*
    BinaryOperator<T> принимает в качестве параметра два объекта типа T,
    выполняет над ними бинарную операцию и возвращает ее результат также в виде объекта типа T
     */
        BinaryOperator<Integer> multiply = (x, y) -> x + y;
        System.out.println(multiply.apply(2, 3)); // < apply() единственный метод BinaryOperator<T>
        System.out.println(multiply.apply(4, 5));

    /*
    Functional<T, R> представляет функцию перехода от объекта типа T к объекту типа R
     */
        Function<Integer, String> output = x -> String.valueOf(x) + "dollars";
        System.out.println(output.apply(10)); // < apply() единственный метод Functional<T, R>

    /*
    Consumer<T> выполняет какое-то действие над объектом типа T, но ничего не возвращая
     */
        Consumer<Integer> printer = x -> System.out.printf("%d dollars \n", x);
        printer.accept(1000); // < accept() единственный метод Consumer<T>

    /*
    Supplier<T> ничего не принимает, но должен возвращать объект типа T
     */
        Supplier<UserForSupplier> userFactory = () -> {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a name: ");
            String name = in.nextLine();
            return new UserForSupplier(name);
        };

        UserForSupplier user1 = userFactory.get(); // < get() единственный метод Supplier<T>
        UserForSupplier user2 = userFactory.get();

        System.out.println("user1 name: " + user1.getName());
        System.out.println("user2 name: " + user2.getName());
    }
}
