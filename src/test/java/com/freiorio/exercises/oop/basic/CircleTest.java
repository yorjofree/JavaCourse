package com.freiorio.exercises.oop.basic;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getCenter() {
        assertEquals(new Point(2,3), new Circle(4, new Point(2,3)).getCenter());
    }

    @Test
    void getRadius() {
        assertEquals(4, new Circle(4, new Point(2,3)).getRadius());
    }

    @Test
    void setCenter() {
        Circle c = new Circle(4, new Point(0,0));
        c.setCenter(new Point(2,3));
        assertEquals(new Point(2,3), c.getCenter());
    }

    @Test
    void setRadius() {
        Circle c = new Circle(0, new Point(2,3));
        c.setRadius(4);
        assertEquals(4, c.getRadius());
    }

    @Test
    void getPerimeter() {
        assertEquals(25.1327, new Circle(4,new Point(2,3)).getPerimeter(), 0.0001);
    }

    @Test
    void getArea() {
        assertEquals(50.2655, new Circle(4,new Point(2,3)).getArea(), 0.0001);
    }

    @Test
    void contains() {
        assertTrue(new Circle(4,new Point(0,0)).contains(new Point(-2,-2)));
        assertFalse(new Circle(4,new Point(0,0)).contains(new Point(4, -4)));
    }

    @Test
    void translate() {
        Circle c = new Circle(4, new Point(1,1));
        c.translate(-2,-3);
        assertEquals(new Circle(4, new Point(-1, -2)).getCenter(), c.getCenter());
    }

    @Test
    void testToString() {
        assertEquals("Circle{center=(2.0, 3.0), radius=4}", new Circle(4, new Point(2,3)).toString());
    }
}