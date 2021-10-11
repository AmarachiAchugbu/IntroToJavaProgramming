package chapter02.programmingExercises02;

import java.util.Scanner;

/**
 * @author FSO
 * Mar 21, 2021 8:53:34 PM
 */

public class ProgrammingExercise_02_02 {
    /** Main method */
    public static void main(String[] args) {
        // Creates a Scanner object to accept the prompted user's input
        Scanner input = new Scanner(System.in);
        
        /* 10th Edition */
        System.out.println("10th Edition");
        System.out.println("============");
        System.out.println();
        
        // Prompt the user to enter the necessary values
        System.out.print("Enter the radius and length of a cylinder: ");
        float radiusOfCylinder = input.nextFloat(); // stores the radius of the cylinder
        float lengthOfCylinder = input.nextFloat(); // stores the length of the cylinder
        
        // Dynamically initialize the area and volume using the provided values
        float areaOfCircle = (float)(Math.pow(radiusOfCylinder, 2) * Math.PI);
        float volumeOfCylinder = areaOfCircle * lengthOfCylinder;
        
        // Display the results of the computation
        System.out.println("The area of the circle of the cylinder is " + areaOfCircle);
        System.out.println("The volume of the cylinder is " + volumeOfCylinder);
        System.out.println();
        
        System.out.println("=================================================");
        System.out.println();
        
        /* 11th Edition */
        System.out.println("11th Edition");
        System.out.println("============");
        System.out.println();
        
        // Prompts the user to enter the lenght of a side and the height of the triangle
        System.out.print("Enter length of the sides and height of the Equilateral triangle: ");
        double lengthOfSides = input.nextDouble();
        double heightOfTriangle = input.nextDouble();
        
        // Computes the area of the triangle
        double areaOfTriangle = (Math.pow(3, 0.5) / 4) * Math.pow(lengthOfSides, 2);
        
        // Computes the volume of the triangle
        double volumeOfTriangle = areaOfTriangle * heightOfTriangle;
        
        // Display the results for the area and volume of the triangle
        System.out.println("The area is " + (int)(areaOfTriangle * 100) / 100.0);
        System.out.println("The volume of the Triangular Prism is " + 
                (int)(volumeOfTriangle * 100) / 100.0);
    }
}
