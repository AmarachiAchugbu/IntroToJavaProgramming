package chapter03.programmingExercises03;

import java.util.Scanner;

/**
 * @author FSO
 * Mar 26, 2021 1:59:58 PM
 */

public class ProgrammingExercise_03_02_MultiplyThreeNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        /* 10th Edition */
        System.out.println("10th Edition");
        System.out.println("============");
        System.out.println();
        
        // Generates two random number
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 10 % 10);
        int number3 = (int)(System.currentTimeMillis() / 100 % 10);
        
        // Display the question, prompting the user for an answer
        System.out.print("What is " + number1 + " + " + number2 + 
                " + " + number3 + " ? ");
        int answer = input.nextInt();
        
        // Analyse the input and display the result
        System.out.println(number1 + " + " + number2 + " = " + answer + 
                " is " + (number1 + number2 + number3 == answer));
        
        System.out.println();
        System.out.println("=================================================");
        System.out.println();
        
        /* 11th Edition */
        System.out.println("11th Edition");
        System.out.println("============");
        System.out.println();
        
        // Generates two random number
        number1 = (int)(System.currentTimeMillis() % 10);
        number2 = (int)(System.currentTimeMillis() / 10 % 10);
        number3 = (int)(System.currentTimeMillis() / 100 % 10);
        
        // Display the question, prompting the user for an answer
        System.out.print("What is " + number1 + " x " + number2 + " x " +
                number3 + "? ");
        answer = input.nextInt();
        
        // Analyse the input and display the result
        System.out.println(number1 + " x " + number2 + " x " + number3 + " = " + 
                answer + " is " + (number1 * number2 * number3 == answer));    
    }
}
