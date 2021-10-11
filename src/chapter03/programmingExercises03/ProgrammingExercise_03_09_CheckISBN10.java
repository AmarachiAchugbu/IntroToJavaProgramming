package chapter03.programmingExercises03;

/**
 * @author FSO
 * Apr 27, 2021 1:21:30 PM
 */

public class ProgrammingExercise_03_09_CheckISBN10 {
    public static void main(String[] args) {
        // Prompt the user to enter the first 9 digits fo the ISBN
        System.out.print("Enter the first 9 digits of an ISBN as an integer: ");
        int isbn = new java.util.Scanner(System.in).nextInt();
        
        // Declare to 
        int remainingDigit = isbn;        
        
        int checksum = 0; // Declare a variable to hold the checksum
        
        // Compute from the last digit to the first
        checksum += (remainingDigit % 10) * 9;
        remainingDigit /= 10;
        checksum += (remainingDigit % 10) * 8;
        remainingDigit /= 10;
        checksum += (remainingDigit % 10) * 7;
        remainingDigit /= 10;
        checksum += (remainingDigit % 10) * 6;
        remainingDigit /= 10;
        checksum += (remainingDigit % 10) * 5;
        remainingDigit /= 10;
        checksum += (remainingDigit % 10) * 4;
        remainingDigit /= 10;
        checksum += (remainingDigit % 10) * 3;
        remainingDigit /= 10;
        checksum += (remainingDigit % 10) * 2;
        remainingDigit /= 10;
        checksum += (remainingDigit % 10);
        
        // Display the result
        System.out.print("The ISBN-10 number is ");
        System.out.print((isbn / 100000000 == 0) ? "0" : "");
        System.out.println(isbn + 
                ((checksum % 11 == 10) ? "X" : "" + (checksum % 11)));
    }
}
