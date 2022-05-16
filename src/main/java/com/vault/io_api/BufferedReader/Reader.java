package com.vault.io_api.BufferedReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) throws IOException {
        // type path to file here
        final String PATH_TO_TEST_FILE = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(PATH_TO_TEST_FILE))) {

            // read first lint
            System.out.println(reader.readLine());

            // read all
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
