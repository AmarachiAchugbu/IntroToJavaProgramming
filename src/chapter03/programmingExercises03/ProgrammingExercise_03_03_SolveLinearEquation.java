package chapter03.programmingExercises03;

import java.util.Scanner;

/**
 * @author FSO
 * Apr 25, 2021 11:05:20 PM
 */

public class ProgrammingExercise_03_03_SolveLinearEquation {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the coefficients of both equations
        System.out.print("Enter a, b, c, d, e, and f: ");
        float a = input.nextFloat(), b = input.nextFloat(), c = input.nextFloat(),
              d = input.nextFloat(), e = input.nextFloat(), f = input.nextFloat();
        
        float x, y; // Declares variables to hold the value of x and y
        
        float determinant = (a * d - b * c);
        
        // Display the result if the equation has a solution or not
        if (determinant != 0) {
            x = (e * d - b * f) / determinant;
            y = (a * f - e * c) / determinant;
            
            // Display the solution
            System.out.println("x is " + x + " and y is " + y);
        } else 
            System.out.println("The equation has no solution");
    }
}
