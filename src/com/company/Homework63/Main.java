package com.company.Homework63;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sides A, B and C:");
        Triangle triangle = new Triangle(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());

        if (triangle.checkingTriangleValidation()) {
            System.out.println("The perimeter is: " + triangle.calculatePerimeter());
            System.out.println("The area is: " + triangle.calculateArea());
        } else {
            System.out.println("The triangle is not valid.");
        }
    }
}
