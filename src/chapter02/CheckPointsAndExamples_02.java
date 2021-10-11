package chapter02;

/**
 * @author FSO
 * Mar 18, 2021 2:24:44 AM
 */

public class CheckPointsAndExamples_02 {
    public static void main(String[] args) {
        double i = 50.0;
        double k = i + 50.0;
        double j = k + 1;
        
        System.out.println("j is " + j + " and k is " + k);
        
        System.out.println(i = 1);
        System.out.println(i);
        System.out.println();
        
        // Check Point 2.6.1
//        int a = b = c = 2;
//        System.out.println(i + " " + j + " " + k);
        
        // Section 2.9.3
        System.out.println(20 % -13);
        System.out.println(-26 % -8);
        
        // Check Point 2.9.2
        System.out.println(56 % 6);
        System.out.println(78 % -4);
        System.out.println(-34 % 5);
        System.out.println(-34 % -5);
        System.out.println(5 % 1);
        System.out.println(1 % 5);
        System.out.println();
        
        System.out.println(2 * (5 / 2 + 5 / 2));
        System.out.println(2 * 5 / 2 + 2 * 5 / 2);
        System.out.println(2 * (5 / 2));
        System.out.println(2 * 5 / 2);
        System.out.println();
        
        System.out.println("25 / 4 is " + 25 / 4);
        System.out.println("25 / 4.0 is " + 25 / 4.0);
        System.out.println("3 * 2 / 4 is " + 3 * 2 / 4);
        System.out.println("3.0 * 2 / 4 is " + 3.0 * 2 / 4);
        System.out.println();
        
        
//        int byteValue = 128;
//        long longValue = 123;

        System.out.println(0B1111);
        int newIntValue = 0b111101011111111111111111111;
        System.out.println(newIntValue);
        newIntValue = 07777;
        System.out.println(newIntValue);
        newIntValue = 0XFFFFFFF;
        System.out.println(newIntValue);
        long longValue = 0xFFFFFFFFFFFFFFL;
        System.out.println(longValue);
        
        float floatValue = 5.0f;
        System.out.println(floatValue);
        
        System.out.println(5.2534e+1);
        System.out.println(12.3e+2);
        System.out.println(5_2);
        System.out.println();
        
        
        System.out.println(newIntValue += 2);
        System.out.println();
        
        double a = 6.5;
        a += a + 1;
        System.out.println(a);
        a = 6;
        a /= 2;
        System.out.println(a);
        System.out.println();
        
        i = 3;
        System.out.println(i++);
        System.out.println(i);
        i = 3;
        System.out.println(++i);
        int f = 10;
        int newNum = 10 * ++f;
        System.out.println("f is " + f + ", newNum is " + newNum);
        
        int num1, num2;
//        num1 = num2 = num1 = 0;
//        System.out.println(num1 + " " + num2);
        
        num1 = 6;
        num2 = num1++;
        System.out.println(num1);
        System.out.println(num2);
        
        num1 = 6;
        num2 = ++num1;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println();
        
        float float1 = 12.5F;
        num1 = (int)float1;
        System.out.println("f is " + float1);
        System.out.println("i is " + num1);
    }
}
