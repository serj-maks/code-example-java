package com.vault.serializable.ex01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Writer {

    public static void testWriter() {
        TestClass testClass = new TestClass();
        testClass.setName("Sergey");
        testClass.setAge(18);

        try (FileOutputStream fos = new FileOutputStream("out.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(testClass);

        } catch (IOException ex1) {
            ex1.printStackTrace(System.err);
        }
    }
}
