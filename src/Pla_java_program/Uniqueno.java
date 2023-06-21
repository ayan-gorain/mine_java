package Pla_java_program;
import java.util.Scanner;
public class Uniqueno {
    static void printUnique(int l, int r)
    {
        for (int i=l ; i<=r ; i++)
        {
            int num = i;
            boolean visited[] = new boolean[10];
            while (num != 0)
            {

                if (visited[num % 10])
                    break;
                visited[num%10] = true;
                num = num/10;
            }
            if (num == 0)
                System.out.println(i + " ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the upper bound :");
        int l = sc.nextInt();
        System.out.print("enter the lower bound :");
        int r= sc.nextInt();
        printUnique(l, r);
    }

}
