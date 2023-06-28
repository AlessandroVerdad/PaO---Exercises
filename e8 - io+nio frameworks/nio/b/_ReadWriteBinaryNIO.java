package com.nbicocchi.exercises.nio.b;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class _ReadWriteBinaryNIO {
    public static byte[] readBinaryFile(String filename) throws IOException {
        return Files.readAllBytes(Paths.get(filename));
    }

    public static void writeBinaryFile(String filename, byte[] bytes) throws IOException {
        Files.write(Paths.get(filename), bytes);
    }
}
