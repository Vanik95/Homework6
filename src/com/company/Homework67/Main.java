package com.company.Homework67;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Dram dram = new Dram();
        System.out.println("Enter the dram value:");
        dram.setDram(scanner.nextDouble());

        Ruble ruble = new Ruble();
        System.out.println("Enter the ruble value:");
        ruble.setRuble(scanner.nextDouble());

        Dollar dollar = new Dollar();
        System.out.println("Enter the dollar value:");
        dollar.setDollar(scanner.nextDouble());

        Converter converter = new Converter();
        System.out.println("The " + dram.getDram() + " drams is " + converter.convertDramToRuble(dram) + " rubles.");
        System.out.println("The " + dram.getDram() + " drams is " + converter.convertDramToDollar(dram) + " dollars.");
        System.out.println("The " + ruble.getRuble() + " rubles is " + converter.convertRubleToDram(ruble) + " drams.");
        System.out.println("The " + ruble.getRuble() + " rubles is " + converter.convertRubleToDollar(ruble) + " dollars.");
        System.out.println("The " + dollar.getDollar() + " dollars is " + converter.convertDollarToDram(dollar) + " drams.");
        System.out.println("The " + dollar.getDollar() + " dollars is " + converter.convertDollarToRuble(dollar) + " rubles.");
    }
}