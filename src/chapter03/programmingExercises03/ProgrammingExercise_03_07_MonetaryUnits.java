package chapter03.programmingExercises03;

/**
 * @author FSO
 * Apr 26, 2021 2:36:40 AM
 */

public class ProgrammingExercise_03_07_MonetaryUnits {
    public static void main(String[] args) {
        // Receive the amount
        System.out.print("Enter the amount in total cents (e.g 11.56 = 1156): ");
        int amount = new java.util.Scanner(System.in).nextInt();        
        
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
        if (numberOfOneDollars > 0) {
            System.out.println("      " + numberOfOneDollars + " dollar" +
                    (numberOfOneDollars == 1 ? "" : "s"));
        }
        
        if (numberOfQuarters > 0) {
            System.out.println("      " + numberOfQuarters + " quarter" +
                    (numberOfQuarters == 1 ? "" : "s"));
        }
        
        if (numberOfDimes > 0) {
            System.out.println("      " + numberOfDimes + " dime" +
                    (numberOfDimes == 1 ? "" : "s"));
        }
        
        if (numberOfNickels > 0) {
            System.out.println("      " + numberOfNickels + " nickel" +
                    (numberOfNickels == 1 ? "" : "s"));
        }
        
        if (numberOfPennies > 0) {
            System.out.println("      " + numberOfPennies + " penn" +
                    (numberOfPennies == 1 ? "y" : "ies"));
        }
    }
}
