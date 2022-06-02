package com.vault.keywords.interface_kw.ex02;

import com.vault.keywords.interface_kw.ex02.printer.IPrinter;
import com.vault.keywords.interface_kw.ex02.printer.Printer;
import com.vault.keywords.interface_kw.ex02.reader.IReader;
import com.vault.keywords.interface_kw.ex02.reader.Reader;
import com.vault.keywords.interface_kw.ex02.replacer.Replacer;

public class Demo {
    public static void main(String[] args) {
        final IReader reader = new Reader("hey:) you cool:)");
        final IPrinter printer = new Printer();
        final Replacer replacer = new Replacer(printer, reader);
        replacer.replace();
    }
}
