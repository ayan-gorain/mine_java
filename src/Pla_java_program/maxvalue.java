package Pla_java_program;

import java.util.Arrays;
import java.util.Collections;

public class maxvalue {
    public static  void main(String[] args){
        int[] arr={23,44,33,21,32,33,45};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest element present in given array: " + max);

    }
}
