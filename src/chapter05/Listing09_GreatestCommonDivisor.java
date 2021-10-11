package chapter05;

import java.util.Scanner;

/**
 * @author FSO
 * Apr 15, 2021 10:44:30 PM
 */

public class Listing09_GreatestCommonDivisor {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter two integers
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();        
        
        int gcd = 1; // Initialize the gcd to 1
        int k = 2; // Possible gcd
        
        // Compute the gcd
        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k; // Updatd gcd
            
            k++;
        }
                
        // Display the result
        System.out.println("The greatest common divisor for " + n1 + " and " + n2 
                + " is " + gcd);
    }
}
