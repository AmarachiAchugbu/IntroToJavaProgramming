package chapter03.programmingExercises03;

import java.util.Scanner;

/**
 * @author FSO
 * May 18, 2021 10:34:14 PM
 */

public class ProgrammingExercise_03_32_PointPosition {
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
        
        // Display the result
        if (pointPosition != 0) {
            System.out.println("p2 is on the " 
                    + ((pointPosition > 0) ? "left" : "right") + " side of the line");
        } else {
            System.out.println("p2 is on the same line");
        }
    }
}
