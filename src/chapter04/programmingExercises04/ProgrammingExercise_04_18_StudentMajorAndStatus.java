package chapter04.programmingExercises04;

/**
 * @author FSO
 * Oct 1, 2021 9:08:13 PM
 */

public class ProgrammingExercise_04_18_StudentMajorAndStatus {
    public static void main(String[] args) {
        // Prompt the user to enter two characters
        System.out.print("Enter two characters of an uppercase letter and a digit: ");
        String majorAndStatus = new java.util.Scanner(System.in).next();
        
        // Extract each of the digit
        char major = majorAndStatus.charAt(0);
        int status = Integer.parseInt(majorAndStatus.charAt(1) + "");
        
        // Validate the input
        if ((major != 'A' && major != 'C' && major != 'I') || status > 4) {
            System.out.println("Invalid input");
            System.exit(1);
        }
        
        // Determine the meaning denoted by both the major and status characters
        String majorString;
        String statusString;
        
        if (major == 'A') {
            majorString = "Accounting";
        } else if (major == 'C') {
            majorString = "Computer Science";
        } else
            majorString = "Information Management";
        
        if (status == 1) {
            statusString = "Freshman";
        } else if (status == 2) {
            statusString = "Sophomore";
        } else if (status == 3) {
            statusString = "Junior";
        } else
            statusString = "Senior";
        
        // Display the result
        System.out.println(majorString + " " + statusString);
    }
}
