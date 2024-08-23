package com.freiorio.exercises.oop.phonebook;

public interface PhoneBook {
    int MAX_PERSONS = 256;

    boolean addPerson(Person p);
    boolean removePerson(Person p);
    Person[] searchByLastname(String s);
    Person[] searchByNameAndLastname(String name, String lastname);
}
