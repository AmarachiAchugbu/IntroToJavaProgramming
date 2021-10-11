package chapter04.programmingExercises04;

import java.util.Scanner;

/**
 * @author FSO
 * Sep 7, 2021 8:53:00 PM
 */

public class ProgrammingExercise_04_15_PhoneKeyPads {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a letter
        System.out.print("Enter a letter: ");
        String s = input.next();
        char letter = s.charAt(0);
        
        // Check if the input is valid
        if (s.length() > 1 || !Character.isLetter(letter)) {
            System.out.println(s + " is an invalid input");
            System.exit(1);
        }
        
        // Convert to a particular case to work with
        char ch = letter;
        if (Character.isUpperCase(ch))
            ch = Character.toLowerCase(ch);        
        
        // Determine the corresponding number of the character
        String numberMap = "";
        switch (ch) {
            case 'a': case 'b': case 'c': numberMap = "2"; break;
            case 'd': case 'e': case 'f': numberMap = "3"; break;
            case 'g': case 'h': case 'i': numberMap = "4"; break;
            case 'j': case 'k': case 'l': numberMap = "5"; break;
            case 'm': case 'n': case 'o': numberMap = "6"; break;
            case 'p': case 'q': case 'r': case 's': numberMap = "7"; break;
            case 't': case 'u': case 'v': numberMap = "8"; break;
            case 'w': case 'x': case 'y': case 'z': numberMap = "9";            
        }
        
        // Display the result
        System.out.println("The corresponding number is " + numberMap);
    }
}
