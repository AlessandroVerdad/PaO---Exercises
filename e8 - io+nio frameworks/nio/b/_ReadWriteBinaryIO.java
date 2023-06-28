package com.nbicocchi.exercises.nio.b;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _ReadWriteBinaryIO {
    public static byte[] readBinaryFile(String filename) throws IOException {
        try (FileInputStream f = new FileInputStream(filename)) {
            return f.readAllBytes();
        }
    }

    public static void writeBinaryFile(String filename, byte[] bytes) throws IOException {
        try (FileOutputStream f = new FileOutputStream(filename)) {
            f.write(bytes);
        }


    }
}
