package chapter04.programmingExercises04;

import java.util.Scanner;

/**
 * @author FSO
 * Aug 27, 2021 2:25:15 PM
 */

public class ProgrammingExercise_04_07_CornerPointCoordinates {
    public static void main(String[] args) {
        // Divide the total degrees in a circle by the number of vertices in a polygon
        double anglesInPentagon = 360 / 5;
        
        // Declare point 2 to be at the zero o'clock position
        double p2 = 90;
        
        // Declare and initialize point 1 by moving clockwise from point 2
        double p1 = p2 - anglesInPentagon;
        
        // Declare and initialize point 3 by moving counterclockwise from point 2
        double p3 = p2 + anglesInPentagon;
        
        // Declare and initialize point 4 by moving counterclockwise from point 3
        double p4 = p3 + anglesInPentagon;
        
        // Declare and initialize point 5 by moving clockwise from point 1
        double p5 = p1 - anglesInPentagon;        
        
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the radius of the bounding circle
        System.out.print("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();
        
        // Compute the coordinates for each of the points
        double p1x = radius * Math.cos(Math.toRadians(p1));
        double p1y = radius * Math.sin(Math.toRadians(p1));
        
        double p2x = radius * Math.cos(Math.toRadians(p2));
        double p2y = radius * Math.sin(Math.toRadians(p2));
        
        double p3x = radius * Math.cos(Math.toRadians(p3));
        double p3y = radius * Math.sin(Math.toRadians(p3));
        
        double p4x = radius * Math.cos(Math.toRadians(p4));
        double p4y = radius * Math.sin(Math.toRadians(p4));
        
        double p5x = radius * Math.cos(Math.toRadians(p5));
        double p5y = radius * Math.sin(Math.toRadians(p5));
        
        
        // Display the coordinates of the five points
        System.out.println("The coordinates of five points on the pentagon are");
        System.out.printf("(%.2f, %.2f)%n", p1x, p1y);
        System.out.printf("(%.2f, %.2f)%n", p2x, p2y);
        System.out.printf("(%.2f, %.2f)%n", p3x, p3y);
        System.out.printf("(%.2f, %.2f)%n", p4x, p4y);
        System.out.printf("(%.2f, %.2f)%n", p5x, p5y);
    }
}
