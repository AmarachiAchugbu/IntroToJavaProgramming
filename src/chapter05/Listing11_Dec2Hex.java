package chapter05;

import java.util.Scanner;

/**
 * @author FSO
 * Apr 16, 2021 4:18:25 PM
 */

public class Listing11_Dec2Hex {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the input
        System.out.print("Enter an integer: ");
        int decimal = input.nextInt();
        
        // Stores the user input separate from what will be processed
        int decimalValue = decimal;
        
        // Declares a String variable to hold the converted hexadecimal value
        String hexString = "";
        
        // Convert the integer to hexadecimal
        while (decimalValue != 0) {
            int remainder = decimalValue % 16;
            
            // Convert the remainder value to a hex digit
            char hexDigit = (remainder > 9) ? (char)('A' + (remainder - 10)) :
                    (char)('0' + remainder);
                        
            hexString = hexDigit + hexString;
            
            decimalValue /= 16;
        }
        
        // Display the result
        System.out.println("The hex number of " + decimal + " is " + 
                (hexString.length() == 0 ? "0" : hexString));
    }
}
