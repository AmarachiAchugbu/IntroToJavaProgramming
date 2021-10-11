package chapter02.programmingExercises02;

import java.util.Scanner;

/**
 * @author FSO
 * Apr 19, 2021 6:57:18 PM
 */

public class ProgrammingExercise_02_13 {
    public static void main(String[] args) {
        // Creates a Scanner object to accept the prompted user's input
        Scanner input = new Scanner(System.in);
        
        /* 10th Edition */
        System.out.println("10th Edition");
        System.out.println("============");
        System.out.println();
        
        // Prompt the user to enter a monthly saving amount 
        System.out.print("Enter the monthly saving amount: ");
        double monthlyAmount = input.nextDouble();
        
        double compoundValue = 0;
        
        final double MONTHLY_INTEREST_RATE = (5.0 / 100) / 12;
        
        // Compute the compound value after the first month
        compoundValue = (monthlyAmount + compoundValue) * (1 + MONTHLY_INTEREST_RATE);
        
        // Compound value after the second month
        compoundValue = (monthlyAmount + compoundValue) * (1 + MONTHLY_INTEREST_RATE);
        
        // Compound value after the third month
        compoundValue = (monthlyAmount + compoundValue) * (1 + MONTHLY_INTEREST_RATE);
        
        // Compound value after the fourth month
        compoundValue = (monthlyAmount + compoundValue) * (1 + MONTHLY_INTEREST_RATE);
        
        // Compound value after the fifth month
        compoundValue = (monthlyAmount + compoundValue) * (1 + MONTHLY_INTEREST_RATE);
        
        // Compound value after the sixth month
        compoundValue = (monthlyAmount + compoundValue) * (1 + MONTHLY_INTEREST_RATE);
        
        // Display the result
        System.out.println("After the sixth month, the account value is $" +
                (int)(compoundValue * 100) / 100.0);
        System.out.println();
        
        System.out.println("=================================================");
        System.out.println();
        
        /* 11th Edition */
        System.out.println("11th Edition");
        System.out.println("============");
        System.out.println();
        
        final double MONTHLY_INTEREST_RATE2 = (3.75 / 100) / 12;
        
        // Prompt the user to enter a monthly saving amount 
        System.out.print("Enter the monthly saving amount: ");
        monthlyAmount = input.nextDouble();
        
        // Assign a new value to compound value
        compoundValue = 0;
        
        // Compute the compound value after the first month
        compoundValue = (monthlyAmount + compoundValue) * (1 + MONTHLY_INTEREST_RATE2);
        System.out.println("After the first month, the account value is " +
                compoundValue);
        
        // Compound value after the second month
        compoundValue = (monthlyAmount + compoundValue) * (1 + MONTHLY_INTEREST_RATE2);
        System.out.println("After the second month, the account value is " +
                compoundValue);
        
        // Compound value after the third month
        compoundValue = (monthlyAmount + compoundValue) * (1 + MONTHLY_INTEREST_RATE2);
        System.out.println("After the third month, the account value is " +
                compoundValue);
        
        // Compound value after the fourth month
        compoundValue = (monthlyAmount + compoundValue) * (1 + MONTHLY_INTEREST_RATE2);
        System.out.println("After the fourth month, the account value is " +
                compoundValue);
        
        // Compound value after the fifth month
        compoundValue = (monthlyAmount + compoundValue) * (1 + MONTHLY_INTEREST_RATE2);
        System.out.println("After the fifth month, the account value is " +
                compoundValue);
        
        // Compound value after the sixth month
        compoundValue = (monthlyAmount + compoundValue) * (1 + MONTHLY_INTEREST_RATE2);
        System.out.println("After the sixth month, the account value is " +
                compoundValue);
    }
}
