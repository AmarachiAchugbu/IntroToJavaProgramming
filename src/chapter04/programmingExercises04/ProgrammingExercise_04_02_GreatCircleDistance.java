package chapter04.programmingExercises04;

import java.util.Scanner;

/**
 * @author FSO
 * Aug 25, 2021 1:54:40 PM
 */

public class ProgrammingExercise_04_02_GreatCircleDistance {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the latitude and longitude of two points
        System.out.print("Enter point1 (latitude and longitude) in degrees: ");
        double p1X = input.nextDouble(), p1Y = input.nextDouble();
        
        System.out.print("Enter point2 (latitude and longitude) in degrees: ");
        double p2X = input.nextDouble(), p2Y = input.nextDouble();
        
        // Convert all the given degree values to radians
        p1X = Math.toRadians(p1X);
        p1Y = Math.toRadians(p1Y);
        p2X = Math.toRadians(p2X);
        p2Y = Math.toRadians(p2Y);
        
        // Declare a constant for the average radius of the earth
        final double RADIUS_OF_EARTH = 6371.01;
        
        // Compute the Great Circle Distance between the two points given
        double greatDistance = RADIUS_OF_EARTH * 
                Math.acos(Math.sin(p1X) * Math.sin(p2X) 
                + Math.cos(p1X) * Math.cos(p2X) * Math.cos(Math.abs(p1Y - p2Y)));
        
        // Display the result
        System.out.println("The distance between the two points is " +
                greatDistance + " km");
    }
}
