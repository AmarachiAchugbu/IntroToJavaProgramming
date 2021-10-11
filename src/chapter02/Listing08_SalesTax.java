package chapter02;

/**
 * @author FSO
 * Mar 20, 2021 9:20:42 PM
 */

public class Listing08_SalesTax {
    public static void main(String[] args) {
        System.out.print("Enter purchase amount: ");
        double purchaseAmount = new java.util.Scanner(System.in).nextDouble();
        
        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is $" + (int)(tax * 100) / 100);
    }
}
