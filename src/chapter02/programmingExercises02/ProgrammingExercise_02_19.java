package chapter02.programmingExercises02;

import java.util.Scanner;

/**
 * @author FSO
 * Apr 19, 2021 8:25:30 PM
 */

public class ProgrammingExercise_02_19 {
    
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the coordinates of three points
        System.out.println("Enter three points for a triangle");
        System.out.print("x1: "); 
        double x1 = input.nextDouble();        
        System.out.print("y1: ");
        double y1 = input.nextDouble();
        
        System.out.print("x2: "); 
        double x2 = input.nextDouble();        
        System.out.print("y2: ");
        double y2 = input.nextDouble();
        
        System.out.print("x3: "); 
        double x3 = input.nextDouble();        
        System.out.print("y3: ");
        double y3 = input.nextDouble();
        
        // Compute the dimensions of the three sides of the triangle using 
        // the three points given by the user
        double sideAB = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        double sideBC = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
        double sideAC = Math.pow(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2), 0.5);
        
        // Next, we compute the overall side of the triangle
        double s = (sideAB + sideBC + sideAC) / 2;
        
        // Now, we compute the area of the triangle using the parameters above
        double areaOfTriangle = Math.pow(s * (s - sideAB) * (s - sideBC) * (s - sideAC), 
                0.5);
        
        // Display the result
        System.out.println("The area of the triangle is " + 
                (int)(areaOfTriangle * 10) / 10.0);
    }
}
