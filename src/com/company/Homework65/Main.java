package com.company.Homework65;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Celsius celsius = new Celsius();
        System.out.println("Enter the celsius temperature: ");
        celsius.setCelsius(scanner.nextDouble());

        Fahrenheit fahrenheit = new Fahrenheit();
        System.out.println("Enter the fahrenheit temperature: ");
        fahrenheit.setFahrenheit(scanner.nextDouble());

        Kelvin kelvin = new Kelvin();
        System.out.println("Enter the kelvin temperature: ");
        kelvin.setKelvin(scanner.nextDouble());

        TemperatureConverter converter = new TemperatureConverter();
        System.out.println("The " + celsius.getCelsius() + " degree of celsius is " + converter.convertCelsiusToFahrenheit(celsius) + " degree of fahrenheit.");
        System.out.println("The " + celsius.getCelsius() + " degree of celsius is " + converter.convertCelsiusToKelvin(celsius) + " degree of kelvin.");
        System.out.println("The " + fahrenheit.getFahrenheit() + " degree of fahrenheit is " + converter.convertFahrenheitToCelsius(fahrenheit) + " degree of celsius.");
        System.out.println("The " + fahrenheit.getFahrenheit() + " degree of fahrenheit is " + converter.convertFahrenheitToKelvin(fahrenheit) + " degree of kelvin.");
        System.out.println("The " + kelvin.getKelvin() + " degree of kelvin is " + converter.convertKelvinToCelsius(kelvin) + " degree of celsius.");
        System.out.println("The " + kelvin.getKelvin() + " degree of kelvin is " + converter.convertKelvinToFahrenheit(kelvin) + " degree of fahrenheit.");
    }
}
