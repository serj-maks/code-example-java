package com.vault.ioapi.directorywalkerv2;

import java.io.File;

public interface Strategy {
    void process(File file);
}
