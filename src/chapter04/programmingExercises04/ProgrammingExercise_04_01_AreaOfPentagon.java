package chapter04.programmingExercises04;

import java.util.Scanner;

/**
 * @author FSO
 * Aug 23, 2021 10:51:54 PM
 */

public class ProgrammingExercise_04_01_AreaOfPentagon {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the length from the center of a pentagon to a vertex
        System.out.print("Enter the length from the center of the pentagon to a vertex: ");
        double lengthFromCenter = input.nextDouble();
        
        // Compute the length of a side of the pentagon with the user-supplied value
        double lengthOfASide = 2 * lengthFromCenter * Math.sin(Math.PI / 5);
        
        // Calculate the area of the pentagon
        double areaOfPentagon = (5 * Math.pow(lengthOfASide, 2)) 
                / (4 * Math.tan(Math.PI / 5));
        
        // Display the result value
        System.out.println("The area of the pentagon is " 
                + Math.round(areaOfPentagon * 100) / 100.0);
    }
}
