package chapter02.programmingExercises02;

import java.util.Scanner;

/**
 * @author FSO
 * Apr 18, 2021 9:48:30 PM
 */

public class ProgrammingExercise_02_10 {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the necessary parameter needed
        System.out.print("Enter the amount of water in kilograms: ");
        double weightOfWater = input.nextDouble();
        
        System.out.print("Enter the initial temperature: ");
        double initialTemp = input.nextDouble();
        
        System.out.print("Enter the final temperature: ");
        double finalTemp = input.nextDouble();
        
        // Compute the energy needed to heat water using the supplied parameters
        double energyNeeded = weightOfWater * (finalTemp - initialTemp) * 4184;
        
        // Display the result
        System.out.println("The energy needed is " + energyNeeded);
    }
}
