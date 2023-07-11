package com.nbicocchi.exercises.nio.c;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class _FileCopyMove {
    public static void fileCopy(String src, String dst) throws IOException {
        Files.copy(Path.of(src), Path.of(dst));
    }
    public static void fileMove(String src, String dst) throws IOException {
        Files.move(Path.of(src), Path.of(dst), StandardCopyOption.REPLACE_EXISTING);
    }
}
