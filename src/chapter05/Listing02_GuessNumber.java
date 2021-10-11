package chapter05;

import java.util.Scanner;

/**
 * @author FSO
 * Apr 14, 2021 5:25:25 PM
 */

public class Listing02_GuessNumber {
    public static void main(String[] args) {
        // Generate a random number
        int number = (int)(Math.random() * 101);        
        
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Display a message to start the game
        System.out.println("Guess a magic number between 0 and 100");
        
        // Create a variable that stores the user's guess
        int guess = -1;
        
        while (guess != number) {            
            // Prompt the user to guess the number
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            
            if (guess == number)
                System.out.println("Yes, the number is " + number);
            else if (guess > number)
                System.out.println("Your guess is too high");
            else 
                System.out.println("Your guess is too low");
        }
    }
}
