package chapter02;

/**
 * @author FSO
 * Mar 18, 2021 5:04:02 PM
 */

public class Listing04_ComputeAreaWithConstant {
    public static void main(String[] args) {
        final double PI = 3.14159; // Declare a constant
        
        // Create a Scanner object
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // Prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        
        // Compute area
        double area = radius * radius * PI;
        
        // Display results
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
