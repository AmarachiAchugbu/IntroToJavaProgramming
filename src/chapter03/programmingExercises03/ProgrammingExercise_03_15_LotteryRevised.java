package chapter03.programmingExercises03;

/**
 * @author FSO
 * Apr 28, 2021 6:01:43 PM
 */

public class ProgrammingExercise_03_15_LotteryRevised {
    public static void main(String[] args) {
        // Generate a lottery number
        short lottery = (short)(Math.random() * 1000);
        
        // Prompt the user to enter a guess
        System.out.print("Enter your lottery pick (three digits): ");
        short guess = new java.util.Scanner(System.in).nextShort();
        
        // Get digits from lottery
        short lotteryDigit1 = (short)(lottery / 100);
        short lotteryDigit2 = (short)(lottery / 10 % 10);
        short lotteryDigit3 = (short)(lottery % 10);
        
        // Get digits from guess
        short guessDigit1 = (short)(guess / 100);
        short guessDigit2 = (short)(guess / 10 % 10);
        short guessDigit3 = (short)(guess % 10);
        
        System.out.println("The lottery number is " + lottery);
        
        // Check the guess
        if (guess == lottery)
            System.out.println("Exact match: You win $10,000");
        else if ((guessDigit1 == lotteryDigit2 ^ guessDigit1 == lotteryDigit3) && 
                (guessDigit2 == lotteryDigit1 ^ guessDigit2 == lotteryDigit3) &&
                (guessDigit3 == lotteryDigit1 ^ guessDigit3 == lotteryDigit2))
            System.out.println("Match all digits: You win $3,000");
        else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 ||
                guessDigit1 == lotteryDigit3 || guessDigit2 == lotteryDigit1 || 
                guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3 ||
                guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 ||
                guessDigit3 == lotteryDigit3)
            System.out.println("Match one digit: You win $1,000");
        else
            System.out.println("Sorry, no match");
    }
}
