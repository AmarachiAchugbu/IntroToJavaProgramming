package chapter03.programmingExercises03;

import java.util.Scanner;

/**
 * @author FSO
 * May 18, 2021 10:17:56 PM
 */

public class ProgrammingExercise_03_23_PointInARectangle {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the coordinates of a point
        System.out.print("Enter a point with two coordinates: ");
        float x = input.nextFloat(), y = input.nextFloat();
        
        // Declare the constants for the width and height of the rectangle
        final float WIDTH_OF_RECTANGLE = 10;
        final float HEIGHT_OF_RECTANGLE = 5;
        
        // Compute the distance from the center to the end of the +x-axis of the shape
        float xToCenterDistance = WIDTH_OF_RECTANGLE / 2;
        
        // Compute the distance from the center to the end of the +y-axis of the shape
        float yToCenterDistance = HEIGHT_OF_RECTANGLE / 2;
        
        // Declare a boolean variable and assign with a boolean expression of 
        // if point is within rectangle
        boolean isWithinRectangle = 
                (x > -xToCenterDistance && x < xToCenterDistance) &&
                (y > -yToCenterDistance && y < yToCenterDistance);
        
        // Display the result of if the point is in the rectangle
        System.out.println("Point (" + x + ", " + y + ") is " +
                (isWithinRectangle ? "" : "not ") + "in the rectangle");
    }
}
