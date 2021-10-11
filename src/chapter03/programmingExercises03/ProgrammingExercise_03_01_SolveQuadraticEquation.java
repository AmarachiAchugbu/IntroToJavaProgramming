package chapter03.programmingExercises03;

import java.util.Scanner;

/**
 * @author FSO
 * Mar 25, 2021 7:41:32 PM
 */

public class ProgrammingExercise_03_01_SolveQuadraticEquation {
    /** Main method */
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter
        System.out.print("Enter the values for the coefficients a, b, and c: ");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();
        
        // Compute the discriminant of the quadratic equation
        float discriminant = (b * b) - 4 * a * c;
        
        // Declare two variables to store the roots of the quadratic equation
        float root1, root2;
        
        // Analyse the discriminant and display the result
        if (discriminant >= 0) {
            root1 = (float)(-b + Math.pow(discriminant, 0.5)) / (2 * a);
            
            System.out.print("The equation has ");
            
            if (discriminant == 0)
                System.out.println("one root " + root1);
            else {
                root2 = (float)(-b -Math.pow(discriminant, 0.5)) / (2 * a);
                System.out.println("two roots " + root1 + " and " + root2);
            }
        } else {
            System.out.println("The equations has no real roots");
        }
    }
}
