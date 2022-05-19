package com.vault.io_api.ex03;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    final static String PATH = "temp";

    public static void main(String[] args) throws IOException {
        deleteAllFiles(new File(PATH));
    }

    // delete all files recursively only this dir, without recursive deleting
    public static void deleteAllFiles(File path) throws IOException {
        Files.walk(path.toPath())
                .filter(Files::isRegularFile)
                .map(Path::toFile)
                .forEach(File::delete);
    }
}
