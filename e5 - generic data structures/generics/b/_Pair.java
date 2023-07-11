package com.nbicocchi.exercises.generics.b;


public class _Pair<K, V> {
    K first;
    V second;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public _Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public K getFirst() {
        return first;
    }

    public void setFirst(K first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }
}


