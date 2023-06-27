package com.nbicocchi.exercises.oop.basic;

import java.awt.*;
import java.util.Arrays;

public class _Polygon {

    Point[] vertices;

    public _Polygon(Point[] vertices) {
        this.vertices = vertices;
    }

    public int getVerticesCount() {
        return vertices.length;
    }

    public double getPerimeter() {
        double per = 0;
        for (int i = 0; i < vertices.length - 1; i++)
            per += Math.hypot((vertices[i].x - vertices[i + 1].x), (vertices[i].y - vertices[i + 1].y));

        return per;
    }

    public double getArea() {
        double area = 0;
        for (int i = 0; i < vertices.length - 1; i++)
            area += (vertices[i + 1].x * vertices[i].y) - (vertices[i + 1].y * vertices[i].x);

        return area;
    }

    @Override
    public String toString() {
        return "_Polygon{" +
                "vertices=" + Arrays.toString(vertices) +
                '}';
    }
}
