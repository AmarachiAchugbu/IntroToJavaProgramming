package chapter05;

/**
 * @author FSO
 * Apr 15, 2021 6:50:34 PM
 */

public class Listing07_MultiplicationTable {
    public static void main(String[] args) {
        // Display the table heading
        System.out.println("         Multiplication Table");
        
        // Display the number title
        System.out.print("   ");
        for (int i = 1; i <= 9; i++)
            System.out.printf("%4d", i);
        
        System.out.println("\n---------------------------------------");
        
        // Display the table body
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " |");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%4d", (i * j));
            }
            System.out.println();
        }
    }
}
