package com.company.Homework62;

public class Rectangle {

    //region Properties

    private int height;
    private int width;

    //endregion

    //region Constructors

    public Rectangle() {
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    //endregion

    //region Public methods

    public int calculatePerimeter() {
        return 2 * (height + width);
    }
    public int calculateArea() {
        return height * width;
    }

    //endregion

    //region Getters and Setters

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    //endregion
}
