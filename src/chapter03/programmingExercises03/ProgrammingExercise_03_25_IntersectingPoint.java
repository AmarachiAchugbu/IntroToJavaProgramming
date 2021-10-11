package chapter03.programmingExercises03;

import java.util.Scanner;

/**
 * @author FSO
 * May 18, 2021 10:20:51 PM
 */

public class ProgrammingExercise_03_25_IntersectingPoint {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the coordinates of four points
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        float x1 = input.nextFloat(), y1 = input.nextFloat(), 
              x2 = input.nextFloat(), y2 = input.nextFloat(),
              x3 = input.nextFloat(), y3 = input.nextFloat(), 
              x4 = input.nextFloat(), y4 = input.nextFloat();
        
        // Declare and compute the values for the coefficients a, b, c, and d
        float a = y1 - y2,
              b = -(x1 - x2),
              c = y3 - y4,
              d = -(x3 - x4);
              
        
        float determinant = (a * d - b * c);
        
        // Display the result if the equation has a solution or not
        if (determinant != 0) {
            // Declare and compute the values for coefficients e and f
            float e = (a * x1) + (b * y1),
                  f = (c * x3) + (d * y3);
            
            // Declare variables and compute the values for the coordinates of the intersecting point
            float x = (e * d - b * f) / determinant; // coordinate of the x-axis
            float y = (a * f - e * c) / determinant; // coordinate of the y-axis
            
            // Display the intersecting point
            System.out.println("The intersecting point is at (" + x + 
                    ", " + y + ")");
        } else // Display when the equation has no solutions
            System.out.println("The two lines are parallel");
    }
}
