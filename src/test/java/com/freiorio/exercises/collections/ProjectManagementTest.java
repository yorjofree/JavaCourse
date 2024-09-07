package com.freiorio.exercises.collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ProjectManagementTest {
    private Project project;
    private Employee employee;
    private Task task;

    @BeforeEach
    void setUp() {
        project = new Project("test", LocalDate.of(2024, 9, 6), LocalDate.of(2025, 12, 31));
        employee = new Employee("francesco", "iorio", "003");
        task = new Task("sample task", 7);
        project.addTask(task);
    }

    @Test
    void getTasks() {
        assertIterableEquals(new HashSet<>(Set.of(new Task("sample task", 7))), project.getTasks());
    }

    @Test
    void addTask() {
        project.addTask(new Task("prova", 2));
        Task secondTask = new Task("prova", 2);
        secondTask.setProject(new Project("test", LocalDate.of(2024, 9, 6), LocalDate.of(2025, 12, 31)));
        assertIterableEquals(new HashSet<>(Set.of(secondTask, new Task("sample task", 7))), project.getTasks());
    }

    @Test
    void removeTask() {
        project.removeTask(task);
        assertIterableEquals(new HashSet<>(), project.getTasks());
    }
}