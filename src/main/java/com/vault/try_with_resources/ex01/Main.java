package com.vault.try_with_resources.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {

    public static void main(String[] args) {
        try (InputStream input = new FileInputStream("C:\\Users\\user\\Desktop\\input.txt");
        OutputStream output = new FileOutputStream("C:\\Users\\user\\Desktop\\output.txt")) {
            byte[] buffer = new byte[4096];
            int r = input.read(buffer);
            while (r != -1) {
                output.write(buffer, 0, r);
                r = input.read(buffer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
