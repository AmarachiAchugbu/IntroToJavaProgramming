package chapter04.programmingExercises04;

import java.util.Scanner;

/**
 * @author FSO
 * Oct 1, 2021 10:30:55 PM
 */

public class ProgrammingExercise_04_22_CheckSubstring {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter two strings
        System.out.print("Enter string s1: ");
        String s1 = input.next();
        
        System.out.print("Enter string s2: ");
        String s2 = input.next();
        
        // Check the strings
        System.out.println(s2 + " is" + (s1.contains(s2) ? "" : " not") 
                + " a substring of " + s1);
    }
}
