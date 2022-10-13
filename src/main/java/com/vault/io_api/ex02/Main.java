package com.vault.io_api.ex02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;

public class Main {

    final static String PATH = "temp";

    public static void main(String[] args) throws IOException {
        deleteAll(PATH);
    }

    // delete all files and dirs with root dir
    public static void deleteAll(String path) throws IOException {
        Path dir = Paths.get(path);
        Files.walk(dir)
                .sorted(Comparator.reverseOrder())
                .forEach(x -> {
                    try {
                        Files.delete(x);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                });
    }
}
