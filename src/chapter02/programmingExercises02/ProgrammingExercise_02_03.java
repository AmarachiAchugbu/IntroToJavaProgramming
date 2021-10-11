package chapter02.programmingExercises02;

import java.util.Scanner;

/**
 * @author FSO
 * Mar 27, 2021 9:05:37 PM
 */

public class ProgrammingExercise_02_03 {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        /* 10th Edition */
        System.out.println("10th Edition");
        System.out.println("============");
        System.out.println();
        
        // Prompt the user to enter a value in feet
        System.out.print("Enter a value for feet: ");
        float feet = input.nextFloat();
        
        // Declare the constant for converting feet to meters
        final float METER_PER_FOOT = 0.305f;
        
        // Dynamically initialize the variable for meter using the feet variable
        float meter = feet * METER_PER_FOOT;
        
        // Display the result
        System.out.println(feet + " feet is " + meter + " meters");
        
        System.out.println();
        System.out.println("=================================================");
        System.out.println();
        
        /* 11th Edition */
        System.out.println("11th Edition");
        System.out.println("============");
        System.out.println();
        
        // Prompt the user to enter a value for meter
        System.out.print("Enter a value for meter: ");
        meter = input.nextFloat();
        
        // Declare a constant for meter to feet
        final float FEET_PER_METER = 1 / METER_PER_FOOT;
        
        // Compute the value of feet from its conversion from meters
        feet = meter * FEET_PER_METER;
        
        // Display the result of the value of feet
        System.out.println(meter + " meters is " + feet + " feet");
        
        System.out.println();
    }
}
