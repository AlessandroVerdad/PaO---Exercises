package com.nbicocchi.exercises.collections.maps;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _WordFrequency {
    String filename = "james-joyce-ulysses.txt";

    public static Map<String, Integer> wordFrequency(String filename) throws IOException {
        Map<String, Integer> frequency = new HashMap<>();

        for (String line : getLines(filename))
            for (String word : lineToWords(line)) {
                if (frequency.containsKey(word))
                    frequency.put(word, frequency.get(word) + 1);
                else
                    frequency.put(word, 1);
            }

        return frequency;
    }


    //  Read file -> transform it into 'List<String>'
    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }

    //  Split a String into list of words 'List<String>'
    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }
}
