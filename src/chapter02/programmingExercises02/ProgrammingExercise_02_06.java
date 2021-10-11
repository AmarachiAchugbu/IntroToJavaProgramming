package chapter02.programmingExercises02;

import java.util.Scanner;

/**
 * @author FSO
 * Mar 27, 2021 9:44:08 PM
 */

public class ProgrammingExercise_02_06 {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        /* 10th Edition */
        System.out.println("10th Edition");
        System.out.println("============");
        System.out.println();
        
        // Prompt the user to enter a number between 0 and 1000
        System.out.print("Enter a number between 0 and 1000: ");
        short number = input.nextShort();
        
        // Create a variable to hold the remaining extracted number
        short remainingValue;
        
        // Extract the digits from the number given
        byte firstDigit = (byte)(number % 10); // stores the first digit of the number
        remainingValue = (short)(number / 10);
        
        byte secondDigit = (byte)(remainingValue % 10); // stores the second digit if any
        remainingValue = (short)(remainingValue / 10);
        
        byte thirdDigit = (byte)(remainingValue % 10); // stores the third digit if any
        byte fourthDigit = (byte)(remainingValue / 10); // stores the fourth digit if any
        
        // Compute the sum of the digits
        byte sumOfDigits = (byte)(firstDigit + secondDigit + thirdDigit + fourthDigit);
        
        // Display the result
        System.out.println("The sum of the digits is " + sumOfDigits);
        System.out.println();
        
        System.out.println("=================================================");
        System.out.println();
        
        /* 11th Edition */
        System.out.println("11th Edition");
        System.out.println("============");
        System.out.println();
        
        // Compute the product of the digits
        int productOfDigits = firstDigit * secondDigit * thirdDigit;
        
        // Display the result
        System.out.println("The multiplication of all digits in " + number
                + " is " + productOfDigits);
        System.out.println();
    }
}
