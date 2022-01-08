package com.vault.ioapi.bufferedreader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\localData\\codejym-java-2.0\\src\\main\\java\\com\\vault\\ioapi\\test.txt"));

            // read first lint
            System.out.println(reader.readLine());

            // read all
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
