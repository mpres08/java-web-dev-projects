package org.launchcode;
import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Miles driven: ");
        double miles = input.nextDouble();

        System.out.print("Gallons of gas used: ");
        double gas = input.nextDouble();

        double gasMileage = miles / gas;
        System.out.print("You are getting " + gasMileage + " mpg");
    }
}
