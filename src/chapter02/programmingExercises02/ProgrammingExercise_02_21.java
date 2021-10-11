package chapter02.programmingExercises02;

import java.util.Scanner;

/**
 * @author FSO
 * Apr 19, 2021 9:00:57 PM
 */

public class ProgrammingExercise_02_21 {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user for the required values to compute the investment value
        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        
        System.out.print("Enter annual interest rate in percentage: ");
        double interestRate = input.nextDouble();
        
        System.out.print("Enter the number of years: ");
        double numberOfYears = input.nextDouble();
        
        // Compute the amount of the future investment value
        double futureInvestment = investmentAmount * 
                Math.pow((1 + interestRate / 1200), numberOfYears * 12);
        
        // Display the result of the future investment
        System.out.println("Accumulated value is $" + 
                (int)(futureInvestment * 100) / 100.0);
    }
}
