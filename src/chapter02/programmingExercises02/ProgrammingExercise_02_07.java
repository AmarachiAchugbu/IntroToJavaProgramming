package chapter02.programmingExercises02;

import java.util.Scanner;

/**
 * @author FSO
 * Apr 13, 2021 10:49:00 PM
 */

public class ProgrammingExercise_02_07 {
    /** Main method */
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the number of minutes to be computed
        System.out.print("Enter the number of minutes: ");
        long numberOfMinutes = input.nextLong();
        
        // Declare a constant for the number of minutes in a year
        final int MINUTES_PER_YEAR = 525_600;
        
        // Declare a constant for the number of minutes in a day
        final int MINUTES_PER_DAY = 1440;
        
        // Compute the number of years from the number of minutes supplied
        long years = numberOfMinutes / MINUTES_PER_YEAR;
        
        // Compute the number of days from the number of minutes given by the user
        long days = (numberOfMinutes % MINUTES_PER_YEAR) / MINUTES_PER_DAY;
                
        System.out.println(numberOfMinutes + " minutes is approximately " +
                years + " years and " + days + " days");
    }
}
