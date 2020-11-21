package com.company.Homework64;

public class Point {

    //region Properties

    private double coordinateX;
    private double coordinateY;

    //endregion

    //region Constructors

    public Point() {
    }

    public Point(double coordinateX, double coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    //endregion

    //region Public methods

    public double calculateDistance() {
        return Math.pow((Math.pow(coordinateX, 2) + Math.pow(coordinateY, 2)), 0.5);
    }
    public double calculateDistance(double coordinateX1, double coordinateY1) {
        return Math.pow(Math.pow((coordinateX1 - coordinateX), 2) + Math.pow((coordinateY1 - coordinateY), 2), 0.5);
    }

    //endregion

    //region Getters and Setters

    public double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }

    //endregion
}
