package com.freiorio.exercises.oop.basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.geom.Point2D;

import static org.junit.jupiter.api.Assertions.*;

class PolygonTest {
    private Polygon p;

    @BeforeEach
    void setUp() {
        Point2D.Double[] vertices = {new Point2D.Double(0,0), new Point2D.Double(3,0), new Point2D.Double(3,3), new Point2D.Double(0,3)};
        p = new Polygon(vertices);
    }

    @Test
    void getVerticesCount() {
        assertEquals(4, p.getVerticesCount());
    }

    @Test
    void getPerimeter() {
        assertEquals(12.0, p.getPerimeter());
    }

    @Test
    void getArea() {
        assertEquals(9.0, p.getArea());
    }

    @Test
    void testToString() {
        assertEquals("Polygon{vertices=[Point2D.Double[0.0, 0.0], Point2D.Double[3.0, 0.0], Point2D.Double[3.0, 3.0], Point2D.Double[0.0, 3.0]]}", p.toString());
    }
}