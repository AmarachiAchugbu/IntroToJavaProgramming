package chapter03.programmingExercises03;

import java.util.Scanner;

/**
 * @author FSO
 * Apr 29, 2021 1:40:09 AM
 */

public class ProgrammingExercise_03_20_WindChillTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the temperature in Fahrenheit between "
                + "-58°F and 41°F: ");
        float outTemp = input.nextFloat();
        
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        float windSpeed = input.nextFloat();
        
        // Check if the input is valid
        if ((outTemp < -58 || outTemp > 41) || windSpeed < 2) {
            System.out.println("Invalid input. Check the value of either "
                    + "the temperature or the wind speed.");
            System.exit(1);
        }
        
        // Compute the Wind-Chill Temperature
        float windChillTemp = (float)(35.74 + (0.6215 * outTemp) - 
                (35.75 * Math.pow(windSpeed, 0.16)) +
                (0.4275 * outTemp * Math.pow(windSpeed, 0.16)));
        
        // Display the result
        System.out.println("The wind chill index is " + windChillTemp);
    }
}
