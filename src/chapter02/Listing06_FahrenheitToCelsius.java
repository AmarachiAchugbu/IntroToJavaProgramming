package chapter02;

import java.util.Scanner;

/**
 * @author FSO
 * Mar 20, 2021 7:06:57 PM
 */

public class Listing06_FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        
        // Convert Fahrenheit to Celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " is " + celsius +
                " in Celsius");
    }
}
