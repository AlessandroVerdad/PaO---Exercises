package com.nbicocchi.exercises.nio.b;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class _FileCreateDelete {
    public static void createFile(String src) throws IOException {
        //  java.io.File
        /*File newFile = new File(src);
        boolean res = newFile.createNewFile();*/

        Files.createFile(Paths.get(src));
    }

    public static void deleteFile(String src) throws IOException {
        //  java.io.File
        /*File newFile = new File(src);
        boolean res = newFile.delete();*/

        Files.deleteIfExists(Paths.get(src));
    }


}
