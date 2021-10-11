package chapter03;

import java.util.Scanner;

/**
 * @author FSO
 * Mar 22, 2021 10:18:25 PM
 */

public class Listing04_ComputeAndInterpretBMI {
    /** Main method */
    public static void main(String[] args) {
        // Create a Scanner object to accept user's input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble(); // reads in the weight as a floating-point
        
        // Prompt the user to enter the height in inches
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        
        // Declare the necessary constants
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;
        
        // Convert the received values to the appropriate parameters
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInInches = height * METERS_PER_INCH;
        
        // Compute the Body Mass Index (BMI)
        double bmi = weightInKilograms / Math.pow(heightInInches, 2);
        
        // Display the result
        System.out.println("BMI is " + bmi);
        
        // Interpret the result
        if (bmi >= 30.0)
            System.out.println("Obese");
        else if (bmi >= 25.0)
            System.out.println("Overweight");
        else if (bmi >= 18.5)
            System.out.println("Normal");
        else
            System.out.println("Underweight");
    }
}
