package com.company.Homework67;

public class Converter {

    public double convertDramToRuble(Dram dram) {
        return dram.getDram() * 0.158;
    }

    public double convertDramToDollar(Dram dram) {

        return dram.getDram() * 0.002;
    }

    public double convertRubleToDram(Ruble ruble) {
        return ruble.getRuble() * 6.33;
    }

    public double convertRubleToDollar(Ruble ruble) {
        return ruble.getRuble() * 0.013;
    }

    public double convertDollarToDram(Dollar dollar) {

        return dollar.getDollar() * 481.6;
    }

    public double convertDollarToRuble(Dollar dollar) {

        return dollar.getDollar() * 76.08;
    }
}
