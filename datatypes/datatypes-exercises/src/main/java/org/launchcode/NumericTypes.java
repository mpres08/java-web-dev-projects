package org.launchcode;
import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Rectangle length: ");
        double length = input.nextDouble();

        System.out.print("Rectangle width: ");
        double width = input.nextDouble();

       double area = length * width;
       System.out.print("The area of the rectangle is " + area);
    }

}
