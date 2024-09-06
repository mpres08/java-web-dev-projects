package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner radiusInput = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        Double radius = radiusInput.nextDouble();
        while (radius <= 0) {
            System.out.print("Incorrect value. Area cannot be found. Try entering a new number: ");
            radius = radiusInput.nextDouble();
        }

        Double area = Circle.getArea(radius);
        System.out.print("The area of the circle with a radius of " + radius + " is: " + area);
    }
}
