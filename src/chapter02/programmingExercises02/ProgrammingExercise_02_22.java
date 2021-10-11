package chapter02.programmingExercises02;

/**
 * @author FSO
 * Apr 19, 2021 9:13:37 PM
 */

public class ProgrammingExercise_02_22 {
    public static void main(String[] args) {
        // Receive the amount
        System.out.print("Enter the amount in total cents (e.g 11.56 = 1156): ");
        int amount = new java.util.Scanner(System.in).nextInt();
        
        // Variable to hold the value of amount which is subject to change
        int remainingAmount = amount;
        
        // Computes the number of single dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount %= 100;
        
        // Computes the number of quarters
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount %= 25;
        
        // Computes the number of dimes
        int numberOfDimes = remainingAmount / 10;
        remainingAmount %= 10;
        
        // Computes the number of nickels
        int numberOfNickels = remainingAmount / 5;
        remainingAmount %= 5;
        
        // Assigns the value of remainingAmount to pennies since it is the last denomination
        int numberOfPennies = remainingAmount;
        
        // Display results 
        System.out.println("Your amount " + amount + " consists of ");
        System.out.println("      " + numberOfOneDollars + " dollars");
        System.out.println("      " + numberOfQuarters + " quaters");
        System.out.println("      " + numberOfDimes + " dimes");
        System.out.println("      " + numberOfNickels + " nickels");
        System.out.println("      " + numberOfPennies + " pennies");
    }
}
