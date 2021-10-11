package chapter03.programmingExercises03;

import java.util.Scanner;

/**
 * @author FSO
 * May 18, 2021 10:22:14 PM
 */

public class ProgrammingExercise_03_27_PointInATriangle {
    public static void main(String[] args) {
        // Create a Scanner object to accept user's input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user for the point's x- and y-coordinates
        System.out.print("Enter a point's x- and y-coordinates: ");
        double pointX = input.nextDouble(), pointY = input.nextDouble();
        
        // Declare and assign values for the points of the triangle
        // The parameters aX, aY, bX, and cX are excluded because the value is 0
        double bY = 100, cX = 200;
        
        // Compute the area of the right-angle triangle ABC
        double areaOfTriangleABC = 0.5 * (cX * bY);
        
        // Next, compute the area of triangle PAB
        double areaOfTrianglePAB = 0.5 * (pointX * bY);
        
        // Next, compute the area of triangle PBC
        double areaOfTrianglePBC = 0.5 * ((pointX * bY) + (cX * (pointY - bY)));
        // If the result for area of a triangle is negative, we multiply by -1
        if (areaOfTrianglePBC < 0) {
            areaOfTrianglePBC *= -1;
        }
        
        // Next, compute the area of triangle PAC
        double areaOfTrianglePAC = 0.5 * (cX * pointY);
        
        // Compare and then display the results
        boolean isInsideTriangle = (areaOfTrianglePAB + areaOfTrianglePBC + areaOfTrianglePAC) 
                == areaOfTriangleABC;
        
        System.out.println("The point is" + (isInsideTriangle ? "" : " not") + 
                " in the triangle");
    }
}
