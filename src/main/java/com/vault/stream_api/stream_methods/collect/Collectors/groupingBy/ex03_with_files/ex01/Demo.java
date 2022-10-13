package com.vault.stream_api.stream_methods.collect.Collectors.groupingBy.ex03_with_files.ex01;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {
        Function<File, String> classifier = x -> x.getName().substring(x.getName().lastIndexOf(".") + 1);

        Map<String, List<File>> groupByExt = Arrays.stream(new File
                        ("src/main/java/com/vault/stream_api/stream_methods/collect/Collectors/groupingBy/ex_with_files/simple_folder").listFiles())
                .collect(Collectors.groupingBy(classifier));

        System.out.println(groupByExt);
    }
}
