package chapter03.programmingExercises03;

import java.util.Scanner;

/**
 * @author FSO
 * May 18, 2021 10:35:08 PM
 */

public class ProgrammingExercise_03_34_PointOnLineSegment {
    public static void main(String[] args) {
        // Create a Scanner object to accept the user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the coordinates for three separate points
        System.out.print("Enter the coordinates for p0: "); // i.e. p0(x, y)
        float p0x = input.nextFloat(), p0y = input.nextFloat();
        
        System.out.print("Enter the coordinates for p1: "); // i.e. p1(x, y)
        float p1x = input.nextFloat(), p1y = input.nextFloat();
        
        System.out.print("Enter the coordinates for p2: "); // i.e. p2(x, y)
        float p2x = input.nextFloat(), p2y = input.nextFloat();
        
        // Compute the position of the point using the expression provided
        float pointPosition = (p1x - p0x) * (p2y - p0y) - (p2x - p0x) * (p1y - p0y);
        
        boolean onLineSegment = ((p2x >= p0x && p2y >= p0y) || (p2x >= p1x && p2y >= p1y))
                && ((p2x <= p1x && p2y <= p1y) || (p2x <= p0x && p2y <= p0y));
        
        // Display the result of if p2 is on the line segment from p0 to p1
        System.out.println("(" + p2x + ", " + p2y + ") is" +
                ((pointPosition == 0 && onLineSegment) ? "" : " not") + " on the line segment from (" +
                p0x + ", " + p0y + ") to (" + p1x + ", " + p1y + ")");
    }
}
