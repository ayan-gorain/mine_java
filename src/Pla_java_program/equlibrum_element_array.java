package Pla_java_program;

public class equlibrum_element_array {
    public class Main
    {
        public static void main(String[] args) {
            int[] arr = {20,1,2,36,7,8,8};

            for(int i = 0 ; i < arr.length ; i++){
                int x = arr[i];
                int p1 = 0;
                int p2 = arr.length - 1;
                int sum1 = 0;
                int sum2 = 0;
                for(int j = 0 ; j < arr.length ; j++){
                    if(p1 != i){
                        sum1 = sum1 + arr[p1];
                        p1++;
                    }

                    if(p2 != i){
                        sum2 = sum2 + arr[p2];
                        p2--;
                    }
                }
                if(sum1 == sum2){
                    System.out.println("Equilibrium element is " + arr[i]);
                }
            }
        }
    }
}
