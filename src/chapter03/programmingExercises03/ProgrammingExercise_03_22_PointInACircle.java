package chapter03.programmingExercises03;

import java.util.Scanner;

/**
 * @author FSO
 * Apr 29, 2021 9:40:34 PM
 */

public class ProgrammingExercise_03_22_PointInACircle {
    public static void main(String[] args) {
        // Declare a constant for the radius of the circle
        final float RADIUS_OF_CIRCLE = 10;
        
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the enter the coordinates
        System.out.print("Enter a point with two coordinates: ");
        float x = input.nextFloat(), y = input.nextFloat();
        
        // Compute the distance from the center to the point
        float distance = (float)(Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), 0.5));
        
        // Display the result of if the point is in the circle or not
        System.out.println("Point (" + x + ", " + y + ") is " +
                (distance <= RADIUS_OF_CIRCLE ? "" : "not ") + "in the circle");
    }
}
