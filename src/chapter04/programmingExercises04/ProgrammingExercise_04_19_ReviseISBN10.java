package chapter04.programmingExercises04;

/**
 * @author FSO
 * Oct 1, 2021 9:49:43 PM
 */

public class ProgrammingExercise_04_19_ReviseISBN10 {
    public static void main(String[] args) {
        // Prompt the user to enter the first 9 digits fo the ISBN
        System.out.print("Enter the first 9 digits of an ISBN number: ");
        String isbn = new java.util.Scanner(System.in).next();
        
        int isbnInteger = Integer.parseInt(isbn); // Turns the string to a number       
        
        int checksum = 0; // Declare a variable to hold the checksum
        
        // Compute from the last digit to the first
        checksum += (isbnInteger % 10) * 9; // Computes the last digit
        isbnInteger /= 10;
        checksum += (isbnInteger % 10) * 8; // Computes the eight digit
        isbnInteger /= 10;
        checksum += (isbnInteger % 10) * 7; // Computes the seventh digit
        isbnInteger /= 10;
        checksum += (isbnInteger % 10) * 6; // Computes the sixth digit
        isbnInteger /= 10;
        checksum += (isbnInteger % 10) * 5; // Computes the fifth digit
        isbnInteger /= 10;
        checksum += (isbnInteger % 10) * 4; // Computes the fourth digit
        isbnInteger /= 10;
        checksum += (isbnInteger % 10) * 3; // Computes the third digit
        isbnInteger /= 10;
        checksum += (isbnInteger % 10) * 2; // Computes the second digit
        isbnInteger /= 10;
        checksum += (isbnInteger % 10); // Computes the first digit
        
        // Display the result
        System.out.print("The ISBN-10 number is " + isbn);
        System.out.println(((checksum % 11 == 10) ? "X" : "" + (checksum % 11)));
    }
}
