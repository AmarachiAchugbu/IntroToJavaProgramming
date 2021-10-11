package chapter06;

/**
 * @author FSO
 * Sep 6, 2021 12:19:51 PM
 */

public class Listing04_Increment {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the call, x is " + x);
        increment(x);
        System.out.println("After the call, x is " + x);
    }
    
    public static void increment(int n) {
        n++;
        System.out.println("n inside the method is " + n);
    }
}
