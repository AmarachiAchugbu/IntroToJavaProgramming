package chapter06;

import java.util.Scanner;

/**
 * @author FSO
 * Sep 9, 2021 9:52:19 PM
 */

public class Listing06_GreatestCommonDivisorMethod {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter two integers
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();
        
        System.out.println("The greatest common divisor for " + n1 + " and " 
                + n2 + " is " + gcd(n1, n2));
    }
    
    public static int gcd(int a, int b) {
        // Declare and initialize the gcd to 1 as its base value
        int gcd = 1;
        
        // Create two variables that puts in order the user input to be processed
        // If n1 < n2, they should be swapped
        int n1 = (a > b) ? a : b;
        int n2 = (a > b) ? b : a;        
        
        // Declare variables that store the values of the division and remainder
        // between the two numbers
        int remainder;
        
        // Compute the gcd
        do {
            remainder = n1 % n2;           
            
            // Check if the remainder is 0
            if (remainder == 0)
                gcd = n2;
            else {
                n1 = n2;
                n2 = remainder;
            }                
        } while (remainder != 0);
                
        // Return the gcd result
        return gcd;
    }
}
