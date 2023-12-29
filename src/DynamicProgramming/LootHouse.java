package DynamicProgramming;

import java.util.Scanner;

public class LootHouse {
    public static int lootHouse(int[] arr){
        int dp[] = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0],arr[1]);
        for(int i=2;i<arr.length;i++){
            dp[i] = Math.max(dp[i-2]+arr[i],dp[i-1]);
        }
        return dp[arr.length-1];
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int t = lootHouse(arr);
        System.out.println(t);
    }
}
