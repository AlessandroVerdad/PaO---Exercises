package com.nbicocchi.exercises.oop.shape;

import java.awt.*;

public class _Rectangle extends AbstractShape{
    Point bottomRight;
    Point upperLeft;

    /**
     * Constructs a shape with the specified id, and color
     *
     * @param id    the id to be assigned to the shape
     * @param color the color to be assigned to the shape
     */
    //  constructor
    public _Rectangle(String id, String color, Point bottomRight, Point upperLeft) {
        super(id, color);
        this.bottomRight = bottomRight;
        this.upperLeft = upperLeft;
    }

    //  getters, setters
    @Override
    public double getPerimeter() {
        return 2 * ((upperLeft.y - bottomRight.y) + (bottomRight.x - upperLeft.x));
    }

    @Override
    public double getArea() {
        return (upperLeft.y - bottomRight.y) * (bottomRight.x - upperLeft.x);
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }

    public Point getUpperLeft() {
        return upperLeft;
    }

    public void setUpperLeft(Point upperLeft) {
        this.upperLeft = upperLeft;
    }

    //  overrides
    @Override
    public void move(Point movement) {
        upperLeft.translate(movement.x, movement.y);
        bottomRight.translate(movement.x, movement.y);
    }

    @Override
    public void resize(double scale) {
        bottomRight.x += (int) (scale-1) * (bottomRight.x - upperLeft.x);
        bottomRight.y -= (int) (scale-1) * (upperLeft.y - bottomRight.y);
    }

    @Override
    public String toString() {
        return "_Rectangle{" +
                "bottomRight=" + bottomRight +
                ", upperLeft=" + upperLeft +
                ", id='" + id + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
