package chapter03.programmingExercises03;

import java.util.Scanner;

/**
 * @author FSO
 * Mar 26, 2021 2:41:11 PM
 */

public class ProgrammingExercise_03_08_SortThreeIntegers {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter three integers
        System.out.print("Enter three separate integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        
        // Declare three new variables to store the sorted numbers
        int sortedNumber1 = 0, sortedNumber2 = 0, sortedNumber3 = 0;
        
        // Sort the three integers
        if (number1 <= number2 && number1 <= number3) {
            sortedNumber1 = number1;
            
            if (number2 <= number3) {
                sortedNumber2 = number2;
                sortedNumber3 = number3;
            } else {
                sortedNumber2 = number3;
                sortedNumber3 = number2;
            }                
        } else if (number2 <= number1 && number2 <= number3) {
            sortedNumber1 = number2;
            
            if (number1 <= number3) {
                sortedNumber2 = number1;
                sortedNumber3 = number3;
            } else {
                sortedNumber2 = number3;
                sortedNumber3 = number1;
            }
        } else if (number3 <= number1 && number3 <= number2) {
            sortedNumber1 = number3;
            
            if (number1 <= number2) {
                sortedNumber2 = number1;
                sortedNumber3 = number2;
            } else {
                sortedNumber2 = number2;
                sortedNumber3 = number1;
            }
        } 
        
        // Display the results
        System.out.println("The sorted order for " + number1 + " " + number2 + 
                " " + number3 + " is: " + sortedNumber1 + " " + sortedNumber2 +
                " " + sortedNumber3);
    }
}
