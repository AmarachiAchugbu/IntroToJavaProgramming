package chapter05;

import java.util.Scanner;

/**
 * @author FSO
 * Apr 14, 2021 10:19:01 PM
 */

public class Listing05_SentinelValue {
    /** Main method */
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Read an initial value
        System.out.print("Enter an integer (the input ends if it is 0): ");
        int data = input.nextInt();
        
        // Keep reading data until the input is 0
        int sum = 0; // Stores the sum of all the inputted values
        while (data != 0) {
            sum += data;
            
            // Read the next data
            System.out.print("Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();
        }
        
        // Display the result
        System.out.println("The sum is " + sum);
    }
}
