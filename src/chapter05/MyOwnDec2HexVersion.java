package chapter05;

import java.util.Scanner;

/**
 * @author FSO
 * Sep 2, 2021 1:38:55 AM
 */

public class MyOwnDec2HexVersion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();
        
        // Declare variables
        int quotient, remainder;
        String hexString = "";
        
        do {
            quotient = decimal / 16;
            remainder = decimal % 16;

            char hexDigit = ' ';

            if (remainder > 9) {
                hexDigit = (char)(remainder - 10 + 'A');
            }

            hexString = (remainder > 9 ? hexDigit + "" : remainder) + hexString;
            
            decimal = quotient;
        } while (quotient != 0);       
        
        // Display the result
        System.out.println("The hex number is " + hexString);
    }
}
