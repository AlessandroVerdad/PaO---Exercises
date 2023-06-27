package com.nbicocchi.exercises.oop.library;

import java.util.Objects;

public class _Person {
    String id;
    String name;
    String lastname;

    //  constructor
    public _Person(String id, String name, String lastname) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
    }

    //  setters, getters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    //  overrides
    @Override
    public String toString() {
        return "_Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        _Person person = (_Person) o;

        if (!id.equals(person.id)) return false;
        if (!name.equals(person.name)) return false;
        return lastname.equals(person.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, id);
    }
}
