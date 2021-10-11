package chapter03.programmingExercises03;

/**
 * @author FSO
 * Apr 29, 2021 1:09:29 AM
 */

public class ProgrammingExercise_03_18_CostOfShipping {
    public static void main(String[] args) {
        // Prompt the user to enter the weight to the package
        System.out.print("Enter the weight of the package (in pounds): ");
        float weight = new java.util.Scanner(System.in).nextFloat();
        
        // Using the given function, determine what the cost of shipping is
        if (weight > 20) {
            System.out.println("The package cannot be shipped");
        } else {
            System.out.print("The shipping cost of the package is $");
            if (weight > 0 && weight <= 1)
                System.out.println("3.5");
            else if (weight > 1 && weight <= 3)
                System.out.println("5.5");
            else if (weight > 3 && weight <= 10)
                System.out.println("8.5");
            else 
                System.out.println("10.5");
        }        
    }
}
