package chapter04;

import java.util.Scanner;

/**
 * @author FSO
 * Mar 25, 2021 9:10:53 PM
 */

public class CheckPointsAndExamples_04 {
    public static void main(String[] args) {
//        // Math.toDegrees() method
//        System.out.println("Math.toDegrees(Math.PI / 180) is " + Math.toDegrees(Math.PI / 180));
//        System.out.println("Math.toDegrees(Math.PI / 6) is " + Math.toDegrees(Math.PI / 6));
//        System.out.println("Math.toDegrees(Math.PI / 3) is " + Math.toDegrees(Math.PI / 3));
//        System.out.println("Math.toDegrees(Math.PI / 2) is " + Math.toDegrees(Math.PI / 2));
//        System.out.println("Math.toDegrees(Math.PI) is " + Math.toDegrees(Math.PI));
//        System.out.println();
//        
//        // Math.toRadians() method
//        System.out.println("Math.toRadians(30) is " + Math.toRadians(30));
//        System.out.println("Math.toRadians(90) is " + Math.toRadians(90));
//        System.out.println("Math.PI / 6 = " + Math.PI / 6);
//        System.out.println();
//        
//        // Math.sin() method
//        System.out.println("Math.sin(0) returns " + Math.sin(0));
//        System.out.println("Math.sin(Math.toRadians(270)) returns " + Math.sin(Math.toRadians(270)));
//        System.out.println("Math.sin(Math.toRadians(90)) returns " + Math.sin(Math.toRadians(90)));
//        System.out.println("Math.sin(Math.PI / 6) is " + Math.sin(Math.PI / 6));
//        System.out.println("Math.sin(Math.PI / 2) is " + Math.sin(Math.PI / 2));
//        System.out.println();
//        
//        // Math.cos() method
//        System.out.println("Math.cos(0) returns " + Math.cos(0));
//        System.out.println("Math.cos(Math.PI / 6) returns " + Math.cos(Math.PI / 6));
//        System.out.println("Math.cos(Math.PI / 2) returns " + Math.cos(Math.PI / 2));
//        System.out.println();
//        
//        // arc-X methods
//        System.out.println("Math.asin(0.5) returns " + Math.asin(0.5) + " radians");
//        System.out.println("Math.toDegrees(Math.asin(0.5)) returns " + Math.toDegrees(Math.asin(0.5)));
//        System.out.println("Math.acos(0.5) returns " + Math.acos(0.5));
//        System.out.println("Math.atan(1.0) returns " + Math.atan(1.0));
//        System.out.println();
        
//        // Exponent methods
//        System.out.println("Exponent methods");
//        System.out.println("Math.E is " + Math.E);
//        System.out.println("e(1) is " + Math.exp(1));
//        System.out.println("e(3.5), i.e. Math.exp(3.5) is " + Math.exp(3.5));
//        System.out.println();
//        
//        // Logarithm methods
//        System.out.println("Logarithm methods");
//        System.out.println("ln(e), i.e. Math.log(Math.E) is " + Math.log(Math.E));
//        System.out.println("ln(3.5) is " + Math.log(3.5));
//        System.out.println("ln(e(3.5)), i.e. Math.log(Math.exp(3.5)) returns " + Math.log(Math.exp(3.5)));
//        System.out.println("ln(e(3.5)), i.e. Math.log(33.11545196) returns " + Math.log(33.11545196));
//        System.out.println("Math.log10(3.5) returns " + Math.log10(3.5));
//        System.out.println("Math.log10(10) returns " + Math.log10(10));
//        System.out.println("Math.log10(100) returns " + Math.log10(100));
//        System.out.println();
//        
//        // Exponent methods
//        System.out.println("Exponent methods");
//        System.out.println("2^3, i.e. Math.pow(2, 3) returns " + Math.pow(2, 3));
//        System.out.println("3^2, i.e. Math.pow(3, 2) returns " + Math.pow(3, 2));
//        System.out.println("4.5^2.5, i.e. Math.pow(4.5, 2.5) returns " + Math.pow(4.5, 2.5));
//        
//        System.out.println();
//        
//        System.out.println("Math.sqrt(4) returns " + Math.sqrt(4));
//        System.out.println("Math.sqrt(10.5) returns " + Math.sqrt(10.5));
//        System.out.println();
        
//        // Rounding Methods
//        System.out.println("Rounding Methods");
//        System.out.println("ceil(x) Methods");
//        System.out.println("Math.ceil(2.0) returns " + Math.ceil(2.0));
//        System.out.println("Math.ceil(2.1) returns " + Math.ceil(2.1));
//        System.out.println("Math.ceil(2.5) returns " + Math.ceil(2.5));
//        System.out.println("Math.ceil(2.9) returns " + Math.ceil(2.9));
//        System.out.println("Math.ceil(-2.0) returns " + Math.ceil(-2.0));
//        System.out.println("Math.ceil(-2.1) returns " + Math.ceil(-2.1));
//        System.out.println("Math.ceil(-2.5) returns " + Math.ceil(-2.5));
//        System.out.println("Math.ceil(-2.9) returns " + Math.ceil(-2.9));
//        System.out.println();
//      
//        System.out.println("floor(x) Methods");
//        System.out.println("Math.floor(2.0) returns " + Math.floor(2.0));
//        System.out.println("Math.floor(2.1) returns " + Math.floor(2.1));
//        System.out.println("Math.floor(2.5) returns " + Math.floor(2.5));
//        System.out.println("Math.floor(2.9) returns " + Math.floor(2.9));
//        System.out.println("Math.floor(-2.0) returns " + Math.floor(-2.0));
//        System.out.println("Math.floor(-2.1) returns " + Math.floor(-2.1));
//        System.out.println("Math.floor(-2.5) returns " + Math.floor(-2.5));
//        System.out.println("Math.floor(-2.9) returns " + Math.floor(-2.9));
//        System.out.println();
//        
//        System.out.println("rint(x) Methods");
//        System.out.println("Math.rint(2.0) returns " + Math.rint(2.0));
//        System.out.println("Math.rint(2.1) returns " + Math.rint(2.1));
//        System.out.println("Math.rint(2.2) returns " + Math.rint(2.2));
//        System.out.println("Math.rint(2.4) returns " + Math.rint(2.4));
//        System.out.println("Math.rint(2.5) returns " + Math.rint(2.5));
//        System.out.println("Math.rint(2.6) returns " + Math.rint(2.6));
//        System.out.println("Math.rint(2.9) returns " + Math.rint(2.9));
//        System.out.println("Math.rint(3.0) returns " + Math.rint(3.0));
//        System.out.println("Math.rint(3.5) returns " + Math.rint(3.5));
//        System.out.println("Math.rint(4.5) returns " + Math.rint(4.5));
//        System.out.println("Math.rint(-2.0) returns " + Math.rint(-2.0));
//        System.out.println("Math.rint(-2.1) returns " + Math.rint(-2.1));
//        System.out.println("Math.rint(-2.5) returns " + Math.rint(-2.5));
//        System.out.println("Math.rint(-2.9) returns " + Math.rint(-2.9));
//        System.out.println("Math.rint(-3.0) returns " + Math.rint(-3.0));
//        System.out.println("Math.rint(-3.5) returns " + Math.rint(-3.5));
//        System.out.println("Math.rint(-4.5) returns " + Math.rint(-4.5));
//        System.out.println();
//        
//        System.out.println("round(x) Methods");
//        System.out.println("Math.round(2.4f) returns " + Math.round(2.4f));
//        System.out.println("Math.round(2.6f) returns " + Math.round(2.6f));
//        System.out.println("Math.round(2.5) returns " + Math.round(2.5));
//        System.out.println("Math.round(3.5) returns " + Math.round(3.5));
//        System.out.println("Math.round(2.0) returns " + Math.round(2.0));
//        System.out.println("Math.round(-2.0f) returns " + Math.round(-2.0f));
//        System.out.println("Math.round(-2.4) returns " + Math.round(-2.4));
//        System.out.println("Math.round(-2.6) returns " + Math.round(-2.6));
//        System.out.println("Math.round(-2.5) returns " + Math.round(-2.5));
//        System.out.println("Math.round(-3.5) returns " + Math.round(-3.5));
//        System.out.println();
        
//        // The min, max, and abs Methods
//        System.out.println("The min, max, and abs Methods");
//        System.out.println("Math.max(2, 3) is " + Math.max(2, 3));
//        System.out.println("Math.min(2.5, 4.6) is " + Math.min(2.5, 4.6));
//        System.out.println("Math.max(Math.max(2.5, 4.6), Math.min(3, 5.6)) returns "
//                + Math.max(Math.max(2.5, 4.6), Math.min(3, 5.6)));
//        System.out.println("Math.abs(-2) returns " + Math.abs(-2));
//        System.out.println("Math.abs(-2.1) returns " + Math.abs(-2.1));
//        
//        byte b1 = -14;
//        System.out.println("Integer as byte is " + b1);
//        System.out.println("Math.abs(b1) returns " + Math.abs(b1));
//        short s1 = -12345;
//        System.out.println("Integer as short is " + s1);
//        System.out.println("Math.abs(s1) returns " + Math.abs(s1));
//        System.out.println();
//        
//        // The random Method
//        System.out.println("The random Method");
//        System.out.println("Math.random() returns " + Math.random());
//        System.out.println("(float)(Math.random()) returns " + (float)(Math.random()));
//        System.out.println();
//        
//        // Check Point 4.2
//        System.out.println("Check Point 4.2.7");
//        System.out.println(Math.log(Math.exp(5.5)));
//        System.out.println(Math.exp(Math.log(5.5)));
//        System.out.println(Math.log(5.5));
//        System.out.println(Math.asin(Math.sin(Math.PI / 6)));
//        System.out.println(Math.sin(Math.asin(Math.PI / 6)));
//        System.out.println(Math.PI / 6);
//        System.out.println();

//        System.out.println("Some Unicode character ranges that contain digits");
//        System.out.println("\u0660 \u0661 \u0662 \u0663 \u0664 \u0665 \u0666 \u0667 \u0668 \u0669");
//        System.out.println("\u06F0 \u06F1 \u06F2 \u06F3 \u06F4 \u06F5 \u06F6 \u06F7 \u06F8 \u06F9");
//        System.out.println("\u0966 \u0967 \u0968 \u0969 \u096A \u096B \u096C \u096D \u096E \u096F");
//        System.out.println("\uFF10 \uFF11 \uFF12 \uFF13 \uFF14 \uFF15 \uFF16 \uFF17 \uFF18 \uFF19");
//        
//        char letterACharacter = 'A';
//        char letterAUnicode = '\u0041';
//        System.out.println(letterACharacter);
//        System.out.println(letterAUnicode);
//        System.out.println("\u03b1");
        
//        char ch = 'a';
//        System.out.println("ch is " + ch);
//        System.out.println("++ch is " + ++ch);
//        System.out.println("ch++ is " + ch++);
//        System.out.println("ch is " + ch);
//        System.out.println();
        
//        // Escape Sequences
//        System.out.println("Escape Sequences");
//        System.out.println("Use of \\\" below");
//        System.out.println("He said \"Java is fun\"");
//        System.out.println("\\ - This is a backslash");
//        System.out.println("\\t is a tab character");
//        System.out.println("ABCDE\bFGHIJK\tLMNOP\nQRSTU\fVWXYZ");
//        System.out.println("    "
//                + "     \rABCDE\bFGHIJK\tLMNOP\nQRSTUVWXYZ");
//        System.out.println("\fABCDE\bFGHIJK\tLMNOP\nQRSTU\rVWXYZ\b\b");
//        System.out.println("This is just an example \r We got into a new line");
//        System.out.println("' - this is a single quote");
//        System.out.println();
        
        
//     
//        // Number Systems
//        System.out.println(0x0041);
//        System.out.println(0xffff);
//        System.out.println(0xAB0041);        
//        System.out.println(0b111);
//        System.out.println(016);
//        System.out.println();
  
//        // Casting between 'char' and Numeric Types
//        System.out.println((char)0xAB0041);
//        ch = (char)65.25;
//        System.out.println(ch);
//        ch = 122;
//        System.out.println(ch);
//        System.out.println();
//        
//        int i = 'a';
//        System.out.println(i);
//        i = '\uFFF4';
//        System.out.println(i);
//        System.out.println();
//        
//        byte b = 'b';
//        System.out.println(b);
//        b = (byte)'\uFFF4';
//        System.out.println(b);
//        
//        b = (byte)129;
//        System.out.println(b);
//        System.out.println();
        
//        ch = 65535;
//        System.out.println(ch);
//        
//        ch = (char)159842352;
//        System.out.println(ch);
//        
//        ch = 122;
//        System.out.println(ch);
//        System.out.println();
//        
//        i = '2' + '3';
//        System.out.println("i is " + i);
//        int j = 2 + 'a';
//        System.out.println("j is " + j);
//        System.out.println(j + " is the Unicode for character " + (char)j);
//        System.out.println("Chapter " + '2');
//        System.out.println();
//        
//        i = '2' * '3';
//        System.out.println("i is " + i);
//        
//        double d = (double)'2' / '3';
//        System.out.println(d);
//        
//        ch = '2' + '3';
//        System.out.println(ch);
//        System.out.println();
//        
//        // Comparing and Testing Characters
//        System.out.println("isDigit('a') is " + Character.isDigit('a'));
//        System.out.println("isLetter('a') is " + Character.isLetter('a'));
//        System.out.println("isLowerCase('a') is " + Character.isLowerCase('a'));
//        System.out.println("isUpperCase('a') is " + Character.isUpperCase('a'));
//        System.out.println("toLowerCase('T') is " + Character.toLowerCase('T'));
//        System.out.println("toUpperCase('q') is " + Character.toUpperCase('q'));
        
//        char ch = new Scanner(System.in).next().charAt(0);
//        ch = Character.toUpperCase(ch);
//        System.out.println(ch);
//        
//        System.out.println('\u0660');
//        System.out.println('\u06F0');
//        System.out.println('\u6b22' + "" + '\u8fce');
//        System.out.println();
//        
//        // Check Point 4.3
//        System.out.println("Check Point 4.3.1a");
//        System.out.println((int)'1');
//        System.out.println((int)'A');
//        System.out.println((int)'B');
//        System.out.println((int)'a');
//        System.out.println((int)'b');
//        System.out.println();
//        
//        System.out.println("Check Point 4.3.1b");
//        System.out.println((char)40);
//        System.out.println((char)59);
//        System.out.println((char)79);
//        System.out.println((char)85);
//        System.out.println((char)90);
//        System.out.println();
//        
//        System.out.println("Check Point 4.3.1c");
//        System.out.println('\u0040');
//        System.out.println('\u005A');
//        System.out.println('\u0071');
//        System.out.println('\u0072');
//        System.out.println('\u007A');
//        System.out.println();
//        
//        System.out.println("Check Point 4.3.7");
//        System.out.println((char)(97 + (int)(Math.random() * 26)) + "\n");
        
//        System.out.println('A' + "" + '\t' + 'B');
//        
//        int num = 97;
//        char c = 97;
//        System.out.println("c is " + c);
//        c = (char)num;
//        System.out.println("c is now " + c);
//        char ch1 = 88, ch2 = 'Y';
//        System.out.println(ch1 + " " + ch2);
//        c = 0xFFFF;
//        System.out.println(c);
//        System.out.println();
        
//        // 4.4 The String Type
//        System.out.println("The String Type");
//        System.out.println("===============\n");
//        
//        System.out.println("4.4.1 Getting String Length");
//        System.out.println("---------------------------\n");
//        String message = "Welcome to Java";
//        System.out.println("The length of \"" + message + "\" is " + message.length());
//        System.out.println("Welcome to Java".length());
//        System.out.println("".length());
//        System.out.println();
//        
//        System.out.println("4.4.2 Getting Characters from a String");
//        System.out.println("--------------------------------------\n");
//        System.out.println("The first character in the message string is  " +
//                message.charAt(0));
//        System.out.println("The last character in the message string is " + 
//                message.charAt(message.length() - 1));
//        System.out.println();
//        
//        System.out.println("4.4.3 Concatenating Strings");
//        System.out.println("---------------------------\n");
//        String myString = message + " and " + "HTML";
//        System.out.println(myString);
//        System.out.println("\nConcatenating String with number");
//        System.out.println("\"Chapter\" + 2 is " + "Chapter " + 2);
//        System.out.println("\nConcatenating with a character");
//        System.out.print("\"Supplement\" + 'B' is ");
//        System.out.println("Supplement" + 'B' + "\n");
//        
//        byte i = 1, j = 2;
//        System.out.println("i is " + i);
//        System.out.println("j is " + j);
//        System.out.println("If the plus sign (+) is used where one operand is a string,");
//        System.out.println("the overall result is a string. E.g without using parentheses");
//        System.out.println("i + j is " + i + j);
//        System.out.println("Using parentheses to find the sum of i and j, we would now have");
//        System.out.println("i + j is " + (i + j));
//        System.out.println();
//        
//        System.out.println("4.4.4 Converting Strings");
//        System.out.println("------------------------\n");
//        System.out.println("Welcome in all caps " + "Welcome".toUpperCase());
//        System.out.println("Welcome in all lowercase is " + "Welcome".toLowerCase());
//        System.out.println("\"\\t Good Night \\n\".trim() will return below:");
//        System.out.println("\t Good Night \n".trim());
//        System.out.println("\t Good\t Night \n".trim());
//        System.out.println();
//        
//        System.out.println("4.4.5 Reading a String from the Console");
//        System.out.println("---------------------------------------\n");
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter three words separated by spaces: ");
//        String s1 = input.next();
//        String s2 = input.next();
//        String s3 = input.next();input.nextLine();
//        System.out.println("s1 is " + s1);
//        System.out.println("s2 is " + s2);
//        System.out.println("s3 is " + s3);
        
//        System.out.print("\nEnter a line: ");
//        String s = input.nextLine();
//        System.out.print("Enter a second line: ");
//        String sAgain = input.nextLine();
//        System.out.println("The line entered is \"" + s + " " + sAgain + "\"");
//        System.out.println();
//        
//        System.out.println("4.4.6 Reading a Character from the Console");
//        System.out.println("------------------------------------------\n");
//        System.out.print("Enter a character: ");
//        String charString = input.next();
//        char ch = charString.charAt(0);
//        System.out.println("The character entered is " + ch);
//        char ch1 = input.next().charAt(0);
//        System.out.println("The character entered is " + ch1);
//        System.out.println();
        
//        System.out.println("4.4.7 Comparing Strings");
//        System.out.println("-----------------------\n");
//        String string1 = "Welcome to Java";
//        String string2 = "Welcome to Java";
//        String string3 = "Welcome to C++";
//        System.out.print("Enter a string: ");
//        String string4 = input.nextLine();
//        
//        if (string1 == string4) {
//            System.out.println("string1 and string4 have the some contents.");
//        } else
//            System.out.println("The two strings are different.");
//        
//        System.out.println("string1 is " + string1);
//        System.out.println("string2 is " + string2);
//        System.out.println("string3 is " + string3 + "\n");
//        System.out.println("string1.equals(string2) is " + string1.equals(string2));
//        System.out.println("string1.equals(string3) is " + string1.equals(string3));
//        System.out.println("\"abc\".compareTo(\"abg\") will give the value " +
//                "abc".compareTo("abg"));
//        
//        System.out.println("\nWe cannot use relational operators to compare strings.");
//        System.out.println("E.g. \"abc\" < \"abg\" will give an error.");
//        System.out.println();
//        
//        System.out.println("\"Welcome to Java\".startsWith(\"We\") is " + 
//                "Welcome to Java".startsWith("We"));
//        System.out.println("\"Welcome to Java\".startsWith(\"we\") is " + 
//                "Welcome to Java".startsWith("we"));
//        System.out.println("\"Welcome to Java\".endsWith(\"va\") is " + 
//                "Welcome to Java".endsWith("va"));
//        System.out.println("\"Welcome to Java\".endsWith(\"v\") is " + 
//                "Welcome to Java".endsWith("v"));
//        System.out.println("\"Welcome to Java\".contains(\"to\") is " + 
//                "Welcome to Java".contains("to"));
//        System.out.println("\"Welcome to Java\".contains(\"To\") is " + 
//                "Welcome to Java".contains("To"));
//        System.out.println("string1.contains(string2) is " + 
//                string1.contains(string2));
//        System.out.println();
//        
//        System.out.println("4.4.8 Obtaining Substrings");
//        System.out.println("--------------------------\n");
//        String oldMessage = "Welcome to Java";
//        String newMessage = oldMessage.substring(0, 11);
//        System.out.println(newMessage + "HTML");
//        System.out.println();
        
//        System.out.println("4.4.9 Finding a Character or a Substring in a String");
//        System.out.println("----------------------------------------------------\n");
//        System.out.println("\"Welcome to Java\".indexOf(\'W\') will return " + 
//                "Welcome to Java".indexOf('W'));
//        System.out.println("\"Welcome to Java\".indexOf(\'o\') will return " + 
//                "Welcome to Java".indexOf('o'));
//        System.out.println("\"Welcome to Java\".indexOf(\'o\', 0) will return " + 
//                "Welcome to Java".indexOf('o', 0));
//        System.out.println("\"Welcome to Java\".indexOf(\'o\', 4) will return " + 
//                "Welcome to Java".indexOf('o', 4));
//        System.out.println("\"Welcome to Java\".indexOf(\'o\', 5) will return " + 
//                "Welcome to Java".indexOf('o', 5));
//        System.out.println("\"Welcome to Java\".indexOf(\"come\") will return " + 
//                "Welcome to Java".indexOf("come"));
//        System.out.println("\"Welcome to Java\".indexOf(\"Java\", 5) will return " + 
//                "Welcome to Java".indexOf("Java", 5));
//        System.out.println("\"Welcome to Java\".indexOf(\"java\", 5) will return " + 
//                "Welcome to Java".indexOf("java", 5));
//        System.out.println();
//        System.out.println("\"Welcome to Java\".lastIndexOf(\'W\') will return " + 
//                "Welcome to Java".lastIndexOf('W'));
//        System.out.println("\"Welcome to Java\".lastIndexOf(\'o\') will return " + 
//                "Welcome to Java".lastIndexOf('o'));
//        System.out.println("\"Welcome to Java\".lastIndexOf(\'o\', 5) will return " + 
//                "Welcome to Java".lastIndexOf('o', 5));
//        System.out.println("\"Welcome to Java\".lastIndexOf(\"come\") will return " + 
//                "Welcome to Java".lastIndexOf("come"));
//        System.out.println("\"Welcome to Java\".lastIndexOf(\"Java\", 5) will return " + 
//                "Welcome to Java".lastIndexOf("Java", 5));
//        System.out.println("\"Welcome to Java\".lastIndexOf(\"Java\") will return " + 
//                "Welcome to Java".lastIndexOf("Java"));
//        System.out.println();
//        
//        System.out.print("Enter your full name: ");
//        String fullName = input.nextLine();
//        
//        int space = fullName.indexOf(' ');
//        String firstName = fullName.substring(0, space);
//        System.out.println(firstName);
//        String lastName = fullName.substring(space + 1);
//        System.out.println(lastName);System.out.println();

        // 4.4.10
//        System.out.print("Enter a number: ");
//        String numberString = input.next();
//        System.out.println("The number is " + Double.parseDouble(numberString) * 2);
//        numberString += " - This is a new String";
//        System.out.println(numberString);        
        
//        // Check Point 4.4.3
//        System.out.println("\"1\" + 1 is " + ("1" + 1));
//        System.out.println("'1' + 1 is " + ('1' + 1));
//        System.out.println("\"1\" + 1 + 1 is " + ("1" + 1 + 1));
//        System.out.println("\"1\" + (1 + 1) is " + ("1" + (1 + 1)));
//        System.out.println("'1' + 1 + 1 is " + ('1' + 1 + 1));
//        System.out.println();
//        
//        // Check Point 4.4.4
//        System.out.println(1 + "Welcome " + 1 + 1);
//        System.out.println(1 + "Welcome " + (1 + 1));
//        System.out.println(1 + "Welcome " + ('\u0001' + 1));
//        System.out.println(1 + "Welcome " + 'a' + 1);

//        // Check Point 4.4.5
//        System.out.println("Check Point 4.4.5");
//        System.out.println("(a) boolean isEqual = s1.equals(s2);");
//        System.out.println("(b) boolean isEqual = s1.equalsIgnoreCase(s2);");
//        System.out.println("(c) int x = s1.compareTo(s2);");
//        System.out.println("(d) int x = s1.compareToIgnoreCase(s2);");
//        System.out.println("(e) boolean b = s1.startsWith(\"AAA\");");
//        System.out.println("(f) boolean b = s1.endsWith(\"AAA\");");
//        System.out.println("(g) int x = s1.length();");
//        System.out.println("(h) char x = s1.charAt(0);");
//        System.out.println("(i) String s3 = s1.concat(s2);");
//        System.out.println("(j) s1.substring(1);");
//        System.out.println("(k) s1.substring(1, 5)");
//        System.out.println("(l) String s3 = s1.toLowerCase();");
//        System.out.println("(m) String s3 = s1.toUpperCase();");
//        System.out.println("(n) String s3 = s1.trim();");
//        System.out.println("(o) int x = s1.indexOf('e');");
//        System.out.println("(p) int x = s1.lastIndexOf(\"abc\");");
//        System.out.println();

        // Formatting Console Output
        System.out.println("Formatting Console Output");
        double amount = 12618.98;
        double interestRate = 0.0013;
        double interest = amount * interestRate;
        System.out.printf("Interest is $%4.2f%n\n", interest);
        
//        // Format Specifiers
//        System.out.println("Format Specifiers");
//        System.out.printf("%3d#%2s#%4.2f%n", 1234, "Java", 51.6653);
//        System.out.printf("%%10.2f for 51.6653 is %n%10.2f%n%n", 51.6653);
//        System.out.printf("%%,10.2f for 123456751.6653 is %n%,10.2f%n%n", 123456751.6653);
//        System.out.printf("%e%n", 1.23);
//        System.out.printf("%10.2e%n", 1.23567);
//        System.out.printf("%12.4e%n", 12345.23567);
//        System.out.printf("%E%n", 1.23);
//        System.out.println("The following line shows the use of comma separators");
//        System.out.printf("%,8d %,10.1f%n", 12345678, 12345678.263);
//        System.out.printf("%08d %08.1f%n", 1234, 5.63);
//        System.out.printf("%8d%8s%8.1f%n", 1234, "Java", 5.63);
//        System.out.printf("%-8d%-8s%-8.1f%n", 1234, "Java", 5.63);
//        System.out.printf("%-,8d%-8s%-8.1f%n", 1234, "Java", 5.63);
////        System.out.printf("%f", 40); // Example to show Illegal Format Conversion
//        System.out.printf("(%d) %n", -100);
//        System.out.printf("%,.2f%n", 4356783497.34);
//        System.out.printf("|%f|%n|%12f|%n|%012f|%n", 10.12345, 10.12345, 10.12345);
        
//        // Check Point 4.6.3
        System.out.println("Check Point 4.6.3");
        System.out.printf("amount is %f %e%n", 32.32, 32.32);
        System.out.printf("amount is %e%n", 5.0);
        System.out.printf("amount is %5.2f%% %5.4e%n", 32.327, 32.32);
        System.out.printf("amount is %5.4e%n", 512.345);
        System.out.printf("%6b%n", (1 > 2));
        System.out.printf("%6s%n", "Java");
        System.out.printf("%-6b%s%n", (1 > 2), "Java");
        System.out.printf("%6b%-8s%n", (1 > 2), "Java");
        System.out.printf("%,5d %,6.1f%n", 312342, 315562.932);
        System.out.printf("%05d %06.1f%n", 32, 32.32);
        System.out.println('c' - 'g');
//        
//        int i = 1;
//        System.out.println(i++);
//        System.out.println(i);
//        i = 1;
//        System.out.println(++i);
//        System.out.println(Math.pow(2, 31));
        System.out.println();
        
        char character = input.next().charAt(0);
        int i = character;
        System.out.println(i);
    }
}
