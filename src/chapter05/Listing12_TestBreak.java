package chapter05;

/**
 * @author FSO
 * Apr 17, 2021 1:40:47 AM
 */

public class Listing12_TestBreak {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;
        
        while (number < 20) {
            number++;
            sum += number;
            
            if (sum >= 100)
                break;
        }
        
        System.out.println("The number is " + number);
        System.out.println("The sum is " + sum);
    }
}
