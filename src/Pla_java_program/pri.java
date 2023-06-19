package Pla_java_program;// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
import java.lang.Math;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        boolean[] arr = new boolean [n];
        for(int i=2;i<n;i++){
            arr[i] = true;
        }
        for(int i = 2;i<n;i++){
            int index = 2;
            while (i*index<n){
                arr[i*index] = false;
                index+=1;
            }
        }
        for(int i=2;i<n;i++){
            if (arr[i]==true){
                System.out.println("Prime "+i);

            }
            else{
                System.out.println("Not Prime "+i);
            }

        }
    }
}