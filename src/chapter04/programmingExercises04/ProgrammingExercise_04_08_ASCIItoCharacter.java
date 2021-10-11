package chapter04.programmingExercises04;

import java.util.Scanner;

/**
 * @author FSO
 * Aug 27, 2021 10:00:45 PM
 */

public class ProgrammingExercise_04_08_ASCIItoCharacter {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter an ASCII code
        System.out.print("Enter an ASCII code: ");
        byte asciiCode = input.nextByte();
        
        // 
        System.out.println("The character for ASCII code " + asciiCode 
                + " is " + (char)asciiCode);
    }
}
