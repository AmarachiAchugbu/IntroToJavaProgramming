package chapter04.programmingExercises04;

import java.util.Scanner;

/**
 * @author FSO
 * Aug 28, 2021 3:12:45 AM
 */

public class ProgrammingExercise_04_10_RevisedGuessBirthday {
    public static void main(String[] args) {
        String set1 = " 1  3  5  7\n" + " 9 11 13 15\n" + "17 19 21 23\n" + "25 27 29 31";
        
        String set2 = " 2  3  6  7\n" + "10 11 14 15\n" + "18 19 22 23\n" + "26 27 30 31";
        
        String set3 = " 4  5  6  7\n" + "12 13 14 15\n" + "20 21 22 23\n" + "28 29 30 31";
        
        String set4 = " 8  9 10 11\n" + "12 13 14 15\n" + "24 25 26 27\n" + "28 29 30 31";
        
        String set5 = "16 17 18 19\n" + "20 21 22 23\n" + "24 25 26 27\n" + "28 29 30 31";
        
        int day = 0;
        
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to answer questions
        System.out.println("\nIs your birthday in Set1?");
        System.out.println(set1);
        System.out.print("Enter N for No and Y for Yes: ");
        String answerString = input.next();
        char answer = Character.toUpperCase(answerString.charAt(0));
        
        if (answer == 'Y') day += 1;
        
        // Prompt the user to answer questions
        System.out.println("\nIs your birthday in Set2?");
        System.out.println(set2);
        System.out.print("Enter N for No and Y for Yes: ");
        answerString = input.next();
        answer = Character.toUpperCase(answerString.charAt(0));
        
        if (answer == 'Y') day += 2;
        
        // Prompt the user to answer questions
        System.out.println("\nIs your birthday in Set3?");
        System.out.println(set3);
        System.out.print("Enter N for No and Y for Yes: ");
        answerString = input.next();
        answer = Character.toUpperCase(answerString.charAt(0));
        
        if (answer == 'Y') day += 4;
        
        // Prompt the user to answer questions
        System.out.println("\nIs your birthday in Set4?");
        System.out.println(set4);
        System.out.print("Enter N for No and Y for Yes: ");
        answerString = input.next();
        answer = Character.toUpperCase(answerString.charAt(0));
        
        if (answer == 'Y') day += 8;
        
        // Prompt the user to answer questions
        System.out.println("\nIs your birthday in Set5?");
        System.out.println(set5);
        System.out.print("Enter N for No and Y for Yes: ");
        answerString = input.next();
        answer = Character.toUpperCase(answerString.charAt(0));
        
        if (answer == 'Y') day += 16;
        
        System.out.println("\nYour birthday is " + day + "!");
    }
}
