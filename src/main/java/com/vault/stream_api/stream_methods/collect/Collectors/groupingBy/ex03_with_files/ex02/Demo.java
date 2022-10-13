package com.vault.stream_api.stream_methods.collect.Collectors.groupingBy.ex03_with_files.ex02;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {
        Map<String, List<String>> fileType = Map.of("document", List.of("txt", "pdf"),
                "image", List.of("jpg", "png"));

        Function<File, String> getFileExc = x -> {
            int n = x.getName().lastIndexOf(".");
            if (n == -1) {
                return "";
            }
            return x.getName().substring(n + 1);
        };

        Function<File, String> outerClassifier = file -> {
            for (String type : fileType.keySet()) {
                String ext = getFileExc.apply(file);
                if (fileType.get(type).contains(ext)) {
                    return type;
                }
            }
            return "not classified";
        };

        Function<File, String> innerClassifier = x -> getFileExc.apply(x);

        Map<String, Map<String, List<File>>> groupByExt = Arrays.stream(new File
                ("src/main/java/com/vault/stream_api/stream_methods/collect/Collectors/groupingBy/ex_with_files/simple_folder").listFiles())
                .collect(Collectors.groupingBy(outerClassifier, Collectors.groupingBy(innerClassifier)));

        // более удобный вывод на консоль
        groupByExt.forEach((type, typeMap) -> {
                    System.out.println(type);
                    typeMap.forEach((ext, file) -> {
                        System.out.println("\t" + ext);
                        file.forEach(x -> System.out.println("\t\t" + x));
                    });
                });
    }
}
