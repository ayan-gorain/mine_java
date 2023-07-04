package Pla_java_program;

public class Equibrum_ele {
    static int eqbmindex(int array[], int n)
    {
        int i, j;
        int lsum, rsum;
        for (i = 0; i < n; ++i)
        {
            lsum = 0;
            for (j = 0; j < i; j++)
                lsum = lsum + array[j];
            rsum = 0;

            for (j = i + 1; j < n; j++)
                rsum = rsum + array[j];
            if (lsum == rsum)
                return i;
        }
        return -1;
    }
    public static void main(String args[])
    {
        int array[] = {9, 3, 7, 6, 8, 1, 10};
        int arraysize = array.length;
        System.out.print("Equilibrium Index is: ");
        System.out.println(eqbmindex(array, arraysize));
    }
}
