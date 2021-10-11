package chapter05;

/**
 * @author FSO
 * Apr 15, 2021 2:37:33 PM
 */

public class CheckPointsAndExamples_05 {
    public static void main(String[] args) {
//        // 5.7.1
//        System.out.println("Check Point 5.7.1");
//        System.out.print("(a) ");
//        int sum = 0;
//        for (int i = 0; i < 10; ++i) {
//            sum += i;
//        }
//        System.out.println(sum);
//        
//        sum = 0;
//        
//        System.out.print("(b) ");
//        for (int i = 0; i < 10; i++) {
//            sum +=i;
//        }
//        System.out.println(sum + "\n");
        
        // Check Point 5.7.2
        System.out.println("Check Point 5.7.2");
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
        
        System.out.println("\nOR\n");
        
        // Correct but confusing
        for (int i = 0; i < 100;) {
            System.out.println(++i);
        }

//        int count = 5, n = 12, a = 0;
//        while (count < n) {
//            System.out.println(a++);
//            count += 3;
//        }
//        
//        // Check Point 5.7.2
//        System.out.println("Check Point 5.9.2");
//        System.out.println("(a)");
//        for (int i = 1; i < 5; i++) {
//            int j = 0;
//            while (j < i) {
//                System.out.print(j + " ");
//                j++;
//            }
//        }
//        
//        System.out.println("(b)");
//        int i = 0;
//        while (i < 5) {
//            for (int j = i; j > 1; j--)
//                System.out.print(j + " ");
//            System.out.println("****");
//            i++;
//        }
//        
//        System.out.println("(c)");
//        i = 5;
//        while (i >= 1) {
//            int num = 1;
//            for (int j = 1; j <= i; j++) {
//                System.out.print(num + "xxx");
//                num *= 2;
//            }
//            
//            System.out.println();
//            i--;
//        }
//        
//        System.out.println("(d)");
//        i = 1;
//        do {
//            int num = 1;
//            for (int j = 1; j <= i; j++) {
//                System.out.print(num + "G");
//                num += 2;
//            }
//            
//            System.out.println();
//            i++;
//        } while (i <= 5);
        
//        System.out.println(100000000.0 + 0.000000001);
//        System.out.println(0.000000001 + 100000000.0);
        
//        sum = 0;
//        for (int i = 0; i < 4; i++) {
//            if (i % 3 == 0) continue;
//            sum += i;
//        }
//        
//        System.out.println("The sum is " + sum);
//        
//        System.out.println("My own attempt");
//        sum = 0;
//        int i = 0;
//        while (i < 4) {
//            System.out.println("i is " + i);
//            if (i++ % 3 == 0) continue;
//            sum += i;
//        }
//        
//        System.out.println("The new sum is " + sum);
//        
//        sum = 0;
//        i = 0;
//        while (i < 4) {
//            if (i % 3 == 0) {
//                i++;
//                continue;
//            }
//            sum += i;
//            i++;
//        }
//        
//        System.out.println("The new sum is " + sum);
        
//        System.out.println("Check Point 5.12.3a");
//        int sumForBreak = 0;
//        int numberForBreak = 0;
//        
//        while (numberForBreak < 20 && sumForBreak < 100) {
//            numberForBreak++;
//            sumForBreak += numberForBreak;
//        }
//        
//        System.out.println("The number is " + numberForBreak);
//        System.out.println("The sum is " + sumForBreak);
//        
//        System.out.println("\nCheck Point 5.12.3a");
//        int sumForContinue = 0;
//        int numberForContinue = 0;
//        
//        while (numberForContinue < 20) {
//            numberForContinue++;
//            
//            if (numberForContinue != 10 && numberForContinue != 11)
//                sumForContinue += numberForContinue;
//        }
//        
//        System.out.println("The number is " + numberForContinue);
//        System.out.println("The sum is " + sumForContinue);

        System.out.println(0.000000001 + 100000000.0);
    }
}
