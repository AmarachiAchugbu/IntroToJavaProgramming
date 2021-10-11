package chapter02.programmingExercises02;

import java.util.Scanner;

/**
 * @author FSO
 * Mar 27, 2021 9:21:57 PM
 */

public class ProgrammingExercise_02_05 {
    public static void main(String[] args) {
        // Create a Scanner object to accept users input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the values needed
        System.out.print("Enter the subtotal: ");
        double subtotal = input.nextDouble(); // stores the subtotal
        System.out.print("Enter the gratuity rate: ");
        double gratuityRate = input.nextDouble(); // stores the gratuity rate
        
        // Dynamically initialize the variables for the gratuity and total
        double gratuity = (gratuityRate / 100) * subtotal;
        double total = subtotal + gratuity;
        
        // Display the results
        System.out.println("The gratuity is $" + gratuity + " and total is $"
                + total);
    }
}
