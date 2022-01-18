package com.vault.serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Reader {

    public static void testReader() {
        try (FileInputStream fis = new FileInputStream("out.dat");
            ObjectInputStream ois = new ObjectInputStream(fis)) {

            TestClass testClass = (TestClass)ois.readObject();
            System.out.println(testClass.getName());
            System.out.println(testClass.getAge());

        } catch (IOException ex1) {
            ex1.printStackTrace(System.err);
        } catch (ClassNotFoundException ex2) {
            ex2.printStackTrace(System.err);
        }
    }
}
