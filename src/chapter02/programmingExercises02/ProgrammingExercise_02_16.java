package chapter02.programmingExercises02;

import java.util.Scanner;

/**
 * @author FSO
 * Apr 19, 2021 8:03:47 PM
 */

public class ProgrammingExercise_02_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the side of the hexagon: ");
        double sideOfHexagon = input.nextDouble();
        
        // Compute the area of the hexagon
        double areaOfHexagon = (3 * Math.pow(3, 0.5) / 2) * Math.pow(sideOfHexagon, 2);
        
        // Display the result
        System.out.println("The area of the hexagon is " + areaOfHexagon);
    }
}
