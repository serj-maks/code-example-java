package com.vault.io_api.ex05_BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public static void main(String[] args) throws IOException {
        // type path to file here
        final String PATH_TO_TEST_FILE = "";
        String[] names = {"Sergey", "Natasha", "Yaroslav"};

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(PATH_TO_TEST_FILE))) {
            writer.write("hello, world!");
            writer.write("\nwhat a nice day!");
            for (String name : names) {
                writer.write("\n" + name);
            }
        }
    }
}
