package chapter05;

import java.util.Scanner;

/**
 * @author FSO
 * Apr 14, 2021 3:55:05 PM
 */

public class Listing01_RepeatAdditionQuiz {
    public static void main(String[] args) {
        // Generates two random number
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        
        // Display the question, prompting the user for an answer
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();
        
        while ((number1 + number2) != answer) {
            System.out.print("Wrong answer. Try again. What is " + number1 + 
                    " + " + number2 + "? ");
            answer = input.nextInt();
        }
        
        // Analyse the input and display the result
        System.out.println("You got it!");
    }
}
