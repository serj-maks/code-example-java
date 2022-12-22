package com.vault.io_api.ex07_dir_walker_2;

import java.io.File;

public interface Strategy {

    void process(File file);
}
