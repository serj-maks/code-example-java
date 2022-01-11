package com.vault.ioapi.directorywalkerv2;

import java.io.File;
import java.io.IOException;

public class ProcessFiles {
    private Strategy strategy;
    private String ext;

    public ProcessFiles(Strategy strategy, String ext) {
        this.strategy = strategy;
        this.ext = ext;
    }

    public void start() {
        String[] args = new String[0];
        if (args.length == 0) {
            processDirectoryTree(new File("."));
        } else {
            for (String arg : args) {
                File fileArg = new File(arg);
                if (fileArg.isDirectory()) {
                    processDirectoryTree(fileArg);
                } else {
                    // разрешает не указывать расширение
                    if (!arg.endsWith("." + ext)) {
                        arg += "." + ext;
                    }
                    try {
                        strategy.process(new File(arg).getCanonicalFile());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public void processDirectoryTree(File root) {
        for (File file : Directory.walk(root.getAbsolutePath(), ".*\\." + ext)) {
            try {
                strategy.process(file.getCanonicalFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
