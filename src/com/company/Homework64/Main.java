package com.company.Homework64;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Point point = new Point();
        System.out.println("Enter the X coordinate:");
        point.setCoordinateX(scanner.nextDouble());
        System.out.println("Enter the Y coordinate:");
        point.setCoordinateY(scanner.nextDouble());

        System.out.println("The distance between our point and (0;0) point is: " + point.calculateDistance());

        System.out.println("The distance between our point and the second point is: " + point.calculateDistance(103,330));
    }
}