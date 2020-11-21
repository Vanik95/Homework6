package com.company.Homework63;

public class Triangle {

    //region Properties

    private double sideA;
    private double sideB;
    private double sideC;

    //endregion

    //region Constructors

    public Triangle() {
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    //endregion

    //region Public methods

    public boolean checkingTriangleValidation() {
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideC + sideB > sideA) {
            return true;
        } else {
            return false;
        }
    }

    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    public double calculateArea() {
        return Math.pow(calculatePerimeter() * ((calculatePerimeter() - sideA) * (calculatePerimeter() - sideB) * (calculatePerimeter() - sideC)), 0.5);
    }

    //endregion

    //region Getters and Setters

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    //endregion

}
