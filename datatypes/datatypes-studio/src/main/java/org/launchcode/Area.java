package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of your favorite circle?: ");
        double radius = input.nextDouble();
        double area = Circle.getArea(radius);
        System.out.println("The radius of your circle is: " + area);
    }
}
