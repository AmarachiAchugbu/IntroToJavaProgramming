package chapter02.programmingExercises02;

import java.util.Scanner;

/**
 * @author FSO
 * Apr 19, 2021 9:20:12 PM
 */

public class ProgrammingExercise_02_23 {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the necessary parameters
        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble(); // stores the distance of the drive
        
        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble(); // measures the fuel efficiency
        
        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();
        
        // Calculate the cost of the trip
        double costOfDriving = (distance / milesPerGallon) * pricePerGallon;
        
        // Display the result
        System.out.println("The cost of driving is $" + 
                (int)(costOfDriving * 100) / 100.0);
    }
}
