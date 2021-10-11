package chapter03.programmingExercises03; 

/**
 * @author FSO
 * Apr 29, 2021 12:40:06 AM
 */

public class ProgrammingExercise_03_16_RandomPoint {
    public static void main(String[] args) {
        // Generate random coordinates in a rectangle
        int x = -50 + (int)(Math.random() * 101);
        int y = -100 + (int)(Math.random() * 201);
        
        // Display the generated coordinates
        System.out.println("The generated coordinates are (" + x + ", " + y + ")");
    }
}
