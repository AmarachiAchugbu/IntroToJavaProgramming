package chapter02.programmingExercises02;

/**
 * @author FSO
 * Apr 18, 2021 9:31:59 PM
 */

public class ProgrammingExercise_02_08 {
    public static void main(String[] args) {
        // Prompt the user to enter their time zone offset to the GMT
        System.out.print("Enter the time zone offset to GMT: ");
        byte timeZoneOffset = new java.util.Scanner(System.in).nextByte();
        
        // Obtain the total milliseconds since midnight Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();
        
        // Obtain the total number of seconds
        long totalNumberOfSeconds = totalMilliseconds / 1000;
        
        // Obtain the current number of seconds
        long currentNumberOfSeconds = totalNumberOfSeconds % 60;
        
        // Obtain the total number of minutes
        long totalNumberOfMinutes = totalNumberOfSeconds / 60;
        
        // Obtain the current number of minutes
        long currentNumberOfMinutes = totalNumberOfMinutes % 60;
        
        // Obtain the total number of hours
        long totalNumberOfHours = totalNumberOfMinutes / 60;
        
        // Obtain the current number of hours
        long currentNumberOfHours = totalNumberOfHours % 24;
        
        // Display the current time
        System.out.println("The current time is " + (currentNumberOfHours + timeZoneOffset) 
                + ":" + currentNumberOfMinutes + ":" + currentNumberOfSeconds);
    }
}
