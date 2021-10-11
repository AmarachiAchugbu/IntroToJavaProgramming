package chapter06;

/**
 * @author FSO
 * Sep 6, 2021 3:24:45 AM
 */

public class Listing01_TestMax {
    /** Main method */
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int k = max(i, j);
        
        System.out.println("The maximum of " + i + " and " + j + " is " + k);
    }
    
    /** Return the maximum of two numbers */
    public static int max(int num1, int num2) {
        int result;
        
        result = (num1 > num2) ? num1 : num2;
        
        return result;
    }
}
