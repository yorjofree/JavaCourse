package com.freiorio.exercises.oop.phonebook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookListTest {
    private PhoneBookList phoneBookList;

    @BeforeEach
    void setUp() {
        phoneBookList = new PhoneBookList();
        phoneBookList.addPerson(new Person("roberto", "iorio", "345"));
    }

    @Test
    void addPerson() {
        assertTrue(phoneBookList.addPerson(new Person("francesco", "iorio", "366")));
        assertTrue(phoneBookList.addPerson(new Person("francesco", "rossi", "366")));
        assertFalse(phoneBookList.addPerson(new Person("francesco", "iorio", "366")));
    }

    @Test
    void removePerson() {
        assertFalse(phoneBookList.removePerson(new Person("francesco", "iorio", "366")));
        assertTrue(phoneBookList.removePerson(new Person("roberto", "iorio", "345")));
        assertFalse(phoneBookList.removePerson(new Person("luisa", "cipolla", "347")));
    }

    @Test
    void searchByLastname() {
        Person[] p = new Person[]{
                new Person("roberto", "iorio", "345"),
                new Person("francesco", "iorio", "366")
        };
        phoneBookList.addPerson(new Person("luisa", "cipolla", "347"));
        phoneBookList.addPerson(new Person("francesco", "iorio", "366"));
        assertArrayEquals(p, phoneBookList.searchByLastname("iorio"));
        phoneBookList.removePerson(new Person("luisa", "cipolla", "347"));
        assertArrayEquals(p, phoneBookList.searchByLastname("iorio"));
    }

    @Test
    void searchByNameAndLastname() {
        Person[] p = new Person[]{
                new Person("francesco", "iorio", "366"),
                new Person("francesco", "iorio", "345")
        };
        phoneBookList.addPerson(new Person("francesco", "iorio", "366"));
        phoneBookList.addPerson(new Person("francesco", "iorio", "345"));
        assertArrayEquals(p, phoneBookList.searchByNameAndLastname("francesco", "iorio"));
        phoneBookList.removePerson(new Person("roberto", "iorio", "345"));
        assertArrayEquals(p, phoneBookList.searchByNameAndLastname("francesco", "iorio"));
    }
}