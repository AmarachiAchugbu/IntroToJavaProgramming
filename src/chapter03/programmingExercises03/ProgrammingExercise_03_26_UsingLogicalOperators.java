package chapter03.programmingExercises03;

import java.util.Scanner;

/**
 * @author FSO
 * May 1, 2021 10:38:33 PM
 */

public class ProgrammingExercise_03_26_UsingLogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to accept user inpu
        Scanner input = new Scanner(System.in);
        
        /* 10th Edition */
        System.out.println("10th Edition");
        System.out.println("============");
        System.out.println();
        
        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        
        // Determine the divisors of the integer using all the logical operators
        System.out.println("Is " + number + " divisible by 5 and 6? " + 
                (number % 5 == 0 && number % 6 == 0));
        System.out.println("Is " + number + " divisible by 5 or 6? " + 
                (number % 5 == 0 || number % 6 == 0));
        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + 
                (number % 5 == 0 ^ number % 6 == 0));
        
        System.out.println();
        System.out.println("=================================================");
        System.out.println();
        
        /* 11th Edition */
        System.out.println("11th Edition");
        System.out.println("============");
        System.out.println();
        
        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        number = input.nextInt(); // reads an integer from the user
        
        // Determine the divisors of the integer using all the logical operators
        System.out.println("Is " + number + " divisible by 4 and 5? " + 
                (number % 4 == 0 && number % 5 == 0));
        System.out.println("Is " + number + " divisible by 4 or 5? " + 
                (number % 4 == 0 || number % 5 == 0));
        System.out.println("Is " + number + " divisible by 4 or 5, but not both? " + 
                (number % 4 == 0 ^ number % 5 == 0));
    }
}
