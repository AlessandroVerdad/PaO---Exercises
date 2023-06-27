package com.nbicocchi.exercises.warmup;

import java.util.Scanner;

public class _MonkeyTrouble {
    public static void main(String[] args) {
        boolean aSmile = true;
        boolean bSmile = false; //  set them differently to enter the loop

        Scanner scn = new Scanner(System.in);

        while (aSmile != bSmile) {
            System.out.print("is moneky A smiling? ('true'/'false'): ");
            aSmile = scn.nextBoolean();

            System.out.print("is moneky B smiling? ('true'/'false'): ");
            bSmile = scn.nextBoolean();

            if (aSmile ==  bSmile)
                System.out.println("We have a problem!...");
            else
                System.out.println("We're good!...");
        }
    }
}
