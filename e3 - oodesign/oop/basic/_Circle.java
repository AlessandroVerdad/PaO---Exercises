package com.nbicocchi.exercises.oop.basic;

import java.awt.*;

public class _Circle {
    int radius;
    Point center;

    public _Circle(int radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public boolean contains(Point point) {
        return Math.hypot((point.x - center.x), (point.y - center.y)) <= radius;
    }

    public void translate(int dx, int dy) {
        center.translate(dx, dy);
    }

    @Override
    public String toString() {
        return "_Circle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}

