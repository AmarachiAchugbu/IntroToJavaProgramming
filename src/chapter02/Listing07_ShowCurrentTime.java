package chapter02;

/**
 * @author FSO
 * Mar 20, 2021 8:20:35 PM
 */

public class Listing07_ShowCurrentTime {
    public static void main(String[] args) {
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
        System.out.println("Current time is " + currentNumberOfHours + ":" +
                currentNumberOfMinutes + ":" + currentNumberOfSeconds + " GMT");
    }
}
