package chapter02.programmingExercises02;

/**
 * @author FSO
 * Apr 18, 2021 10:31:54 PM
 */

public class ProgrammingExercise_02_11 {
    public static void main(String[] args) {
        // Declare a variable to hold the current population
        long currentPopulation = 312_032_486;
        
        // Declare a variable to hold the value of the number of seconds in a year
        int secondsInYear = 31_536_000;
        
        // Compute the number of births in a year
        double numberOfBirthPerYear = secondsInYear / 7.0;
        
        // Compute the number of new immigrants per year
        double numberOfImmigrantsPerYear = secondsInYear / 45.0;
        
        // Compute the number of deaths in a year
        double numberOfDeathsPerYear = secondsInYear / 13.0;
        
        // Compute the population change per year
        double populationChangePerYear = numberOfBirthPerYear + numberOfImmigrantsPerYear
                - numberOfDeathsPerYear;
        
        // Prompt the user to enter the number of years for the population projection
        System.out.print("Enter the number of years: ");
        int years = new java.util.Scanner(System.in).nextInt();
        
        // Compute the population in the number of years given
        double projectedPopulation = currentPopulation + 
                (populationChangePerYear * years);
        
        // Display the result of the projected population
        System.out.println("The population in " + years + " years is " + 
                (long)projectedPopulation);
    }
}
