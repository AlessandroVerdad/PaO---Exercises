package com.nbicocchi.exercises.collections.lists.c;

import java.util.ArrayList;
import java.util.List;

public class _SpeedTest {

    public static long insertBeginning(List<String> list, String item, int times) {
        long start = System.nanoTime();

        for (int i = 0; i < times; i++) {
            list.add(0, item);
        }
        
        return System.nanoTime() - start;
    }
    public static long insertEnd(List<String> list, String item, int times) {
        long start = System.nanoTime();

        for (int i = 0; i < times; i++) {
            list.add(list.size()-1, item);
        }

        return System.nanoTime() - start;
    }

    public static void main(String[] args) {
        List<String> testArray = new ArrayList<>();
        List<String> testLinked = new ArrayList<>();

        int n = 1000;

        long headArray = insertBeginning(testArray, "Hello", n);
        long tailArray = insertEnd(testArray, "Hello", n);

        long headLinked = insertBeginning(testLinked, "Hello", n);
        long tailLinked = insertEnd(testLinked, "Hello", n);

        System.out.println("\nArrayList:\n");
        System.out.println("- head 10000 times:\t" + headArray);
        System.out.println("- tail 10000 times:\t" + tailArray);

        System.out.println("\nLinkedList:\n");
        System.out.println("- head 10000 times:\t" + headLinked);
        System.out.println("- tail 10000 times:\t" + tailLinked);


    }
}
