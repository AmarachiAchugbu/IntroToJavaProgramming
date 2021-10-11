package chapter03.programmingExercises03;

import java.util.Scanner;

/**
 * @author FSO
 * Apr 28, 2021 5:10:07 PM
 */

public class ProgrammingExercise_03_11_DaysInAMonth {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the month and year as integers
        System.out.print("Enter the month: ");
        byte month = input.nextByte();
        
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        
        int numberOfDays; // stores the number of days in the specified month
        
        // Determine if the year specified is a leap year
        boolean isLeapYear = (year % 4 == 0 ^ year % 100 == 0) || (year % 400 == 0);
        
        // Check for the number of days in the month
        switch (month) {
            case 2: numberOfDays = isLeapYear ? 29: 28; break;
            case 4:
            case 6:
            case 9:
            case 11: numberOfDays = 30; break;
            default: numberOfDays = 31;
        }
        
        // Display the result
        // First, we display the month
        switch (month) {
            case 1: System.out.print("January"); break;
            case 2: System.out.print("February"); break;
            case 3: System.out.print("March"); break;
            case 4: System.out.print("April"); break;
            case 5: System.out.print("May"); break;
            case 6: System.out.print("June"); break;
            case 7: System.out.print("July"); break;
            case 8: System.out.print("August"); break;
            case 9: System.out.print("September"); break;
            case 10: System.out.print("October"); break;
            case 11: System.out.print("November"); break;
            case 12: System.out.print("December");
        }
        
        // Next, we display the number of days
        System.out.println(" " + year + " had " + numberOfDays + " days");
    }
}
