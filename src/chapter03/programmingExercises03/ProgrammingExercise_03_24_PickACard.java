package chapter03.programmingExercises03;

/**
 * @author FSO
 * Apr 29, 2021 9:55:59 PM
 */

public class ProgrammingExercise_03_24_PickACard {
    public static void main(String[] args) {
        // Generate a random rank
        int rank = 1 + (int)(Math.random() * 13);
        
        // Generate a random suit
        int suit = 1 + (int)(Math.random() * 4);
        
        // Display the random card picked
        System.out.print("The card you picked is ");
        switch (rank) { // Displays the appropriate name of the rank from the integer generated
            case 1: System.out.print("Ace"); break;
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: System.out.print(rank); break; // Displays the number of the rank
            case 11: System.out.print("Jack"); break;
            case 12: System.out.print("Queen"); break;
            case 13: System.out.print("King");
        }
        
        System.out.print(" of ");
        switch (suit) { // Displays the correct name of the suit from the number generated
            case 1: System.out.println("Clubs"); break;
            case 2: System.out.println("Diamonds"); break;
            case 3: System.out.println("Hearts"); break;
            case 4: System.out.println("Spades");
        }
    }
}
