package Pla_java_program;

public class Arreveodd {
    public static void main(String []args){
        int[] arr = {2, 3, 4, 44, 54, 3};
        int sum=0;
        int eve = 0,odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                eve=eve+arr[i];
            }
            else{
                odd=odd+arr[i];
            }

        }
        System.out.println(eve);
        System.out.println(odd);

    }

}
