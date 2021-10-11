package chapter04.programmingExercises04;

import java.util.Scanner;

/**
 * @author FSO
 * Sep 7, 2021 7:46:00 PM
 */

public class ProgrammingExercise_04_12_HexToBinary {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a hex digit
        System.out.print("Enter a hex digit: ");
        String hex = input.next(); // input is entered as a string
        
        char hexDigit = hex.charAt(0);
        
        // Convert the hexDigit to uppercase if it is a lowercase letter entered
        if (Character.isLowerCase(hexDigit)) {
            hexDigit = Character.toUpperCase(hexDigit);
        }
        
        // Check if the input is invalid
        if (!Character.isLetterOrDigit(hexDigit) || hexDigit > 'F' || hex.length() > 1) {
            System.out.println(hex + " is an invalid input");
            System.exit(1);
        }
        
        int decimal;
        
        // 1. Convert the hexDigit to decimal
        decimal = Character.isDigit(hexDigit) ? (hexDigit - '0') 
                : (hexDigit - 'A' + 10);
        
        // Declare variables to store the quotient, the remainder and the binary string
        String binaryNumber = "";
        int quotient, remainder;
        
        // 2. Convert the decimal to binary
        quotient = decimal / 2;
        remainder = decimal % 2;
        
        if (quotient != 0) {
            decimal = quotient;
            binaryNumber = remainder + binaryNumber;
        }
        
        quotient = decimal / 2;
        remainder = decimal % 2;
        
        if (quotient != 0) {
            decimal = quotient;
            binaryNumber = remainder + binaryNumber;
        }
        
        quotient = decimal / 2;
        remainder = decimal % 2;
        
        if (quotient != 0) {
            decimal = quotient;
            binaryNumber = remainder + binaryNumber;
        }
        
        remainder = decimal % 2;
        binaryNumber = remainder + binaryNumber;
        
        // Display the result
        System.out.println("The binary value is " + binaryNumber);
    }
}
