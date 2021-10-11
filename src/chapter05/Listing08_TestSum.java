package chapter05;

/**
 * @author FSO
 * Apr 15, 2021 8:28:52 PM
 */

public class Listing08_TestSum {
    public static void main(String[] args) {
        // Initialize sum
        float sum = 0;
        
        // Add 0.01, 0.02, ..., 0.99, 1 to sum
        for (float i = 0.01f; i <= 1.0f; i = i + 0.01f)
            sum += i;
        
        // Display result
        System.out.println("The sum is " + sum);
        
        double sum2 = 0;
        for (double i = 0.01; i <= 1.0; i = i + 0.01)
            sum2 += i;
        System.out.println("The new sum is " + sum2);
        
        sum2 = 0;
        double currentValue = 0.01;
        for (int count = 0; count < 100; count++){
            sum2 += currentValue;
            currentValue += 0.01;
        }
        System.out.println("The new sum is " + sum2);
    }
}
