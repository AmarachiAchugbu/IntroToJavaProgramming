package chapter04.programmingExercises04;

/**
 * @author FSO
 * Aug 26, 2021 10:26:47 PM
 */

public class ProgrammingExercise_04_06_RandomPointsOnCircle {
    public static void main(String[] args) {
        // Declare a constant to store the radius
        final double RADIUS_OF_CIRCLE = 40;
        
        // Generate a random angle in radians between 0 and 2*pi to generate random points
        double randomAngle = Math.random() * ((2 * Math.PI) + 1);
        
        // Random point1 x and y coordinates
        double point1X = RADIUS_OF_CIRCLE * Math.cos(randomAngle),
               point1Y = RADIUS_OF_CIRCLE * Math.sin(randomAngle);
        
        randomAngle = Math.random() * ((2 * Math.PI) + 1); // random angle for point 2
        
        // Random point2 x and y coordinates
        double point2X = RADIUS_OF_CIRCLE * Math.cos(randomAngle),
               point2Y = RADIUS_OF_CIRCLE * Math.sin(randomAngle);
        
        randomAngle = Math.random() * ((2 * Math.PI) + 1); // random angle for point 3
        
        // Random point3 x and y coordinates
        double point3X = RADIUS_OF_CIRCLE * Math.cos(randomAngle),
               point3Y = RADIUS_OF_CIRCLE * Math.sin(randomAngle);
        
        // Compute the distance between the three points
        double sideA = Math.sqrt(Math.pow(point1X - point2X, 2) 
                + Math.pow(point1Y - point2Y, 2));
        double sideB = Math.sqrt(Math.pow(point2X - point3X, 2) 
                + Math.pow(point2Y - point3Y, 2));
        double sideC = Math.sqrt(Math.pow(point1X - point3X, 2) 
                + Math.pow(point1Y - point3Y, 2));
        
        // Compute the three angles
        double angleA = Math.toDegrees(Math.acos((sideA * sideA - sideB * sideB 
                - sideC * sideC) / (-2 * sideB * sideC)));
        double angleB = Math.toDegrees(Math.acos((sideB * sideB - sideA * sideA
                - sideC * sideC) / (-2 * sideA * sideC)));
        double angleC = Math.toDegrees(Math.acos((sideC * sideC - sideA * sideA
                - sideB * sideB) / (-2 * sideA * sideB)));
        
        // Display the results
        System.out.println("The three angles are " 
                + Math.round(angleA * 100) / 100.0 + ", " 
                + Math.round(angleB * 100) / 100.0 + ", and " 
                + Math.round(angleC * 100) / 100.0);
    }
}
