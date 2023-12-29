package DynamicProgramming;

import java.util.Scanner;

public class MinStepToOne {
    public static int minStepToOne(int n){

        int minStepCount[] = new int[n+1];
        minStepCount[0] = 0;
        minStepCount[1]= 0;
        minStepCount[2]=1;
        minStepCount[3]=1;
        if(n==1){
            return 0;
        }
        for(int i = 4;i<=n;i++){
            int least = 1+minStepCount[i-1];
            if(i%3 ==0){
                if(1+minStepCount[i/3]<least){
                    least = 1+minStepCount[i/3];
                }
            }
            if (i%2==0) {
                if(1+minStepCount[i/2]<least){
                    least = 1+minStepCount[i/2];
                }

            }

            minStepCount[i] = least;
        }
        return minStepCount[n];


    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = minStepToOne(n);
        System.out.println(count);
    }
}
