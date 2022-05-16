package com.vault.io_api.dir_walker_2;

import java.io.File;

public interface Strategy {
    void process(File file);
}
