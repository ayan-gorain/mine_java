package Pla_java_program;

public class leaders_of_array {
    public class Main
    {
        public static void main(String[] args) {
            int[] arr = {16,8,10,3,2};
            int n = arr.length;
            int[] res = new int[n];


            int index = 0;
            for(int i = 0 ; i < n ; i++){
                int flag = 0;
                int x = arr[i];
                for(int j = i+1 ; j < n ; j++){
                    if(x < arr[j]){
                        flag = 1;
                        break;
                    }
                }
                if( flag == 0){
                    res[index] = arr[i];
                    index++;
                }
            }
            for(int i = 0 ; i < res.length ; i++){
                if(res[i] != 0){
                    System.out.print(res[i]+" ");
                }
            }

        }
    }
}
