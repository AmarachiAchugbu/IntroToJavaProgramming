/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chapter06;

import java.util.Scanner;

/**
 * @author FSO
 * Sep 10, 2021 11:39:51 AM
 */

public class Listing08_HexToDec {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompt the user for a hexadecimal number
        System.out.print("Enter a hex number: ");
        String hexNum = input.next();
        
        // Display the decimal equivalent of the hexdecimal number
        System.out.println("The decimal value for hex number " + hexNum + " is " 
                + hexToDec(hexNum.toUpperCase()));
        System.out.println(hexNum);
    }
    
    public static int hexToDec(String hexNum) {
        int sum = 0; // Variable to store the decimal equivalent of the hex number
        
        for (int i = 0, j = hexNum.length() - 1; i < hexNum.length(); i++, j--) {
            sum += hexCharToDecimal(hexNum.charAt(i)) * (int)Math.pow(16, j);
        }
        
        return sum;
    }
    
    public static int hexCharToDecimal(char ch) {
        return ch >= 'A' && ch <= 'F' ? (ch - 'A' + 10) : (ch - '0');
    }
}
