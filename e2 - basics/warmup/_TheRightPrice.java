package com.nbicocchi.exercises.warmup;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class _TheRightPrice {
    public static void main(String[] args) {

        //  Create random number

        Random random = new Random();
        int price = random.nextInt(100+1);
        Scanner scn = new Scanner(System.in);

        //  Input
        System.out.print("UserA: enter your guessed price [0-100]: ");
        int guessA = scn.nextInt();


        System.out.print("UserB: enter your guessed price [0-100]: ");
        int guessB = scn.nextInt();

        if (Math.abs(price-guessA) < Math.abs(price-guessB))
            System.out.println("User A got the closest one!");
        else
            System.out.println("User A got the closest one!");

        System.out.println("Secret number: " + price);

    }
}
