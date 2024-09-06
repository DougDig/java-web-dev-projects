package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double radius = 0;
        do {
            try {
                System.out.println("What is the radius of your favorite circle?: ");
                radius = input.nextDouble();
            }
            catch (Exception e)
            {
                System.out.println("Wrong data type you naughty monkey");
                break;
            }
        } while (radius == 0 || radius < 0);
        double area = Circle.getArea(radius);
        System.out.println("The radius of your circle is: " + area);
    }
}
