package chapter03;

/**
 * @author FSO
 * Mar 22, 2021 5:00:23 AM
 */

public class Listing03_SubtractionQuiz {
    /** Main method */
    public static void main(String[] args) {
        // Generate two random single-digit integers
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        
        // If number1 is greater than number2, swap
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        
        // Prompt the user for an answer
        System.out.print("What is " + number1 + " - " + number2 + "? ");
        int answer = new java.util.Scanner(System.in).nextInt();
        
        // Grade the answer and display the result
        if (number1 - number2 == answer) {
            System.out.println("You are correct!");
        } else {
            System.out.println("Your answer is wrong");
            System.out.println(number1 + " - " + number2 + " should be " + 
                    (number1 - number2));
        }
    }
}
