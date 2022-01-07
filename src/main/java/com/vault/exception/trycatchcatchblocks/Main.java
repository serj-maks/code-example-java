package com.vault.exception.trycatchcatchblocks;

public class Main {
    public static void main(String[] args) {

        try {
            System.out.println(1/0);
        } catch (NullPointerException ex1) {
            ex1.printStackTrace();
        } catch (ArithmeticException ex2) {
            ex2.printStackTrace();
        }
    }
}
