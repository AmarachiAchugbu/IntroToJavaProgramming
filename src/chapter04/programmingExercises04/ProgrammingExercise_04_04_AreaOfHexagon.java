package chapter04.programmingExercises04;

import java.util.Scanner;

/**
 * @author FSO
 * Aug 26, 2021 2:54:49 AM
 */

public class ProgrammingExercise_04_04_AreaOfHexagon {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the length of a side of a hexagon
        System.out.print("Enter the length of a side of the hexagon: ");
        double lengthOfASide = input.nextDouble();
        
        // Calculate the area of the hexagon
        double areaOfHexagon = (6 * Math.pow(lengthOfASide, 2)) 
                / (4 * Math.tan(Math.PI / 6));
        
        // Display the result value
        System.out.println("The area of the hexagon is " 
                + Math.round(areaOfHexagon * 100) / 100.0);
    }
}
