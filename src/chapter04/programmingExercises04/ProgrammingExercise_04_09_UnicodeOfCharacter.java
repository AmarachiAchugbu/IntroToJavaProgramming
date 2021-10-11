package chapter04.programmingExercises04;

import java.util.Scanner;

/**
 * @author FSO
 * Aug 28, 2021 2:59:09 AM
 */

public class ProgrammingExercise_04_09_UnicodeOfCharacter {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        char character = input.next().charAt(0);
        
        // Display the result 
        System.out.println("The unicode for the character " + character + " is " 
                + (int)character);
    }
}
