package chapter05;

/**
 * @author FSO
 * Apr 17, 2021 11:41:04 AM
 */

public class Listing13_TestContinue {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;
        
        while (number < 20) {
            number++;
            
            if (number == 10 || number == 11)
                continue;
            
            sum += number;
        }
        
        System.out.println("The number is " + number);
        System.out.println("The sum is " + sum);
    }
}
