package com.vault.functional_interface.supplier.ex01;

import java.util.Scanner;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<UserForSupplier> userFactory = () -> {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a name: ");
            String name = in.nextLine();
            return new UserForSupplier(name);
        };

        UserForSupplier user1 = userFactory.get();
        UserForSupplier user2 = userFactory.get();

        System.out.println("user1 name: " + user1.getName());
        System.out.println("user2 name: " + user2.getName());
    }
}
