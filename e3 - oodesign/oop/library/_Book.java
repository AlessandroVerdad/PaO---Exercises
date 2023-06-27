package com.nbicocchi.exercises.oop.library;

public class _Book extends Item {
    int pages;

    //  Constructor
    public _Book(String title, int year, int pages) {
        super(title, year);
        this.pages = pages;
    }

    //  getters, setters
    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "_Book{" +
                "pages=" + pages +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}
