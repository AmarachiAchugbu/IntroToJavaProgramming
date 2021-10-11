package chapter04.programmingExercises04;

/**
 * @author FSO
 * Sep 7, 2021 9:06:36 PM
 */

public class ProgrammingExercise_04_16_RandomLowercaseLetter {
    public static void main(String[] args) {
        // Generate a random number between 97 to 122
        byte number = (byte)(97 + Math.random() * 26);
        
        // Display the lowercase character of the random number generated
        System.out.println("The random lowercase character generated is '" +
                (char)number + "'");
    }
}
