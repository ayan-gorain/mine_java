package Pla_java_program;

import java.util.*;
public class ManacherAlgorithm {
    public static String longestPalindromicSubstring(String s) {
        if (s == null || s.length() == 0)
            return "";
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append("#");
            sb.append(c);
        }
        sb.append("#");
        String processedString = sb.toString();
        int[] palLenArray = new int[processedString.length()];
        int center = 0;
        int right = 0;
        for (int i = 0; i < processedString.length(); i++) {
            int mirror = 2 * center - i;
            if (i < right) {
                palLenArray[i] = Math.min(right - i, palLenArray[mirror]);
            }
            int leftIndex = i - (palLenArray[i] + 1);int rightIndex = i + (palLenArray[i] + 1);
            while (leftIndex >= 0 && rightIndex < processedString.length() &&
                    processedString.charAt(leftIndex) == processedString.charAt(rightIndex)) {
                palLenArray[i]++;
                leftIndex--;
                rightIndex++;
            }
            if (i + palLenArray[i] > right) {
                center = i;
                right = i + palLenArray[i];
            }
        }
        int maxLength = 0;
        int centerIndex = 0;
        for (int i = 0; i < processedString.length(); i++) {
            if (palLenArray[i] > maxLength) {
                maxLength = palLenArray[i];
                centerIndex = i;
            }
        }
        int start = (centerIndex - maxLength) / 2;
        int end = start + maxLength;
        return s.substring(start, end);
    }
    public static void main(String[] args) {
        System.out.println("Name:Ayan Gorain");
        System.out.println("Email:ayan.gorain2021@vitbhopal.ac.in ");
        System.out.println("Class:AB516");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");String input = sc.nextLine();
        System.out.println("Longest Palindromic Substring: " +
                longestPalindromicSubstring(input));
    }
}