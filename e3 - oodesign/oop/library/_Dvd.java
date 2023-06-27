package com.nbicocchi.exercises.oop.library;

public class _Dvd extends Item {
    int length;

    //  constructor
    public _Dvd(String title, int year, int length) {
        super(title, year);
        this.length = length;
    }

    //  getters, setters
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "_Dvds{" +
                "length=" + length +
                '}';
    }
}
