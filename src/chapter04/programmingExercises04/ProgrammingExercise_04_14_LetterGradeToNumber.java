package chapter04.programmingExercises04;

import java.util.Scanner;

/**
 * @author FSO
 * Sep 7, 2021 8:33:43 PM
 */

public class ProgrammingExercise_04_14_LetterGradeToNumber {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a letter grade of A, B, C, D or F
        System.out.print("Enter a letter grade: ");
        String letterGradeString = input.next();
        char letterGrade = letterGradeString.charAt(0);
        
        // Check if the input is valid
        if (letterGrade == 'E' || letterGrade > 'F' || !Character.isLetter(letterGrade)
                || letterGradeString.length() > 1) {
            System.out.println(letterGradeString + " is an invalid grade");
            System.exit(1);
        }
        
        // Determine the corresponding numeric value of the valid input
        int numericValue = (letterGrade < 'E') ? ('E' - letterGrade) : 0;
        
        // Display the result
        System.out.println("The numeric value for grade " + letterGrade + " is " +
                numericValue);
    }
}
