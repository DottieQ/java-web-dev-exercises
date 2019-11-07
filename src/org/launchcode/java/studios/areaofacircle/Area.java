package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of a circle:");
        double radius = input.nextInt();
//        double pi = 3.14;
//        double area = pi * radius * radius;
        double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius "
                + radius + " is: " + area);
        }
    }
