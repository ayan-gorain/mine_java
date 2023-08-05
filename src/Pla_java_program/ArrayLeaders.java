package Pla_java_program;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class ArrayLeaders {
    public static void main(String[] args) {
        System.out.println("Name:Ayan Gorain");
        System.out.println("Email:ayan.gorain2021@vitbhopal.ac.in ");
        System.out.println("Class:AB516");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the matrix length");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the matrix");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }List<Integer> leaders = findLeaders(nums);
        System.out.println("Leaders:"+leaders);
    }
    public static List<Integer> findLeaders(int[] nums) {
        List<Integer> leaders = new ArrayList<>();
        int n = nums.length;
        int maxRight = nums[n-1]; // The rightmost element is always a leader
        leaders.add(maxRight);
// Traverse the array from right to left
        for (int i = n -2; i >= 0; i--) {
            if (nums[i] > maxRight) {
                maxRight = nums[i];
                leaders.add(maxRight);
            }
        }
        return leaders;
    }
}