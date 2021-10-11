package chapter03.programmingExercises03;

import java.util.Scanner;

/**
 * @author FSO
 * Mar 26, 2021 3:38:05 PM
 */

public class ProgrammingExercise_03_14_HeadsOrTails {
    public static void main(String[] args) {
        // Generate a lottery number
        byte coinFlip = (byte)(Math.random() * 2);
        
        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a guess of how the coin flips (Heads (0) or Tails (1)): ");
        byte guess = input.nextByte();
        
        // Check the validity of the input
        if (guess < 0 || guess > 1) {
            System.out.println("Error: Invalid Input");
            System.exit(1);
        }
        
        // Compare the values and display the result
        System.out.println("The coin flip is " + (coinFlip == 0 ? "Heads" : "Tails") +
                " and your guess is " + (guess == 0 ? "Heads" : "Tails"));        
        System.out.println("Your guess is " +
                (guess == coinFlip ? "correct" : "incorrect"));
    }
}
