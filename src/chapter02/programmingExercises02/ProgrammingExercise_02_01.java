package chapter02.programmingExercises02;

import java.util.Scanner;

/**
 * @author FSO
 * Mar 21, 2021 4:29:48 PM
 */

public class ProgrammingExercise_02_01 {
    public static void main(String[] args) {
        // Creates a Scanner object to accept the prompted user's input
        Scanner input = new Scanner(System.in);
        
        /* 10th Edition */
        System.out.println("10th Edition");
        System.out.println("============");
        System.out.println();
        
        // Prompt the user to enter the value for the degree in Celsius
        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();
        
        // Declare dynamically the variable for fahrenheit using celsius
        double fahrenheit = (9.0 / 5) * celsius + 32;
        
        // Display the result
        System.out.println(celsius + " Celsius is " + fahrenheit + " fahrenheit");
        System.out.println();
        
        System.out.println("=================================================");
        System.out.println();
        
        /* 11th Edition */
        System.out.println("11th Edition");
        System.out.println("============");
        System.out.println();
        
        System.out.print("Enter miles: ");
        double miles = input.nextDouble();
        
        // Creates a constant
        final double KILOMETERS_PER_MILES = 1.6;
        
        // Converts the value in miles to kilometers;
        double kilometers = miles * KILOMETERS_PER_MILES;
        
        // Display the results
        System.out.println(miles + " miles is " + ((int)(kilometers * 100) / 100.0) + 
                " kilometers");
        System.out.println();
    }
}