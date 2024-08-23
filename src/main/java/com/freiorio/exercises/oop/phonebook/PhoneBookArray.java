package com.freiorio.exercises.oop.phonebook;

import java.util.Arrays;

public class PhoneBookArray implements PhoneBook {
    private final Person[] phoneBook;

    public PhoneBookArray() {
        phoneBook = new Person[PhoneBook.MAX_PERSONS];
        Arrays.fill(phoneBook, null);
    }

    @Override
    public boolean addPerson(Person p) {
        for (Person person : phoneBook) {
            if (person != null && person.equals(p)) {
                return false;
            }
        }
        for (int i = 0; i < phoneBook.length; i++) {
            if (phoneBook[i] == null) {
                phoneBook[i] = new Person(p.getName(), p.getLastname(), p.getPhone());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removePerson(Person p) {
        for (int i = 0; i < phoneBook.length; i++) {
            if (phoneBook[i] != null && phoneBook[i].equals(p)) {
                phoneBook[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Person[] searchByLastname(String s) {
        Person[] p = new Person[0];
        for (Person person : phoneBook) {
            if (person != null && person.getLastname().equals(s)) {
                p = Arrays.copyOf(p, p.length + 1);
                p[p.length-1] = new Person(person.getName(), person.getLastname(), person.getPhone());
            }
        }
        return p;
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        Person[] p = new Person[0];
        for (Person person : phoneBook) {
            if (person != null && person.getName().equals(name) && person.getLastname().equals(lastname)) {
                p = Arrays.copyOf(p, p.length + 1);
                p[p.length-1] = new Person(person.getName(), person.getLastname(), person.getPhone());
            }
        }
        return p;
    }
}
