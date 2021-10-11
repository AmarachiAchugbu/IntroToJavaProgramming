package chapter02.programmingExercises02;

import java.util.Scanner;

/**
 * @author FSO
 * Apr 18, 2021 9:39:42 PM
 */

public class ProgrammingExercise_02_09 {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the necessary parameter needed
        System.out.print("Enter the starting velocity (v0): ");
        float velocity0 = input.nextFloat(); // starting velocity
        
        System.out.print("Enter the ending velocity (v1): ");
        float velocity1 = input.nextFloat(); // ending velocity
        
        System.out.print("Enter the time span (t): ");
        float time = input.nextFloat(); // the time taken to make the change in velocity
        
        // Compute the average velocity and assign the value dynamically to the variable
        float averageAcceleration = (velocity1 - velocity0) / time;
        
        // Display the result of the average acceleration
        System.out.println("The average acceleration is " + averageAcceleration);
    }
}
