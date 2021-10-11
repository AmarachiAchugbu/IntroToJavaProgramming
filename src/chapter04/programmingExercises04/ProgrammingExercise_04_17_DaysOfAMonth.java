package chapter04.programmingExercises04;

import java.util.Scanner;

/**
 * @author FSO
 * Sep 9, 2021 8:11:06 PM
 */

public class ProgrammingExercise_04_17_DaysOfAMonth {
    public static void main(String[] args) {
        // 
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        
        System.out.print("Enter the first three letters of the month: ");
        String month = input.next();
        
        // Check if the 
        if (!Character.isUpperCase(month.charAt(0))) {
            System.out.println(month + " is not a correct month name");
            System.exit(1);
        }
        
        // Declare a variable that stores the number of days
        byte numOfDays;
        
        // Check if the year is a leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        switch (month) {
            case "Feb": 
                numOfDays = isLeapYear ? (byte)29 : (byte)28;
                break;
            case "Apr":
            case "Jun":
            case "Sep":
            case "Nov": numOfDays = 30; break;
            default: numOfDays = 31;
        }
        
        System.out.println(month + " " + year + " has " + numOfDays + " days");        
    }
}
