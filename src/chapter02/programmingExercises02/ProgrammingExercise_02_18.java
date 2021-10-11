package chapter02.programmingExercises02;

/**
 * @author FSO
 * Apr 19, 2021 8:15:34 PM
 */

public class ProgrammingExercise_02_18 {
    public static void main(String[] args) {
        /* 10th Edition */
        System.out.println("10th Edition");
        System.out.println("============");
        System.out.println();
        
        // Display the table heading
        System.out.println("a     b     pow(a, b)");
        
        // Declare integer types to hold the variables
        int a = 1, b = 2;
        
        // Display the result of raising a to the power of b
        System.out.println(a + "     " + b + "     " + (int)Math.pow(a, b));        
        a++; b++;
        System.out.println(a + "     " + b + "     " + (int)Math.pow(a, b));
        a++; b++;
        System.out.println(a + "     " + b + "     " + (int)Math.pow(a, b));
        a++; b++;
        System.out.println(a + "     " + b + "     " + (int)Math.pow(a, b));
        a++; b++;
        System.out.println(a + "     " + b + "     " + (int)Math.pow(a, b));
        System.out.println();
        
        System.out.println("=================================================");
        System.out.println();
        
        /* 11th Edition */
        System.out.println("11th Edition");
        System.out.println("============");
        System.out.println();
        
        // Display the table heading
        System.out.println("  a          b       Middle Point");
        
        // Display the result of raising a to the power of b
        System.out.println("(0, 0)     (2, 1)     (" + ((0 + 2) / 2.0) +
                ", " + ((0 + 1) / 2.0) + ")");      
        System.out.println("(1, 4)     (4, 2)     (" + ((1 + 4) / 2.0) +
                ", " + ((4 + 2) / 2.0) + ")");      
        System.out.println("(2, 7)     (6, 3)     (" + ((2 + 6) / 2.0) +
                ", " + ((7 + 3) / 2.0) + ")");      
        System.out.println("(3, 9)     (10, 5)    (" + ((3 + 10) / 2.0) +
                ", " + ((9 + 5) / 2.0) + ")");      
        System.out.println("(4, 11)    (12, 7)    (" + ((4 + 12) / 2.0) +
                ", " + ((11 + 7) / 2.0) + ")");
        System.out.println();
    }
}
