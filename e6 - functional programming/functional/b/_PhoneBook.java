package com.nbicocchi.exercises.functional.b;

import java.util.List;
import java.util.Optional;

public class _PhoneBook {
    List<Person> phoneBook;

    //  cons
    public void _PhoneBook(List<Person> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public Optional<Person> searchByLastname(String lastname) {
        return phoneBook.stream()
                .filter(p -> p.getLastname().equals(lastname))
                .findFirst();   //  return an 'Optional'
    }

    public Optional<Person> searchByNameAndLastname(String name, String lastname) {
        return phoneBook.stream()
                .filter(p -> p.getLastname().equals(lastname) && p.getName().equals(lastname))
                .findFirst();   //  return an 'Optional'
    }
    //  ##################################
    //  --- Version with Optional class ---
    //  SUCCESS -> return Optional.of(p);
    //  FAIL -> return Optional.empty();
    //  ##################################
    /*
    for (Person p : people) {
            if (p.getLastname().equals(lastname) && p.getName().equals(name)) {
                return Optional.of(p);
            }
        }
        return Optional.empty();
     */

    public class Person {
        String name;
        String lastname;
        String phone;

        public Person(String name, String lastname, String phone) {
            this.name = name;
            this.lastname = lastname;
            this.phone = phone;
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

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }
    }
}
