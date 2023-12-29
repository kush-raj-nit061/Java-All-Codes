package Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PairSumToZero {

    public static int pairSumZero(int arr[]){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int value = map.get(arr[i]);
                map.put(arr[i],value+1);
                continue;
            }
            map.put(arr[i],1);
        }
        int count = 0;

        for(int i = 0;i<arr.length;i++){

            if(map.containsKey(arr[i]) && map.containsKey(-arr[i])){
                int freq = map.get(arr[i]);
                int val = map.get(-arr[i]);
                count= count+freq*val;
                map.put(arr[i],0);
                map.put(-arr[i],0);
            }
        }

        return count;



    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int count = pairSumZero(arr);
        System.out.println(count);

    }



}
