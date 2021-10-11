package chapter04.programmingExercises04;

import java.util.Scanner;

/**
 * @author FSO
 * Sep 7, 2021 5:12:06 PM
 */

public class ProgrammingExercise_04_11_DecimalToHex_12thEdition {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a decimal value between 0 and 15
        System.out.print("Enter a decimal value (0 to 15): ");
        byte decimal = input.nextByte();
        
        // Check if the user input is valid
        if (decimal < 0 || decimal > 15) {
            System.out.println(decimal + " is an invalid input");
            System.exit(0);
        }
        
        // Declare a string variable to store the hex digit
        char hexDigit;
        if (decimal < 10) {
            hexDigit = (char)(decimal + '0');
        } else 
            hexDigit = (char)(decimal - 10 + 'A');
        
        // Display the result
        System.out.println("The hex value is " + hexDigit);
        
        for (int i = 1; i <= 26; i++) {
            System.out.println(i + "\t" + (char)(i - 1 + 'A'));
        }
    }
}
