package com.freiorio.exercises.oop.phonebook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook {
    private final ArrayList<Person> phoneBook;

    public PhoneBookList() {
        phoneBook = new ArrayList<>();
    }

    @Override
    public boolean addPerson(Person p) {
        if (phoneBook.contains(p)) {
            return false;
        }
        if (phoneBook.size() >= MAX_PERSONS) {
            return false;
        }
        return phoneBook.add(p);
    }

    @Override
    public boolean removePerson(Person p) {
        return phoneBook.remove(p);
    }

    @Override
    public Person[] searchByLastname(String s) {
        ArrayList<Person> tmp = new ArrayList<>();
        for (Person person : phoneBook) {
            if (person.getLastname().equals(s)) {
                tmp.add(person);
            }
        }
        return tmp.toArray(new Person[]{});
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        ArrayList<Person> tmp = new ArrayList<>();
        for (Person person : phoneBook) {
            if (person.getName().equals(name) && person.getLastname().equals(lastname)) {
                tmp.add(person);
            }
        }
        return tmp.toArray(new Person[0]);
    }
}
