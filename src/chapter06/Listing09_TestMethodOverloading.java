package chapter06;

/**
 * @author FSO
 * Sep 10, 2021 4:08:33 PM
 */

public class Listing09_TestMethodOverloading {
    /** Main method */
    public static void main(String[] args) {
        // Invoke the max method with int parameters
        System.out.println("The maximum of 3 and 4 is " + max(3, 4));
        
        // Invoke the max method with double parameters
        System.out.println("The maximum of 3.0 and 5.4 is " + max(3.0, 5.4));
        
        // Invoke the max method with int parameters
        System.out.println("The maximum of 3.0 and 5.4, and 10.14 is " 
                + max(3.0, 5.4, 10.14));
    }
    
    /** Return the max of two integer values */
    public static int max(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }
    
    /** Find the max of two double values */
    public static double max(double num1, double num2) {
        return (num1 > num2) ? num1 : num2;
    }
    
    /** Return the max of three double values */
    public static double max(double num1, double num2, double num3) {
        return max(max(num1, num2), num3);
    }
}
