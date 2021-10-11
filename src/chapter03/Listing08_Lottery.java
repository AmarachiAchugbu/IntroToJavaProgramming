package chapter03;

import java.util.Scanner;

/**
 * @author FSO
 * Mar 24, 2021 4:22:45 PM
 */

public class Listing08_Lottery {
    /** Main method */
    public static void main(String[] args) {
        // Generate a lottery number
        byte lottery = (byte)(Math.random() * 100);
        
        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in); // Scanner object to accept user input
        System.out.print("Enter your lottery pick (two digits): ");
        byte guess = input.nextByte();
        
        // Get digits from lottery
        byte lotteryDigit1 = (byte)(lottery / 10);
        byte lotteryDigit2 = (byte)(lottery % 10);
        
        // Get digits from guess
        byte guessDigit1 = (byte)(guess / 10);
        byte guessDigit2 = (byte)(guess % 10);
        
        System.out.println("The lottery number is " + lottery);
        
        // Check the guess
        if (guess == lottery)
            System.out.println("Exact match: You win $10,000");
        else if (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1)
            System.out.println("Match all digits: You win $3,000");
        else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 ||
                guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2)
            System.out.println("Match one digit: You win $1,000");
        else
            System.out.println("Sorry, no match");
    }
}
