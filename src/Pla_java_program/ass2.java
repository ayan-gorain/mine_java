package Pla_java_program;

import java.io.*;
import java.util.*;
class Solution {
    static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++)
            f = f * i;
        return f;
    }static void print(char[] temp) {
        for (int i = 0; i < temp.length; i++)
            System.out.print(temp[i]);
        System.out.println();
    }
    static int calculateTotal(char[] temp, int n) {
        int f = factorial(n);
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < temp.length; i++) {
            if (hm.containsKey(temp[i]))
                hm.put(temp[i], hm.get(temp[i]) + 1);
            else
                hm.put(temp[i], 1);
        }
        for (Map.Entry<Character, Integer> e : hm.entrySet()) {
            Integer x = e.getValue();
            if (x > 1) {
                int temp5 = factorial(x);
                f = f / temp5;
            }
        }
        return f;
    }
    static void nextPermutation(char[] temp) {
        int i;
        for (i = temp.length - 1; i > 0; i--)
            if (temp[i] > temp[i - 1])
                break;
        int min = i;
        int j, x = temp[i - 1];
        for (j = i + 1; j < temp.length; j++)if ((temp[j] < temp[min]) && (temp[j] > x))
            min = j;
        char temp_to_swap;
        temp_to_swap = temp[i - 1];
        temp[i - 1] = temp[min];
        temp[min] = temp_to_swap;
        Arrays.sort(temp, i, temp.length);
        print(temp);
    }
    static void printAllPermutations(String s) {
        char[] temp = s.toCharArray();
        Arrays.sort(temp);
        print(temp);
        int total = calculateTotal(temp, temp.length);
        for (int i = 1; i < total; i++)
            nextPermutation(temp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name:Ayan Gorain");
        System.out.println("Email:ayan.gorain2021@vitbhopal.ac.in ");
        System.out.println("Class:AB516");
        System.out.println("Enter the String");
        String s = sc.nextLine();
        printAllPermutations(s);
    }
}