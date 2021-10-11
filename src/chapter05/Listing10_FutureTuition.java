package chapter05;

/**
 * @author FSO
 * Apr 15, 2021 11:03:47 PM
 */

public class Listing10_FutureTuition {
    public static void main(String[] args) {
        double tuition = 10000; // Year 0
        int year = 0;
        
        while (tuition < 20000) {
            tuition *= 1.07;
            year++;
        }
        
        System.out.println("Tuition will be doubled in " + year + 
                (year > 1 ? " years" : " year"));
        System.out.printf("Tuition will be $%.2f in %d" + 
                (year > 1 ? " years%n" : " year%n"), tuition, year);
    }
}
