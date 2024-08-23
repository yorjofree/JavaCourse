package com.freiorio.exercises.oop.phonebook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookArrayTest {
    private PhoneBookArray phoneBookArray;

    @BeforeEach
    void setUp() {
        phoneBookArray = new PhoneBookArray();
    }

    @Test
    void addPerson() {
        assertTrue(phoneBookArray.addPerson(new Person("Francesco", "Iorio", "3663342706")));
        assertFalse(phoneBookArray.addPerson(new Person("Francesco", "Iorio", "3663342706")));
    }

    @Test
    void removePerson() {
        Person[] p = new Person[]{
                new Person("Francesco", "Iorio", "366"),
                new Person("Roberto", "Iorio", "345"),
                new Person("Luisa", "Cipolla", "347")
        };
        for (Person person : p) {
            phoneBookArray.addPerson(person);
        }
        assertTrue(phoneBookArray.removePerson(new Person("Roberto", "Iorio", "345")));
        assertFalse(phoneBookArray.removePerson(new Person("Roberto", "Iorio", "345")));
        assertFalse(phoneBookArray.removePerson(new Person("Francesco", "Iorio", "345")));
    }

    @Test
    void searchByLastname() {
        Person p = new Person("Francesco", "Iorio", "366");
        phoneBookArray.addPerson(p);
        assertArrayEquals(new Person[]{p}, phoneBookArray.searchByLastname("Iorio"));
        assertArrayEquals(new Person[0], phoneBookArray.searchByLastname("Cipolla"));
        phoneBookArray.removePerson(p);
        assertArrayEquals(new Person[0], phoneBookArray.searchByLastname("Iorio"));
    }

    @Test
    void searchByNameAndLastname() {
        Person[] p = new Person[]{
                new Person("Francesco", "Iorio", "366"),
                new Person("Roberto", "Iorio", "345"),
                new Person("Luisa", "Cipolla", "347")
        };
        for (Person person : p) {
            phoneBookArray.addPerson(person);
        }
        assertArrayEquals(new Person[]{new Person("Francesco", "Iorio", "366")}, phoneBookArray.searchByNameAndLastname("Francesco", "Iorio"));
        assertArrayEquals(new Person[0], phoneBookArray.searchByNameAndLastname("Gennaro", "Cipolla"));
        phoneBookArray.removePerson(new Person("Roberto", "Iorio", "345"));
        assertArrayEquals(new Person[0], phoneBookArray.searchByNameAndLastname("Roberto", "Iorio"));
    }
}