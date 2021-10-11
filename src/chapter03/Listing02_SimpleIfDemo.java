package chapter03;

/**
 * @author FSO
 * Mar 22, 2021 3:08:56 AM
 */

public class Listing02_SimpleIfDemo {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        int number = new java.util.Scanner(System.in).nextInt();
        
        if (number % 5 == 0)
            System.out.println("HiFive");
        
        if (number % 2 == 0)
            System.out.println("HiEven");
    }
}
