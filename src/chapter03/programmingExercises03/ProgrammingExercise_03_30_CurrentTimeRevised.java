package chapter03.programmingExercises03;

/**
 * @author FSO
 * May 1, 2021 10:46:22 PM
 */

public class ProgrammingExercise_03_30_CurrentTimeRevised {
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
        
        long realHours = (currentNumberOfHours + timeZoneOffset);
        
        boolean isGreaterThan12 = realHours > 12;
        
        // Display the current time
        System.out.print("The current time is " + 
                (isGreaterThan12 ? realHours - 12 : realHours));
        System.out.print(":"  + currentNumberOfMinutes + ":" + currentNumberOfSeconds);
        System.out.println(isGreaterThan12 ? " PM" : " AM");
    }
}
