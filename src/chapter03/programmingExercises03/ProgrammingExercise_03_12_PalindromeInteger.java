package chapter03.programmingExercises03;

/**
 * @author FSO
 * Mar 26, 2021 3:15:56 PM
 */

public class ProgrammingExercise_03_12_PalindromeInteger {
    public static void main(String[] args) {
        // Prompt the user to enter a three-digit integer
        System.out.print("Enter a three-digit integer: ");
        short palindromeInteger = new java.util.Scanner(System.in).nextShort();
        
        if (palindromeInteger < 100 || palindromeInteger > 999) {
            System.out.println("Error: Invalid Input.");
            System.out.println("Should be an integer between 100 and 999");
            System.exit(1);
        }
        
        // Extract the first and three digits
        byte firstDigit = (byte)(palindromeInteger / 100);
        byte thirdDigit = (byte)(palindromeInteger % 10);
        
        // Display the result
        System.out.println(palindromeInteger + " is" + 
                ((firstDigit == thirdDigit) ? "" : " not") + " a palindrome");
    }
}
