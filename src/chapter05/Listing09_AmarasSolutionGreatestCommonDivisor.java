package chapter05;

import java.util.Scanner;

/**
 * @author FSO
 * Apr 15, 2021 9:48:53 PM
 */

public class Listing09_AmarasSolutionGreatestCommonDivisor {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter two integers
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();
        
        // Declare and initialize the gcd to 1 as its base value
        int gcd = 1;
        
        // Create two variables that puts in order the user input to be processed
        // If n1 < n2, they should be swapped
        int a = (n1 < n2) ? n2 : n1;
        int b = (n1 < n2) ? n1 : n2;        
        
        // Declare variables that store the values of the division and remainder
        // between the two numbers
        int remainder;
        
        // Compute the gcd
        do {
            remainder = a % b;           
            
            // Check if the remainder is 0
            if (remainder == 0)
                gcd = b;
            else {
                a = b;
                b = remainder;
            }                
        } while (remainder != 0);
                
        // Display the result
        System.out.println("The gcd for " + n1 + " and " + n2 + " is " + gcd);
    }
}
