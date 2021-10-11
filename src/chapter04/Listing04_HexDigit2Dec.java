package chapter04;

import java.util.Scanner;

/**
 * @author FSO
 * Apr 7, 2021 3:30:05 PM
 */

public class Listing04_HexDigit2Dec {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a hexadecimal digit
        System.out.print("Enter a hex digit: ");
        String hexDigit = input.next();
        
        // Check if the hex string has exactly one character
        if (hexDigit.length() != 1) {
            System.out.println("You must enter exactly one character");
            System.exit(1);
        }
        
        char hexCharacter = Character.toUpperCase(hexDigit.charAt(0));
        if (Character.isDigit(hexCharacter)) {
            System.out.println("The decimal value for hex digit " + hexDigit +
                    " is " + hexDigit);
        } else if ('A' <= hexCharacter && hexCharacter <= 'F') {
            System.out.println("The decimal value for hex digit " + hexDigit +
                    " is " + (10 + (hexCharacter - 'A')));
        } else 
            System.out.println(hexDigit + " is an invalid input");
    }
}
