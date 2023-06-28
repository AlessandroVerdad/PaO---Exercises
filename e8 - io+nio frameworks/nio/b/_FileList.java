package com.nbicocchi.exercises.nio.b;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _FileList {
    public static Set<String> fileList(String src) throws IOException {
        try (Stream<Path> subtreeStream = Files.list(Paths.get(src))) {
            return subtreeStream
                    .filter(Files::isDirectory)
                    .map(Path::getFileName)
                    .map(Path::toString)
                    .collect(Collectors.toSet());
        }

    }
}
