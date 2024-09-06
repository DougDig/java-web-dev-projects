package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Miles Driven?:");
        Double miles = input.nextDouble();
        System.out.println("Gallons Used?:");
        Double gallons = input.nextDouble();
        System.out.println("Mpg is: " + miles / gallons);
    }
}
