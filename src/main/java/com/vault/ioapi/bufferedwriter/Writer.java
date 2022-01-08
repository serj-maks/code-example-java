package com.vault.ioapi.bufferedwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {
        String[] names = {"Sergey", "Natasha", "Yaroslav"};

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\localData\\codejym-java-2.0\\src\\main\\java\\com\\vault\\ioapi\\test.txt"));
            writer.write("hello, world!");
            writer.write("\nwhat a nice day!");
            for (String name : names) {
                writer.write("\n" + name);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
