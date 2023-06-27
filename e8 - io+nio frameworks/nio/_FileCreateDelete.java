package com.nbicocchi.exercises.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class _FileCreateDelete {
    public static void createFile(String src) throws IOException
    {
        /*File newFile = new File(src);
        boolean result = newFile.createNewFile();*/

        Files.createFile(Paths.get(src));
    }
    public static void deleteFile(String src) throws IOException
    {
        /*File newFile = new File(src);
        boolean result = newFile.delete();*/

        Files.deleteIfExists(Paths.get(src));
    }

}
