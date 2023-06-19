package Pla_java_program;
import java .util.Scanner;

public class special_no {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        if(n>99){
            System.out.println("false");
        }
        for(int i = 11 ; i < n ; i++){
            if((i%10 + (i%100-i%10)/10) +  (i%10*(i%100-i%10)/10) == i){
                System.out.println(i);
            }
        }
    }
    }
