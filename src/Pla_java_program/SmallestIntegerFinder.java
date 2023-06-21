package Pla_java_program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SmallestIntegerFinder {
    public static int multiplyDigits(int num) {
        int result = 1;
        while (num > 0) {
            int digit = num % 10;
            result *= digit;
            num /= 10;
        }
        return result;
    }

    public static int findSmallestInteger(int a) {
        if (a == 0) {
            return 10; // Edge case: 0 can only be represented by 10
        }

        List<Integer> digitList = new ArrayList<>();
        for (int digit = 9; digit > 1; digit--) {
            while (a % digit == 0) {
                digitList.add(digit);
                a /= digit;
            }
        }

        if (a > 1) {
            return -1; // No solution exists for the given 'a'
        }

        Collections.sort(digitList);
        StringBuilder sb = new StringBuilder();
        for (int digit : digitList) {
            sb.append(digit);
        }

        int b = Integer.parseInt(sb.toString());
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = findSmallestInteger(a);
        if (b != -1) {
            System.out.println("The smallest integer value 'b' for " + a + " is: " + b);
        } else {
            System.out.println("No solution exists for " + a);
        }
    }
}