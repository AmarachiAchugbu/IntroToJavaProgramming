package chapter02;

import java.util.Scanner;

/**
 * @author FSO
 * Mar 21, 2021 2:57:52 AM
 */

public class Listing09_ComputeLoan {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the annual interest rate
        System.out.print("Enter the annual interest in percentage: ");
        double annualInterestRate = input.nextDouble();
        
        // Prompt the user to enter the number of years
        System.out.print("Enter the number of years for the loan: ");
        int numberOfYears = input.nextInt();
        
        // Prompt the user to enter the loan amount
        System.out.print("Enter the loan amount: ");
        double loanAmount = input.nextDouble();
        
        // Compute the monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;
        
        // Compute the monthly payment amount
        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        
        // Compute the total payment
        double totalPayment = monthlyPayment * numberOfYears * 12;
        
        // Display the results of the monthly payment and the total payment
        System.out.println("Monthly Payment is $" + (int)(monthlyPayment * 100) / 100.0);
        System.out.println("Total Payment is $" + (int)(totalPayment * 100) / 100.0);
    }
}
