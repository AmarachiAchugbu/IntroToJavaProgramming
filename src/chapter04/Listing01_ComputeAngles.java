package chapter04;

import java.util.Scanner;

/**
 * @author FSO
 * Apr 13, 2021 5:04:21 PM
 */

public class Listing01_ComputeAngles {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter three points
        System.out.print("Enter three points: ");
        double x1 = input.nextDouble(), y1 = input.nextDouble();
        double x2 = input.nextDouble(), y2 = input.nextDouble();
        double x3 = input.nextDouble(), y3 = input.nextDouble();
        
        // Compute three sides
        double a = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2)); // for side BC
        double b = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2)); // for side AC
        double c = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); // for side AB
        
        // Compute the three angles using the Law of Cosines formula
        double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
        double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        double C = Math.toDegrees(Math.acos((c * c - a * a - b * b) / (-2 * a * b)));
        
        // Display the results
        System.out.println("The three angles are " + Math.round(A * 100) / 100.0 + " " +
                Math.round(B * 100) / 100.0 + " " + Math.round(C * 100) / 100.0);
    }
}
