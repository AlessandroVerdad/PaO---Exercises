package com.nbicocchi.exercises.collections.sets.a;

import java.util.HashSet;
import java.util.Set;

public class _Eratosthenes {

    public static Set<Integer> eratosthenes(int n) {
        Set<Integer> primes = new HashSet<>();
        for (int i = 1; i <= n; i++)
            primes.add(i);

        for (int i = 2; i < Math.sqrt(n); i++)
            primes.removeAll(multiplesOf(i, n));

        return primes;
    }

    public static Set<Integer> multiplesOf(int number, int topBound) {
        Set<Integer> multiples = new HashSet<>();
        for (int i = 2; i * number <= topBound; i++)
            multiples.add(i);

        return multiples;
    }
}
