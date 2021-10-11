package chapter05;

import java.util.Scanner;

/**
 * @author FSO
 * Apr 14, 2021 11:17:39 PM
 */

public class Listing06_TestDoWhile {
    /** Main method */
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        int data, sum = 0;
        
        do {
            // Read a value
            System.out.print("Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();
            
            sum += data;
        } while (data != 0);
                
        // Display the result
        System.out.println("The sum is " + sum);
    }
}
