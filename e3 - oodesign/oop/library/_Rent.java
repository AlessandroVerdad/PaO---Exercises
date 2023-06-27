package com.nbicocchi.exercises.oop.library;

import java.time.LocalDate;
import java.util.Objects;

public class _Rent {
    Item item;
    Person renter;
    LocalDate begin;
    LocalDate end;

    //  constructor
    public _Rent(Item item, Person renter, LocalDate begin, LocalDate end) {
        this.item = item;
        this.renter = renter;
        this.begin = begin;
        this.end = end;
    }

    //  getters, setters
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Person getRenter() {
        return renter;
    }

    public void setRenter(Person renter) {
        this.renter = renter;
    }

    public LocalDate getBegin() {
        return begin;
    }

    public void setBegin(LocalDate begin) {
        this.begin = begin;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    //  -- custom --
    public boolean isExpired(LocalDate today) {
        return today.isAfter(this.end);
    }

    //  overrides
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        _Rent rents = (_Rent) o;

        if (item != null ? !item.equals(rents.item) : rents.item != null) return false;
        if (renter != null ? !renter.equals(rents.renter) : rents.renter != null) return false;
        if (begin != null ? !begin.equals(rents.begin) : rents.begin != null) return false;
        return end != null ? end.equals(rents.end) : rents.end == null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(begin, end, item, renter);
    }

    @Override
    public String toString() {
        return "_Rents{" +
                "item=" + item +
                ", renter=" + renter +
                ", begin=" + begin +
                ", end=" + end +
                '}';
    }
}
