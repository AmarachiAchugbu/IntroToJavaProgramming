package chapter02.programmingExercises02;

import java.util.Scanner;

/**
 * @author FSO
 * Apr 19, 2021 6:57:39 PM
 */

public class ProgrammingExercise_02_14 {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the values needed to compute the BMI
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble(); // stores the weight in pounds
        
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble(); // stores the height in inches
        
        // Declare constants for the conversion between the metrics
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;
        
        // Compute the BMI and dynamically initialize a variable with the value
        double bmi = (weight * KILOGRAMS_PER_POUND) / 
                (Math.pow((height * METERS_PER_INCH), 2));
        
        // Display the result
        System.out.println("BMI is " + bmi);
    }
}
