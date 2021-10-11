package chapter02.programmingExercises02;

import java.util.Scanner;

/**
 * @author FSO
 * Mar 27, 2021 9:14:50 PM
 */

public class ProgrammingExercise_02_04 {
    public static void main(String[] args) {
        // Create a Scanner object to accept users input
        Scanner input = new Scanner(System.in);
        
        /* 10th Edition */
        System.out.println("10th Edition");
        System.out.println("============");
        System.out.println();
        
        // Prompt the user to enter a value in pounds
        System.out.print("Enter a number in pounds: ");
        float pounds = input.nextFloat();
        
        // Declare the constant for converting pounds into kilograms
        final float KILOGRAMS_PER_POUND = 0.454f;
        
        // Dynamically initialize the variable for kilometer using the pounds variable
        float kilograms = pounds * KILOGRAMS_PER_POUND;
        
        // Display the result
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
        System.out.println();
        
        System.out.println("=================================================");
        System.out.println();
        
        /* 11th Edition */
        System.out.println("11th Edition");
        System.out.println("============");
        System.out.println();
        
        // Prompt the user to enter a number in square meter
        System.out.print("Enter a number in square meters: ");
        float squareMeters = input.nextFloat();
        
        // Declare the constant for converting square meters into pings
        final float PINGS_PER_SQUARE_METER = 0.3025F;
        
        // Dynamically initialize the variable for pings using the value of square meters
        float pings = squareMeters * PINGS_PER_SQUARE_METER;
        
        // Display the result
        System.out.println(squareMeters + " square meters is " + pings + " pings");
    }
}
