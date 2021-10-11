package chapter02;

/**
 * @author FSO
 * Mar 18, 2021 3:04:14 AM
 */

public class Listing02_ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        // Create a Scanner object
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // Prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        
        // Compute area
        double area = radius * radius * 3.14159;
        
        // Display results
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
