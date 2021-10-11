package chapter04.programmingExercises04;

import java.util.Scanner;

/**
 * @author FSO
 * Aug 28, 2021 4:54:06 PM
 */

public class ProgrammingExercise_04_11_BinaryToDecimal_11thEdition {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter binary digits
        System.out.print("Enter binary digits (0000 to 1111): ");
        String binaryNumber = input.next();
        
        // Check that the user supplied value is a binary string
        if (binaryNumber.length() != 4) {
            System.out.println("Invalid input. Enter the specified number of digits.");
            System.exit(1);
        }
        
        // Declare variables that will store the sum and the character at the index
        byte decimalValue = 0;
        char binaryDigit = binaryNumber.charAt(0);
        if (binaryDigit < '0' || binaryDigit > '1') {
            System.out.println("Invalid input. " + binaryDigit + " is not binary");
            System.exit(1);
        }
        
        // Compute the decimal value of the binary digit at index 0
        decimalValue += (Integer.parseInt(binaryDigit + "") * Math.pow(2, 3));
        
        // Compute the decimal value of the binary digit at index 1
        binaryDigit = binaryNumber.charAt(1);
        if (binaryDigit < '0' || binaryDigit > '1') {
            System.out.println("Invalid input. " + binaryDigit + " is not binary");
            System.exit(1);
        }
        decimalValue += (Integer.parseInt(binaryDigit + "") * Math.pow(2, 2));
        
        // Compute the decimal value of the binary digit at index 2
        binaryDigit = binaryNumber.charAt(2);
        if (binaryDigit < '0' || binaryDigit > '1') {
            System.out.println("Invalid input. " + binaryDigit + " is not binary");
            System.exit(1);
        }
        decimalValue += (Integer.parseInt(binaryDigit + "") * 2);
        
        // Compute the decimal value of the binary digit at index 3
        binaryDigit = binaryNumber.charAt(3);
        if (binaryDigit < '0' || binaryDigit > '1') {
            System.out.println("Invalid input. " + binaryDigit + " is not binary");
            System.exit(1);
        }
        decimalValue += Integer.parseInt(binaryDigit + "");
        
        // Display the result of the corresponding decimal value to the binary digit
        System.out.println("The decimal value is " + decimalValue);
    }
}
