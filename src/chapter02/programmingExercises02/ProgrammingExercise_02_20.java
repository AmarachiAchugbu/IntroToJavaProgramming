package chapter02.programmingExercises02;

import java.util.Scanner;

/**
 * @author FSO
 * Apr 19, 2021 8:54:27 PM
 */

public class ProgrammingExercise_02_20 {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the values needed
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        float balance = input.nextFloat(), interestRate = input.nextFloat();
        
        // Compute the interest for the next month
        float monthlyInterest = balance * (interestRate / 1200);
        
        // Display the result
        System.out.println("The interest is " + monthlyInterest);
    }
}
