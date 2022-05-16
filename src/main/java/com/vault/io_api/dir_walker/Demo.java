package com.vault.io_api.dir_walker;

import java.io.File;

import static com.vault.io_api.dir_walker.Directory.walk;

public class Demo {
    // создание последовательности объектов File, соответствующих
    // регулярному выражению - либо в локальном каталоге, либо directory,
    // посредством обхода дерева каталога
    // более подробно - книга "Философия Java" стр. 724
    public static void main(String[] args) {

        // простая проверка
        if (args.length == 0) {
            System.out.println(walk("."));
        } else {
            for (String arg : args) {
                System.out.println(walk(arg));
            }
        }

        // все каталоги
        CustomPrint.customPrint(Directory.walk(".").dirs);

        // все файлы, которые начинаются с "T"
        for (File file : Directory.local(".", "T.*")) {
            System.out.println(file);
            System.out.println("------------");
        }

        // все файлы с расширением ".java", которые начинаются с "T"
        for (File file : Directory.walk(".", "R.*\\.java")) {
            System.out.println(file);
            System.out.println("------------");
        }

        // все файлы с расширением ".class", которые содержат "Z" или "z"
        for (File file : Directory.walk(".", ".*[Zz].*\\.class")) {
            System.out.println(file);
        }
    }
}
