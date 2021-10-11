package chapter06;

import java.util.Scanner;

/**
 * @author FSO
 * Sep 11, 2021 6:05:40 PM
 */

public class Listing12 {
    /** Main method */
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the year
        System.out.print("Enter full year (e.g., 2012): ");
        int year = input.nextInt();
        
        // Prompt the user to enter month
        System.out.print("Enter month as a number between 1 and 12: ");
        int month = input.nextInt();
        
        // Print calendar for the month of the year
        printMonth(month, year);
    }
    
    public static void printMonth(int month, int year) {
        // Print the headings of the calendar
        printMonthTitle(month, year);
        
        // Print the body of the calendar
        printMonthBody(month, year);
    }
    
    /** Print the month title, e.g. March 2012 */
    public static void printMonthTitle(int month, int year) {
        System.out.println("\n\t" + getMonthName(month) + " " + year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }
    
    public static String getMonthName(int month) {
        switch (month) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";            
            case 10: return "October";            
            case 11: return "November";
            default: return "December";
        }
    }
    
    public static void printMonthBody(int month, int year) {
        // Get start day of the week for the first date on the month
        int zellersStartDay = getStartDay(month, year);
        
        // Adjust the start day from the algorithm
        int startDay = (zellersStartDay == 0) ? 6 : --zellersStartDay;
        
        // Get the number of days in the month
        int numOfDaysInMonth = getNumberOfDaysInMonth(month, year);
        
        // Pad space before the first day of the month
        int i;
        for (i = 0; i < startDay; i++) 
            System.out.print("    ");
        
        for (i = 1; i <= numOfDaysInMonth; i++) {
            System.out.printf("%4d", i);
            
            if ((i + startDay) % 7 == 0) 
                System.out.println();
        }       
        
        System.out.println();
    }
    
    public static int getStartDay(int month, int year) {
        // Make the year the previous year for either Jan or Feb only
        if (month == 1 || month == 2) {
            year--;
            
            month += 12; // Add a full calendar year to the month
        }
        
        int century = year / 100;
        
        int yearOfCentury = year % 100;
        
        // Calculate the day of the week using Zeller's Congruence
        int dayOfWeek = (1 + ((26 * (month + 1)) / 10) + yearOfCentury +
                (yearOfCentury / 4) + (century / 4) + (5 * century)) % 7;
        
        return dayOfWeek;      
    }
    
    public static int getNumberOfDaysInMonth(int month, int year) {
        switch (month) {
            case 2: // For the month of February
                return isLeapYear(year) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11: return 30; // For months Apr, Jun, Sept, and Nov
            default: return 31; // For the remainder months
        }
    }
    
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
