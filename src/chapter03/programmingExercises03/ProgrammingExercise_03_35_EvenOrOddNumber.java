package chapter03.programmingExercises03;

/**
 * @author FSO
 * Mar 26, 2021 1:46:37 PM
 */

public class ProgrammingExercise_03_35_EvenOrOddNumber {
    public static void main(String[] args) {
        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = new java.util.Scanner(System.in).nextInt();
        
        // Determine whether the integer is an odd number or not and display the result
        System.out.println(number + " is an " + 
                ((number % 2 == 0) ? "even" : "odd") + " number");
    }
}
