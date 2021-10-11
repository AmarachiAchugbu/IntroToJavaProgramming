package chapter05;

import java.util.Scanner;

/**
 * @author FSO
 * Apr 14, 2021 7:41:19 PM
 */

public class Listing04_SubtractionQuizLoop {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 5; // Number of questions
        int correctCount = 0; // Count the number of correct answers
        int count = 0; // Count the number of questions
        long startTime = System.nanoTime();
        String output = ""; // Output string is initially empty
        
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        while (count < NUMBER_OF_QUESTIONS) {            
            // 1. Generate two random single-digit integers
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);

            // 2. If number1 is greater than number2, swap number1 with number2
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            // 3. Prompt the user for an answer
            System.out.print("What is " + number1 + " - " + number2 + "? ");
            int answer = input.nextInt();

            // 4. Grade the answer and display the result
            if (number1 - number2 == answer) {
                System.out.println("You are correct!\n");
                correctCount++;
            } else {
                System.out.println("Your answer is wrong.\n");
                System.out.println(number1 + " - " + number2 + " should be " + 
                        (number1 - number2));
            }
            
            output += number1 + " - " + number2 + " = " + answer +
                    ((number1 - number2) == answer ? " correct\n" : " wrong\n");
            count++; // Increase the question count
        }
        
        long testTime = System.nanoTime() - startTime;
        
        System.out.println("Correct count is " + correctCount);
        System.out.printf("Test time is %.2f seconds%n", (testTime / 1.0E9));
        System.out.println("\n" + output);
    }
}
