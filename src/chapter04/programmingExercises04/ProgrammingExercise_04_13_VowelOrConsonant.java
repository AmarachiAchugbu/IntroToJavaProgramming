package chapter04.programmingExercises04;

import java.util.Scanner;

/**
 * @author FSO
 * Sep 7, 2021 8:17:33 PM
 */

public class ProgrammingExercise_04_13_VowelOrConsonant {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a letter
        System.out.print("Enter a letter: ");
        char letter = input.next().charAt(0);
        
        // Determine if the input is valid
        if (!Character.isLetter(letter)) {
            System.out.println(letter + " is an invalid input");
            System.exit(1);
        }
        
        char checkLetter = letter;
        
        // Convert from a lowercase character to uppercase and store in new variable
        if (Character.isLowerCase(letter))
            checkLetter = Character.toUpperCase(letter);
        
        String typeOfLetter;
        
        // Determine if the letter is a vowel or a consonant
        switch (checkLetter) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': typeOfLetter = "vowel"; break;
            default: typeOfLetter = "consonant";
        }
        
        // Display the result
        System.out.println(letter + " is a " + typeOfLetter);
        
        
    }
}
