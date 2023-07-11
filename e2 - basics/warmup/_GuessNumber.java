package com.nbicocchi.exercises.warmup;

import java.util.Random;
import java.util.Scanner;

public class _GuessNumber {
    public static void main(String[] args) {

        //  Create random number
        int topBound = 3;
        Random randomSeed = new Random();
        int secretNumber = randomSeed.nextInt(topBound+1);
        double a = randomSeed.nextDouble((double) 4.45, (double)  1.245);

        boolean correct = false;

        Scanner scanner = new Scanner(System.in);

        while (!correct) {

            System.out.print("Guess a number in [0-3]: ");
            int guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("You got it right!");
                correct = true;
            }
            else
                System.out.println("Wrong! Retry...");
        }
    }

}


