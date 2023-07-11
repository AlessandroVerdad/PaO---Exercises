package com.nbicocchi.exercises.functional.c;

import java.util.List;
import java.util.Optional;

public class _PhoneBook {
    public class Person {
        String name;
        String lastname;
        String phone;
    }

    List<Person> phoneBook;

    public _PhoneBook(List<Person> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public Optional<Person> searchByLastname(String lastname) {
        return phoneBook.stream().filter(p -> p.lastname.equals(lastname)).findFirst();
    }
    public Optional<Person> searchByNameAndLastname(String name, String lastname) {
        return phoneBook.stream()
                .filter(p -> p.lastname.equals(lastname) && p.name.equals(name))
                .findFirst();
    }
}
