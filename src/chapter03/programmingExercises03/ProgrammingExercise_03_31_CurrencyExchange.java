package chapter03.programmingExercises03;

import java.util.Scanner;

/**
 * @author FSO
 * May 18, 2021 10:33:44 PM
 */

public class ProgrammingExercise_03_31_CurrencyExchange {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the exchange rate from USD to RMB
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double dollarToRMB = input.nextDouble();
        
        // Prompt the user to enter their choice of conversion
        System.out.print("Enter 0 to convert dollars to RMB or 1 for vice versa: ");
        byte conversionChoice = input.nextByte();
        if (conversionChoice != 0 || conversionChoice != 1) {
            System.out.println("Incorrect input");
            System.exit(1);
        }
        
        // Prompt the user for the amount in the respective currency they want to change from
        System.out.print("Enter the " + 
                    ((conversionChoice == 0) ? "dollar" : "RMB") + " amount: ");
        double amount = input.nextDouble();
        
        // Declare a varible that stores the converted amount in the new currency
        double convertedAmount;
        
        // Compute the new amount and display the result
        if (conversionChoice == 0) {
            convertedAmount = dollarToRMB * amount;
            System.out.println("$" + amount + " is " + convertedAmount + " yuan");
        } else {
            convertedAmount = amount / dollarToRMB;
            System.out.println(amount + " yuan is $" 
                    + (int)(convertedAmount * 100) / 100.0);
        }            
    }
}
