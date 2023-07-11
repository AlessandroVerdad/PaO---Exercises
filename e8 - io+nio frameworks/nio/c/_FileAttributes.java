package com.nbicocchi.exercises.nio.c;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class _FileAttributes {

    public static boolean exists(String filename)
    {
        return Files.exists(Path.of(filename));
    }
    public static boolean isReadable(String filename) {
        return Files.isReadable(Path.of(filename));
    }
    public static boolean isWritable(String filename) {
        return Files.isDirectory(Path.of(filename));
    }
    public static boolean isExecutable(String filename) {
        return Files.isExecutable(Path.of(filename));
    }

    public static boolean isRegularFile(String filename) {
        return Files.isRegularFile(Path.of(filename));
    }
    public static boolean isDirectory(String filename) {
        return Files.isDirectory(Path.of(filename));

    }
    public static long size(String filename) throws IOException {
        return Files.size(Path.of(filename));

    }
}
