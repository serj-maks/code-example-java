package com.vault.interface_kw.ex02.printer;

public class Printer implements IPrinter {

    @Override
    public void print(final String text) {
        System.out.println(text);
    }
}
