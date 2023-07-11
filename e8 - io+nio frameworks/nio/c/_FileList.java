package com.nbicocchi.exercises.nio.c;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _FileList {
    public static Set<String> fileList(String src) throws IOException {
        if (!Files.isDirectory(Path.of(src))) {
            System.out.println("Error, parameter is not a dir");
            return null;
        }

        try (Stream<Path> stream = Files.list(Path.of(src))) {
            return stream
                    .filter(Files::isDirectory)
                    .map(Path::getFileName)
                    .map(Path::toString)
                    .collect(Collectors.toSet());
        }
    }
}
