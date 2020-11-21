package com.company.Homework61;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius:");
        Circle circle = new Circle(scanner.nextDouble());

        System.out.println("The area of circle is: " + circle.calculateArea());
        System.out.println("The perimeter of circle is: " + circle.calculatePerimeter());
    }
}
