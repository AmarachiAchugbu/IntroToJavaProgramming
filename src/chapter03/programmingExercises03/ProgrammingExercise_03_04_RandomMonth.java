package chapter03.programmingExercises03;

/**
 * @author FSO
 * Mar 26, 2021 2:15:38 PM
 */

public class ProgrammingExercise_03_04_RandomMonth {
    public static void main(String[] args) {
        // Generate a random integer to represent the months of the year
        int month = 1 + (int)(Math.random() * 12);
        
        System.out.print("The month generated is ");
        
        // Display the month from the generated number
        switch (month) {
            case 1: System.out.println("January"); break;
            case 2: System.out.println("February"); break;
            case 3: System.out.println("March"); break;
            case 4: System.out.println("April"); break;
            case 5: System.out.println("May"); break;
            case 6: System.out.println("June"); break;
            case 7: System.out.println("July"); break;
            case 8: System.out.println("August"); break;
            case 9: System.out.println("September"); break;
            case 10: System.out.println("October"); break;
            case 11: System.out.println("November"); break;
            case 12: System.out.println("December");
        }
    }
}
