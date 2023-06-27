package com.nbicocchi.exercises.oop.phonebook;

import java.util.Arrays;

public class _PhoneBookArray implements PhoneBook {

    public static final int MAX_PERSONS = 256;
    Person[] phoneBook;

    public _PhoneBookArray() {
        this.phoneBook = new Person[MAX_PERSONS];
    }

    @Override
    public boolean addPerson(Person person) {
        //  Search for duplicates
        for (int i = 0; i < MAX_PERSONS; i++)
            if (phoneBook[i].equals(person) && phoneBook[i] != null)
                return false;

        for (int i = 0; i < MAX_PERSONS; i++)
            if (phoneBook[i] == null) {
                phoneBook[i] = person;   //  copy between objects

                return true;
            }

        return false;
    }

    @Override
    public boolean removePerson(Person person) {
        for (Person client : phoneBook)
            if (client.equals(person)) {
                client = null;
                return true;
            }

        return false;   //  'person' not found
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        Person[] foundPerson = new Person[MAX_PERSONS];
        int i = 0;

        for (Person client : phoneBook)
            if (client != null)
                if (client.lastname.equals(lastname))
                    foundPerson[i++] = client;  //  copy between objects

        return Arrays.copyOf(foundPerson, i);
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        Person[] foundPerson = new Person[MAX_PERSONS];
        int i = 0;

        for (Person client : phoneBook)
            if (client != null)
                if (client.lastname.equals(lastname) && client.name.equals(name))
                    foundPerson[i++] = client;  //  copy between objects

        return Arrays.copyOf(foundPerson, i);
    }
}
