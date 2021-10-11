package chapter04;

import java.util.Scanner;

/**
 * @author FSO
 * Apr 7, 2021 3:56:59 PM
 */

public class Listing05_LotteryUsingStrings {
    public static void main(String[] args) {
        // Generate a lottery number
        String lottery = "" + (byte)(Math.random() * 10) + (byte)(Math.random() * 10);
        
        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        String guess = input.next();
        
        // Get digits from lottery
        char lotteryDigit1 = lottery.charAt(0);
        char lotteryDigit2 = lottery.charAt(1);
        
        // Get digits from guess
        char guessDigit1 = guess.charAt(0);
        char guessDigit2 = guess.charAt(1);
        
        System.out.println("The lottery number is " + lottery);
        
        // Check the guess
        if (guess.equals(lottery))
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
