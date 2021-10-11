package chapter04.programmingExercises04;

/**
 * @author FSO
 * Oct 1, 2021 10:13:31 PM
 */

public class ProgrammingExercise_04_21_CheckSSN {
    public static void main(String[] args) {
        // Prompt the user to enter a Social Security Number (SSN)
        System.out.print("Enter a SSN: ");
        String ssn = new java.util.Scanner(System.in).next();
        
        int firstDash = ssn.indexOf('-');
        int secondDash = ssn.lastIndexOf('-');
        
        // Extract the three sets of numbers
        String set1 = ssn.substring(0, firstDash);
        String set2 = ssn.substring(firstDash + 1, secondDash);
        String set3 = ssn.substring(secondDash + 1);
        
        // Parse the strings
    }
}
