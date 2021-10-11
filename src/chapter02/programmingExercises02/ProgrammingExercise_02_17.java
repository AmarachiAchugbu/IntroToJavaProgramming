package chapter02.programmingExercises02;

import java.util.Scanner;

/**
 * @author FSO
 * Apr 19, 2021 8:08:39 PM
 */

public class ProgrammingExercise_02_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the temperature in Fahrenheit between "
                + "-58°F and 41°F: ");
        double outTemp = input.nextDouble();
        
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double windSpeed = input.nextDouble();
        
        // Compute the Wind-Chill Temperature
        double windChillTemp = 35.74 + (0.6215 * outTemp) - 
                (35.75 * Math.pow(windSpeed, 0.16)) +
                (0.4275 * outTemp * Math.pow(windSpeed, 0.16));
        
        // Display the result
        System.out.println("The wind chill index is " + windChillTemp);
    }
}
