package Pla_java_program;

public class Unfiormitymatrix {
    public static void main(String [] args){
        int[][] uni = {
                {2, 2},
                {6, 4}
        };

        int even1 = 0;
        int odd1 = 0;

        for (int i = 0 ; i < uni.length ; i++) {
            for (int j = 0 ; j < uni.length ; j++) {
                if( uni[i][j]%2 != 0){
                    odd1++;
                }
                else{
                    even1++;
                }
            }
        }

        if(even1 == 0 || odd1 == 0){
            System.out.println("It is a Unfiormity matrix");
        }
        else{
            System.out.println("Not a Unfiormity matrix");
        }
    }
}
