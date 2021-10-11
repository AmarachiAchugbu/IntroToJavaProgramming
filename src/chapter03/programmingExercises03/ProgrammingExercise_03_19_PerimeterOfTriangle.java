package chapter03.programmingExercises03;

import java.util.Scanner;

/**
 * @author FSO
 * Apr 29, 2021 1:20:47 AM
 */

public class ProgrammingExercise_03_19_PerimeterOfTriangle {
    public static void main(String[] args) {
        // Create Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the dimensions for three edges of a triangle
        System.out.print("Enter the dimensions for three edges of a triangle: ");
        double edge1 = input.nextDouble();
        double edge2 = input.nextDouble();
        double edge3 = input.nextDouble();
        
        if ((edge1 + edge2 <= edge3) || (edge1 + edge3 <= edge2) || (edge2 + edge3 <= edge1)) {
            System.out.println("Error: invalid input.");
            System.exit(1);
        }
        
        // Compute the perimeter with the valid input
        double perimeterOfTriangle = edge1 + edge2 + edge3;
        
        // Display the result
        System.out.println("The perimeter of the triangle is " + perimeterOfTriangle);
    }
}
