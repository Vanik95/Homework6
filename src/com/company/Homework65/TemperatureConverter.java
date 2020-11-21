package com.company.Homework65;

public class TemperatureConverter {

    public double convertCelsiusToFahrenheit(Celsius celsius) {
        return celsius.getCelsius() * 1.8 + 32;
    }

    public double convertCelsiusToKelvin(Celsius celsius) {
        return celsius.getCelsius() + 273.15;
    }

    public double convertFahrenheitToCelsius(Fahrenheit fahrenheit) {
        return (fahrenheit.getFahrenheit() - 32) * 5 / 9;
    }

    public double convertFahrenheitToKelvin(Fahrenheit fahrenheit) {
        return (fahrenheit.getFahrenheit() - 32) * 5 / 9 + 273.15;
    }

    public double convertKelvinToCelsius(Kelvin kelvin) {
        return kelvin.getKelvin() - 273.15;
    }

    public double convertKelvinToFahrenheit(Kelvin kelvin) {
        return (kelvin.getKelvin() - 273.15) * 9 / 5 + 273;
    }
}
