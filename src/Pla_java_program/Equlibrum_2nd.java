package Pla_java_program;

public class Equlibrum_2nd {
    static int eqbmindex(int array[], int n)
    {
        int rsum = 0;
        int lsum = 0;
        for (int i = 0; i < n; ++i)
            rsum = rsum + array[i];
        for (int i = 0; i < n; ++i)
        {
            rsum = rsum - array[i];
            if (lsum == rsum)
                return i;
            lsum = lsum + array[i];
        }
        return -1;
    }
    public static void main(String args[])
    {
        int array[] = {2, 9, 3, 4, 0, 3, 3, 2, 9, 1};
        int arraysize = array.length;
        System.out.print("Equilibrium Index is: ");
        System.out.println(eqbmindex(array, arraysize));
    }
}
