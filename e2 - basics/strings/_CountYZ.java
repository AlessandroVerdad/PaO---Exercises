package com.nbicocchi.exercises.strings;

public class _CountYZ {
    public static int countYZ(String string) {
        int countYZ = 0;

        for (int i = 1; i < string.length(); i++) {
            StringBuilder evaluate = new StringBuilder();

            String a = String.valueOf(string.charAt(i - 1));
            String b = String.valueOf(string.charAt(i));

            evaluate.append(a).append(b);

            if (evaluate.toString().equals("y ") || evaluate.toString().equals("Z ") || evaluate.toString().equals("Y "))
                countYZ++;
        }

        return countYZ;
    }


}
