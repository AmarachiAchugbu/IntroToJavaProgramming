package chapter03;

import java.util.Scanner;

/**
 * @author FSO
 * Mar 22, 2021 12:46:43 AM
 */

public class CheckPointsAndExamples_03 {
    public static void main(String[] args) {
        // Create Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Test to check for the conversion of boolean values to other data types
//        boolean b = true;
//        int i = (int)b;
//        
//        int i2 = 1;
//        b = (boolean)i;
        
//        int score1 = new java.util.Scanner(System.in).nextInt();
//        int pay = 100;
//        
//        if (score1 > 90)
//            pay *= 1.03;
//        
//        System.out.println(pay);
//        
//        score1 = new java.util.Scanner(System.in).nextInt();
//        pay = 100;
//        
//        if (score1 > 90)
//            pay += pay * 0.03;
//        
//        System.out.println(pay);
//        
//        byte b = 50;
//        b = (byte)(b * 2);
//        
//        if (b >= 100) {
//            System.out.println("The area is " + b);
//        }
        
//        int x = 1, y = 2;
        
//        int n, d;
//        n = 10;
//        d = 0;
//        
//        if (d != 0 & (n % d) == 0)
//            System.out.println(d + " is a factor of " + n);
    
        // CheckPoint 3.10.4 (e)
        System.out.println(0 != 0);
        
        System.out.println();
        
        // CheckPoint 3.13.4
        int day = input.nextInt();
        
        switch (day) {
            case 0: System.out.println("Sunday"); break;
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday");
        }
        
        
        int year = input.nextInt();
        
        if (year % 12 == 0)
            System.out.println("Monkey");
        else if (year % 12 == 1)
            System.out.println("Rooster");
        else if (year % 12 == 2)
            System.out.println("Dog");
        else if (year % 12 == 3)
            System.out.println("Pig");
        else if (year % 12 == 4)
            System.out.println("Rat");
        else if (year % 12 == 5)
            System.out.println("Ox");
        else if (year % 12 == 6)
            System.out.println("Tiger");
        else if (year % 12 == 7)
            System.out.println("Rabbit");
        else if (year % 12 == 8)
            System.out.println("Dragon");
        else if (year % 12 == 9)
            System.out.println("Snake");
        else if (year % 12 == 10)
            System.out.println("Horse");
        else if (year % 12 == 11)
            System.out.println("Sheep");
        
        int i = 1;
        int k = ++i + i * 3;
        System.out.println(k);
        
        boolean even = false;
        if (even = true)
            System.out.println("It is even");
    }
}
