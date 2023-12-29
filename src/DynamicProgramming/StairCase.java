package DynamicProgramming;

import java.util.Scanner;

public class StairCase {

    public static int totalStairs(int n){
        int prev1=2;
        int prev2=1;
        int prev3=1;
        int curr;
        for(int i = 3;i<=n;i++){
            curr = prev3+prev2+prev1;
            prev3=prev2;
            prev2= prev1;
            prev1 = curr;


        }
        if(n==0||n==1) {
            return prev2;
        }else{
            return prev1;
        }

    }

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int count =  totalStairs(n);
        System.out.println(count);

    }
}
