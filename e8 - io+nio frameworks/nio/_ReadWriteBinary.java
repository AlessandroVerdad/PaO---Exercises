package com.nbicocchi.exercises.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class _ReadWriteBinary {
    public static byte[] readBinaryFile(String filename) throws IOException
    {
        Path dstPath = Paths.get(filename);
        return Files.readAllBytes(dstPath);
    }

    public static void writeBinaryFile(String filename, byte[] bytes) throws IOException
    {
        Path dstPath = Paths.get(filename);
        Files.write(dstPath, bytes);
    }
    
}
