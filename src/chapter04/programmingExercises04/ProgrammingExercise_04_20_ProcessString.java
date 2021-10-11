package chapter04.programmingExercises04;

/**
 * @author FSO
 * Oct 1, 2021 10:07:27 PM
 */

public class ProgrammingExercise_04_20_ProcessString {
    public static void main(String[] args) {
        // Prompt the user to enter a string
        System.out.print("Enter any string you like: ");
        String userInput = new java.util.Scanner(System.in).next();
        
        // Process the string
        System.out.println("The length of the string is " + userInput.length());
        System.out.println("The last character of the string is " 
                + userInput.charAt(userInput.length() - 1));
    }
}
