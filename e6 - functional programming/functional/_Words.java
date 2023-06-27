package com.nbicocchi.exercises.functional;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class _Words {
    String filename = "james-joyce-ulysses.txt";

    //  read file -> convert 2 List<String>
    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }

    //  da 1 linea -> n parole (List<String>)
    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }


    public static long howManyLines(String filename, String subString) throws IOException {
        List<String> bookLines = getLines(filename);    //  get lines
        return bookLines.stream().filter(s -> s.contains(subString)).count();

    }

    public static long howManyTimes(String filename, String word) throws IOException {
        List<String> bookLines = getLines(filename);
        /*
        TODO
         */
        return -1;
    }

}
