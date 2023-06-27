package com.nbicocchi.exercises.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class _FileCopyMove {
    public static void fileCopy(String src, String dst) throws IOException
    {
        Files.copy(Paths.get(src), Paths.get(dst), StandardCopyOption.REPLACE_EXISTING);
    }
    public static void fileMove(String src, String dst) throws IOException
    {
        /*File srcFile = new File(src);
        File dstFile = new File(dst);

        boolean result = srcFile.renameTo(dstFile);*/

        Files.move(Paths.get(src), Paths.get(dst), StandardCopyOption.REPLACE_EXISTING);
    }
    

}
