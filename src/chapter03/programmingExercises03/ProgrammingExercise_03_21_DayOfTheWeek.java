package chapter03.programmingExercises03;

import java.util.Scanner;

/**
 * @author FSO
 * Apr 29, 2021 8:57:19 PM
 */

public class ProgrammingExercise_03_21_DayOfTheWeek {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the needed parameters
        System.out.print("Enter year (e.g., 2012): ");
        int year = input.nextInt();
        
        System.out.print("Enter month (1 - 12): ");
        byte month = input.nextByte();
        
        System.out.print("Enter the day of the month (1 - 31): ");
        byte dayOfMonth = input.nextByte();
        
        if (month == 1 || month == 2) {
            year--; // Make the year the previous year for either Jan or Feb only
            
            month += 12; // Add a full calendar year to the month
        }
        
        int century = year / 100;
        
        int yearOfCentury = year % 100;
        
        // Calculate the day of the week
        int dayOfWeek = (dayOfMonth + ((26 * (month + 1)) / 10) + yearOfCentury +
                (yearOfCentury / 4) + (century / 4) + (5 * century)) % 7;
        
        // Display the name of the day of the week
        System.out.print("Day of the week is ");
        switch (dayOfWeek) {
            case 0: System.out.println("Saturday"); break;
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday");
        }
    }
}
