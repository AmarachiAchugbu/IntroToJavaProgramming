package chapter03.programmingExercises03;

import java.util.Scanner;

/**
 * @author FSO
 * Apr 26, 2021 2:29:07 AM
 */

public class ProgrammingExercise_03_06_BMI {
    public static void main(String[] args) {
        // Create a Scanner object to accept user's input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble(); // reads in the weight as a floating-point
        
        // Prompt the user to enter the height in both feet and inches
        System.out.print("Enter feet: ");
        double feet = input.nextDouble(); // stores the feet part
        
        System.out.print("Enter inches: ");
        double inches = input.nextDouble(); // stores the inches part of the height
        
        // Declare the necessary constants
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double INCHES_PER_FEET = 12;
        final double METERS_PER_INCH = 0.0254;
        
        // Convert the received values to the appropriate parameters
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInInches = (feet * INCHES_PER_FEET + inches) * METERS_PER_INCH;
        
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
