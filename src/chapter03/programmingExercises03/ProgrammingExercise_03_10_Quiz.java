package chapter03.programmingExercises03;

/**
 * @author FSO
 * Apr 28, 2021 12:05:19 PM
 */

public class ProgrammingExercise_03_10_Quiz {
    public static void main(String[] args) {
        /* 10th Edition */
        System.out.println("10th Edition");
        System.out.println("============");
        System.out.println();
        
        // Generate two random single-digit integers
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);
        
        // Prompt the user for an answer
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = new java.util.Scanner(System.in).nextInt();
        
        // Grade the answer and display the result
        if (number1 + number2 == answer) {
            System.out.println("You are correct!");
        } else {
            System.out.println("Your answer is wrong");
            System.out.println(number1 + " + " + number2 + " should be " + 
                    (number1 + number2));
        }
        
        System.out.println();
        System.out.println("=================================================");
        System.out.println();
        
        /* 11th Edition */
        System.out.println("11th Edition");
        System.out.println("============");
        System.out.println();
        
        // Generate two random integers
        number1 = (int)(Math.random() * 1000);
        number2 = (int)(Math.random() * 1000);
        
        // Prompt the user for an answer
        System.out.print("What is " + number1 + " x " + number2 + "? ");
        answer = new java.util.Scanner(System.in).nextInt();
        
        // Grade the answer and display the result
        if (number1 * number2 == answer) {
            System.out.println("You are correct!");
        } else {
            System.out.println("Your answer is wrong");
            System.out.println(number1 + " x " + number2 + " should be " + 
                    (number1 * number2));
        }
    }
}
