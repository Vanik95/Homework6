package com.company.Homework66;

public class Converter {

    public double convertMetersToMiles(Meters meters) {
        return meters.getMeters() * 0.00062137;
    }
    public double convertMilesToMeters(Miles miles) {
        return miles.getMiles() * 1609.344;
    }
}
