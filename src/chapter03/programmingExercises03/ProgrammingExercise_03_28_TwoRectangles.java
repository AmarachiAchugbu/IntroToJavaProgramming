package chapter03.programmingExercises03;

import java.util.Scanner;

/**
 * @author FSO
 * May 18, 2021 10:22:57 PM
 */

public class ProgrammingExercise_03_28_TwoRectangles {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the values for the two rectangles
        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        float r1X = input.nextFloat(),
              r1Y = input.nextFloat(),
              r1Width = input.nextFloat(),
              r1Height = input.nextFloat();
        
        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        float r2X = input.nextFloat(),
              r2Y = input.nextFloat(),
              r2Width = input.nextFloat(),
              r2Height = input.nextFloat();
        
//        (x > -horizontalDistance && x < horizontalDistance) &&
//                (y > -verticalDistance && y < verticalDistance)
//        
//        // Compare the dimensions of both rectangles and determine the result
//        if ((r1X >)) {
//            
//        }
    }
}
