package com.nbicocchi.exercises.oop.shape;

import java.awt.*;

public class _Circle extends AbstractShape{
    Point centre;
    double radius;

    /**
     * Constructs a shape with the specified id, and color
     *
     * @param id    the id to be assigned to the shape
     * @param color the color to be assigned to the shape
     */
    //  constructor
    public _Circle(String id, String color, Point centre, double radius) {
        super(id, color);
        this.centre = centre;
        this.radius = radius;
    }

    //  getters, setters
    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //  overrides
    @Override
    public double getPerimeter() {
        return 2*radius*Math.PI;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public void move(Point movement) {
        centre.translate(movement.x, movement.y);
    }

    @Override
    public void resize(double scale) {
        radius*=scale;
    }

    @Override
    public String toString() {
        return "_Cirle{" +
                "centre=" + centre +
                ", radius=" + radius +
                ", id='" + id + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
