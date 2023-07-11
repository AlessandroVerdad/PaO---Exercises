package com.nbicocchi.exercises.oop.phonebook;

import java.util.ArrayList;

public class _PhoneBookList implements PhoneBook {
    public static final int MAX_PERSONS = 256;
    final ArrayList<Person> phoneBook;

    public _PhoneBookList() {
        phoneBook = new ArrayList<>();
    }

    @Override
    public boolean addPerson(Person person) {
        if (person == null || phoneBook.size() >= MAX_PERSONS)
            return false;

        phoneBook.add(person);
        return true;
    }

    @Override
    public boolean removePerson(Person person) {
        return phoneBook.remove(person);   //  already returns a boolean
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        ArrayList<Person> foundPerson = new ArrayList<>();

        for (Person person : phoneBook)
            if (person != null && person.lastname.equals(lastname))
                foundPerson.add(person);

        return foundPerson.toArray(new Person[]{});
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        ArrayList<Person> foundPerson = new ArrayList<>();

        for (Person person : phoneBook)
            if (person != null && person.lastname.equals(lastname) && person.name.equals(name))
                foundPerson.add(person);

        return foundPerson.toArray(new Person[]{});
    }
}
