package chapter03;

/**
 * @author FSO
 * Mar 22, 2021 12:43:17 AM
 */

public class Listing01_AdditionQuiz {
    public static void main(String[] args) {
        // Generates two random number
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 10 % 10);
        
        // Display the question, prompting the user for an answer
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = new java.util.Scanner(System.in).nextInt();
        
        // Analyse the input and display the result
        System.out.println(number1 + " + " + number2 + " = " + answer + 
                " is " + (number1 + number2 == answer));        
    }
}
