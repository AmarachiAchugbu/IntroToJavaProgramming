package chapter03;

/**
 * @author FSO
 * Mar 23, 2021 9:29:41 PM
 */

public class Listing06_TestBooleanOperators {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        System.out.print("Enter an integer: "); // Prompt the user the enter an integer
        int number = new java.util.Scanner(System.in).nextInt(); 
        
        if (number % 2 == 0 && number % 3 == 0)
            System.out.println(number + " is divisible by 2 and 3.");
        
        if (number % 2 == 0 || number % 3 == 0)
            System.out.println(number + " is divisible by 2 or 3.");
        
        if (number % 2 == 0 ^ number % 3 == 0)
            System.out.println(number + " is divisible by 2 or 3, but not both.");
    }
}
