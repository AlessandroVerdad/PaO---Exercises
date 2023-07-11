package com.nbicocchi.exercises.nio.c;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _ReadWriteBinary_IO {
    public static byte[] readBinaryFile(String filename) throws IOException {
        try(FileInputStream fis = new FileInputStream(filename))
        {
            return fis.readAllBytes();
        }
    }
    public static void writeBinaryFile(String filename, byte[] bytes) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(filename)) {
            fos.write(bytes);
        }
    }
}
