package DynamicProgramming;

import java.util.Scanner;

public class ByteLandian {

    public static int byteLandian(int n){
        int a[] = new int[n+1];
        a[0] = 0;
        a[1] = 1;
        a[2]=2;
        a[3]=3;
        for(int i = 4;i<=n;i++){
            a[i] = a[i/2]+a[i/3]+a[i/4];
            if(a[i] < i){
                a[i] = i;
            }
        }
        return a[n];

    }

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int t = byteLandian(n);
        System.out.println(t);
    }
}
