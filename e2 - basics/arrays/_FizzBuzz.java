package com.nbicocchi.exercises.arrays;

public class _FizzBuzz {
    public static String[] fizzBuzz(int start, int end) {
        String[] b = new String[start - end];
        int j = 1;

        for (int i = start; i < end; i++) {
            if (j % 3 == 0 && j % 5 == 0)
                b[j-1] = "FizzBuzz";
            else if (j % 3 == 0)
                b[j-1] = "Fizz";
            else if (j % 5 == 0)
                b[j-1] = "Buzz";
            else
                b[j-1] = Integer.toString(j);

            j++;
        }

        return b;
    }
}
