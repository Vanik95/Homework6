package com.company.Homework62;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.println("Enter the height:");
        rectangle.setHeight(scanner.nextInt());
        System.out.println("Enter the width:");
        rectangle.setWidth(scanner.nextInt());

        System.out.println("The area of rectangle is: " + rectangle.calculateArea());
        System.out.println("The perimeter of rectangle is: " + rectangle.calculatePerimeter());
    }
}
