package com.vault.exception.try_catch_catch_blocks.ex02;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        // блок catch можно совместить. Данная запись удобна,
        // если все исключения записываются в один лог
        } catch (NullPointerException | ArithmeticException ex1) {
            ex1.printStackTrace();
        }
    }
}
