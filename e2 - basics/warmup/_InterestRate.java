package com.nbicocchi.exercises.warmup;

public class _InterestRate {
    public static void main(String[] args) {
        int nYear = 3;
        double initial = 1000;

        for(int i=0; i<nYear; i++)
        {
            initial = initial * 105/100;
            System.out.println("Balance year " + (i+1) + ": " + initial);
        }
    }
}
