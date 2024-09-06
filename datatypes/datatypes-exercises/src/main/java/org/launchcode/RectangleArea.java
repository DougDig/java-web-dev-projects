package org.launchcode;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Length of Rectangle?:");
        int length = input.nextInt();
        System.out.println("Width of Rectangle?:");
        int width = input.nextInt();
        System.out.println("Area is: " + length * width);
    }
}
