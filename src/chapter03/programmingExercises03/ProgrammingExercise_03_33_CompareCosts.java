package chapter03.programmingExercises03;

import java.util.Scanner;

/**
 * @author FSO
 * May 18, 2021 10:34:48 PM
 */

public class ProgrammingExercise_03_33_CompareCosts {
    public static void main(String[] args) {
        // Create a Scanner object to enter accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the weight and price of 2 different packages
        System.out.print("Enter weight and price for package 1: ");
        float weight1 = input.nextFloat(), price1 = input.nextFloat();
        
        System.out.print("Enter weight and price for package 2: ");
        float weight2 = input.nextFloat(), price2 = input.nextFloat();
        
        // Compute the cost per weight for each package
        float costPerWeight1 = price1 / weight1; // for package 1
        float costPerWeight2 = price2 / weight2; // for package 2
        
        // Compare which package has the better price and display the result
        if (costPerWeight1 != costPerWeight2) {
            System.out.println("Package " 
                    + ((costPerWeight1 < costPerWeight2) ? "1" : "2") 
                    + " has a better price.");
        } else
            System.out.println("The two packages have the same price");
    }
}
