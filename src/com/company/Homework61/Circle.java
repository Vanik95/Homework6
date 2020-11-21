package com.company.Homework61;

public class Circle {

    //region Properties

    private double radius;

    //endregion

    //region Constructors

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    //endregion

    //region Public methods

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    //endregion

    //region Getters and Setters

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //endregion
}
