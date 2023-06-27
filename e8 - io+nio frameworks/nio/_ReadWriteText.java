package com.nbicocchi.exercises.nio;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class _ReadWriteText {
    public static List<String> readTextFile(String filename) throws IOException
    {
        Path srcPath = Paths.get(filename);
        return Files.readAllLines(srcPath, StandardCharsets.UTF_8);
    }

    public static <T extends CharSequence> void writeTextFile(String filename, List<T> lines) throws IOException
    {
        Path dstPath = Paths.get(filename);
        Files.write(dstPath, lines);
    }

}
