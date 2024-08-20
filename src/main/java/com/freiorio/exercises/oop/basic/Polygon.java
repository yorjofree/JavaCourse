package com.freiorio.exercises.oop.basic;

import java.awt.geom.Point2D;
import java.util.Arrays;

public class Polygon {
    private final Point2D.Double[] vertices;

    public Polygon(Point2D.Double[] vertices) {
        if (vertices.length < 3) {
            throw new IllegalArgumentException("Al least three vertices are required");
        }
        this.vertices = vertices;
    }

    public int getVerticesCount() {
        return vertices.length;
    }

    public double getPerimeter() {
        double perimeter = vertices[0].distance(vertices[vertices.length-1]);
        for (int i = 1; i < vertices.length; i++) {
            perimeter += vertices[i].distance(vertices[i-1]);
        }
        return perimeter;
    }

    public double getArea() {
        double areaX2 = vertices[0].getX() * vertices[vertices.length-1].getY() - vertices[0].getY() * vertices[vertices.length-1].getX();
        for (int i = 1; i < vertices.length; i++) {
            areaX2 += vertices[i].getX() * vertices[i-1].getY() - vertices[i].getY() * vertices[i-1].getX();
        }
        return Math.abs(areaX2) / 2.0;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "vertices=" + Arrays.toString(vertices) +
                '}';
    }
}
