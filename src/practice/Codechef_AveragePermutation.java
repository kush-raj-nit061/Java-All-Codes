package practice;

import java.util.Scanner;

public class Codechef_AveragePermutation {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int len = s.nextInt();
            int num = len;
            int arr[] = new int[len];
            for(int i = 0;i<(len+1)/2;i++){
                arr[i] = num;
                num-=2;
            }
            if(num == -1){
                num = 2;
            }else{
                num = 1;

            }
            for(int i = (len+1)/2;i<len;i++){
                arr[i] = num;
                num+=2;

            }
            for(int i = 0;i<len;i++){
                System.out.println(arr[i]);
            }
        }
    }
}
