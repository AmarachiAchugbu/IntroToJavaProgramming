package chapter03.programmingExercises03;

/**
 * @author FSO
 * Apr 29, 2021 12:45:56 AM
 */

public class ProgrammingExercise_03_17_RockPaperScissors {
    public static void main(String[] args) {
        // Generate a random integer to represent rock, paper or scissor
        byte computerPick = (byte)(Math.random() * 3);
        
        // Prompt the user to enter a number between 0 to 2
        System.out.print("scissor (0), rock (1), paper (2): ");
        byte userInput = new java.util.Scanner(System.in).nextByte();
        
        // Display the first part of the result i.e. the computer's pick
        System.out.print("The computer is ");
        if (computerPick == 0) {
            System.out.print("scissor. ");
        } else if (computerPick == 1) 
            System.out.print("rock. ");
        else
            System.out.print("paper. ");
        
        // Display the second part of the result i.e. the user's pick
        System.out.print("You are ");
        if (userInput == 0) {
            System.out.print("scissor" + ((computerPick == userInput) ? " too. " : ". "));
        } else if (userInput == 1) 
            System.out.print("rock" + ((computerPick == userInput) ? " too. " : ". "));
        else
            System.out.print("paper" + ((computerPick == userInput) ? " too. " : ". "));
        
        // Evaluate who won or if it is a draw
        if ((computerPick == 0 && userInput == 2) ||
                (computerPick == 1 && userInput == 0) ||
                (computerPick == 2 && userInput == 1)) {
            System.out.println("Computer won.");
        } else if ((userInput == 0 && computerPick == 2) || 
                (userInput == 1 && computerPick == 0) || 
                (userInput == 2 && computerPick == 1)) {
            System.out.println("You won.");
        } else
            System.out.println("It is a draw.");
    }
}
