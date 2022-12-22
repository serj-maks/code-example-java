package com.vault.io_api.ex07_dir_walker_2;

import java.io.File;

public class Demo {

    // обходит каталоги и обрабатывает в них файлы в соответствии с объектом "Strategy"
    // и выбранным расширением
    public static void main(String[] args) {
        Strategy strategy = new Strategy() {
            @Override
            public void process(File file) {
                System.out.println(file);
            }
        };
        ProcessFiles fileslist = new ProcessFiles(strategy, "pdf");
        fileslist.start();
    }
}
