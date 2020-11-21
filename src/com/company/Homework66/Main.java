package com.company.Homework66;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();

        System.out.println("Enter the meter value:");
        Meters meters = new Meters(scanner.nextDouble());

        System.out.println("Enter the mile value:");
        Miles miles = new Miles(scanner.nextDouble());

        System.out.println("The " + meters.getMeters() + " meters is " + converter.convertMetersToMiles(meters) + " miles.");
        System.out.println("The " + miles.getMiles() + " miles is " + converter.convertMilesToMeters(miles) + " meters.");

    }
}
