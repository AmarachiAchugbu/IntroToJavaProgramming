package chapter02.programmingExercises02;

import java.util.Scanner;

/**
 * @author FSO
 * Apr 19, 2021 6:57:51 PM
 */

public class ProgrammingExercise_02_15 {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter two points
        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble(), y1 = input.nextDouble();
        
        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble(), y2 = input.nextDouble();
        
        double changeInX = x2 - x1, changeInY = y2 - y1;
        
        // Compute the distance between the two points
        double distance = Math.pow(Math.pow(changeInX, 2) + Math.pow(changeInY, 2)
                , 0.5);
        
        // Display the result
        System.out.println("The distance between the two points is " + distance);
    }
}
