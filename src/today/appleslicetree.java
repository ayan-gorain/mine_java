package today;

public class appleslicetree {

        public static void main(String[] args) {
            int N = 2;
            int S = 2;
            int W = 3;
            int E = 3;
            int k = 2;
            int M = 10;

            if(M <= S*k){
                System.out.println(M);
            }
            else if(M <= S*k + W + E){
                System.out.println(S*k + (W+E)*k);
            }
            else{
                System.out.println(-1);
            }

        }



}
