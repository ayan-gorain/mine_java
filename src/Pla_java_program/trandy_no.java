package Pla_java_program;
import java.util.Scanner;
public class trandy_no {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<999 && n>100){
            n = n%100 - n%10;
            if(n%3 == 0){
                System.out.println("The given number is trendy number");
            }
            else {
                System.out.println("The given number is not trendy number");

            }

        }

    }
}