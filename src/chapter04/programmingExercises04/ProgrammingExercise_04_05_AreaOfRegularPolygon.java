package chapter04.programmingExercises04;

import java.util.Scanner;

/**
 * @author FSO
 * Aug 26, 2021 2:58:52 AM
 */

public class ProgrammingExercise_04_05_AreaOfRegularPolygon {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the number of sides of the polygon
        System.out.print("Enter the number of sides of the polygon: ");
        int numberOfSides = input.nextInt();
        
        // Prompt the user to enter the length of a side of the polygon
        System.out.print("Enter the length of a side of the polygon: ");
        double lengthOfASide = input.nextDouble();
        
        // Calculate the area of the hexagon
        double areaOfPolygon = (numberOfSides * Math.pow(lengthOfASide, 2)) 
                / (4 * Math.tan(Math.PI / numberOfSides));
        
        // Display the result value
        System.out.println("The area of the polygon is " + areaOfPolygon);
    }
}
