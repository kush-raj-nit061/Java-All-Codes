package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Codechef_MakeAllEqualUsingPairs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int n = s.nextInt();

            int a[] = new int[n];
            for(int i = 0;i<n;i++){
                a[i] = s.nextInt();
            }
            if(a.length==0){
                System.out.println("0");
            }
            Arrays.sort(a);
            int max = 0;
            int temp=0;
            for(int i = 0;i<a.length-1;i++){
                if(a[i] == a[i+1]){
                    temp ++;
                }
                else if(temp>max) {
                    max = temp;
                    temp = 0;
                }


            }
            System.out.println(n-max-1);

        }
    }
}
