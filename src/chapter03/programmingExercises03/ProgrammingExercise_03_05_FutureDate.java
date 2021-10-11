package chapter03.programmingExercises03;

import java.util.Scanner;

/**
 * @author FSO
 * Mar 26, 2021 2:25:02 PM
 */

public class ProgrammingExercise_03_05_FutureDate {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter an integer for the current day of the week
        System.out.println("(Sunday is 0, Monday is 1, ... , and Saturday is 6)");
        System.out.print("Enter today's day: ");
        byte currentDayOfWeek = input.nextByte();
        
        // Prompt the user to enter the number of days after today for a future day
        System.out.print("Enter the number of days elapsed since today: ");
        int daysElapsed = input.nextInt();
        
        // Compute the future day of the week
        int futureDay = (currentDayOfWeek + daysElapsed) % 7;
        
        // Display the future day of the week
        System.out.print("Today is ");
        switch (currentDayOfWeek) {
            case 0: System.out.print("Sunday"); break;
            case 1: System.out.print("Monday"); break;
            case 2: System.out.print("Tuesday"); break;
            case 3: System.out.print("Wednesday"); break;
            case 4: System.out.print("Thursday"); break;
            case 5: System.out.print("Friday"); break;
            case 6: System.out.print("Saturday");
        }
        
        System.out.print(" and the future day is ");
        switch (futureDay) {
            case 0: System.out.println("Sunday"); break;
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday");
        }
    }
}
