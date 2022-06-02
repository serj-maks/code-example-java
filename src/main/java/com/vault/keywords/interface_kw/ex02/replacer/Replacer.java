package com.vault.keywords.interface_kw.ex02.replacer;

import com.vault.keywords.interface_kw.ex02.printer.IPrinter;
import com.vault.keywords.interface_kw.ex02.reader.IReader;

public class Replacer {

    private final IPrinter printer;
    private final IReader reader;

    public Replacer(final IPrinter printer, final IReader reader) {
        this.printer = printer;
        this.reader = reader;
    }

    public void replace() {
        final String text = reader.read();
        final String replacedText = text.replace(":)", "=)");
        printer.print(replacedText);
    }
}
