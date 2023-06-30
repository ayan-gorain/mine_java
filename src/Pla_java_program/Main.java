package Pla_java_program;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);




        int[] a = {2, 3, 10};
        int[] m = {5, 7, 11};

        int M = 1;
        for (int i = 0; i < m.length; i++) {
            M = M * m[i];
        }


        int[] M1 = new int[3];
        int[] M2 = new int[3];
        for (int i = 0; i < m.length; i++) {
            M1[i] = M / m[i];
            for (int j = 1; j < M1[i]; j++) {
                if ((M1[i] * j) % m[i] == 1) {
                    M2[i] = j;
                    break;
                }
            }
        }


        int ans = 0;
        for (int i = 0; i < M1.length; i++) {
            ans = ans + (a[i] * M1[i] * M2[i]);
        }

        System.out.println(ans % M);
    }
}