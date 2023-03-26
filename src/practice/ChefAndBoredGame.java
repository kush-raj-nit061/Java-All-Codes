package practice;

import java.util.Scanner;

public class ChefAndBoredGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int sum = 0;
            if(n%2==0){
                for(int i = 2;i<=n;i+=2){
                    sum+=i*i;
                }
            }else{
                for(int i = 1;i<=n;i+=2){
                    sum += i*i;
                }
            }
            System.out.println(sum);
        }
    }
}
