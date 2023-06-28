package com.nbicocchi.exercises.nio.a;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _FileList {
    public static Set<String> fileList(String src) throws IOException {
        Path srcPath = Path.of(src);

        //  --- 'src' parameter control should be added ---
        //  if(Files.isDirectory(srcPath))

        try (Stream<Path> subtree = Files.list(srcPath)) {

            return subtree
                    .filter(itemFIle -> !Files.isDirectory(itemFIle))
                    .map(Path::getFileName)
                    .map(Object::toString)
                    .collect(Collectors.toSet());
        }
    }
}
