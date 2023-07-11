package com.nbicocchi.exercises.generics.b;

public class _PairSameType <T>{
    T first;
    T second;

    public void swap() {
        T tmp = first;
        first = second;
        second = tmp;
    }


}
