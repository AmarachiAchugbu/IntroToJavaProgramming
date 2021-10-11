package chapter02;

/**
 * @author FSO
 * Mar 18, 2021 7:07:16 PM
 */

public class Listing05_DisplayTime {
    public static void main(String[] args) {
        // Prompt the user for input
        System.out.print("Enter an integer for seconds: ");
        int seconds = new java.util.Scanner(System.in).nextInt();
        
        int minutes = seconds / 60; // Find minutes in seconds
        int remainingSeconds = seconds % 60; // Seconds remaining
        
        System.out.println(seconds + " seconds is " + minutes + 
                " minutes and " + remainingSeconds + " seconds");
    }
}
