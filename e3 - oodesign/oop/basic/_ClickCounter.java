package com.nbicocchi.exercises.oop.basic;

public class _ClickCounter {

    int value = 0;

    public _ClickCounter(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void click() {
        value++;
    }

    public void undo() {
        value = Math.max(value - 1, 0);     //  prevents the value to go below 0
    }

    public void reset() {
        value = 0;
    }
}
