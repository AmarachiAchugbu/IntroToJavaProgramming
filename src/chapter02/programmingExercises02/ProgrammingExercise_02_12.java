package chapter02.programmingExercises02;

import java.util.Scanner;

/**
 * @author FSO
 * Apr 18, 2021 10:50:55 PM
 */

public class ProgrammingExercise_02_12 {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the needed parameters
        System.out.print("Enter the take-off speed (v): ");
        double takeOffSpeed = input.nextDouble(); // stores the take-off speed
        
        System.out.print("Enter the airplane's acceleration (a): ");
        double acceleration = input.nextDouble();
        
        // Calculate the runway length of the airplane
        double runwayLength = (takeOffSpeed * takeOffSpeed) / (2 * acceleration);
        
        // Display the result
        System.out.println("The minimum runway length for this airplane is " +
                (int)(runwayLength * 1000) / 1000.0);
    }
}
