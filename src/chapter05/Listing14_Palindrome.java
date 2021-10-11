package chapter05;

import java.util.Scanner;

/**
 * @author FSO
 * Apr 17, 2021 3:16:04 PM
 */

public class Listing14_Palindrome {
    /** Main Method */
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        
        // Declare variables for the indicies of the string
        int low = 0; // The index of the first character in the string
        int high = s.length() - 1; // The index of the last character in the string
        
        boolean isPalindrome = true;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                isPalindrome = false;
                break;
            }
            
            low++; high--;
        }
        
        // Display the result
        System.out.println(s + " is" + (isPalindrome ? "" : " not") + " a palindrome");
    }
}
